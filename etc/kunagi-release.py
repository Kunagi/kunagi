#!/usr/bin/env python

# Script for releasing Kunagi

import sys
import os
import shutil

def fail(message):
    print message
    print ''
    print '*** Releasing Kunagi FAILED ****'
    exit(1)

def execute(cmd, dir=None):
    previousDir = os.getcwd()
    if dir:
        os.chdir(dir)
    pipe = os.popen('{ ' + cmd + '; } 2>&1', 'r')
    text = pipe.read()
    sts = pipe.close()
    if dir:
        os.chdir(previousDir)
    if sts is None: sts = 0
    if text[-1:] == '\n': text = text[:-1]
    dirinfo = ''
    if dir:
        dirinfo = '\n  work-dir: ' + dir
    if sts != 0:
        fail('Executing command failed: ' + cmd + dirinfo + '\n' + text)
    return text

# ------------ main -----------------

# check parameters
if len(sys.argv) < 2:
    fail('Missing parameter: release-label')

releaseLabel = sys.argv[1]
branchName = 'r' + releaseLabel
print 'Releasing Kunagi ' + releaseLabel


# configuration
os.chdir('/home/kunagi/')
workDir = os.path.abspath('kunagi-release-workdir')
artifactsDestinationHomeDir = '/var/www/kunagi.org/website/releases'
githubUser = 'git://github.com/Kunagi'
buildDir = workDir + '/kunagi/build'
packageDir = buildDir + '/package-content/kunagi'
packageWar = buildDir + '/kunagi.war'
packageZip = buildDir + '/kunagi-' + releaseLabel + '.zip'
packageTar = buildDir + '/kunagi-' + releaseLabel + '.tar.gz'
packageExe32 = artifactsDestinationHomeDir + '/kunagi32.exe'
packageExe64 = artifactsDestinationHomeDir + '/kunagi64.exe'


# cleanup previous release
print '  Clean work direcotry: ' + workDir
if os.path.exists(workDir):
    shutil.rmtree(workDir)


# checkout
print '  Clone git repositories from ' + githubUser
execute('git clone ' + githubUser + '/kunagi.git ' + workDir + '/kunagi')
execute('git checkout ' + branchName, workDir + '/kunagi')
execute('git clone ' + githubUser + '/ilarkesto.git ' + workDir + '/ilarkesto')
execute('git checkout kunagi-' + branchName, workDir + '/ilarkesto')


#download dependencies
print '  Downloading dependencies'
os.mkdir(workDir + '/ilarkesto/lib')
execute('./download-dependencies.bsh', workDir + '/ilarkesto')



# write build.properties file
print '  Update build.properties'
buildPropertiesFilePath = workDir + '/kunagi/src/main/java/scrum/server/build.properties'
buildPropertiesFile = f = open(buildPropertiesFilePath, 'a')
f.write('release.label=' + releaseLabel + '\n')
f.close()


# build
print '  Build & Test'
execute('ant package', workDir + '/kunagi')


# pack
print '  Pack'
if not os.path.exists(packageDir):
    fail('Missing package directory: ' + packageDir)
newPackageDir = packageDir + '-' + releaseLabel
shutil.move(packageDir, newPackageDir)
packageDir = newPackageDir
packageDirParentDir = os.path.abspath(packageDir + '/../')
execute('tar -czf ../kunagi-' + releaseLabel + '.tar.gz kunagi-' + releaseLabel, packageDirParentDir)
execute('zip -r9 ../kunagi-' + releaseLabel + '.zip kunagi-' + releaseLabel, packageDirParentDir)


# debianize
print '  Create debian package'
debianDir = buildDir + '/debian'
debianDocDir = debianDir + '/usr/share/doc/kunagi'
packageDeb = buildDir + '/kunagi_' + releaseLabel + '.deb'
shutil.copytree(workDir + '/kunagi/src/debian', buildDir + '/debian')
os.makedirs(debianDir + '/var/lib/tomcat6/webapps')
shutil.copyfile(packageWar, debianDir + '/var/lib/tomcat6/webapps/kunagi.war')
os.makedirs(debianDocDir)
shutil.copyfile(workDir + '/kunagi/README', debianDocDir + '/README')
execute('fakeroot dpkg-deb --build debian', buildDir)
shutil.move(buildDir + '/debian.deb', packageDeb)


# check files and directories
print '  Check artifacts'
artifactsDestinationDir = artifactsDestinationHomeDir + '/' + releaseLabel
#if os.path.exists(artifactsDestinationDir):
#    fail('Release directory already exists: ' + artifactsDestinationDir)
if not os.path.exists(packageWar):
    fail('Missing war package: ' + packageWar)
if not os.path.exists(packageZip):
    fail('Missing zip package: ' + packageZip)
if not os.path.exists(packageTar):
    fail('Missing tar package: ' + packageTar)
if not os.path.exists(packageExe32):
    fail('Missing 32 bit exe package: ' + packageExe32)
if not os.path.exists(packageExe64):
    fail('Missing 64 bit exe package: ' + packageExe64)


# update homepage
print '  Update homepage'
execute('ant releaseHomepage', workDir + '/kunagi')


# copy artifacts
print '  Copy artifacts to ' + artifactsDestinationDir
os.mkdir(artifactsDestinationDir)
shutil.copyfile(packageWar, artifactsDestinationDir + '/kunagi.war')
shutil.copyfile(packageExe32, artifactsDestinationDir + '/kunagi32.exe')
shutil.copyfile(packageExe64, artifactsDestinationDir + '/kunagi64.exe')
shutil.copyfile(packageDeb, artifactsDestinationDir + '/kunagi_' + releaseLabel + '.deb')
shutil.copyfile(packageTar, artifactsDestinationDir + '/kunagi-' + releaseLabel + '.tar.gz')
shutil.copyfile(packageZip, artifactsDestinationDir + '/kunagi-' + releaseLabel + '.zip')


# deploy
print '  Deploy demo'
shutil.copyfile(packageWar, '/home/kunagi-demo/tomcat/webapps/kunagi-demo.war')
#shutil.copyfile(packageWar, '/home/kunagi/tomcat/webapps/kunagi.war')


print 'Kunagi ' + releaseLabel + ' released'
