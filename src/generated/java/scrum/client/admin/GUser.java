// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: scrum.mda.KunagiModelApplication$1










package scrum.client.admin;

import java.util.*;
import ilarkesto.core.base.Utl;
import ilarkesto.core.logging.Log;
import ilarkesto.core.base.Str;
import ilarkesto.core.persistance.AEntity;
import ilarkesto.core.persistance.EntityDoesNotExistException;

public abstract class GUser
            extends scrum.client.common.AScrumGwtEntity
            implements java.lang.Comparable<User> {

    public static class UserMetadata implements ilarkesto.core.persistance.meta.EntityMetadata {

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata name = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "name";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).getName();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata password = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "password";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).getPassword();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata passwordSalt = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "passwordSalt";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).getPasswordSalt();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata publicName = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "publicName";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).getPublicName();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata fullName = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "fullName";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).getFullName();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata admin = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "admin";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).isAdmin();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata emailVerified = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "emailVerified";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).isEmailVerified();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata email = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "email";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).getEmail();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata currentProject = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "currentProject";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).getCurrentProject();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata color = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "color";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).getColor();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata lastLoginDateAndTime = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "lastLoginDateAndTime";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).getLastLoginDateAndTime();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata registrationDateAndTime = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "registrationDateAndTime";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).getRegistrationDateAndTime();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata disabled = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "disabled";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).isDisabled();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata hideUserGuideBlog = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "hideUserGuideBlog";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).isHideUserGuideBlog();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata hideUserGuideCalendar = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "hideUserGuideCalendar";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).isHideUserGuideCalendar();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata hideUserGuideFiles = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "hideUserGuideFiles";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).isHideUserGuideFiles();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata hideUserGuideForum = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "hideUserGuideForum";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).isHideUserGuideForum();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata hideUserGuideImpediments = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "hideUserGuideImpediments";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).isHideUserGuideImpediments();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata hideUserGuideIssues = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "hideUserGuideIssues";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).isHideUserGuideIssues();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata hideUserGuideJournal = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "hideUserGuideJournal";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).isHideUserGuideJournal();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata hideUserGuideNextSprint = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "hideUserGuideNextSprint";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).isHideUserGuideNextSprint();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata hideUserGuideProductBacklog = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "hideUserGuideProductBacklog";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).isHideUserGuideProductBacklog();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata hideUserGuideCourtroom = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "hideUserGuideCourtroom";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).isHideUserGuideCourtroom();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata hideUserGuideQualityBacklog = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "hideUserGuideQualityBacklog";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).isHideUserGuideQualityBacklog();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata hideUserGuideReleases = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "hideUserGuideReleases";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).isHideUserGuideReleases();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata hideUserGuideRisks = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "hideUserGuideRisks";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).isHideUserGuideRisks();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata hideUserGuideSprintBacklog = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "hideUserGuideSprintBacklog";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).isHideUserGuideSprintBacklog();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata hideUserGuideWhiteboard = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "hideUserGuideWhiteboard";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).isHideUserGuideWhiteboard();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata loginToken = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "loginToken";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).getLoginToken();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata openId = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "openId";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).getOpenId();
            }

        };

        public static transient ilarkesto.core.persistance.meta.EntityFieldMetadata[] fields = new ilarkesto.core.persistance.meta.EntityFieldMetadata[] {
            name
            ,password
            ,passwordSalt
            ,publicName
            ,fullName
            ,admin
            ,emailVerified
            ,email
            ,currentProject
            ,color
            ,lastLoginDateAndTime
            ,registrationDateAndTime
            ,disabled
            ,hideUserGuideBlog
            ,hideUserGuideCalendar
            ,hideUserGuideFiles
            ,hideUserGuideForum
            ,hideUserGuideImpediments
            ,hideUserGuideIssues
            ,hideUserGuideJournal
            ,hideUserGuideNextSprint
            ,hideUserGuideProductBacklog
            ,hideUserGuideCourtroom
            ,hideUserGuideQualityBacklog
            ,hideUserGuideReleases
            ,hideUserGuideRisks
            ,hideUserGuideSprintBacklog
            ,hideUserGuideWhiteboard
            ,loginToken
            ,openId
        };

        public ilarkesto.core.persistance.meta.EntityFieldMetadata[] getFields() {
            return fields;
        }

        public ilarkesto.core.persistance.meta.EntityFieldMetadata getField(String fieldName) {
            if ("name".equals(fieldName)) return name;
            if ("password".equals(fieldName)) return password;
            if ("passwordSalt".equals(fieldName)) return passwordSalt;
            if ("publicName".equals(fieldName)) return publicName;
            if ("fullName".equals(fieldName)) return fullName;
            if ("admin".equals(fieldName)) return admin;
            if ("emailVerified".equals(fieldName)) return emailVerified;
            if ("email".equals(fieldName)) return email;
            if ("currentProject".equals(fieldName)) return currentProject;
            if ("currentProjectId".equals(fieldName)) return currentProject;
            if ("color".equals(fieldName)) return color;
            if ("lastLoginDateAndTime".equals(fieldName)) return lastLoginDateAndTime;
            if ("registrationDateAndTime".equals(fieldName)) return registrationDateAndTime;
            if ("disabled".equals(fieldName)) return disabled;
            if ("hideUserGuideBlog".equals(fieldName)) return hideUserGuideBlog;
            if ("hideUserGuideCalendar".equals(fieldName)) return hideUserGuideCalendar;
            if ("hideUserGuideFiles".equals(fieldName)) return hideUserGuideFiles;
            if ("hideUserGuideForum".equals(fieldName)) return hideUserGuideForum;
            if ("hideUserGuideImpediments".equals(fieldName)) return hideUserGuideImpediments;
            if ("hideUserGuideIssues".equals(fieldName)) return hideUserGuideIssues;
            if ("hideUserGuideJournal".equals(fieldName)) return hideUserGuideJournal;
            if ("hideUserGuideNextSprint".equals(fieldName)) return hideUserGuideNextSprint;
            if ("hideUserGuideProductBacklog".equals(fieldName)) return hideUserGuideProductBacklog;
            if ("hideUserGuideCourtroom".equals(fieldName)) return hideUserGuideCourtroom;
            if ("hideUserGuideQualityBacklog".equals(fieldName)) return hideUserGuideQualityBacklog;
            if ("hideUserGuideReleases".equals(fieldName)) return hideUserGuideReleases;
            if ("hideUserGuideRisks".equals(fieldName)) return hideUserGuideRisks;
            if ("hideUserGuideSprintBacklog".equals(fieldName)) return hideUserGuideSprintBacklog;
            if ("hideUserGuideWhiteboard".equals(fieldName)) return hideUserGuideWhiteboard;
            if ("loginToken".equals(fieldName)) return loginToken;
            if ("openId".equals(fieldName)) return openId;
            return null;
        }

    }

    public static transient final UserMetadata metadata = new UserMetadata();

    @Override
    public UserMetadata getMetadata() { return metadata; };

    protected static final ilarkesto.core.logging.Log log = ilarkesto.core.logging.Log.get(User.class);

    public static User getByName(final java.lang.String name) {
        return (User) ilarkesto.core.persistance.Transaction.get().findFirst(new AUserQuery() {
            @Override
            public boolean test(User entity) {
                return entity.isName(name);
            }
            @Override
            public String toString() {
                return "User:byName";
            }
        });
    }

    public static Set< User> listByPassword(final java.lang.String password) {
        return new AUserQuery() {
            @Override
            public boolean test(User entity) {
                return entity.isPassword(password);
            }
            @Override
            public String toString() {
                return "User:byPassword";
            }
        }.list();
    }

    public static Set< User> listByPasswordSalt(final java.lang.String passwordSalt) {
        return new AUserQuery() {
            @Override
            public boolean test(User entity) {
                return entity.isPasswordSalt(passwordSalt);
            }
            @Override
            public String toString() {
                return "User:byPasswordSalt";
            }
        }.list();
    }

    public static Set< User> listByPublicName(final java.lang.String publicName) {
        return new AUserQuery() {
            @Override
            public boolean test(User entity) {
                return entity.isPublicName(publicName);
            }
            @Override
            public String toString() {
                return "User:byPublicName";
            }
        }.list();
    }

    public static Set< User> listByFullName(final java.lang.String fullName) {
        return new AUserQuery() {
            @Override
            public boolean test(User entity) {
                return entity.isFullName(fullName);
            }
            @Override
            public String toString() {
                return "User:byFullName";
            }
        }.list();
    }

    public static Set< User> listByAdmin(final boolean admin) {
        return new AUserQuery() {
            @Override
            public boolean test(User entity) {
                return entity.isAdmin(admin);
            }
            @Override
            public String toString() {
                return "User:byAdmin";
            }
        }.list();
    }

    public static Set< User> listByEmailVerified(final boolean emailVerified) {
        return new AUserQuery() {
            @Override
            public boolean test(User entity) {
                return entity.isEmailVerified(emailVerified);
            }
            @Override
            public String toString() {
                return "User:byEmailVerified";
            }
        }.list();
    }

    public static User getByEmail(final java.lang.String email) {
        return (User) ilarkesto.core.persistance.Transaction.get().findFirst(new AUserQuery() {
            @Override
            public boolean test(User entity) {
                return entity.isEmail(email);
            }
            @Override
            public String toString() {
                return "User:byEmail";
            }
        });
    }

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<User> currentProjectBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<User>() {
    @Override
        protected Set<User> loadById(final String id) {
        return new AUserQuery() {
            @Override
            public boolean test(User entity) {
                return id.equals(entity.getCurrentProjectId());
            }
            @Override
            public String toString() {
                return "User:byCurrentProject";
            }
        }.list();
        }
    };

    public static Set< User> listByCurrentProject(final scrum.client.project.Project currentProject) {
        if (currentProject == null) return new HashSet<User>();
        return currentProjectBackReferencesCache.getById(currentProject.getId());
    }

    public static Set< User> listByColor(final java.lang.String color) {
        return new AUserQuery() {
            @Override
            public boolean test(User entity) {
                return entity.isColor(color);
            }
            @Override
            public String toString() {
                return "User:byColor";
            }
        }.list();
    }

    public static Set< User> listByLastLoginDateAndTime(final ilarkesto.core.time.DateAndTime lastLoginDateAndTime) {
        return new AUserQuery() {
            @Override
            public boolean test(User entity) {
                return entity.isLastLoginDateAndTime(lastLoginDateAndTime);
            }
            @Override
            public String toString() {
                return "User:byLastLoginDateAndTime";
            }
        }.list();
    }

    public static Set< User> listByRegistrationDateAndTime(final ilarkesto.core.time.DateAndTime registrationDateAndTime) {
        return new AUserQuery() {
            @Override
            public boolean test(User entity) {
                return entity.isRegistrationDateAndTime(registrationDateAndTime);
            }
            @Override
            public String toString() {
                return "User:byRegistrationDateAndTime";
            }
        }.list();
    }

    public static Set< User> listByDisabled(final boolean disabled) {
        return new AUserQuery() {
            @Override
            public boolean test(User entity) {
                return entity.isDisabled(disabled);
            }
            @Override
            public String toString() {
                return "User:byDisabled";
            }
        }.list();
    }

    public static Set< User> listByHideUserGuideBlog(final boolean hideUserGuideBlog) {
        return new AUserQuery() {
            @Override
            public boolean test(User entity) {
                return entity.isHideUserGuideBlog(hideUserGuideBlog);
            }
            @Override
            public String toString() {
                return "User:byHideUserGuideBlog";
            }
        }.list();
    }

    public static Set< User> listByHideUserGuideCalendar(final boolean hideUserGuideCalendar) {
        return new AUserQuery() {
            @Override
            public boolean test(User entity) {
                return entity.isHideUserGuideCalendar(hideUserGuideCalendar);
            }
            @Override
            public String toString() {
                return "User:byHideUserGuideCalendar";
            }
        }.list();
    }

    public static Set< User> listByHideUserGuideFiles(final boolean hideUserGuideFiles) {
        return new AUserQuery() {
            @Override
            public boolean test(User entity) {
                return entity.isHideUserGuideFiles(hideUserGuideFiles);
            }
            @Override
            public String toString() {
                return "User:byHideUserGuideFiles";
            }
        }.list();
    }

    public static Set< User> listByHideUserGuideForum(final boolean hideUserGuideForum) {
        return new AUserQuery() {
            @Override
            public boolean test(User entity) {
                return entity.isHideUserGuideForum(hideUserGuideForum);
            }
            @Override
            public String toString() {
                return "User:byHideUserGuideForum";
            }
        }.list();
    }

    public static Set< User> listByHideUserGuideImpediments(final boolean hideUserGuideImpediments) {
        return new AUserQuery() {
            @Override
            public boolean test(User entity) {
                return entity.isHideUserGuideImpediments(hideUserGuideImpediments);
            }
            @Override
            public String toString() {
                return "User:byHideUserGuideImpediments";
            }
        }.list();
    }

    public static Set< User> listByHideUserGuideIssues(final boolean hideUserGuideIssues) {
        return new AUserQuery() {
            @Override
            public boolean test(User entity) {
                return entity.isHideUserGuideIssues(hideUserGuideIssues);
            }
            @Override
            public String toString() {
                return "User:byHideUserGuideIssues";
            }
        }.list();
    }

    public static Set< User> listByHideUserGuideJournal(final boolean hideUserGuideJournal) {
        return new AUserQuery() {
            @Override
            public boolean test(User entity) {
                return entity.isHideUserGuideJournal(hideUserGuideJournal);
            }
            @Override
            public String toString() {
                return "User:byHideUserGuideJournal";
            }
        }.list();
    }

    public static Set< User> listByHideUserGuideNextSprint(final boolean hideUserGuideNextSprint) {
        return new AUserQuery() {
            @Override
            public boolean test(User entity) {
                return entity.isHideUserGuideNextSprint(hideUserGuideNextSprint);
            }
            @Override
            public String toString() {
                return "User:byHideUserGuideNextSprint";
            }
        }.list();
    }

    public static Set< User> listByHideUserGuideProductBacklog(final boolean hideUserGuideProductBacklog) {
        return new AUserQuery() {
            @Override
            public boolean test(User entity) {
                return entity.isHideUserGuideProductBacklog(hideUserGuideProductBacklog);
            }
            @Override
            public String toString() {
                return "User:byHideUserGuideProductBacklog";
            }
        }.list();
    }

    public static Set< User> listByHideUserGuideCourtroom(final boolean hideUserGuideCourtroom) {
        return new AUserQuery() {
            @Override
            public boolean test(User entity) {
                return entity.isHideUserGuideCourtroom(hideUserGuideCourtroom);
            }
            @Override
            public String toString() {
                return "User:byHideUserGuideCourtroom";
            }
        }.list();
    }

    public static Set< User> listByHideUserGuideQualityBacklog(final boolean hideUserGuideQualityBacklog) {
        return new AUserQuery() {
            @Override
            public boolean test(User entity) {
                return entity.isHideUserGuideQualityBacklog(hideUserGuideQualityBacklog);
            }
            @Override
            public String toString() {
                return "User:byHideUserGuideQualityBacklog";
            }
        }.list();
    }

    public static Set< User> listByHideUserGuideReleases(final boolean hideUserGuideReleases) {
        return new AUserQuery() {
            @Override
            public boolean test(User entity) {
                return entity.isHideUserGuideReleases(hideUserGuideReleases);
            }
            @Override
            public String toString() {
                return "User:byHideUserGuideReleases";
            }
        }.list();
    }

    public static Set< User> listByHideUserGuideRisks(final boolean hideUserGuideRisks) {
        return new AUserQuery() {
            @Override
            public boolean test(User entity) {
                return entity.isHideUserGuideRisks(hideUserGuideRisks);
            }
            @Override
            public String toString() {
                return "User:byHideUserGuideRisks";
            }
        }.list();
    }

    public static Set< User> listByHideUserGuideSprintBacklog(final boolean hideUserGuideSprintBacklog) {
        return new AUserQuery() {
            @Override
            public boolean test(User entity) {
                return entity.isHideUserGuideSprintBacklog(hideUserGuideSprintBacklog);
            }
            @Override
            public String toString() {
                return "User:byHideUserGuideSprintBacklog";
            }
        }.list();
    }

    public static Set< User> listByHideUserGuideWhiteboard(final boolean hideUserGuideWhiteboard) {
        return new AUserQuery() {
            @Override
            public boolean test(User entity) {
                return entity.isHideUserGuideWhiteboard(hideUserGuideWhiteboard);
            }
            @Override
            public String toString() {
                return "User:byHideUserGuideWhiteboard";
            }
        }.list();
    }

    public static User getByLoginToken(final java.lang.String loginToken) {
        return (User) ilarkesto.core.persistance.Transaction.get().findFirst(new AUserQuery() {
            @Override
            public boolean test(User entity) {
                return entity.isLoginToken(loginToken);
            }
            @Override
            public String toString() {
                return "User:byLoginToken";
            }
        });
    }

    public static User getByOpenId(final java.lang.String openId) {
        return (User) ilarkesto.core.persistance.Transaction.get().findFirst(new AUserQuery() {
            @Override
            public boolean test(User entity) {
                return entity.isOpenId(openId);
            }
            @Override
            public String toString() {
                return "User:byOpenId";
            }
        });
    }

    @Override
    protected void onAfterPersist() {
        super.onAfterPersist();
        currentProjectBackReferencesCache.clear(getCurrentProjectId());
    }

    public abstract static class AUserQuery extends ilarkesto.core.persistance.AEntityQuery<User> {
    @Override
        public Class<User> getType() {
            return User.class;
        }
    }

    public static Set<User> listAll() {
        return new ilarkesto.core.persistance.AllByTypeQuery(User.class).list();
    }

    public static User getById(String id) {
        return (User) AEntity.getById(id);
    }

    @Override
    public Set<ilarkesto.core.persistance.Entity> getReferencedEntities() {
        Set<ilarkesto.core.persistance.Entity> ret = super.getReferencedEntities();
    // --- references ---
        try { Utl.addIfNotNull(ret, getCurrentProject()); } catch(EntityDoesNotExistException ex) {}
    // --- back references ---
        ret.addAll(getProjects());
        ret.addAll(getProjectWithAdminss());
        ret.addAll(getProjectWithProductOwnerss());
        ret.addAll(getProjectWithScrumMasterss());
        ret.addAll(getProjectWithTeamMemberss());
        ret.addAll(getSprints());
        ret.addAll(getSprintWithScrumMasterss());
        ret.addAll(getSprintWithTeamMemberss());
        ret.addAll(getEmoticons());
        ret.addAll(getProjectUserConfigs());
        ret.addAll(getIssues());
        ret.addAll(getIssueWithOwners());
        ret.addAll(getTasks());
        ret.addAll(getChanges());
        ret.addAll(getComments());
        ret.addAll(getChatMessages());
        ret.addAll(getBlogEntrys());
        ret.addAll(getRequirementEstimationVotes());
        ret.addAll(getEmoticonWithOwners());
        return ret;
    }

    @Override
    public void storeProperties(Map<String, String> properties) {
        super.storeProperties(properties);
        properties.put("name", ilarkesto.core.persistance.Persistence.propertyAsString(this.name));
        properties.put("password", ilarkesto.core.persistance.Persistence.propertyAsString(this.password));
        properties.put("passwordSalt", ilarkesto.core.persistance.Persistence.propertyAsString(this.passwordSalt));
        properties.put("publicName", ilarkesto.core.persistance.Persistence.propertyAsString(this.publicName));
        properties.put("fullName", ilarkesto.core.persistance.Persistence.propertyAsString(this.fullName));
        properties.put("admin", ilarkesto.core.persistance.Persistence.propertyAsString(this.admin));
        properties.put("emailVerified", ilarkesto.core.persistance.Persistence.propertyAsString(this.emailVerified));
        properties.put("email", ilarkesto.core.persistance.Persistence.propertyAsString(this.email));
        properties.put("currentProjectId", ilarkesto.core.persistance.Persistence.propertyAsString(this.currentProjectId));
        properties.put("color", ilarkesto.core.persistance.Persistence.propertyAsString(this.color));
        properties.put("lastLoginDateAndTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastLoginDateAndTime));
        properties.put("registrationDateAndTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.registrationDateAndTime));
        properties.put("disabled", ilarkesto.core.persistance.Persistence.propertyAsString(this.disabled));
        properties.put("hideUserGuideBlog", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideBlog));
        properties.put("hideUserGuideCalendar", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideCalendar));
        properties.put("hideUserGuideFiles", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideFiles));
        properties.put("hideUserGuideForum", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideForum));
        properties.put("hideUserGuideImpediments", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideImpediments));
        properties.put("hideUserGuideIssues", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideIssues));
        properties.put("hideUserGuideJournal", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideJournal));
        properties.put("hideUserGuideNextSprint", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideNextSprint));
        properties.put("hideUserGuideProductBacklog", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideProductBacklog));
        properties.put("hideUserGuideCourtroom", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideCourtroom));
        properties.put("hideUserGuideQualityBacklog", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideQualityBacklog));
        properties.put("hideUserGuideReleases", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideReleases));
        properties.put("hideUserGuideRisks", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideRisks));
        properties.put("hideUserGuideSprintBacklog", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideSprintBacklog));
        properties.put("hideUserGuideWhiteboard", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideWhiteboard));
        properties.put("loginToken", ilarkesto.core.persistance.Persistence.propertyAsString(this.loginToken));
        properties.put("openId", ilarkesto.core.persistance.Persistence.propertyAsString(this.openId));
    }

    @Override
    public int compareTo(User other) {
        return ilarkesto.core.localization.GermanComparator.INSTANCE.compare(toString(), other.toString());
    }

    public final Set<scrum.client.project.Project> getProjects() {
        return scrum.client.project.Project.listByParticipant((User)this);
    }

    public final Set<scrum.client.project.Project> getProjectWithAdminss() {
        return scrum.client.project.Project.listByAdmin((User)this);
    }

    public final Set<scrum.client.project.Project> getProjectWithProductOwnerss() {
        return scrum.client.project.Project.listByProductOwner((User)this);
    }

    public final Set<scrum.client.project.Project> getProjectWithScrumMasterss() {
        return scrum.client.project.Project.listByScrumMaster((User)this);
    }

    public final Set<scrum.client.project.Project> getProjectWithTeamMemberss() {
        return scrum.client.project.Project.listByTeamMember((User)this);
    }

    public final Set<scrum.client.sprint.Sprint> getSprints() {
        return scrum.client.sprint.Sprint.listByProductOwner((User)this);
    }

    public final Set<scrum.client.sprint.Sprint> getSprintWithScrumMasterss() {
        return scrum.client.sprint.Sprint.listByScrumMaster((User)this);
    }

    public final Set<scrum.client.sprint.Sprint> getSprintWithTeamMemberss() {
        return scrum.client.sprint.Sprint.listByTeamMember((User)this);
    }

    public final Set<scrum.client.collaboration.Emoticon> getEmoticons() {
        return scrum.client.collaboration.Emoticon.listByOwner((User)this);
    }

    public final Set<scrum.client.admin.ProjectUserConfig> getProjectUserConfigs() {
        return scrum.client.admin.ProjectUserConfig.listByUser((User)this);
    }

    public final Set<scrum.client.issues.Issue> getIssues() {
        return scrum.client.issues.Issue.listByCreator((User)this);
    }

    public final Set<scrum.client.issues.Issue> getIssueWithOwners() {
        return scrum.client.issues.Issue.listByOwner((User)this);
    }

    public final Set<scrum.client.sprint.Task> getTasks() {
        return scrum.client.sprint.Task.listByOwner((User)this);
    }

    public final Set<scrum.client.journal.Change> getChanges() {
        return scrum.client.journal.Change.listByUser((User)this);
    }

    public final Set<scrum.client.collaboration.Comment> getComments() {
        return scrum.client.collaboration.Comment.listByAuthor((User)this);
    }

    public final Set<scrum.client.collaboration.ChatMessage> getChatMessages() {
        return scrum.client.collaboration.ChatMessage.listByAuthor((User)this);
    }

    public final Set<scrum.client.pr.BlogEntry> getBlogEntrys() {
        return scrum.client.pr.BlogEntry.listByAuthor((User)this);
    }

    public final Set<scrum.client.estimation.RequirementEstimationVote> getRequirementEstimationVotes() {
        return scrum.client.estimation.RequirementEstimationVote.listByUser((User)this);
    }

    public final Set<scrum.client.collaboration.Emoticon> getEmoticonWithOwners() {
        return scrum.client.collaboration.Emoticon.listByOwner((User)this);
    }

    private static final ilarkesto.core.logging.Log LOG = ilarkesto.core.logging.Log.get(GUser.class);

    public static final String TYPE = "User";


    // -----------------------------------------------------------
    // - Searchable
    // -----------------------------------------------------------

    @Override
    public boolean matches(ilarkesto.core.search.SearchText search) {
         return search.matches(getName(), getPublicName(), getFullName(), getEmail());
    }
    // -----------------------------------------------------------
    // - name
    // -----------------------------------------------------------

    private java.lang.String name;

    public final java.lang.String getName() {
        return name;
    }

    public final void setName(java.lang.String name) {
        name = prepareName(name);
        if (isName(name)) return;
        if (name != null) {
            Object existing = User.getByName(name);
            if (existing != null && existing != this) throw new ilarkesto.core.persistance.UniqueFieldConstraintException("User" ,"name", name);
        }
        this.name = name;
            updateLastModified();
            fireModified("name", ilarkesto.core.persistance.Persistence.propertyAsString(this.name));
    }

    private final void updateName(java.lang.String name) {
        if (isName(name)) return;
        if (name != null) {
            Object existing = User.getByName(name);
            if (existing != null && existing != this) throw new ilarkesto.core.persistance.UniqueFieldConstraintException("User" ,"name", name);
        }
        this.name = name;
            updateLastModified();
            fireModified("name", ilarkesto.core.persistance.Persistence.propertyAsString(this.name));
    }

    protected java.lang.String prepareName(java.lang.String name) {
        // name = Str.removeUnreadableChars(name);
        return name;
    }

    public final boolean isNameSet() {
        return this.name != null;
    }

    public final boolean isName(java.lang.String name) {
        if (this.name == null && name == null) return true;
        return this.name != null && this.name.equals(name);
    }

    protected final void updateName(Object value) {
        setName((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - password
    // -----------------------------------------------------------

    private java.lang.String password;

    public final java.lang.String getPassword() {
        return password;
    }

    public final void setPassword(java.lang.String password) {
        password = preparePassword(password);
        if (isPassword(password)) return;
        this.password = password;
            updateLastModified();
            fireModified("password", ilarkesto.core.persistance.Persistence.propertyAsString(this.password));
    }

    private final void updatePassword(java.lang.String password) {
        if (isPassword(password)) return;
        this.password = password;
            updateLastModified();
            fireModified("password", ilarkesto.core.persistance.Persistence.propertyAsString(this.password));
    }

    protected java.lang.String preparePassword(java.lang.String password) {
        // password = Str.removeUnreadableChars(password);
        return password;
    }

    public final boolean isPasswordSet() {
        return this.password != null;
    }

    public final boolean isPassword(java.lang.String password) {
        if (this.password == null && password == null) return true;
        return this.password != null && this.password.equals(password);
    }

    protected final void updatePassword(Object value) {
        setPassword((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - passwordSalt
    // -----------------------------------------------------------

    private java.lang.String passwordSalt;

    public final java.lang.String getPasswordSalt() {
        return passwordSalt;
    }

    public final void setPasswordSalt(java.lang.String passwordSalt) {
        passwordSalt = preparePasswordSalt(passwordSalt);
        if (isPasswordSalt(passwordSalt)) return;
        this.passwordSalt = passwordSalt;
            updateLastModified();
            fireModified("passwordSalt", ilarkesto.core.persistance.Persistence.propertyAsString(this.passwordSalt));
    }

    private final void updatePasswordSalt(java.lang.String passwordSalt) {
        if (isPasswordSalt(passwordSalt)) return;
        this.passwordSalt = passwordSalt;
            updateLastModified();
            fireModified("passwordSalt", ilarkesto.core.persistance.Persistence.propertyAsString(this.passwordSalt));
    }

    protected java.lang.String preparePasswordSalt(java.lang.String passwordSalt) {
        // passwordSalt = Str.removeUnreadableChars(passwordSalt);
        return passwordSalt;
    }

    public final boolean isPasswordSaltSet() {
        return this.passwordSalt != null;
    }

    public final boolean isPasswordSalt(java.lang.String passwordSalt) {
        if (this.passwordSalt == null && passwordSalt == null) return true;
        return this.passwordSalt != null && this.passwordSalt.equals(passwordSalt);
    }

    protected final void updatePasswordSalt(Object value) {
        setPasswordSalt((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - publicName
    // -----------------------------------------------------------

    private java.lang.String publicName;

    public final java.lang.String getPublicName() {
        return publicName;
    }

    public final void setPublicName(java.lang.String publicName) {
        publicName = preparePublicName(publicName);
        if (isPublicName(publicName)) return;
        this.publicName = publicName;
            updateLastModified();
            fireModified("publicName", ilarkesto.core.persistance.Persistence.propertyAsString(this.publicName));
    }

    private final void updatePublicName(java.lang.String publicName) {
        if (isPublicName(publicName)) return;
        this.publicName = publicName;
            updateLastModified();
            fireModified("publicName", ilarkesto.core.persistance.Persistence.propertyAsString(this.publicName));
    }

    protected java.lang.String preparePublicName(java.lang.String publicName) {
        // publicName = Str.removeUnreadableChars(publicName);
        return publicName;
    }

    public final boolean isPublicNameSet() {
        return this.publicName != null;
    }

    public final boolean isPublicName(java.lang.String publicName) {
        if (this.publicName == null && publicName == null) return true;
        return this.publicName != null && this.publicName.equals(publicName);
    }

    protected final void updatePublicName(Object value) {
        setPublicName((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - fullName
    // -----------------------------------------------------------

    private java.lang.String fullName;

    public final java.lang.String getFullName() {
        return fullName;
    }

    public final void setFullName(java.lang.String fullName) {
        fullName = prepareFullName(fullName);
        if (isFullName(fullName)) return;
        this.fullName = fullName;
            updateLastModified();
            fireModified("fullName", ilarkesto.core.persistance.Persistence.propertyAsString(this.fullName));
    }

    private final void updateFullName(java.lang.String fullName) {
        if (isFullName(fullName)) return;
        this.fullName = fullName;
            updateLastModified();
            fireModified("fullName", ilarkesto.core.persistance.Persistence.propertyAsString(this.fullName));
    }

    protected java.lang.String prepareFullName(java.lang.String fullName) {
        // fullName = Str.removeUnreadableChars(fullName);
        return fullName;
    }

    public final boolean isFullNameSet() {
        return this.fullName != null;
    }

    public final boolean isFullName(java.lang.String fullName) {
        if (this.fullName == null && fullName == null) return true;
        return this.fullName != null && this.fullName.equals(fullName);
    }

    protected final void updateFullName(Object value) {
        setFullName((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - admin
    // -----------------------------------------------------------

    private boolean admin;

    public final boolean isAdmin() {
        return admin;
    }

    public final void setAdmin(boolean admin) {
        admin = prepareAdmin(admin);
        if (isAdmin(admin)) return;
        this.admin = admin;
            updateLastModified();
            fireModified("admin", ilarkesto.core.persistance.Persistence.propertyAsString(this.admin));
    }

    private final void updateAdmin(boolean admin) {
        if (isAdmin(admin)) return;
        this.admin = admin;
            updateLastModified();
            fireModified("admin", ilarkesto.core.persistance.Persistence.propertyAsString(this.admin));
    }

    protected boolean prepareAdmin(boolean admin) {
        return admin;
    }

    public final boolean isAdmin(boolean admin) {
        return this.admin == admin;
    }

    protected final void updateAdmin(Object value) {
        setAdmin((Boolean)value);
    }
    // -----------------------------------------------------------
    // - emailVerified
    // -----------------------------------------------------------

    private boolean emailVerified;

    public final boolean isEmailVerified() {
        return emailVerified;
    }

    public final void setEmailVerified(boolean emailVerified) {
        emailVerified = prepareEmailVerified(emailVerified);
        if (isEmailVerified(emailVerified)) return;
        this.emailVerified = emailVerified;
            updateLastModified();
            fireModified("emailVerified", ilarkesto.core.persistance.Persistence.propertyAsString(this.emailVerified));
    }

    private final void updateEmailVerified(boolean emailVerified) {
        if (isEmailVerified(emailVerified)) return;
        this.emailVerified = emailVerified;
            updateLastModified();
            fireModified("emailVerified", ilarkesto.core.persistance.Persistence.propertyAsString(this.emailVerified));
    }

    protected boolean prepareEmailVerified(boolean emailVerified) {
        return emailVerified;
    }

    public final boolean isEmailVerified(boolean emailVerified) {
        return this.emailVerified == emailVerified;
    }

    protected final void updateEmailVerified(Object value) {
        setEmailVerified((Boolean)value);
    }
    // -----------------------------------------------------------
    // - email
    // -----------------------------------------------------------

    private java.lang.String email;

    public final java.lang.String getEmail() {
        return email;
    }

    public final void setEmail(java.lang.String email) {
        email = prepareEmail(email);
        if (isEmail(email)) return;
        if (email != null) {
            Object existing = User.getByEmail(email);
            if (existing != null && existing != this) throw new ilarkesto.core.persistance.UniqueFieldConstraintException("User" ,"email", email);
        }
        this.email = email;
            updateLastModified();
            fireModified("email", ilarkesto.core.persistance.Persistence.propertyAsString(this.email));
    }

    private final void updateEmail(java.lang.String email) {
        if (isEmail(email)) return;
        if (email != null) {
            Object existing = User.getByEmail(email);
            if (existing != null && existing != this) throw new ilarkesto.core.persistance.UniqueFieldConstraintException("User" ,"email", email);
        }
        this.email = email;
            updateLastModified();
            fireModified("email", ilarkesto.core.persistance.Persistence.propertyAsString(this.email));
    }

    protected java.lang.String prepareEmail(java.lang.String email) {
        // email = Str.removeUnreadableChars(email);
        return email;
    }

    public final boolean isEmailSet() {
        return this.email != null;
    }

    public final boolean isEmail(java.lang.String email) {
        if (this.email == null && email == null) return true;
        return this.email != null && this.email.equals(email);
    }

    protected final void updateEmail(Object value) {
        setEmail((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - currentProject
    // -----------------------------------------------------------

    private String currentProjectId;

    public final String getCurrentProjectId() {
        return this.currentProjectId;
    }

    public final scrum.client.project.Project getCurrentProject() {
        try {
            return this.currentProjectId == null ? null : (scrum.client.project.Project) AEntity.getById(this.currentProjectId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("User.currentProject");
        }
    }

    public final void setCurrentProject(scrum.client.project.Project currentProject) {
        currentProject = prepareCurrentProject(currentProject);
        if (isCurrentProject(currentProject)) return;
        setCurrentProjectId(currentProject == null ? null : currentProject.getId());
    }

    public final void setCurrentProjectId(String id) {
        if (Utl.equals(currentProjectId, id)) return;
        clearCurrentProjectBackReferenceCache(id, this.currentProjectId);
        this.currentProjectId = id;
            updateLastModified();
            fireModified("currentProjectId", ilarkesto.core.persistance.Persistence.propertyAsString(this.currentProjectId));
    }

    private void clearCurrentProjectBackReferenceCache(String oldId, String newId) {
        currentProjectBackReferencesCache.clear(oldId);
        currentProjectBackReferencesCache.clear(newId);
    }

    private final void updateCurrentProjectId(String id) {
        setCurrentProjectId(id);
    }

    protected scrum.client.project.Project prepareCurrentProject(scrum.client.project.Project currentProject) {
        return currentProject;
    }

    protected void repairDeadCurrentProjectReference(String entityId) {
        if (!isPersisted()) return;
        if (this.currentProjectId == null || entityId.equals(this.currentProjectId)) {
            setCurrentProject(null);
        }
    }

    public final boolean isCurrentProjectSet() {
        return this.currentProjectId != null;
    }

    public final boolean isCurrentProject(scrum.client.project.Project currentProject) {
        if (this.currentProjectId == null && currentProject == null) return true;
        return currentProject != null && currentProject.getId().equals(this.currentProjectId);
    }

    // -----------------------------------------------------------
    // - color
    // -----------------------------------------------------------

    private java.lang.String color;

    public final java.lang.String getColor() {
        return color;
    }

    public final void setColor(java.lang.String color) {
        color = prepareColor(color);
        if (isColor(color)) return;
        this.color = color;
            updateLastModified();
            fireModified("color", ilarkesto.core.persistance.Persistence.propertyAsString(this.color));
    }

    private final void updateColor(java.lang.String color) {
        if (isColor(color)) return;
        this.color = color;
            updateLastModified();
            fireModified("color", ilarkesto.core.persistance.Persistence.propertyAsString(this.color));
    }

    protected java.lang.String prepareColor(java.lang.String color) {
        // color = Str.removeUnreadableChars(color);
        return color;
    }

    public final boolean isColorSet() {
        return this.color != null;
    }

    public final boolean isColor(java.lang.String color) {
        if (this.color == null && color == null) return true;
        return this.color != null && this.color.equals(color);
    }

    protected final void updateColor(Object value) {
        setColor((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - lastLoginDateAndTime
    // -----------------------------------------------------------

    private ilarkesto.core.time.DateAndTime lastLoginDateAndTime;

    public final ilarkesto.core.time.DateAndTime getLastLoginDateAndTime() {
        return lastLoginDateAndTime;
    }

    public final void setLastLoginDateAndTime(ilarkesto.core.time.DateAndTime lastLoginDateAndTime) {
        lastLoginDateAndTime = prepareLastLoginDateAndTime(lastLoginDateAndTime);
        if (isLastLoginDateAndTime(lastLoginDateAndTime)) return;
        this.lastLoginDateAndTime = lastLoginDateAndTime;
            updateLastModified();
            fireModified("lastLoginDateAndTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastLoginDateAndTime));
    }

    private final void updateLastLoginDateAndTime(ilarkesto.core.time.DateAndTime lastLoginDateAndTime) {
        if (isLastLoginDateAndTime(lastLoginDateAndTime)) return;
        this.lastLoginDateAndTime = lastLoginDateAndTime;
            updateLastModified();
            fireModified("lastLoginDateAndTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastLoginDateAndTime));
    }

    protected ilarkesto.core.time.DateAndTime prepareLastLoginDateAndTime(ilarkesto.core.time.DateAndTime lastLoginDateAndTime) {
        return lastLoginDateAndTime;
    }

    public final boolean isLastLoginDateAndTimeSet() {
        return this.lastLoginDateAndTime != null;
    }

    public final boolean isLastLoginDateAndTime(ilarkesto.core.time.DateAndTime lastLoginDateAndTime) {
        if (this.lastLoginDateAndTime == null && lastLoginDateAndTime == null) return true;
        return this.lastLoginDateAndTime != null && this.lastLoginDateAndTime.equals(lastLoginDateAndTime);
    }

    protected final void updateLastLoginDateAndTime(Object value) {
        value = value == null ? null : new ilarkesto.core.time.DateAndTime((String)value);
        setLastLoginDateAndTime((ilarkesto.core.time.DateAndTime)value);
    }
    // -----------------------------------------------------------
    // - registrationDateAndTime
    // -----------------------------------------------------------

    private ilarkesto.core.time.DateAndTime registrationDateAndTime;

    public final ilarkesto.core.time.DateAndTime getRegistrationDateAndTime() {
        return registrationDateAndTime;
    }

    public final void setRegistrationDateAndTime(ilarkesto.core.time.DateAndTime registrationDateAndTime) {
        registrationDateAndTime = prepareRegistrationDateAndTime(registrationDateAndTime);
        if (isRegistrationDateAndTime(registrationDateAndTime)) return;
        this.registrationDateAndTime = registrationDateAndTime;
            updateLastModified();
            fireModified("registrationDateAndTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.registrationDateAndTime));
    }

    private final void updateRegistrationDateAndTime(ilarkesto.core.time.DateAndTime registrationDateAndTime) {
        if (isRegistrationDateAndTime(registrationDateAndTime)) return;
        this.registrationDateAndTime = registrationDateAndTime;
            updateLastModified();
            fireModified("registrationDateAndTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.registrationDateAndTime));
    }

    protected ilarkesto.core.time.DateAndTime prepareRegistrationDateAndTime(ilarkesto.core.time.DateAndTime registrationDateAndTime) {
        return registrationDateAndTime;
    }

    public final boolean isRegistrationDateAndTimeSet() {
        return this.registrationDateAndTime != null;
    }

    public final boolean isRegistrationDateAndTime(ilarkesto.core.time.DateAndTime registrationDateAndTime) {
        if (this.registrationDateAndTime == null && registrationDateAndTime == null) return true;
        return this.registrationDateAndTime != null && this.registrationDateAndTime.equals(registrationDateAndTime);
    }

    protected final void updateRegistrationDateAndTime(Object value) {
        value = value == null ? null : new ilarkesto.core.time.DateAndTime((String)value);
        setRegistrationDateAndTime((ilarkesto.core.time.DateAndTime)value);
    }
    // -----------------------------------------------------------
    // - disabled
    // -----------------------------------------------------------

    private boolean disabled;

    public final boolean isDisabled() {
        return disabled;
    }

    public final void setDisabled(boolean disabled) {
        disabled = prepareDisabled(disabled);
        if (isDisabled(disabled)) return;
        this.disabled = disabled;
            updateLastModified();
            fireModified("disabled", ilarkesto.core.persistance.Persistence.propertyAsString(this.disabled));
    }

    private final void updateDisabled(boolean disabled) {
        if (isDisabled(disabled)) return;
        this.disabled = disabled;
            updateLastModified();
            fireModified("disabled", ilarkesto.core.persistance.Persistence.propertyAsString(this.disabled));
    }

    protected boolean prepareDisabled(boolean disabled) {
        return disabled;
    }

    public final boolean isDisabled(boolean disabled) {
        return this.disabled == disabled;
    }

    protected final void updateDisabled(Object value) {
        setDisabled((Boolean)value);
    }
    // -----------------------------------------------------------
    // - hideUserGuideBlog
    // -----------------------------------------------------------

    private boolean hideUserGuideBlog;

    public final boolean isHideUserGuideBlog() {
        return hideUserGuideBlog;
    }

    public final void setHideUserGuideBlog(boolean hideUserGuideBlog) {
        hideUserGuideBlog = prepareHideUserGuideBlog(hideUserGuideBlog);
        if (isHideUserGuideBlog(hideUserGuideBlog)) return;
        this.hideUserGuideBlog = hideUserGuideBlog;
            updateLastModified();
            fireModified("hideUserGuideBlog", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideBlog));
    }

    private final void updateHideUserGuideBlog(boolean hideUserGuideBlog) {
        if (isHideUserGuideBlog(hideUserGuideBlog)) return;
        this.hideUserGuideBlog = hideUserGuideBlog;
            updateLastModified();
            fireModified("hideUserGuideBlog", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideBlog));
    }

    protected boolean prepareHideUserGuideBlog(boolean hideUserGuideBlog) {
        return hideUserGuideBlog;
    }

    public final boolean isHideUserGuideBlog(boolean hideUserGuideBlog) {
        return this.hideUserGuideBlog == hideUserGuideBlog;
    }

    protected final void updateHideUserGuideBlog(Object value) {
        setHideUserGuideBlog((Boolean)value);
    }
    // -----------------------------------------------------------
    // - hideUserGuideCalendar
    // -----------------------------------------------------------

    private boolean hideUserGuideCalendar;

    public final boolean isHideUserGuideCalendar() {
        return hideUserGuideCalendar;
    }

    public final void setHideUserGuideCalendar(boolean hideUserGuideCalendar) {
        hideUserGuideCalendar = prepareHideUserGuideCalendar(hideUserGuideCalendar);
        if (isHideUserGuideCalendar(hideUserGuideCalendar)) return;
        this.hideUserGuideCalendar = hideUserGuideCalendar;
            updateLastModified();
            fireModified("hideUserGuideCalendar", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideCalendar));
    }

    private final void updateHideUserGuideCalendar(boolean hideUserGuideCalendar) {
        if (isHideUserGuideCalendar(hideUserGuideCalendar)) return;
        this.hideUserGuideCalendar = hideUserGuideCalendar;
            updateLastModified();
            fireModified("hideUserGuideCalendar", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideCalendar));
    }

    protected boolean prepareHideUserGuideCalendar(boolean hideUserGuideCalendar) {
        return hideUserGuideCalendar;
    }

    public final boolean isHideUserGuideCalendar(boolean hideUserGuideCalendar) {
        return this.hideUserGuideCalendar == hideUserGuideCalendar;
    }

    protected final void updateHideUserGuideCalendar(Object value) {
        setHideUserGuideCalendar((Boolean)value);
    }
    // -----------------------------------------------------------
    // - hideUserGuideFiles
    // -----------------------------------------------------------

    private boolean hideUserGuideFiles;

    public final boolean isHideUserGuideFiles() {
        return hideUserGuideFiles;
    }

    public final void setHideUserGuideFiles(boolean hideUserGuideFiles) {
        hideUserGuideFiles = prepareHideUserGuideFiles(hideUserGuideFiles);
        if (isHideUserGuideFiles(hideUserGuideFiles)) return;
        this.hideUserGuideFiles = hideUserGuideFiles;
            updateLastModified();
            fireModified("hideUserGuideFiles", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideFiles));
    }

    private final void updateHideUserGuideFiles(boolean hideUserGuideFiles) {
        if (isHideUserGuideFiles(hideUserGuideFiles)) return;
        this.hideUserGuideFiles = hideUserGuideFiles;
            updateLastModified();
            fireModified("hideUserGuideFiles", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideFiles));
    }

    protected boolean prepareHideUserGuideFiles(boolean hideUserGuideFiles) {
        return hideUserGuideFiles;
    }

    public final boolean isHideUserGuideFiles(boolean hideUserGuideFiles) {
        return this.hideUserGuideFiles == hideUserGuideFiles;
    }

    protected final void updateHideUserGuideFiles(Object value) {
        setHideUserGuideFiles((Boolean)value);
    }
    // -----------------------------------------------------------
    // - hideUserGuideForum
    // -----------------------------------------------------------

    private boolean hideUserGuideForum;

    public final boolean isHideUserGuideForum() {
        return hideUserGuideForum;
    }

    public final void setHideUserGuideForum(boolean hideUserGuideForum) {
        hideUserGuideForum = prepareHideUserGuideForum(hideUserGuideForum);
        if (isHideUserGuideForum(hideUserGuideForum)) return;
        this.hideUserGuideForum = hideUserGuideForum;
            updateLastModified();
            fireModified("hideUserGuideForum", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideForum));
    }

    private final void updateHideUserGuideForum(boolean hideUserGuideForum) {
        if (isHideUserGuideForum(hideUserGuideForum)) return;
        this.hideUserGuideForum = hideUserGuideForum;
            updateLastModified();
            fireModified("hideUserGuideForum", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideForum));
    }

    protected boolean prepareHideUserGuideForum(boolean hideUserGuideForum) {
        return hideUserGuideForum;
    }

    public final boolean isHideUserGuideForum(boolean hideUserGuideForum) {
        return this.hideUserGuideForum == hideUserGuideForum;
    }

    protected final void updateHideUserGuideForum(Object value) {
        setHideUserGuideForum((Boolean)value);
    }
    // -----------------------------------------------------------
    // - hideUserGuideImpediments
    // -----------------------------------------------------------

    private boolean hideUserGuideImpediments;

    public final boolean isHideUserGuideImpediments() {
        return hideUserGuideImpediments;
    }

    public final void setHideUserGuideImpediments(boolean hideUserGuideImpediments) {
        hideUserGuideImpediments = prepareHideUserGuideImpediments(hideUserGuideImpediments);
        if (isHideUserGuideImpediments(hideUserGuideImpediments)) return;
        this.hideUserGuideImpediments = hideUserGuideImpediments;
            updateLastModified();
            fireModified("hideUserGuideImpediments", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideImpediments));
    }

    private final void updateHideUserGuideImpediments(boolean hideUserGuideImpediments) {
        if (isHideUserGuideImpediments(hideUserGuideImpediments)) return;
        this.hideUserGuideImpediments = hideUserGuideImpediments;
            updateLastModified();
            fireModified("hideUserGuideImpediments", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideImpediments));
    }

    protected boolean prepareHideUserGuideImpediments(boolean hideUserGuideImpediments) {
        return hideUserGuideImpediments;
    }

    public final boolean isHideUserGuideImpediments(boolean hideUserGuideImpediments) {
        return this.hideUserGuideImpediments == hideUserGuideImpediments;
    }

    protected final void updateHideUserGuideImpediments(Object value) {
        setHideUserGuideImpediments((Boolean)value);
    }
    // -----------------------------------------------------------
    // - hideUserGuideIssues
    // -----------------------------------------------------------

    private boolean hideUserGuideIssues;

    public final boolean isHideUserGuideIssues() {
        return hideUserGuideIssues;
    }

    public final void setHideUserGuideIssues(boolean hideUserGuideIssues) {
        hideUserGuideIssues = prepareHideUserGuideIssues(hideUserGuideIssues);
        if (isHideUserGuideIssues(hideUserGuideIssues)) return;
        this.hideUserGuideIssues = hideUserGuideIssues;
            updateLastModified();
            fireModified("hideUserGuideIssues", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideIssues));
    }

    private final void updateHideUserGuideIssues(boolean hideUserGuideIssues) {
        if (isHideUserGuideIssues(hideUserGuideIssues)) return;
        this.hideUserGuideIssues = hideUserGuideIssues;
            updateLastModified();
            fireModified("hideUserGuideIssues", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideIssues));
    }

    protected boolean prepareHideUserGuideIssues(boolean hideUserGuideIssues) {
        return hideUserGuideIssues;
    }

    public final boolean isHideUserGuideIssues(boolean hideUserGuideIssues) {
        return this.hideUserGuideIssues == hideUserGuideIssues;
    }

    protected final void updateHideUserGuideIssues(Object value) {
        setHideUserGuideIssues((Boolean)value);
    }
    // -----------------------------------------------------------
    // - hideUserGuideJournal
    // -----------------------------------------------------------

    private boolean hideUserGuideJournal;

    public final boolean isHideUserGuideJournal() {
        return hideUserGuideJournal;
    }

    public final void setHideUserGuideJournal(boolean hideUserGuideJournal) {
        hideUserGuideJournal = prepareHideUserGuideJournal(hideUserGuideJournal);
        if (isHideUserGuideJournal(hideUserGuideJournal)) return;
        this.hideUserGuideJournal = hideUserGuideJournal;
            updateLastModified();
            fireModified("hideUserGuideJournal", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideJournal));
    }

    private final void updateHideUserGuideJournal(boolean hideUserGuideJournal) {
        if (isHideUserGuideJournal(hideUserGuideJournal)) return;
        this.hideUserGuideJournal = hideUserGuideJournal;
            updateLastModified();
            fireModified("hideUserGuideJournal", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideJournal));
    }

    protected boolean prepareHideUserGuideJournal(boolean hideUserGuideJournal) {
        return hideUserGuideJournal;
    }

    public final boolean isHideUserGuideJournal(boolean hideUserGuideJournal) {
        return this.hideUserGuideJournal == hideUserGuideJournal;
    }

    protected final void updateHideUserGuideJournal(Object value) {
        setHideUserGuideJournal((Boolean)value);
    }
    // -----------------------------------------------------------
    // - hideUserGuideNextSprint
    // -----------------------------------------------------------

    private boolean hideUserGuideNextSprint;

    public final boolean isHideUserGuideNextSprint() {
        return hideUserGuideNextSprint;
    }

    public final void setHideUserGuideNextSprint(boolean hideUserGuideNextSprint) {
        hideUserGuideNextSprint = prepareHideUserGuideNextSprint(hideUserGuideNextSprint);
        if (isHideUserGuideNextSprint(hideUserGuideNextSprint)) return;
        this.hideUserGuideNextSprint = hideUserGuideNextSprint;
            updateLastModified();
            fireModified("hideUserGuideNextSprint", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideNextSprint));
    }

    private final void updateHideUserGuideNextSprint(boolean hideUserGuideNextSprint) {
        if (isHideUserGuideNextSprint(hideUserGuideNextSprint)) return;
        this.hideUserGuideNextSprint = hideUserGuideNextSprint;
            updateLastModified();
            fireModified("hideUserGuideNextSprint", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideNextSprint));
    }

    protected boolean prepareHideUserGuideNextSprint(boolean hideUserGuideNextSprint) {
        return hideUserGuideNextSprint;
    }

    public final boolean isHideUserGuideNextSprint(boolean hideUserGuideNextSprint) {
        return this.hideUserGuideNextSprint == hideUserGuideNextSprint;
    }

    protected final void updateHideUserGuideNextSprint(Object value) {
        setHideUserGuideNextSprint((Boolean)value);
    }
    // -----------------------------------------------------------
    // - hideUserGuideProductBacklog
    // -----------------------------------------------------------

    private boolean hideUserGuideProductBacklog;

    public final boolean isHideUserGuideProductBacklog() {
        return hideUserGuideProductBacklog;
    }

    public final void setHideUserGuideProductBacklog(boolean hideUserGuideProductBacklog) {
        hideUserGuideProductBacklog = prepareHideUserGuideProductBacklog(hideUserGuideProductBacklog);
        if (isHideUserGuideProductBacklog(hideUserGuideProductBacklog)) return;
        this.hideUserGuideProductBacklog = hideUserGuideProductBacklog;
            updateLastModified();
            fireModified("hideUserGuideProductBacklog", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideProductBacklog));
    }

    private final void updateHideUserGuideProductBacklog(boolean hideUserGuideProductBacklog) {
        if (isHideUserGuideProductBacklog(hideUserGuideProductBacklog)) return;
        this.hideUserGuideProductBacklog = hideUserGuideProductBacklog;
            updateLastModified();
            fireModified("hideUserGuideProductBacklog", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideProductBacklog));
    }

    protected boolean prepareHideUserGuideProductBacklog(boolean hideUserGuideProductBacklog) {
        return hideUserGuideProductBacklog;
    }

    public final boolean isHideUserGuideProductBacklog(boolean hideUserGuideProductBacklog) {
        return this.hideUserGuideProductBacklog == hideUserGuideProductBacklog;
    }

    protected final void updateHideUserGuideProductBacklog(Object value) {
        setHideUserGuideProductBacklog((Boolean)value);
    }
    // -----------------------------------------------------------
    // - hideUserGuideCourtroom
    // -----------------------------------------------------------

    private boolean hideUserGuideCourtroom;

    public final boolean isHideUserGuideCourtroom() {
        return hideUserGuideCourtroom;
    }

    public final void setHideUserGuideCourtroom(boolean hideUserGuideCourtroom) {
        hideUserGuideCourtroom = prepareHideUserGuideCourtroom(hideUserGuideCourtroom);
        if (isHideUserGuideCourtroom(hideUserGuideCourtroom)) return;
        this.hideUserGuideCourtroom = hideUserGuideCourtroom;
            updateLastModified();
            fireModified("hideUserGuideCourtroom", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideCourtroom));
    }

    private final void updateHideUserGuideCourtroom(boolean hideUserGuideCourtroom) {
        if (isHideUserGuideCourtroom(hideUserGuideCourtroom)) return;
        this.hideUserGuideCourtroom = hideUserGuideCourtroom;
            updateLastModified();
            fireModified("hideUserGuideCourtroom", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideCourtroom));
    }

    protected boolean prepareHideUserGuideCourtroom(boolean hideUserGuideCourtroom) {
        return hideUserGuideCourtroom;
    }

    public final boolean isHideUserGuideCourtroom(boolean hideUserGuideCourtroom) {
        return this.hideUserGuideCourtroom == hideUserGuideCourtroom;
    }

    protected final void updateHideUserGuideCourtroom(Object value) {
        setHideUserGuideCourtroom((Boolean)value);
    }
    // -----------------------------------------------------------
    // - hideUserGuideQualityBacklog
    // -----------------------------------------------------------

    private boolean hideUserGuideQualityBacklog;

    public final boolean isHideUserGuideQualityBacklog() {
        return hideUserGuideQualityBacklog;
    }

    public final void setHideUserGuideQualityBacklog(boolean hideUserGuideQualityBacklog) {
        hideUserGuideQualityBacklog = prepareHideUserGuideQualityBacklog(hideUserGuideQualityBacklog);
        if (isHideUserGuideQualityBacklog(hideUserGuideQualityBacklog)) return;
        this.hideUserGuideQualityBacklog = hideUserGuideQualityBacklog;
            updateLastModified();
            fireModified("hideUserGuideQualityBacklog", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideQualityBacklog));
    }

    private final void updateHideUserGuideQualityBacklog(boolean hideUserGuideQualityBacklog) {
        if (isHideUserGuideQualityBacklog(hideUserGuideQualityBacklog)) return;
        this.hideUserGuideQualityBacklog = hideUserGuideQualityBacklog;
            updateLastModified();
            fireModified("hideUserGuideQualityBacklog", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideQualityBacklog));
    }

    protected boolean prepareHideUserGuideQualityBacklog(boolean hideUserGuideQualityBacklog) {
        return hideUserGuideQualityBacklog;
    }

    public final boolean isHideUserGuideQualityBacklog(boolean hideUserGuideQualityBacklog) {
        return this.hideUserGuideQualityBacklog == hideUserGuideQualityBacklog;
    }

    protected final void updateHideUserGuideQualityBacklog(Object value) {
        setHideUserGuideQualityBacklog((Boolean)value);
    }
    // -----------------------------------------------------------
    // - hideUserGuideReleases
    // -----------------------------------------------------------

    private boolean hideUserGuideReleases;

    public final boolean isHideUserGuideReleases() {
        return hideUserGuideReleases;
    }

    public final void setHideUserGuideReleases(boolean hideUserGuideReleases) {
        hideUserGuideReleases = prepareHideUserGuideReleases(hideUserGuideReleases);
        if (isHideUserGuideReleases(hideUserGuideReleases)) return;
        this.hideUserGuideReleases = hideUserGuideReleases;
            updateLastModified();
            fireModified("hideUserGuideReleases", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideReleases));
    }

    private final void updateHideUserGuideReleases(boolean hideUserGuideReleases) {
        if (isHideUserGuideReleases(hideUserGuideReleases)) return;
        this.hideUserGuideReleases = hideUserGuideReleases;
            updateLastModified();
            fireModified("hideUserGuideReleases", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideReleases));
    }

    protected boolean prepareHideUserGuideReleases(boolean hideUserGuideReleases) {
        return hideUserGuideReleases;
    }

    public final boolean isHideUserGuideReleases(boolean hideUserGuideReleases) {
        return this.hideUserGuideReleases == hideUserGuideReleases;
    }

    protected final void updateHideUserGuideReleases(Object value) {
        setHideUserGuideReleases((Boolean)value);
    }
    // -----------------------------------------------------------
    // - hideUserGuideRisks
    // -----------------------------------------------------------

    private boolean hideUserGuideRisks;

    public final boolean isHideUserGuideRisks() {
        return hideUserGuideRisks;
    }

    public final void setHideUserGuideRisks(boolean hideUserGuideRisks) {
        hideUserGuideRisks = prepareHideUserGuideRisks(hideUserGuideRisks);
        if (isHideUserGuideRisks(hideUserGuideRisks)) return;
        this.hideUserGuideRisks = hideUserGuideRisks;
            updateLastModified();
            fireModified("hideUserGuideRisks", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideRisks));
    }

    private final void updateHideUserGuideRisks(boolean hideUserGuideRisks) {
        if (isHideUserGuideRisks(hideUserGuideRisks)) return;
        this.hideUserGuideRisks = hideUserGuideRisks;
            updateLastModified();
            fireModified("hideUserGuideRisks", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideRisks));
    }

    protected boolean prepareHideUserGuideRisks(boolean hideUserGuideRisks) {
        return hideUserGuideRisks;
    }

    public final boolean isHideUserGuideRisks(boolean hideUserGuideRisks) {
        return this.hideUserGuideRisks == hideUserGuideRisks;
    }

    protected final void updateHideUserGuideRisks(Object value) {
        setHideUserGuideRisks((Boolean)value);
    }
    // -----------------------------------------------------------
    // - hideUserGuideSprintBacklog
    // -----------------------------------------------------------

    private boolean hideUserGuideSprintBacklog;

    public final boolean isHideUserGuideSprintBacklog() {
        return hideUserGuideSprintBacklog;
    }

    public final void setHideUserGuideSprintBacklog(boolean hideUserGuideSprintBacklog) {
        hideUserGuideSprintBacklog = prepareHideUserGuideSprintBacklog(hideUserGuideSprintBacklog);
        if (isHideUserGuideSprintBacklog(hideUserGuideSprintBacklog)) return;
        this.hideUserGuideSprintBacklog = hideUserGuideSprintBacklog;
            updateLastModified();
            fireModified("hideUserGuideSprintBacklog", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideSprintBacklog));
    }

    private final void updateHideUserGuideSprintBacklog(boolean hideUserGuideSprintBacklog) {
        if (isHideUserGuideSprintBacklog(hideUserGuideSprintBacklog)) return;
        this.hideUserGuideSprintBacklog = hideUserGuideSprintBacklog;
            updateLastModified();
            fireModified("hideUserGuideSprintBacklog", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideSprintBacklog));
    }

    protected boolean prepareHideUserGuideSprintBacklog(boolean hideUserGuideSprintBacklog) {
        return hideUserGuideSprintBacklog;
    }

    public final boolean isHideUserGuideSprintBacklog(boolean hideUserGuideSprintBacklog) {
        return this.hideUserGuideSprintBacklog == hideUserGuideSprintBacklog;
    }

    protected final void updateHideUserGuideSprintBacklog(Object value) {
        setHideUserGuideSprintBacklog((Boolean)value);
    }
    // -----------------------------------------------------------
    // - hideUserGuideWhiteboard
    // -----------------------------------------------------------

    private boolean hideUserGuideWhiteboard;

    public final boolean isHideUserGuideWhiteboard() {
        return hideUserGuideWhiteboard;
    }

    public final void setHideUserGuideWhiteboard(boolean hideUserGuideWhiteboard) {
        hideUserGuideWhiteboard = prepareHideUserGuideWhiteboard(hideUserGuideWhiteboard);
        if (isHideUserGuideWhiteboard(hideUserGuideWhiteboard)) return;
        this.hideUserGuideWhiteboard = hideUserGuideWhiteboard;
            updateLastModified();
            fireModified("hideUserGuideWhiteboard", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideWhiteboard));
    }

    private final void updateHideUserGuideWhiteboard(boolean hideUserGuideWhiteboard) {
        if (isHideUserGuideWhiteboard(hideUserGuideWhiteboard)) return;
        this.hideUserGuideWhiteboard = hideUserGuideWhiteboard;
            updateLastModified();
            fireModified("hideUserGuideWhiteboard", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideWhiteboard));
    }

    protected boolean prepareHideUserGuideWhiteboard(boolean hideUserGuideWhiteboard) {
        return hideUserGuideWhiteboard;
    }

    public final boolean isHideUserGuideWhiteboard(boolean hideUserGuideWhiteboard) {
        return this.hideUserGuideWhiteboard == hideUserGuideWhiteboard;
    }

    protected final void updateHideUserGuideWhiteboard(Object value) {
        setHideUserGuideWhiteboard((Boolean)value);
    }
    // -----------------------------------------------------------
    // - loginToken
    // -----------------------------------------------------------

    private java.lang.String loginToken;

    public final java.lang.String getLoginToken() {
        return loginToken;
    }

    public final void setLoginToken(java.lang.String loginToken) {
        loginToken = prepareLoginToken(loginToken);
        if (isLoginToken(loginToken)) return;
        if (loginToken != null) {
            Object existing = User.getByLoginToken(loginToken);
            if (existing != null && existing != this) throw new ilarkesto.core.persistance.UniqueFieldConstraintException("User" ,"loginToken", loginToken);
        }
        this.loginToken = loginToken;
            updateLastModified();
            fireModified("loginToken", ilarkesto.core.persistance.Persistence.propertyAsString(this.loginToken));
    }

    private final void updateLoginToken(java.lang.String loginToken) {
        if (isLoginToken(loginToken)) return;
        if (loginToken != null) {
            Object existing = User.getByLoginToken(loginToken);
            if (existing != null && existing != this) throw new ilarkesto.core.persistance.UniqueFieldConstraintException("User" ,"loginToken", loginToken);
        }
        this.loginToken = loginToken;
            updateLastModified();
            fireModified("loginToken", ilarkesto.core.persistance.Persistence.propertyAsString(this.loginToken));
    }

    protected java.lang.String prepareLoginToken(java.lang.String loginToken) {
        // loginToken = Str.removeUnreadableChars(loginToken);
        return loginToken;
    }

    public final boolean isLoginTokenSet() {
        return this.loginToken != null;
    }

    public final boolean isLoginToken(java.lang.String loginToken) {
        if (this.loginToken == null && loginToken == null) return true;
        return this.loginToken != null && this.loginToken.equals(loginToken);
    }

    protected final void updateLoginToken(Object value) {
        setLoginToken((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - openId
    // -----------------------------------------------------------

    private java.lang.String openId;

    public final java.lang.String getOpenId() {
        return openId;
    }

    public final void setOpenId(java.lang.String openId) {
        openId = prepareOpenId(openId);
        if (isOpenId(openId)) return;
        if (openId != null) {
            Object existing = User.getByOpenId(openId);
            if (existing != null && existing != this) throw new ilarkesto.core.persistance.UniqueFieldConstraintException("User" ,"openId", openId);
        }
        this.openId = openId;
            updateLastModified();
            fireModified("openId", ilarkesto.core.persistance.Persistence.propertyAsString(this.openId));
    }

    private final void updateOpenId(java.lang.String openId) {
        if (isOpenId(openId)) return;
        if (openId != null) {
            Object existing = User.getByOpenId(openId);
            if (existing != null && existing != this) throw new ilarkesto.core.persistance.UniqueFieldConstraintException("User" ,"openId", openId);
        }
        this.openId = openId;
            updateLastModified();
            fireModified("openId", ilarkesto.core.persistance.Persistence.propertyAsString(this.openId));
    }

    protected java.lang.String prepareOpenId(java.lang.String openId) {
        // openId = Str.removeUnreadableChars(openId);
        return openId;
    }

    public final boolean isOpenIdSet() {
        return this.openId != null;
    }

    public final boolean isOpenId(java.lang.String openId) {
        if (this.openId == null && openId == null) return true;
        return this.openId != null && this.openId.equals(openId);
    }

    protected final void updateOpenId(Object value) {
        setOpenId((java.lang.String)value);
    }

    public void updateProperties(Map<String, String> properties) {
        super.updateProperties(properties);
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            String property = entry.getKey();
            if (property.equals("id")) continue;
            String value = entry.getValue();
            if (property.equals("name")) updateName(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("password")) updatePassword(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("passwordSalt")) updatePasswordSalt(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("publicName")) updatePublicName(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("fullName")) updateFullName(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("admin")) updateAdmin(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("emailVerified")) updateEmailVerified(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("email")) updateEmail(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("currentProjectId")) updateCurrentProjectId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("color")) updateColor(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("lastLoginDateAndTime")) updateLastLoginDateAndTime(ilarkesto.core.persistance.Persistence.parsePropertyDateAndTime(value));
            if (property.equals("registrationDateAndTime")) updateRegistrationDateAndTime(ilarkesto.core.persistance.Persistence.parsePropertyDateAndTime(value));
            if (property.equals("disabled")) updateDisabled(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("hideUserGuideBlog")) updateHideUserGuideBlog(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("hideUserGuideCalendar")) updateHideUserGuideCalendar(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("hideUserGuideFiles")) updateHideUserGuideFiles(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("hideUserGuideForum")) updateHideUserGuideForum(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("hideUserGuideImpediments")) updateHideUserGuideImpediments(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("hideUserGuideIssues")) updateHideUserGuideIssues(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("hideUserGuideJournal")) updateHideUserGuideJournal(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("hideUserGuideNextSprint")) updateHideUserGuideNextSprint(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("hideUserGuideProductBacklog")) updateHideUserGuideProductBacklog(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("hideUserGuideCourtroom")) updateHideUserGuideCourtroom(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("hideUserGuideQualityBacklog")) updateHideUserGuideQualityBacklog(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("hideUserGuideReleases")) updateHideUserGuideReleases(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("hideUserGuideRisks")) updateHideUserGuideRisks(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("hideUserGuideSprintBacklog")) updateHideUserGuideSprintBacklog(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("hideUserGuideWhiteboard")) updateHideUserGuideWhiteboard(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("loginToken")) updateLoginToken(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("openId")) updateOpenId(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
        }
    }

    // --- ensure integrity ---
    @Override
    public void onEnsureIntegrity() {
        super.onEnsureIntegrity();
        try {
            getCurrentProject();
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            LOG.info("Repairing dead currentProject reference");
            repairDeadCurrentProjectReference(this.currentProjectId);
        }
        Collection<scrum.client.project.Project> project = getProjects();
        Collection<scrum.client.project.Project> projectWithAdmins = getProjectWithAdminss();
        Collection<scrum.client.project.Project> projectWithProductOwners = getProjectWithProductOwnerss();
        Collection<scrum.client.project.Project> projectWithScrumMasters = getProjectWithScrumMasterss();
        Collection<scrum.client.project.Project> projectWithTeamMembers = getProjectWithTeamMemberss();
        Collection<scrum.client.sprint.Sprint> sprint = getSprints();
        Collection<scrum.client.sprint.Sprint> sprintWithScrumMasters = getSprintWithScrumMasterss();
        Collection<scrum.client.sprint.Sprint> sprintWithTeamMembers = getSprintWithTeamMemberss();
        Collection<scrum.client.collaboration.Emoticon> emoticon = getEmoticons();
        Collection<scrum.client.admin.ProjectUserConfig> projectUserConfig = getProjectUserConfigs();
        Collection<scrum.client.issues.Issue> issue = getIssues();
        Collection<scrum.client.issues.Issue> issueWithOwner = getIssueWithOwners();
        Collection<scrum.client.sprint.Task> task = getTasks();
        Collection<scrum.client.journal.Change> change = getChanges();
        Collection<scrum.client.collaboration.Comment> comment = getComments();
        Collection<scrum.client.collaboration.ChatMessage> chatMessage = getChatMessages();
        Collection<scrum.client.pr.BlogEntry> blogEntry = getBlogEntrys();
        Collection<scrum.client.estimation.RequirementEstimationVote> requirementEstimationVote = getRequirementEstimationVotes();
        Collection<scrum.client.collaboration.Emoticon> emoticonWithOwner = getEmoticonWithOwners();
    }

    // --- PLUGIN: GwtEntityPropertyEditorClassGeneratorPlugin ---

    private transient NameModel nameModel;

    public NameModel getNameModel() {
        if (nameModel == null) nameModel = createNameModel();
        return nameModel;
    }

    protected NameModel createNameModel() { return new NameModel(); }

    protected class NameModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "User_name";
        }

        @Override
        public java.lang.String getValue() {
            return getName();
        }

        @Override
        public void setValue(java.lang.String value) {
            setName(value);
        }
        @Override
        public String getTooltip() { return "Login name."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient PasswordModel passwordModel;

    public PasswordModel getPasswordModel() {
        if (passwordModel == null) passwordModel = createPasswordModel();
        return passwordModel;
    }

    protected PasswordModel createPasswordModel() { return new PasswordModel(); }

    protected class PasswordModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "User_password";
        }

        @Override
        public java.lang.String getValue() {
            return getPassword();
        }

        @Override
        public void setValue(java.lang.String value) {
            setPassword(value);
        }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient PasswordSaltModel passwordSaltModel;

    public PasswordSaltModel getPasswordSaltModel() {
        if (passwordSaltModel == null) passwordSaltModel = createPasswordSaltModel();
        return passwordSaltModel;
    }

    protected PasswordSaltModel createPasswordSaltModel() { return new PasswordSaltModel(); }

    protected class PasswordSaltModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "User_passwordSalt";
        }

        @Override
        public java.lang.String getValue() {
            return getPasswordSalt();
        }

        @Override
        public void setValue(java.lang.String value) {
            setPasswordSalt(value);
        }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient PublicNameModel publicNameModel;

    public PublicNameModel getPublicNameModel() {
        if (publicNameModel == null) publicNameModel = createPublicNameModel();
        return publicNameModel;
    }

    protected PublicNameModel createPublicNameModel() { return new PublicNameModel(); }

    protected class PublicNameModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "User_publicName";
        }

        @Override
        public java.lang.String getValue() {
            return getPublicName();
        }

        @Override
        public void setValue(java.lang.String value) {
            setPublicName(value);
        }
        @Override
        public String getTooltip() { return "Name, which is displayed to the public on blog entries or emails."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient FullNameModel fullNameModel;

    public FullNameModel getFullNameModel() {
        if (fullNameModel == null) fullNameModel = createFullNameModel();
        return fullNameModel;
    }

    protected FullNameModel createFullNameModel() { return new FullNameModel(); }

    protected class FullNameModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "User_fullName";
        }

        @Override
        public java.lang.String getValue() {
            return getFullName();
        }

        @Override
        public void setValue(java.lang.String value) {
            setFullName(value);
        }
        @Override
        public String getTooltip() { return "Full name of the person."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient AdminModel adminModel;

    public AdminModel getAdminModel() {
        if (adminModel == null) adminModel = createAdminModel();
        return adminModel;
    }

    protected AdminModel createAdminModel() { return new AdminModel(); }

    protected class AdminModel extends ilarkesto.gwt.client.editor.ABooleanEditorModel {

        @Override
        public String getId() {
            return "User_admin";
        }

        @Override
        public java.lang.Boolean getValue() {
            return isAdmin();
        }

        @Override
        public void setValue(java.lang.Boolean value) {
            setAdmin(value);
        }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        protected void onChangeValue(java.lang.Boolean oldValue, java.lang.Boolean newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient EmailVerifiedModel emailVerifiedModel;

    public EmailVerifiedModel getEmailVerifiedModel() {
        if (emailVerifiedModel == null) emailVerifiedModel = createEmailVerifiedModel();
        return emailVerifiedModel;
    }

    protected EmailVerifiedModel createEmailVerifiedModel() { return new EmailVerifiedModel(); }

    protected class EmailVerifiedModel extends ilarkesto.gwt.client.editor.ABooleanEditorModel {

        @Override
        public String getId() {
            return "User_emailVerified";
        }

        @Override
        public java.lang.Boolean getValue() {
            return isEmailVerified();
        }

        @Override
        public void setValue(java.lang.Boolean value) {
            setEmailVerified(value);
        }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        protected void onChangeValue(java.lang.Boolean oldValue, java.lang.Boolean newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient EmailModel emailModel;

    public EmailModel getEmailModel() {
        if (emailModel == null) emailModel = createEmailModel();
        return emailModel;
    }

    protected EmailModel createEmailModel() { return new EmailModel(); }

    protected class EmailModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "User_email";
        }

        @Override
        public java.lang.String getValue() {
            return getEmail();
        }

        @Override
        public void setValue(java.lang.String value) {
            setEmail(value);
        }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient ColorModel colorModel;

    public ColorModel getColorModel() {
        if (colorModel == null) colorModel = createColorModel();
        return colorModel;
    }

    protected ColorModel createColorModel() { return new ColorModel(); }

    protected class ColorModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "User_color";
        }

        @Override
        public java.lang.String getValue() {
            return getColor();
        }

        @Override
        public void setValue(java.lang.String value) {
            setColor(value);
        }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient LastLoginDateAndTimeModel lastLoginDateAndTimeModel;

    public LastLoginDateAndTimeModel getLastLoginDateAndTimeModel() {
        if (lastLoginDateAndTimeModel == null) lastLoginDateAndTimeModel = createLastLoginDateAndTimeModel();
        return lastLoginDateAndTimeModel;
    }

    protected LastLoginDateAndTimeModel createLastLoginDateAndTimeModel() { return new LastLoginDateAndTimeModel(); }

    protected class LastLoginDateAndTimeModel extends ilarkesto.gwt.client.editor.ADateAndTimeEditorModel {

        @Override
        public String getId() {
            return "User_lastLoginDateAndTime";
        }

        @Override
        public ilarkesto.core.time.DateAndTime getValue() {
            return getLastLoginDateAndTime();
        }

        @Override
        public void setValue(ilarkesto.core.time.DateAndTime value) {
            setLastLoginDateAndTime(value);
        }

        @Override
        protected void onChangeValue(ilarkesto.core.time.DateAndTime oldValue, ilarkesto.core.time.DateAndTime newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient RegistrationDateAndTimeModel registrationDateAndTimeModel;

    public RegistrationDateAndTimeModel getRegistrationDateAndTimeModel() {
        if (registrationDateAndTimeModel == null) registrationDateAndTimeModel = createRegistrationDateAndTimeModel();
        return registrationDateAndTimeModel;
    }

    protected RegistrationDateAndTimeModel createRegistrationDateAndTimeModel() { return new RegistrationDateAndTimeModel(); }

    protected class RegistrationDateAndTimeModel extends ilarkesto.gwt.client.editor.ADateAndTimeEditorModel {

        @Override
        public String getId() {
            return "User_registrationDateAndTime";
        }

        @Override
        public ilarkesto.core.time.DateAndTime getValue() {
            return getRegistrationDateAndTime();
        }

        @Override
        public void setValue(ilarkesto.core.time.DateAndTime value) {
            setRegistrationDateAndTime(value);
        }

        @Override
        protected void onChangeValue(ilarkesto.core.time.DateAndTime oldValue, ilarkesto.core.time.DateAndTime newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient DisabledModel disabledModel;

    public DisabledModel getDisabledModel() {
        if (disabledModel == null) disabledModel = createDisabledModel();
        return disabledModel;
    }

    protected DisabledModel createDisabledModel() { return new DisabledModel(); }

    protected class DisabledModel extends ilarkesto.gwt.client.editor.ABooleanEditorModel {

        @Override
        public String getId() {
            return "User_disabled";
        }

        @Override
        public java.lang.Boolean getValue() {
            return isDisabled();
        }

        @Override
        public void setValue(java.lang.Boolean value) {
            setDisabled(value);
        }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        protected void onChangeValue(java.lang.Boolean oldValue, java.lang.Boolean newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient HideUserGuideBlogModel hideUserGuideBlogModel;

    public HideUserGuideBlogModel getHideUserGuideBlogModel() {
        if (hideUserGuideBlogModel == null) hideUserGuideBlogModel = createHideUserGuideBlogModel();
        return hideUserGuideBlogModel;
    }

    protected HideUserGuideBlogModel createHideUserGuideBlogModel() { return new HideUserGuideBlogModel(); }

    protected class HideUserGuideBlogModel extends ilarkesto.gwt.client.editor.ABooleanEditorModel {

        @Override
        public String getId() {
            return "User_hideUserGuideBlog";
        }

        @Override
        public java.lang.Boolean getValue() {
            return isHideUserGuideBlog();
        }

        @Override
        public void setValue(java.lang.Boolean value) {
            setHideUserGuideBlog(value);
        }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        protected void onChangeValue(java.lang.Boolean oldValue, java.lang.Boolean newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient HideUserGuideCalendarModel hideUserGuideCalendarModel;

    public HideUserGuideCalendarModel getHideUserGuideCalendarModel() {
        if (hideUserGuideCalendarModel == null) hideUserGuideCalendarModel = createHideUserGuideCalendarModel();
        return hideUserGuideCalendarModel;
    }

    protected HideUserGuideCalendarModel createHideUserGuideCalendarModel() { return new HideUserGuideCalendarModel(); }

    protected class HideUserGuideCalendarModel extends ilarkesto.gwt.client.editor.ABooleanEditorModel {

        @Override
        public String getId() {
            return "User_hideUserGuideCalendar";
        }

        @Override
        public java.lang.Boolean getValue() {
            return isHideUserGuideCalendar();
        }

        @Override
        public void setValue(java.lang.Boolean value) {
            setHideUserGuideCalendar(value);
        }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        protected void onChangeValue(java.lang.Boolean oldValue, java.lang.Boolean newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient HideUserGuideFilesModel hideUserGuideFilesModel;

    public HideUserGuideFilesModel getHideUserGuideFilesModel() {
        if (hideUserGuideFilesModel == null) hideUserGuideFilesModel = createHideUserGuideFilesModel();
        return hideUserGuideFilesModel;
    }

    protected HideUserGuideFilesModel createHideUserGuideFilesModel() { return new HideUserGuideFilesModel(); }

    protected class HideUserGuideFilesModel extends ilarkesto.gwt.client.editor.ABooleanEditorModel {

        @Override
        public String getId() {
            return "User_hideUserGuideFiles";
        }

        @Override
        public java.lang.Boolean getValue() {
            return isHideUserGuideFiles();
        }

        @Override
        public void setValue(java.lang.Boolean value) {
            setHideUserGuideFiles(value);
        }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        protected void onChangeValue(java.lang.Boolean oldValue, java.lang.Boolean newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient HideUserGuideForumModel hideUserGuideForumModel;

    public HideUserGuideForumModel getHideUserGuideForumModel() {
        if (hideUserGuideForumModel == null) hideUserGuideForumModel = createHideUserGuideForumModel();
        return hideUserGuideForumModel;
    }

    protected HideUserGuideForumModel createHideUserGuideForumModel() { return new HideUserGuideForumModel(); }

    protected class HideUserGuideForumModel extends ilarkesto.gwt.client.editor.ABooleanEditorModel {

        @Override
        public String getId() {
            return "User_hideUserGuideForum";
        }

        @Override
        public java.lang.Boolean getValue() {
            return isHideUserGuideForum();
        }

        @Override
        public void setValue(java.lang.Boolean value) {
            setHideUserGuideForum(value);
        }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        protected void onChangeValue(java.lang.Boolean oldValue, java.lang.Boolean newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient HideUserGuideImpedimentsModel hideUserGuideImpedimentsModel;

    public HideUserGuideImpedimentsModel getHideUserGuideImpedimentsModel() {
        if (hideUserGuideImpedimentsModel == null) hideUserGuideImpedimentsModel = createHideUserGuideImpedimentsModel();
        return hideUserGuideImpedimentsModel;
    }

    protected HideUserGuideImpedimentsModel createHideUserGuideImpedimentsModel() { return new HideUserGuideImpedimentsModel(); }

    protected class HideUserGuideImpedimentsModel extends ilarkesto.gwt.client.editor.ABooleanEditorModel {

        @Override
        public String getId() {
            return "User_hideUserGuideImpediments";
        }

        @Override
        public java.lang.Boolean getValue() {
            return isHideUserGuideImpediments();
        }

        @Override
        public void setValue(java.lang.Boolean value) {
            setHideUserGuideImpediments(value);
        }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        protected void onChangeValue(java.lang.Boolean oldValue, java.lang.Boolean newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient HideUserGuideIssuesModel hideUserGuideIssuesModel;

    public HideUserGuideIssuesModel getHideUserGuideIssuesModel() {
        if (hideUserGuideIssuesModel == null) hideUserGuideIssuesModel = createHideUserGuideIssuesModel();
        return hideUserGuideIssuesModel;
    }

    protected HideUserGuideIssuesModel createHideUserGuideIssuesModel() { return new HideUserGuideIssuesModel(); }

    protected class HideUserGuideIssuesModel extends ilarkesto.gwt.client.editor.ABooleanEditorModel {

        @Override
        public String getId() {
            return "User_hideUserGuideIssues";
        }

        @Override
        public java.lang.Boolean getValue() {
            return isHideUserGuideIssues();
        }

        @Override
        public void setValue(java.lang.Boolean value) {
            setHideUserGuideIssues(value);
        }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        protected void onChangeValue(java.lang.Boolean oldValue, java.lang.Boolean newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient HideUserGuideJournalModel hideUserGuideJournalModel;

    public HideUserGuideJournalModel getHideUserGuideJournalModel() {
        if (hideUserGuideJournalModel == null) hideUserGuideJournalModel = createHideUserGuideJournalModel();
        return hideUserGuideJournalModel;
    }

    protected HideUserGuideJournalModel createHideUserGuideJournalModel() { return new HideUserGuideJournalModel(); }

    protected class HideUserGuideJournalModel extends ilarkesto.gwt.client.editor.ABooleanEditorModel {

        @Override
        public String getId() {
            return "User_hideUserGuideJournal";
        }

        @Override
        public java.lang.Boolean getValue() {
            return isHideUserGuideJournal();
        }

        @Override
        public void setValue(java.lang.Boolean value) {
            setHideUserGuideJournal(value);
        }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        protected void onChangeValue(java.lang.Boolean oldValue, java.lang.Boolean newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient HideUserGuideNextSprintModel hideUserGuideNextSprintModel;

    public HideUserGuideNextSprintModel getHideUserGuideNextSprintModel() {
        if (hideUserGuideNextSprintModel == null) hideUserGuideNextSprintModel = createHideUserGuideNextSprintModel();
        return hideUserGuideNextSprintModel;
    }

    protected HideUserGuideNextSprintModel createHideUserGuideNextSprintModel() { return new HideUserGuideNextSprintModel(); }

    protected class HideUserGuideNextSprintModel extends ilarkesto.gwt.client.editor.ABooleanEditorModel {

        @Override
        public String getId() {
            return "User_hideUserGuideNextSprint";
        }

        @Override
        public java.lang.Boolean getValue() {
            return isHideUserGuideNextSprint();
        }

        @Override
        public void setValue(java.lang.Boolean value) {
            setHideUserGuideNextSprint(value);
        }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        protected void onChangeValue(java.lang.Boolean oldValue, java.lang.Boolean newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient HideUserGuideProductBacklogModel hideUserGuideProductBacklogModel;

    public HideUserGuideProductBacklogModel getHideUserGuideProductBacklogModel() {
        if (hideUserGuideProductBacklogModel == null) hideUserGuideProductBacklogModel = createHideUserGuideProductBacklogModel();
        return hideUserGuideProductBacklogModel;
    }

    protected HideUserGuideProductBacklogModel createHideUserGuideProductBacklogModel() { return new HideUserGuideProductBacklogModel(); }

    protected class HideUserGuideProductBacklogModel extends ilarkesto.gwt.client.editor.ABooleanEditorModel {

        @Override
        public String getId() {
            return "User_hideUserGuideProductBacklog";
        }

        @Override
        public java.lang.Boolean getValue() {
            return isHideUserGuideProductBacklog();
        }

        @Override
        public void setValue(java.lang.Boolean value) {
            setHideUserGuideProductBacklog(value);
        }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        protected void onChangeValue(java.lang.Boolean oldValue, java.lang.Boolean newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient HideUserGuideCourtroomModel hideUserGuideCourtroomModel;

    public HideUserGuideCourtroomModel getHideUserGuideCourtroomModel() {
        if (hideUserGuideCourtroomModel == null) hideUserGuideCourtroomModel = createHideUserGuideCourtroomModel();
        return hideUserGuideCourtroomModel;
    }

    protected HideUserGuideCourtroomModel createHideUserGuideCourtroomModel() { return new HideUserGuideCourtroomModel(); }

    protected class HideUserGuideCourtroomModel extends ilarkesto.gwt.client.editor.ABooleanEditorModel {

        @Override
        public String getId() {
            return "User_hideUserGuideCourtroom";
        }

        @Override
        public java.lang.Boolean getValue() {
            return isHideUserGuideCourtroom();
        }

        @Override
        public void setValue(java.lang.Boolean value) {
            setHideUserGuideCourtroom(value);
        }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        protected void onChangeValue(java.lang.Boolean oldValue, java.lang.Boolean newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient HideUserGuideQualityBacklogModel hideUserGuideQualityBacklogModel;

    public HideUserGuideQualityBacklogModel getHideUserGuideQualityBacklogModel() {
        if (hideUserGuideQualityBacklogModel == null) hideUserGuideQualityBacklogModel = createHideUserGuideQualityBacklogModel();
        return hideUserGuideQualityBacklogModel;
    }

    protected HideUserGuideQualityBacklogModel createHideUserGuideQualityBacklogModel() { return new HideUserGuideQualityBacklogModel(); }

    protected class HideUserGuideQualityBacklogModel extends ilarkesto.gwt.client.editor.ABooleanEditorModel {

        @Override
        public String getId() {
            return "User_hideUserGuideQualityBacklog";
        }

        @Override
        public java.lang.Boolean getValue() {
            return isHideUserGuideQualityBacklog();
        }

        @Override
        public void setValue(java.lang.Boolean value) {
            setHideUserGuideQualityBacklog(value);
        }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        protected void onChangeValue(java.lang.Boolean oldValue, java.lang.Boolean newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient HideUserGuideReleasesModel hideUserGuideReleasesModel;

    public HideUserGuideReleasesModel getHideUserGuideReleasesModel() {
        if (hideUserGuideReleasesModel == null) hideUserGuideReleasesModel = createHideUserGuideReleasesModel();
        return hideUserGuideReleasesModel;
    }

    protected HideUserGuideReleasesModel createHideUserGuideReleasesModel() { return new HideUserGuideReleasesModel(); }

    protected class HideUserGuideReleasesModel extends ilarkesto.gwt.client.editor.ABooleanEditorModel {

        @Override
        public String getId() {
            return "User_hideUserGuideReleases";
        }

        @Override
        public java.lang.Boolean getValue() {
            return isHideUserGuideReleases();
        }

        @Override
        public void setValue(java.lang.Boolean value) {
            setHideUserGuideReleases(value);
        }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        protected void onChangeValue(java.lang.Boolean oldValue, java.lang.Boolean newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient HideUserGuideRisksModel hideUserGuideRisksModel;

    public HideUserGuideRisksModel getHideUserGuideRisksModel() {
        if (hideUserGuideRisksModel == null) hideUserGuideRisksModel = createHideUserGuideRisksModel();
        return hideUserGuideRisksModel;
    }

    protected HideUserGuideRisksModel createHideUserGuideRisksModel() { return new HideUserGuideRisksModel(); }

    protected class HideUserGuideRisksModel extends ilarkesto.gwt.client.editor.ABooleanEditorModel {

        @Override
        public String getId() {
            return "User_hideUserGuideRisks";
        }

        @Override
        public java.lang.Boolean getValue() {
            return isHideUserGuideRisks();
        }

        @Override
        public void setValue(java.lang.Boolean value) {
            setHideUserGuideRisks(value);
        }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        protected void onChangeValue(java.lang.Boolean oldValue, java.lang.Boolean newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient HideUserGuideSprintBacklogModel hideUserGuideSprintBacklogModel;

    public HideUserGuideSprintBacklogModel getHideUserGuideSprintBacklogModel() {
        if (hideUserGuideSprintBacklogModel == null) hideUserGuideSprintBacklogModel = createHideUserGuideSprintBacklogModel();
        return hideUserGuideSprintBacklogModel;
    }

    protected HideUserGuideSprintBacklogModel createHideUserGuideSprintBacklogModel() { return new HideUserGuideSprintBacklogModel(); }

    protected class HideUserGuideSprintBacklogModel extends ilarkesto.gwt.client.editor.ABooleanEditorModel {

        @Override
        public String getId() {
            return "User_hideUserGuideSprintBacklog";
        }

        @Override
        public java.lang.Boolean getValue() {
            return isHideUserGuideSprintBacklog();
        }

        @Override
        public void setValue(java.lang.Boolean value) {
            setHideUserGuideSprintBacklog(value);
        }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        protected void onChangeValue(java.lang.Boolean oldValue, java.lang.Boolean newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient HideUserGuideWhiteboardModel hideUserGuideWhiteboardModel;

    public HideUserGuideWhiteboardModel getHideUserGuideWhiteboardModel() {
        if (hideUserGuideWhiteboardModel == null) hideUserGuideWhiteboardModel = createHideUserGuideWhiteboardModel();
        return hideUserGuideWhiteboardModel;
    }

    protected HideUserGuideWhiteboardModel createHideUserGuideWhiteboardModel() { return new HideUserGuideWhiteboardModel(); }

    protected class HideUserGuideWhiteboardModel extends ilarkesto.gwt.client.editor.ABooleanEditorModel {

        @Override
        public String getId() {
            return "User_hideUserGuideWhiteboard";
        }

        @Override
        public java.lang.Boolean getValue() {
            return isHideUserGuideWhiteboard();
        }

        @Override
        public void setValue(java.lang.Boolean value) {
            setHideUserGuideWhiteboard(value);
        }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        protected void onChangeValue(java.lang.Boolean oldValue, java.lang.Boolean newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient LoginTokenModel loginTokenModel;

    public LoginTokenModel getLoginTokenModel() {
        if (loginTokenModel == null) loginTokenModel = createLoginTokenModel();
        return loginTokenModel;
    }

    protected LoginTokenModel createLoginTokenModel() { return new LoginTokenModel(); }

    protected class LoginTokenModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "User_loginToken";
        }

        @Override
        public java.lang.String getValue() {
            return getLoginToken();
        }

        @Override
        public void setValue(java.lang.String value) {
            setLoginToken(value);
        }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient OpenIdModel openIdModel;

    public OpenIdModel getOpenIdModel() {
        if (openIdModel == null) openIdModel = createOpenIdModel();
        return openIdModel;
    }

    protected OpenIdModel createOpenIdModel() { return new OpenIdModel(); }

    protected class OpenIdModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "User_openId";
        }

        @Override
        public java.lang.String getValue() {
            return getOpenId();
        }

        @Override
        public void setValue(java.lang.String value) {
            setOpenId(value);
        }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

}