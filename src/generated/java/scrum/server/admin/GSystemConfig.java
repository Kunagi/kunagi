// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: ilarkesto.mda.legacy.generator.EntityGenerator










package scrum.server.admin;

import java.util.*;
import ilarkesto.core.base.Utl;
import ilarkesto.core.logging.Log;
import ilarkesto.persistence.ADatob;
import ilarkesto.persistence.AEntity;
import ilarkesto.auth.AuthUser;
import ilarkesto.core.base.Str;
import ilarkesto.core.persistance.EntityDoesNotExistException;

public abstract class GSystemConfig
            extends ilarkesto.persistence.AEntity
            implements ilarkesto.auth.ViewProtected<scrum.server.admin.User>, ilarkesto.auth.EditProtected<scrum.server.admin.User>, java.lang.Comparable<SystemConfig> {

    public static class SystemConfigMetadata implements ilarkesto.core.persistance.meta.EntityMetadata {

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata url = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "url";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SystemConfig)entity).getUrl();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata adminEmail = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "adminEmail";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SystemConfig)entity).getAdminEmail();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata googleAnalyticsId = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "googleAnalyticsId";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SystemConfig)entity).getGoogleAnalyticsId();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata smtpServer = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "smtpServer";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SystemConfig)entity).getSmtpServer();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata smtpPort = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "smtpPort";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SystemConfig)entity).getSmtpPort();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata smtpTls = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "smtpTls";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SystemConfig)entity).isSmtpTls();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata smtpUser = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "smtpUser";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SystemConfig)entity).getSmtpUser();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata smtpPassword = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "smtpPassword";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SystemConfig)entity).getSmtpPassword();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata smtpFrom = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "smtpFrom";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SystemConfig)entity).getSmtpFrom();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata instanceName = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "instanceName";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SystemConfig)entity).getInstanceName();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata loginPageLogoUrl = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "loginPageLogoUrl";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SystemConfig)entity).getLoginPageLogoUrl();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata loginPageMessage = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "loginPageMessage";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SystemConfig)entity).getLoginPageMessage();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata registerPageMessage = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "registerPageMessage";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SystemConfig)entity).getRegisterPageMessage();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata aboutPageMessage = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "aboutPageMessage";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SystemConfig)entity).getAboutPageMessage();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata userEmailMandatory = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "userEmailMandatory";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SystemConfig)entity).isUserEmailMandatory();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata registrationDisabled = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "registrationDisabled";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SystemConfig)entity).isRegistrationDisabled();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata projectCreationDisabled = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "projectCreationDisabled";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SystemConfig)entity).isProjectCreationDisabled();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata defaultUserPassword = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "defaultUserPassword";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SystemConfig)entity).getDefaultUserPassword();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata openIdDisabled = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "openIdDisabled";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SystemConfig)entity).isOpenIdDisabled();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata openIdDomains = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "openIdDomains";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SystemConfig)entity).getOpenIdDomains();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata versionCheckEnabled = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "versionCheckEnabled";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SystemConfig)entity).isVersionCheckEnabled();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata ldapEnabled = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "ldapEnabled";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SystemConfig)entity).isLdapEnabled();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata ldapUrl = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "ldapUrl";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SystemConfig)entity).getLdapUrl();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata ldapUser = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "ldapUser";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SystemConfig)entity).getLdapUser();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata ldapPassword = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "ldapPassword";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SystemConfig)entity).getLdapPassword();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata ldapBaseDn = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "ldapBaseDn";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SystemConfig)entity).getLdapBaseDn();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata ldapUserFilterRegex = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "ldapUserFilterRegex";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SystemConfig)entity).getLdapUserFilterRegex();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata maxFileSize = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "maxFileSize";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SystemConfig)entity).getMaxFileSize();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata subscriptionKeySeed = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "subscriptionKeySeed";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SystemConfig)entity).getSubscriptionKeySeed();
            }

        };

        public static transient ilarkesto.core.persistance.meta.EntityFieldMetadata[] fields = new ilarkesto.core.persistance.meta.EntityFieldMetadata[] {
            url
            ,adminEmail
            ,googleAnalyticsId
            ,smtpServer
            ,smtpPort
            ,smtpTls
            ,smtpUser
            ,smtpPassword
            ,smtpFrom
            ,instanceName
            ,loginPageLogoUrl
            ,loginPageMessage
            ,registerPageMessage
            ,aboutPageMessage
            ,userEmailMandatory
            ,registrationDisabled
            ,projectCreationDisabled
            ,defaultUserPassword
            ,openIdDisabled
            ,openIdDomains
            ,versionCheckEnabled
            ,ldapEnabled
            ,ldapUrl
            ,ldapUser
            ,ldapPassword
            ,ldapBaseDn
            ,ldapUserFilterRegex
            ,maxFileSize
            ,subscriptionKeySeed
        };

        public ilarkesto.core.persistance.meta.EntityFieldMetadata[] getFields() {
            return fields;
        }

        public ilarkesto.core.persistance.meta.EntityFieldMetadata getField(String fieldName) {
            if ("url".equals(fieldName)) return url;
            if ("adminEmail".equals(fieldName)) return adminEmail;
            if ("googleAnalyticsId".equals(fieldName)) return googleAnalyticsId;
            if ("smtpServer".equals(fieldName)) return smtpServer;
            if ("smtpPort".equals(fieldName)) return smtpPort;
            if ("smtpTls".equals(fieldName)) return smtpTls;
            if ("smtpUser".equals(fieldName)) return smtpUser;
            if ("smtpPassword".equals(fieldName)) return smtpPassword;
            if ("smtpFrom".equals(fieldName)) return smtpFrom;
            if ("instanceName".equals(fieldName)) return instanceName;
            if ("loginPageLogoUrl".equals(fieldName)) return loginPageLogoUrl;
            if ("loginPageMessage".equals(fieldName)) return loginPageMessage;
            if ("registerPageMessage".equals(fieldName)) return registerPageMessage;
            if ("aboutPageMessage".equals(fieldName)) return aboutPageMessage;
            if ("userEmailMandatory".equals(fieldName)) return userEmailMandatory;
            if ("registrationDisabled".equals(fieldName)) return registrationDisabled;
            if ("projectCreationDisabled".equals(fieldName)) return projectCreationDisabled;
            if ("defaultUserPassword".equals(fieldName)) return defaultUserPassword;
            if ("openIdDisabled".equals(fieldName)) return openIdDisabled;
            if ("openIdDomains".equals(fieldName)) return openIdDomains;
            if ("versionCheckEnabled".equals(fieldName)) return versionCheckEnabled;
            if ("ldapEnabled".equals(fieldName)) return ldapEnabled;
            if ("ldapUrl".equals(fieldName)) return ldapUrl;
            if ("ldapUser".equals(fieldName)) return ldapUser;
            if ("ldapPassword".equals(fieldName)) return ldapPassword;
            if ("ldapBaseDn".equals(fieldName)) return ldapBaseDn;
            if ("ldapUserFilterRegex".equals(fieldName)) return ldapUserFilterRegex;
            if ("maxFileSize".equals(fieldName)) return maxFileSize;
            if ("subscriptionKeySeed".equals(fieldName)) return subscriptionKeySeed;
            return null;
        }

    }

    public static transient final SystemConfigMetadata metadata = new SystemConfigMetadata();

    @Override
    public SystemConfigMetadata getMetadata() { return metadata; };

    protected static final ilarkesto.core.logging.Log log = ilarkesto.core.logging.Log.get(SystemConfig.class);

    // --- AEntity ---

    public final scrum.server.admin.SystemConfigDao getDao() {
        return systemConfigDao;
    }

    protected void repairDeadDatob(ADatob datob) {
    }

    public abstract static class ASystemConfigQuery extends ilarkesto.core.persistance.AEntityQuery<SystemConfig> {
    @Override
        public Class<SystemConfig> getType() {
            return SystemConfig.class;
        }
    }

    public static SystemConfig get() {
        Set<SystemConfig> ret = new ilarkesto.core.persistance.AllByTypeQuery(SystemConfig.class).list();
        if (ret.isEmpty()) return null;
        return ret.iterator().next();
    }

    public static Set<SystemConfig> listAll() {
        return new ilarkesto.core.persistance.AllByTypeQuery(SystemConfig.class).list();
    }

    public static SystemConfig getById(String id) {
        return (SystemConfig) AEntity.getById(id);
    }

    @Override
    public Set<ilarkesto.core.persistance.Entity> getReferencedEntities() {
        Set<ilarkesto.core.persistance.Entity> ret = super.getReferencedEntities();
    // --- references ---
        return ret;
    }

    @Override
    public void storeProperties(Map<String, String> properties) {
        super.storeProperties(properties);
        properties.put("url", ilarkesto.core.persistance.Persistence.propertyAsString(this.url));
        properties.put("adminEmail", ilarkesto.core.persistance.Persistence.propertyAsString(this.adminEmail));
        properties.put("googleAnalyticsId", ilarkesto.core.persistance.Persistence.propertyAsString(this.googleAnalyticsId));
        properties.put("smtpServer", ilarkesto.core.persistance.Persistence.propertyAsString(this.smtpServer));
        properties.put("smtpPort", ilarkesto.core.persistance.Persistence.propertyAsString(this.smtpPort));
        properties.put("smtpTls", ilarkesto.core.persistance.Persistence.propertyAsString(this.smtpTls));
        properties.put("smtpUser", ilarkesto.core.persistance.Persistence.propertyAsString(this.smtpUser));
        properties.put("smtpPassword", ilarkesto.core.persistance.Persistence.propertyAsString(this.smtpPassword));
        properties.put("smtpFrom", ilarkesto.core.persistance.Persistence.propertyAsString(this.smtpFrom));
        properties.put("instanceName", ilarkesto.core.persistance.Persistence.propertyAsString(this.instanceName));
        properties.put("loginPageLogoUrl", ilarkesto.core.persistance.Persistence.propertyAsString(this.loginPageLogoUrl));
        properties.put("loginPageMessage", ilarkesto.core.persistance.Persistence.propertyAsString(this.loginPageMessage));
        properties.put("registerPageMessage", ilarkesto.core.persistance.Persistence.propertyAsString(this.registerPageMessage));
        properties.put("aboutPageMessage", ilarkesto.core.persistance.Persistence.propertyAsString(this.aboutPageMessage));
        properties.put("userEmailMandatory", ilarkesto.core.persistance.Persistence.propertyAsString(this.userEmailMandatory));
        properties.put("registrationDisabled", ilarkesto.core.persistance.Persistence.propertyAsString(this.registrationDisabled));
        properties.put("projectCreationDisabled", ilarkesto.core.persistance.Persistence.propertyAsString(this.projectCreationDisabled));
        properties.put("defaultUserPassword", ilarkesto.core.persistance.Persistence.propertyAsString(this.defaultUserPassword));
        properties.put("openIdDisabled", ilarkesto.core.persistance.Persistence.propertyAsString(this.openIdDisabled));
        properties.put("openIdDomains", ilarkesto.core.persistance.Persistence.propertyAsString(this.openIdDomains));
        properties.put("versionCheckEnabled", ilarkesto.core.persistance.Persistence.propertyAsString(this.versionCheckEnabled));
        properties.put("ldapEnabled", ilarkesto.core.persistance.Persistence.propertyAsString(this.ldapEnabled));
        properties.put("ldapUrl", ilarkesto.core.persistance.Persistence.propertyAsString(this.ldapUrl));
        properties.put("ldapUser", ilarkesto.core.persistance.Persistence.propertyAsString(this.ldapUser));
        properties.put("ldapPassword", ilarkesto.core.persistance.Persistence.propertyAsString(this.ldapPassword));
        properties.put("ldapBaseDn", ilarkesto.core.persistance.Persistence.propertyAsString(this.ldapBaseDn));
        properties.put("ldapUserFilterRegex", ilarkesto.core.persistance.Persistence.propertyAsString(this.ldapUserFilterRegex));
        properties.put("maxFileSize", ilarkesto.core.persistance.Persistence.propertyAsString(this.maxFileSize));
        properties.put("subscriptionKeySeed", ilarkesto.core.persistance.Persistence.propertyAsString(this.subscriptionKeySeed));
    }

    @Override
    public int compareTo(SystemConfig other) {
        return ilarkesto.core.localization.GermanComparator.INSTANCE.compare(toString(), other.toString());
    }

    private static final ilarkesto.core.logging.Log LOG = ilarkesto.core.logging.Log.get(GSystemConfig.class);

    public static final String TYPE = "SystemConfig";
    // -----------------------------------------------------------
    // - url
    // -----------------------------------------------------------

    private java.lang.String url;

    public final java.lang.String getUrl() {
        return url;
    }

    public final void setUrl(java.lang.String url) {
        url = prepareUrl(url);
        if (isUrl(url)) return;
        this.url = url;
            updateLastModified();
            fireModified("url", ilarkesto.core.persistance.Persistence.propertyAsString(this.url));
    }

    private final void updateUrl(java.lang.String url) {
        if (isUrl(url)) return;
        this.url = url;
            updateLastModified();
            fireModified("url", ilarkesto.core.persistance.Persistence.propertyAsString(this.url));
    }

    protected java.lang.String prepareUrl(java.lang.String url) {
        // url = Str.removeUnreadableChars(url);
        return url;
    }

    public final boolean isUrlSet() {
        return this.url != null;
    }

    public final boolean isUrl(java.lang.String url) {
        if (this.url == null && url == null) return true;
        return this.url != null && this.url.equals(url);
    }

    protected final void updateUrl(Object value) {
        setUrl((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - adminEmail
    // -----------------------------------------------------------

    private java.lang.String adminEmail;

    public final java.lang.String getAdminEmail() {
        return adminEmail;
    }

    public final void setAdminEmail(java.lang.String adminEmail) {
        adminEmail = prepareAdminEmail(adminEmail);
        if (isAdminEmail(adminEmail)) return;
        this.adminEmail = adminEmail;
            updateLastModified();
            fireModified("adminEmail", ilarkesto.core.persistance.Persistence.propertyAsString(this.adminEmail));
    }

    private final void updateAdminEmail(java.lang.String adminEmail) {
        if (isAdminEmail(adminEmail)) return;
        this.adminEmail = adminEmail;
            updateLastModified();
            fireModified("adminEmail", ilarkesto.core.persistance.Persistence.propertyAsString(this.adminEmail));
    }

    protected java.lang.String prepareAdminEmail(java.lang.String adminEmail) {
        // adminEmail = Str.removeUnreadableChars(adminEmail);
        return adminEmail;
    }

    public final boolean isAdminEmailSet() {
        return this.adminEmail != null;
    }

    public final boolean isAdminEmail(java.lang.String adminEmail) {
        if (this.adminEmail == null && adminEmail == null) return true;
        return this.adminEmail != null && this.adminEmail.equals(adminEmail);
    }

    protected final void updateAdminEmail(Object value) {
        setAdminEmail((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - googleAnalyticsId
    // -----------------------------------------------------------

    private java.lang.String googleAnalyticsId;

    public final java.lang.String getGoogleAnalyticsId() {
        return googleAnalyticsId;
    }

    public final void setGoogleAnalyticsId(java.lang.String googleAnalyticsId) {
        googleAnalyticsId = prepareGoogleAnalyticsId(googleAnalyticsId);
        if (isGoogleAnalyticsId(googleAnalyticsId)) return;
        this.googleAnalyticsId = googleAnalyticsId;
            updateLastModified();
            fireModified("googleAnalyticsId", ilarkesto.core.persistance.Persistence.propertyAsString(this.googleAnalyticsId));
    }

    private final void updateGoogleAnalyticsId(java.lang.String googleAnalyticsId) {
        if (isGoogleAnalyticsId(googleAnalyticsId)) return;
        this.googleAnalyticsId = googleAnalyticsId;
            updateLastModified();
            fireModified("googleAnalyticsId", ilarkesto.core.persistance.Persistence.propertyAsString(this.googleAnalyticsId));
    }

    protected java.lang.String prepareGoogleAnalyticsId(java.lang.String googleAnalyticsId) {
        // googleAnalyticsId = Str.removeUnreadableChars(googleAnalyticsId);
        return googleAnalyticsId;
    }

    public final boolean isGoogleAnalyticsIdSet() {
        return this.googleAnalyticsId != null;
    }

    public final boolean isGoogleAnalyticsId(java.lang.String googleAnalyticsId) {
        if (this.googleAnalyticsId == null && googleAnalyticsId == null) return true;
        return this.googleAnalyticsId != null && this.googleAnalyticsId.equals(googleAnalyticsId);
    }

    protected final void updateGoogleAnalyticsId(Object value) {
        setGoogleAnalyticsId((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - smtpServer
    // -----------------------------------------------------------

    private java.lang.String smtpServer;

    public final java.lang.String getSmtpServer() {
        return smtpServer;
    }

    public final void setSmtpServer(java.lang.String smtpServer) {
        smtpServer = prepareSmtpServer(smtpServer);
        if (isSmtpServer(smtpServer)) return;
        this.smtpServer = smtpServer;
            updateLastModified();
            fireModified("smtpServer", ilarkesto.core.persistance.Persistence.propertyAsString(this.smtpServer));
    }

    private final void updateSmtpServer(java.lang.String smtpServer) {
        if (isSmtpServer(smtpServer)) return;
        this.smtpServer = smtpServer;
            updateLastModified();
            fireModified("smtpServer", ilarkesto.core.persistance.Persistence.propertyAsString(this.smtpServer));
    }

    protected java.lang.String prepareSmtpServer(java.lang.String smtpServer) {
        // smtpServer = Str.removeUnreadableChars(smtpServer);
        return smtpServer;
    }

    public final boolean isSmtpServerSet() {
        return this.smtpServer != null;
    }

    public final boolean isSmtpServer(java.lang.String smtpServer) {
        if (this.smtpServer == null && smtpServer == null) return true;
        return this.smtpServer != null && this.smtpServer.equals(smtpServer);
    }

    protected final void updateSmtpServer(Object value) {
        setSmtpServer((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - smtpPort
    // -----------------------------------------------------------

    private java.lang.Integer smtpPort;

    public final java.lang.Integer getSmtpPort() {
        return smtpPort;
    }

    public final void setSmtpPort(java.lang.Integer smtpPort) {
        smtpPort = prepareSmtpPort(smtpPort);
        if (isSmtpPort(smtpPort)) return;
        this.smtpPort = smtpPort;
            updateLastModified();
            fireModified("smtpPort", ilarkesto.core.persistance.Persistence.propertyAsString(this.smtpPort));
    }

    private final void updateSmtpPort(java.lang.Integer smtpPort) {
        if (isSmtpPort(smtpPort)) return;
        this.smtpPort = smtpPort;
            updateLastModified();
            fireModified("smtpPort", ilarkesto.core.persistance.Persistence.propertyAsString(this.smtpPort));
    }

    protected java.lang.Integer prepareSmtpPort(java.lang.Integer smtpPort) {
        return smtpPort;
    }

    public final boolean isSmtpPortSet() {
        return this.smtpPort != null;
    }

    public final boolean isSmtpPort(java.lang.Integer smtpPort) {
        if (this.smtpPort == null && smtpPort == null) return true;
        return this.smtpPort != null && this.smtpPort.equals(smtpPort);
    }

    protected final void updateSmtpPort(Object value) {
        setSmtpPort((java.lang.Integer)value);
    }
    // -----------------------------------------------------------
    // - smtpTls
    // -----------------------------------------------------------

    private boolean smtpTls;

    public final boolean isSmtpTls() {
        return smtpTls;
    }

    public final void setSmtpTls(boolean smtpTls) {
        smtpTls = prepareSmtpTls(smtpTls);
        if (isSmtpTls(smtpTls)) return;
        this.smtpTls = smtpTls;
            updateLastModified();
            fireModified("smtpTls", ilarkesto.core.persistance.Persistence.propertyAsString(this.smtpTls));
    }

    private final void updateSmtpTls(boolean smtpTls) {
        if (isSmtpTls(smtpTls)) return;
        this.smtpTls = smtpTls;
            updateLastModified();
            fireModified("smtpTls", ilarkesto.core.persistance.Persistence.propertyAsString(this.smtpTls));
    }

    protected boolean prepareSmtpTls(boolean smtpTls) {
        return smtpTls;
    }

    public final boolean isSmtpTls(boolean smtpTls) {
        return this.smtpTls == smtpTls;
    }

    protected final void updateSmtpTls(Object value) {
        setSmtpTls((Boolean)value);
    }
    // -----------------------------------------------------------
    // - smtpUser
    // -----------------------------------------------------------

    private java.lang.String smtpUser;

    public final java.lang.String getSmtpUser() {
        return smtpUser;
    }

    public final void setSmtpUser(java.lang.String smtpUser) {
        smtpUser = prepareSmtpUser(smtpUser);
        if (isSmtpUser(smtpUser)) return;
        this.smtpUser = smtpUser;
            updateLastModified();
            fireModified("smtpUser", ilarkesto.core.persistance.Persistence.propertyAsString(this.smtpUser));
    }

    private final void updateSmtpUser(java.lang.String smtpUser) {
        if (isSmtpUser(smtpUser)) return;
        this.smtpUser = smtpUser;
            updateLastModified();
            fireModified("smtpUser", ilarkesto.core.persistance.Persistence.propertyAsString(this.smtpUser));
    }

    protected java.lang.String prepareSmtpUser(java.lang.String smtpUser) {
        // smtpUser = Str.removeUnreadableChars(smtpUser);
        return smtpUser;
    }

    public final boolean isSmtpUserSet() {
        return this.smtpUser != null;
    }

    public final boolean isSmtpUser(java.lang.String smtpUser) {
        if (this.smtpUser == null && smtpUser == null) return true;
        return this.smtpUser != null && this.smtpUser.equals(smtpUser);
    }

    protected final void updateSmtpUser(Object value) {
        setSmtpUser((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - smtpPassword
    // -----------------------------------------------------------

    private java.lang.String smtpPassword;

    public final java.lang.String getSmtpPassword() {
        return smtpPassword;
    }

    public final void setSmtpPassword(java.lang.String smtpPassword) {
        smtpPassword = prepareSmtpPassword(smtpPassword);
        if (isSmtpPassword(smtpPassword)) return;
        this.smtpPassword = smtpPassword;
            updateLastModified();
            fireModified("smtpPassword", ilarkesto.core.persistance.Persistence.propertyAsString(this.smtpPassword));
    }

    private final void updateSmtpPassword(java.lang.String smtpPassword) {
        if (isSmtpPassword(smtpPassword)) return;
        this.smtpPassword = smtpPassword;
            updateLastModified();
            fireModified("smtpPassword", ilarkesto.core.persistance.Persistence.propertyAsString(this.smtpPassword));
    }

    protected java.lang.String prepareSmtpPassword(java.lang.String smtpPassword) {
        // smtpPassword = Str.removeUnreadableChars(smtpPassword);
        return smtpPassword;
    }

    public final boolean isSmtpPasswordSet() {
        return this.smtpPassword != null;
    }

    public final boolean isSmtpPassword(java.lang.String smtpPassword) {
        if (this.smtpPassword == null && smtpPassword == null) return true;
        return this.smtpPassword != null && this.smtpPassword.equals(smtpPassword);
    }

    protected final void updateSmtpPassword(Object value) {
        setSmtpPassword((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - smtpFrom
    // -----------------------------------------------------------

    private java.lang.String smtpFrom;

    public final java.lang.String getSmtpFrom() {
        return smtpFrom;
    }

    public final void setSmtpFrom(java.lang.String smtpFrom) {
        smtpFrom = prepareSmtpFrom(smtpFrom);
        if (isSmtpFrom(smtpFrom)) return;
        this.smtpFrom = smtpFrom;
            updateLastModified();
            fireModified("smtpFrom", ilarkesto.core.persistance.Persistence.propertyAsString(this.smtpFrom));
    }

    private final void updateSmtpFrom(java.lang.String smtpFrom) {
        if (isSmtpFrom(smtpFrom)) return;
        this.smtpFrom = smtpFrom;
            updateLastModified();
            fireModified("smtpFrom", ilarkesto.core.persistance.Persistence.propertyAsString(this.smtpFrom));
    }

    protected java.lang.String prepareSmtpFrom(java.lang.String smtpFrom) {
        // smtpFrom = Str.removeUnreadableChars(smtpFrom);
        return smtpFrom;
    }

    public final boolean isSmtpFromSet() {
        return this.smtpFrom != null;
    }

    public final boolean isSmtpFrom(java.lang.String smtpFrom) {
        if (this.smtpFrom == null && smtpFrom == null) return true;
        return this.smtpFrom != null && this.smtpFrom.equals(smtpFrom);
    }

    protected final void updateSmtpFrom(Object value) {
        setSmtpFrom((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - instanceName
    // -----------------------------------------------------------

    private java.lang.String instanceName;

    public final java.lang.String getInstanceName() {
        return instanceName;
    }

    public final void setInstanceName(java.lang.String instanceName) {
        instanceName = prepareInstanceName(instanceName);
        if (isInstanceName(instanceName)) return;
        this.instanceName = instanceName;
            updateLastModified();
            fireModified("instanceName", ilarkesto.core.persistance.Persistence.propertyAsString(this.instanceName));
    }

    private final void updateInstanceName(java.lang.String instanceName) {
        if (isInstanceName(instanceName)) return;
        this.instanceName = instanceName;
            updateLastModified();
            fireModified("instanceName", ilarkesto.core.persistance.Persistence.propertyAsString(this.instanceName));
    }

    protected java.lang.String prepareInstanceName(java.lang.String instanceName) {
        // instanceName = Str.removeUnreadableChars(instanceName);
        return instanceName;
    }

    public final boolean isInstanceNameSet() {
        return this.instanceName != null;
    }

    public final boolean isInstanceName(java.lang.String instanceName) {
        if (this.instanceName == null && instanceName == null) return true;
        return this.instanceName != null && this.instanceName.equals(instanceName);
    }

    protected final void updateInstanceName(Object value) {
        setInstanceName((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - loginPageLogoUrl
    // -----------------------------------------------------------

    private java.lang.String loginPageLogoUrl;

    public final java.lang.String getLoginPageLogoUrl() {
        return loginPageLogoUrl;
    }

    public final void setLoginPageLogoUrl(java.lang.String loginPageLogoUrl) {
        loginPageLogoUrl = prepareLoginPageLogoUrl(loginPageLogoUrl);
        if (isLoginPageLogoUrl(loginPageLogoUrl)) return;
        this.loginPageLogoUrl = loginPageLogoUrl;
            updateLastModified();
            fireModified("loginPageLogoUrl", ilarkesto.core.persistance.Persistence.propertyAsString(this.loginPageLogoUrl));
    }

    private final void updateLoginPageLogoUrl(java.lang.String loginPageLogoUrl) {
        if (isLoginPageLogoUrl(loginPageLogoUrl)) return;
        this.loginPageLogoUrl = loginPageLogoUrl;
            updateLastModified();
            fireModified("loginPageLogoUrl", ilarkesto.core.persistance.Persistence.propertyAsString(this.loginPageLogoUrl));
    }

    protected java.lang.String prepareLoginPageLogoUrl(java.lang.String loginPageLogoUrl) {
        // loginPageLogoUrl = Str.removeUnreadableChars(loginPageLogoUrl);
        return loginPageLogoUrl;
    }

    public final boolean isLoginPageLogoUrlSet() {
        return this.loginPageLogoUrl != null;
    }

    public final boolean isLoginPageLogoUrl(java.lang.String loginPageLogoUrl) {
        if (this.loginPageLogoUrl == null && loginPageLogoUrl == null) return true;
        return this.loginPageLogoUrl != null && this.loginPageLogoUrl.equals(loginPageLogoUrl);
    }

    protected final void updateLoginPageLogoUrl(Object value) {
        setLoginPageLogoUrl((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - loginPageMessage
    // -----------------------------------------------------------

    private java.lang.String loginPageMessage;

    public final java.lang.String getLoginPageMessage() {
        return loginPageMessage;
    }

    public final void setLoginPageMessage(java.lang.String loginPageMessage) {
        loginPageMessage = prepareLoginPageMessage(loginPageMessage);
        if (isLoginPageMessage(loginPageMessage)) return;
        this.loginPageMessage = loginPageMessage;
            updateLastModified();
            fireModified("loginPageMessage", ilarkesto.core.persistance.Persistence.propertyAsString(this.loginPageMessage));
    }

    private final void updateLoginPageMessage(java.lang.String loginPageMessage) {
        if (isLoginPageMessage(loginPageMessage)) return;
        this.loginPageMessage = loginPageMessage;
            updateLastModified();
            fireModified("loginPageMessage", ilarkesto.core.persistance.Persistence.propertyAsString(this.loginPageMessage));
    }

    protected java.lang.String prepareLoginPageMessage(java.lang.String loginPageMessage) {
        // loginPageMessage = Str.removeUnreadableChars(loginPageMessage);
        return loginPageMessage;
    }

    public final boolean isLoginPageMessageSet() {
        return this.loginPageMessage != null;
    }

    public final boolean isLoginPageMessage(java.lang.String loginPageMessage) {
        if (this.loginPageMessage == null && loginPageMessage == null) return true;
        return this.loginPageMessage != null && this.loginPageMessage.equals(loginPageMessage);
    }

    protected final void updateLoginPageMessage(Object value) {
        setLoginPageMessage((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - registerPageMessage
    // -----------------------------------------------------------

    private java.lang.String registerPageMessage;

    public final java.lang.String getRegisterPageMessage() {
        return registerPageMessage;
    }

    public final void setRegisterPageMessage(java.lang.String registerPageMessage) {
        registerPageMessage = prepareRegisterPageMessage(registerPageMessage);
        if (isRegisterPageMessage(registerPageMessage)) return;
        this.registerPageMessage = registerPageMessage;
            updateLastModified();
            fireModified("registerPageMessage", ilarkesto.core.persistance.Persistence.propertyAsString(this.registerPageMessage));
    }

    private final void updateRegisterPageMessage(java.lang.String registerPageMessage) {
        if (isRegisterPageMessage(registerPageMessage)) return;
        this.registerPageMessage = registerPageMessage;
            updateLastModified();
            fireModified("registerPageMessage", ilarkesto.core.persistance.Persistence.propertyAsString(this.registerPageMessage));
    }

    protected java.lang.String prepareRegisterPageMessage(java.lang.String registerPageMessage) {
        // registerPageMessage = Str.removeUnreadableChars(registerPageMessage);
        return registerPageMessage;
    }

    public final boolean isRegisterPageMessageSet() {
        return this.registerPageMessage != null;
    }

    public final boolean isRegisterPageMessage(java.lang.String registerPageMessage) {
        if (this.registerPageMessage == null && registerPageMessage == null) return true;
        return this.registerPageMessage != null && this.registerPageMessage.equals(registerPageMessage);
    }

    protected final void updateRegisterPageMessage(Object value) {
        setRegisterPageMessage((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - aboutPageMessage
    // -----------------------------------------------------------

    private java.lang.String aboutPageMessage;

    public final java.lang.String getAboutPageMessage() {
        return aboutPageMessage;
    }

    public final void setAboutPageMessage(java.lang.String aboutPageMessage) {
        aboutPageMessage = prepareAboutPageMessage(aboutPageMessage);
        if (isAboutPageMessage(aboutPageMessage)) return;
        this.aboutPageMessage = aboutPageMessage;
            updateLastModified();
            fireModified("aboutPageMessage", ilarkesto.core.persistance.Persistence.propertyAsString(this.aboutPageMessage));
    }

    private final void updateAboutPageMessage(java.lang.String aboutPageMessage) {
        if (isAboutPageMessage(aboutPageMessage)) return;
        this.aboutPageMessage = aboutPageMessage;
            updateLastModified();
            fireModified("aboutPageMessage", ilarkesto.core.persistance.Persistence.propertyAsString(this.aboutPageMessage));
    }

    protected java.lang.String prepareAboutPageMessage(java.lang.String aboutPageMessage) {
        // aboutPageMessage = Str.removeUnreadableChars(aboutPageMessage);
        return aboutPageMessage;
    }

    public final boolean isAboutPageMessageSet() {
        return this.aboutPageMessage != null;
    }

    public final boolean isAboutPageMessage(java.lang.String aboutPageMessage) {
        if (this.aboutPageMessage == null && aboutPageMessage == null) return true;
        return this.aboutPageMessage != null && this.aboutPageMessage.equals(aboutPageMessage);
    }

    protected final void updateAboutPageMessage(Object value) {
        setAboutPageMessage((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - userEmailMandatory
    // -----------------------------------------------------------

    private boolean userEmailMandatory;

    public final boolean isUserEmailMandatory() {
        return userEmailMandatory;
    }

    public final void setUserEmailMandatory(boolean userEmailMandatory) {
        userEmailMandatory = prepareUserEmailMandatory(userEmailMandatory);
        if (isUserEmailMandatory(userEmailMandatory)) return;
        this.userEmailMandatory = userEmailMandatory;
            updateLastModified();
            fireModified("userEmailMandatory", ilarkesto.core.persistance.Persistence.propertyAsString(this.userEmailMandatory));
    }

    private final void updateUserEmailMandatory(boolean userEmailMandatory) {
        if (isUserEmailMandatory(userEmailMandatory)) return;
        this.userEmailMandatory = userEmailMandatory;
            updateLastModified();
            fireModified("userEmailMandatory", ilarkesto.core.persistance.Persistence.propertyAsString(this.userEmailMandatory));
    }

    protected boolean prepareUserEmailMandatory(boolean userEmailMandatory) {
        return userEmailMandatory;
    }

    public final boolean isUserEmailMandatory(boolean userEmailMandatory) {
        return this.userEmailMandatory == userEmailMandatory;
    }

    protected final void updateUserEmailMandatory(Object value) {
        setUserEmailMandatory((Boolean)value);
    }
    // -----------------------------------------------------------
    // - registrationDisabled
    // -----------------------------------------------------------

    private boolean registrationDisabled;

    public final boolean isRegistrationDisabled() {
        return registrationDisabled;
    }

    public final void setRegistrationDisabled(boolean registrationDisabled) {
        registrationDisabled = prepareRegistrationDisabled(registrationDisabled);
        if (isRegistrationDisabled(registrationDisabled)) return;
        this.registrationDisabled = registrationDisabled;
            updateLastModified();
            fireModified("registrationDisabled", ilarkesto.core.persistance.Persistence.propertyAsString(this.registrationDisabled));
    }

    private final void updateRegistrationDisabled(boolean registrationDisabled) {
        if (isRegistrationDisabled(registrationDisabled)) return;
        this.registrationDisabled = registrationDisabled;
            updateLastModified();
            fireModified("registrationDisabled", ilarkesto.core.persistance.Persistence.propertyAsString(this.registrationDisabled));
    }

    protected boolean prepareRegistrationDisabled(boolean registrationDisabled) {
        return registrationDisabled;
    }

    public final boolean isRegistrationDisabled(boolean registrationDisabled) {
        return this.registrationDisabled == registrationDisabled;
    }

    protected final void updateRegistrationDisabled(Object value) {
        setRegistrationDisabled((Boolean)value);
    }
    // -----------------------------------------------------------
    // - projectCreationDisabled
    // -----------------------------------------------------------

    private boolean projectCreationDisabled;

    public final boolean isProjectCreationDisabled() {
        return projectCreationDisabled;
    }

    public final void setProjectCreationDisabled(boolean projectCreationDisabled) {
        projectCreationDisabled = prepareProjectCreationDisabled(projectCreationDisabled);
        if (isProjectCreationDisabled(projectCreationDisabled)) return;
        this.projectCreationDisabled = projectCreationDisabled;
            updateLastModified();
            fireModified("projectCreationDisabled", ilarkesto.core.persistance.Persistence.propertyAsString(this.projectCreationDisabled));
    }

    private final void updateProjectCreationDisabled(boolean projectCreationDisabled) {
        if (isProjectCreationDisabled(projectCreationDisabled)) return;
        this.projectCreationDisabled = projectCreationDisabled;
            updateLastModified();
            fireModified("projectCreationDisabled", ilarkesto.core.persistance.Persistence.propertyAsString(this.projectCreationDisabled));
    }

    protected boolean prepareProjectCreationDisabled(boolean projectCreationDisabled) {
        return projectCreationDisabled;
    }

    public final boolean isProjectCreationDisabled(boolean projectCreationDisabled) {
        return this.projectCreationDisabled == projectCreationDisabled;
    }

    protected final void updateProjectCreationDisabled(Object value) {
        setProjectCreationDisabled((Boolean)value);
    }
    // -----------------------------------------------------------
    // - defaultUserPassword
    // -----------------------------------------------------------

    private java.lang.String defaultUserPassword;

    public final java.lang.String getDefaultUserPassword() {
        return defaultUserPassword;
    }

    public final void setDefaultUserPassword(java.lang.String defaultUserPassword) {
        defaultUserPassword = prepareDefaultUserPassword(defaultUserPassword);
        if (isDefaultUserPassword(defaultUserPassword)) return;
        this.defaultUserPassword = defaultUserPassword;
            updateLastModified();
            fireModified("defaultUserPassword", ilarkesto.core.persistance.Persistence.propertyAsString(this.defaultUserPassword));
    }

    private final void updateDefaultUserPassword(java.lang.String defaultUserPassword) {
        if (isDefaultUserPassword(defaultUserPassword)) return;
        this.defaultUserPassword = defaultUserPassword;
            updateLastModified();
            fireModified("defaultUserPassword", ilarkesto.core.persistance.Persistence.propertyAsString(this.defaultUserPassword));
    }

    protected java.lang.String prepareDefaultUserPassword(java.lang.String defaultUserPassword) {
        // defaultUserPassword = Str.removeUnreadableChars(defaultUserPassword);
        return defaultUserPassword;
    }

    public final boolean isDefaultUserPasswordSet() {
        return this.defaultUserPassword != null;
    }

    public final boolean isDefaultUserPassword(java.lang.String defaultUserPassword) {
        if (this.defaultUserPassword == null && defaultUserPassword == null) return true;
        return this.defaultUserPassword != null && this.defaultUserPassword.equals(defaultUserPassword);
    }

    protected final void updateDefaultUserPassword(Object value) {
        setDefaultUserPassword((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - openIdDisabled
    // -----------------------------------------------------------

    private boolean openIdDisabled;

    public final boolean isOpenIdDisabled() {
        return openIdDisabled;
    }

    public final void setOpenIdDisabled(boolean openIdDisabled) {
        openIdDisabled = prepareOpenIdDisabled(openIdDisabled);
        if (isOpenIdDisabled(openIdDisabled)) return;
        this.openIdDisabled = openIdDisabled;
            updateLastModified();
            fireModified("openIdDisabled", ilarkesto.core.persistance.Persistence.propertyAsString(this.openIdDisabled));
    }

    private final void updateOpenIdDisabled(boolean openIdDisabled) {
        if (isOpenIdDisabled(openIdDisabled)) return;
        this.openIdDisabled = openIdDisabled;
            updateLastModified();
            fireModified("openIdDisabled", ilarkesto.core.persistance.Persistence.propertyAsString(this.openIdDisabled));
    }

    protected boolean prepareOpenIdDisabled(boolean openIdDisabled) {
        return openIdDisabled;
    }

    public final boolean isOpenIdDisabled(boolean openIdDisabled) {
        return this.openIdDisabled == openIdDisabled;
    }

    protected final void updateOpenIdDisabled(Object value) {
        setOpenIdDisabled((Boolean)value);
    }
    // -----------------------------------------------------------
    // - openIdDomains
    // -----------------------------------------------------------

    private java.lang.String openIdDomains;

    public final java.lang.String getOpenIdDomains() {
        return openIdDomains;
    }

    public final void setOpenIdDomains(java.lang.String openIdDomains) {
        openIdDomains = prepareOpenIdDomains(openIdDomains);
        if (isOpenIdDomains(openIdDomains)) return;
        this.openIdDomains = openIdDomains;
            updateLastModified();
            fireModified("openIdDomains", ilarkesto.core.persistance.Persistence.propertyAsString(this.openIdDomains));
    }

    private final void updateOpenIdDomains(java.lang.String openIdDomains) {
        if (isOpenIdDomains(openIdDomains)) return;
        this.openIdDomains = openIdDomains;
            updateLastModified();
            fireModified("openIdDomains", ilarkesto.core.persistance.Persistence.propertyAsString(this.openIdDomains));
    }

    protected java.lang.String prepareOpenIdDomains(java.lang.String openIdDomains) {
        // openIdDomains = Str.removeUnreadableChars(openIdDomains);
        return openIdDomains;
    }

    public final boolean isOpenIdDomainsSet() {
        return this.openIdDomains != null;
    }

    public final boolean isOpenIdDomains(java.lang.String openIdDomains) {
        if (this.openIdDomains == null && openIdDomains == null) return true;
        return this.openIdDomains != null && this.openIdDomains.equals(openIdDomains);
    }

    protected final void updateOpenIdDomains(Object value) {
        setOpenIdDomains((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - versionCheckEnabled
    // -----------------------------------------------------------

    private boolean versionCheckEnabled;

    public final boolean isVersionCheckEnabled() {
        return versionCheckEnabled;
    }

    public final void setVersionCheckEnabled(boolean versionCheckEnabled) {
        versionCheckEnabled = prepareVersionCheckEnabled(versionCheckEnabled);
        if (isVersionCheckEnabled(versionCheckEnabled)) return;
        this.versionCheckEnabled = versionCheckEnabled;
            updateLastModified();
            fireModified("versionCheckEnabled", ilarkesto.core.persistance.Persistence.propertyAsString(this.versionCheckEnabled));
    }

    private final void updateVersionCheckEnabled(boolean versionCheckEnabled) {
        if (isVersionCheckEnabled(versionCheckEnabled)) return;
        this.versionCheckEnabled = versionCheckEnabled;
            updateLastModified();
            fireModified("versionCheckEnabled", ilarkesto.core.persistance.Persistence.propertyAsString(this.versionCheckEnabled));
    }

    protected boolean prepareVersionCheckEnabled(boolean versionCheckEnabled) {
        return versionCheckEnabled;
    }

    public final boolean isVersionCheckEnabled(boolean versionCheckEnabled) {
        return this.versionCheckEnabled == versionCheckEnabled;
    }

    protected final void updateVersionCheckEnabled(Object value) {
        setVersionCheckEnabled((Boolean)value);
    }
    // -----------------------------------------------------------
    // - ldapEnabled
    // -----------------------------------------------------------

    private boolean ldapEnabled;

    public final boolean isLdapEnabled() {
        return ldapEnabled;
    }

    public final void setLdapEnabled(boolean ldapEnabled) {
        ldapEnabled = prepareLdapEnabled(ldapEnabled);
        if (isLdapEnabled(ldapEnabled)) return;
        this.ldapEnabled = ldapEnabled;
            updateLastModified();
            fireModified("ldapEnabled", ilarkesto.core.persistance.Persistence.propertyAsString(this.ldapEnabled));
    }

    private final void updateLdapEnabled(boolean ldapEnabled) {
        if (isLdapEnabled(ldapEnabled)) return;
        this.ldapEnabled = ldapEnabled;
            updateLastModified();
            fireModified("ldapEnabled", ilarkesto.core.persistance.Persistence.propertyAsString(this.ldapEnabled));
    }

    protected boolean prepareLdapEnabled(boolean ldapEnabled) {
        return ldapEnabled;
    }

    public final boolean isLdapEnabled(boolean ldapEnabled) {
        return this.ldapEnabled == ldapEnabled;
    }

    protected final void updateLdapEnabled(Object value) {
        setLdapEnabled((Boolean)value);
    }
    // -----------------------------------------------------------
    // - ldapUrl
    // -----------------------------------------------------------

    private java.lang.String ldapUrl;

    public final java.lang.String getLdapUrl() {
        return ldapUrl;
    }

    public final void setLdapUrl(java.lang.String ldapUrl) {
        ldapUrl = prepareLdapUrl(ldapUrl);
        if (isLdapUrl(ldapUrl)) return;
        this.ldapUrl = ldapUrl;
            updateLastModified();
            fireModified("ldapUrl", ilarkesto.core.persistance.Persistence.propertyAsString(this.ldapUrl));
    }

    private final void updateLdapUrl(java.lang.String ldapUrl) {
        if (isLdapUrl(ldapUrl)) return;
        this.ldapUrl = ldapUrl;
            updateLastModified();
            fireModified("ldapUrl", ilarkesto.core.persistance.Persistence.propertyAsString(this.ldapUrl));
    }

    protected java.lang.String prepareLdapUrl(java.lang.String ldapUrl) {
        // ldapUrl = Str.removeUnreadableChars(ldapUrl);
        return ldapUrl;
    }

    public final boolean isLdapUrlSet() {
        return this.ldapUrl != null;
    }

    public final boolean isLdapUrl(java.lang.String ldapUrl) {
        if (this.ldapUrl == null && ldapUrl == null) return true;
        return this.ldapUrl != null && this.ldapUrl.equals(ldapUrl);
    }

    protected final void updateLdapUrl(Object value) {
        setLdapUrl((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - ldapUser
    // -----------------------------------------------------------

    private java.lang.String ldapUser;

    public final java.lang.String getLdapUser() {
        return ldapUser;
    }

    public final void setLdapUser(java.lang.String ldapUser) {
        ldapUser = prepareLdapUser(ldapUser);
        if (isLdapUser(ldapUser)) return;
        this.ldapUser = ldapUser;
            updateLastModified();
            fireModified("ldapUser", ilarkesto.core.persistance.Persistence.propertyAsString(this.ldapUser));
    }

    private final void updateLdapUser(java.lang.String ldapUser) {
        if (isLdapUser(ldapUser)) return;
        this.ldapUser = ldapUser;
            updateLastModified();
            fireModified("ldapUser", ilarkesto.core.persistance.Persistence.propertyAsString(this.ldapUser));
    }

    protected java.lang.String prepareLdapUser(java.lang.String ldapUser) {
        // ldapUser = Str.removeUnreadableChars(ldapUser);
        return ldapUser;
    }

    public final boolean isLdapUserSet() {
        return this.ldapUser != null;
    }

    public final boolean isLdapUser(java.lang.String ldapUser) {
        if (this.ldapUser == null && ldapUser == null) return true;
        return this.ldapUser != null && this.ldapUser.equals(ldapUser);
    }

    protected final void updateLdapUser(Object value) {
        setLdapUser((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - ldapPassword
    // -----------------------------------------------------------

    private java.lang.String ldapPassword;

    public final java.lang.String getLdapPassword() {
        return ldapPassword;
    }

    public final void setLdapPassword(java.lang.String ldapPassword) {
        ldapPassword = prepareLdapPassword(ldapPassword);
        if (isLdapPassword(ldapPassword)) return;
        this.ldapPassword = ldapPassword;
            updateLastModified();
            fireModified("ldapPassword", ilarkesto.core.persistance.Persistence.propertyAsString(this.ldapPassword));
    }

    private final void updateLdapPassword(java.lang.String ldapPassword) {
        if (isLdapPassword(ldapPassword)) return;
        this.ldapPassword = ldapPassword;
            updateLastModified();
            fireModified("ldapPassword", ilarkesto.core.persistance.Persistence.propertyAsString(this.ldapPassword));
    }

    protected java.lang.String prepareLdapPassword(java.lang.String ldapPassword) {
        // ldapPassword = Str.removeUnreadableChars(ldapPassword);
        return ldapPassword;
    }

    public final boolean isLdapPasswordSet() {
        return this.ldapPassword != null;
    }

    public final boolean isLdapPassword(java.lang.String ldapPassword) {
        if (this.ldapPassword == null && ldapPassword == null) return true;
        return this.ldapPassword != null && this.ldapPassword.equals(ldapPassword);
    }

    protected final void updateLdapPassword(Object value) {
        setLdapPassword((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - ldapBaseDn
    // -----------------------------------------------------------

    private java.lang.String ldapBaseDn;

    public final java.lang.String getLdapBaseDn() {
        return ldapBaseDn;
    }

    public final void setLdapBaseDn(java.lang.String ldapBaseDn) {
        ldapBaseDn = prepareLdapBaseDn(ldapBaseDn);
        if (isLdapBaseDn(ldapBaseDn)) return;
        this.ldapBaseDn = ldapBaseDn;
            updateLastModified();
            fireModified("ldapBaseDn", ilarkesto.core.persistance.Persistence.propertyAsString(this.ldapBaseDn));
    }

    private final void updateLdapBaseDn(java.lang.String ldapBaseDn) {
        if (isLdapBaseDn(ldapBaseDn)) return;
        this.ldapBaseDn = ldapBaseDn;
            updateLastModified();
            fireModified("ldapBaseDn", ilarkesto.core.persistance.Persistence.propertyAsString(this.ldapBaseDn));
    }

    protected java.lang.String prepareLdapBaseDn(java.lang.String ldapBaseDn) {
        // ldapBaseDn = Str.removeUnreadableChars(ldapBaseDn);
        return ldapBaseDn;
    }

    public final boolean isLdapBaseDnSet() {
        return this.ldapBaseDn != null;
    }

    public final boolean isLdapBaseDn(java.lang.String ldapBaseDn) {
        if (this.ldapBaseDn == null && ldapBaseDn == null) return true;
        return this.ldapBaseDn != null && this.ldapBaseDn.equals(ldapBaseDn);
    }

    protected final void updateLdapBaseDn(Object value) {
        setLdapBaseDn((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - ldapUserFilterRegex
    // -----------------------------------------------------------

    private java.lang.String ldapUserFilterRegex;

    public final java.lang.String getLdapUserFilterRegex() {
        return ldapUserFilterRegex;
    }

    public final void setLdapUserFilterRegex(java.lang.String ldapUserFilterRegex) {
        ldapUserFilterRegex = prepareLdapUserFilterRegex(ldapUserFilterRegex);
        if (isLdapUserFilterRegex(ldapUserFilterRegex)) return;
        this.ldapUserFilterRegex = ldapUserFilterRegex;
            updateLastModified();
            fireModified("ldapUserFilterRegex", ilarkesto.core.persistance.Persistence.propertyAsString(this.ldapUserFilterRegex));
    }

    private final void updateLdapUserFilterRegex(java.lang.String ldapUserFilterRegex) {
        if (isLdapUserFilterRegex(ldapUserFilterRegex)) return;
        this.ldapUserFilterRegex = ldapUserFilterRegex;
            updateLastModified();
            fireModified("ldapUserFilterRegex", ilarkesto.core.persistance.Persistence.propertyAsString(this.ldapUserFilterRegex));
    }

    protected java.lang.String prepareLdapUserFilterRegex(java.lang.String ldapUserFilterRegex) {
        // ldapUserFilterRegex = Str.removeUnreadableChars(ldapUserFilterRegex);
        return ldapUserFilterRegex;
    }

    public final boolean isLdapUserFilterRegexSet() {
        return this.ldapUserFilterRegex != null;
    }

    public final boolean isLdapUserFilterRegex(java.lang.String ldapUserFilterRegex) {
        if (this.ldapUserFilterRegex == null && ldapUserFilterRegex == null) return true;
        return this.ldapUserFilterRegex != null && this.ldapUserFilterRegex.equals(ldapUserFilterRegex);
    }

    protected final void updateLdapUserFilterRegex(Object value) {
        setLdapUserFilterRegex((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - maxFileSize
    // -----------------------------------------------------------

    private java.lang.Integer maxFileSize;

    public final java.lang.Integer getMaxFileSize() {
        return maxFileSize;
    }

    public final void setMaxFileSize(java.lang.Integer maxFileSize) {
        maxFileSize = prepareMaxFileSize(maxFileSize);
        if (isMaxFileSize(maxFileSize)) return;
        this.maxFileSize = maxFileSize;
            updateLastModified();
            fireModified("maxFileSize", ilarkesto.core.persistance.Persistence.propertyAsString(this.maxFileSize));
    }

    private final void updateMaxFileSize(java.lang.Integer maxFileSize) {
        if (isMaxFileSize(maxFileSize)) return;
        this.maxFileSize = maxFileSize;
            updateLastModified();
            fireModified("maxFileSize", ilarkesto.core.persistance.Persistence.propertyAsString(this.maxFileSize));
    }

    protected java.lang.Integer prepareMaxFileSize(java.lang.Integer maxFileSize) {
        return maxFileSize;
    }

    public final boolean isMaxFileSizeSet() {
        return this.maxFileSize != null;
    }

    public final boolean isMaxFileSize(java.lang.Integer maxFileSize) {
        if (this.maxFileSize == null && maxFileSize == null) return true;
        return this.maxFileSize != null && this.maxFileSize.equals(maxFileSize);
    }

    protected final void updateMaxFileSize(Object value) {
        setMaxFileSize((java.lang.Integer)value);
    }
    // -----------------------------------------------------------
    // - subscriptionKeySeed
    // -----------------------------------------------------------

    private java.lang.String subscriptionKeySeed;

    public final java.lang.String getSubscriptionKeySeed() {
        return subscriptionKeySeed;
    }

    public final void setSubscriptionKeySeed(java.lang.String subscriptionKeySeed) {
        subscriptionKeySeed = prepareSubscriptionKeySeed(subscriptionKeySeed);
        if (isSubscriptionKeySeed(subscriptionKeySeed)) return;
        this.subscriptionKeySeed = subscriptionKeySeed;
            updateLastModified();
            fireModified("subscriptionKeySeed", ilarkesto.core.persistance.Persistence.propertyAsString(this.subscriptionKeySeed));
    }

    private final void updateSubscriptionKeySeed(java.lang.String subscriptionKeySeed) {
        if (isSubscriptionKeySeed(subscriptionKeySeed)) return;
        this.subscriptionKeySeed = subscriptionKeySeed;
            updateLastModified();
            fireModified("subscriptionKeySeed", ilarkesto.core.persistance.Persistence.propertyAsString(this.subscriptionKeySeed));
    }

    protected java.lang.String prepareSubscriptionKeySeed(java.lang.String subscriptionKeySeed) {
        // subscriptionKeySeed = Str.removeUnreadableChars(subscriptionKeySeed);
        return subscriptionKeySeed;
    }

    public final boolean isSubscriptionKeySeedSet() {
        return this.subscriptionKeySeed != null;
    }

    public final boolean isSubscriptionKeySeed(java.lang.String subscriptionKeySeed) {
        if (this.subscriptionKeySeed == null && subscriptionKeySeed == null) return true;
        return this.subscriptionKeySeed != null && this.subscriptionKeySeed.equals(subscriptionKeySeed);
    }

    protected final void updateSubscriptionKeySeed(Object value) {
        setSubscriptionKeySeed((java.lang.String)value);
    }

    public void updateProperties(Map<String, String> properties) {
        super.updateProperties(properties);
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            String property = entry.getKey();
            if (property.equals("id")) continue;
            String value = entry.getValue();
            if (property.equals("url")) updateUrl(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("adminEmail")) updateAdminEmail(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("googleAnalyticsId")) updateGoogleAnalyticsId(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("smtpServer")) updateSmtpServer(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("smtpPort")) updateSmtpPort(ilarkesto.core.persistance.Persistence.parsePropertyInteger(value));
            if (property.equals("smtpTls")) updateSmtpTls(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("smtpUser")) updateSmtpUser(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("smtpPassword")) updateSmtpPassword(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("smtpFrom")) updateSmtpFrom(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("instanceName")) updateInstanceName(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("loginPageLogoUrl")) updateLoginPageLogoUrl(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("loginPageMessage")) updateLoginPageMessage(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("registerPageMessage")) updateRegisterPageMessage(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("aboutPageMessage")) updateAboutPageMessage(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("userEmailMandatory")) updateUserEmailMandatory(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("registrationDisabled")) updateRegistrationDisabled(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("projectCreationDisabled")) updateProjectCreationDisabled(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("defaultUserPassword")) updateDefaultUserPassword(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("openIdDisabled")) updateOpenIdDisabled(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("openIdDomains")) updateOpenIdDomains(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("versionCheckEnabled")) updateVersionCheckEnabled(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("ldapEnabled")) updateLdapEnabled(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("ldapUrl")) updateLdapUrl(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("ldapUser")) updateLdapUser(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("ldapPassword")) updateLdapPassword(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("ldapBaseDn")) updateLdapBaseDn(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("ldapUserFilterRegex")) updateLdapUserFilterRegex(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("maxFileSize")) updateMaxFileSize(ilarkesto.core.persistance.Persistence.parsePropertyInteger(value));
            if (property.equals("subscriptionKeySeed")) updateSubscriptionKeySeed(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
        }
    }

    protected void repairDeadReferences(String entityId) {
        if (!isPersisted()) return;
        super.repairDeadReferences(entityId);
    }

    // --- ensure integrity ---
    @Override
    public void onEnsureIntegrity() {
        super.onEnsureIntegrity();
        if (listAll().size() > 1) throw new IllegalStateException("Multiple singleton instances: SystemConfig");
    }

    static scrum.server.admin.SystemConfigDao systemConfigDao;

    public static final void setSystemConfigDao(scrum.server.admin.SystemConfigDao systemConfigDao) {
        GSystemConfig.systemConfigDao = systemConfigDao;
    }

}