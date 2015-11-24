// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: scrum.mda.KunagiModelApplication$1










package scrum.client.project;

import java.util.*;
import ilarkesto.core.base.Utl;
import ilarkesto.core.logging.Log;
import ilarkesto.core.base.Str;
import ilarkesto.core.persistance.AEntity;
import ilarkesto.core.persistance.EntityDoesNotExistException;

public abstract class GRequirement
            extends scrum.client.common.AScrumGwtEntity
            implements java.lang.Comparable<Requirement> {

    public static class RequirementMetadata implements ilarkesto.core.persistance.meta.EntityMetadata {

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata project = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "project";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Requirement)entity).getProject();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata sprint = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "sprint";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Requirement)entity).getSprint();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata issue = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "issue";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Requirement)entity).getIssue();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata number = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "number";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Requirement)entity).getNumber();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata qualitys = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "qualitys";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Requirement)entity).getQualitys();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata label = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "label";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Requirement)entity).getLabel();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata description = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "description";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Requirement)entity).getDescription();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata testDescription = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "testDescription";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Requirement)entity).getTestDescription();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata estimatedWork = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "estimatedWork";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Requirement)entity).getEstimatedWork();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata rejectDate = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "rejectDate";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Requirement)entity).getRejectDate();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata closed = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "closed";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Requirement)entity).isClosed();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata deleted = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "deleted";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Requirement)entity).isDeleted();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata dirty = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "dirty";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Requirement)entity).isDirty();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata workEstimationVotingActive = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "workEstimationVotingActive";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Requirement)entity).isWorkEstimationVotingActive();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata workEstimationVotingShowoff = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "workEstimationVotingShowoff";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Requirement)entity).isWorkEstimationVotingShowoff();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata tasksOrderIds = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "tasksOrderIds";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Requirement)entity).getTasksOrderIds();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata themes = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "themes";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Requirement)entity).getThemes();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata epic = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "epic";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Requirement)entity).getEpic();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata externalTrackerId = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "externalTrackerId";
            public static final String label = "External ID";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Requirement)entity).getExternalTrackerId();
            }

        };

        public static transient ilarkesto.core.persistance.meta.EntityFieldMetadata[] fields = new ilarkesto.core.persistance.meta.EntityFieldMetadata[] {
            project
            ,sprint
            ,issue
            ,number
            ,qualitys
            ,label
            ,description
            ,testDescription
            ,estimatedWork
            ,rejectDate
            ,closed
            ,deleted
            ,dirty
            ,workEstimationVotingActive
            ,workEstimationVotingShowoff
            ,tasksOrderIds
            ,themes
            ,epic
            ,externalTrackerId
        };

        public ilarkesto.core.persistance.meta.EntityFieldMetadata[] getFields() {
            return fields;
        }

        public ilarkesto.core.persistance.meta.EntityFieldMetadata getField(String fieldName) {
            if ("project".equals(fieldName)) return project;
            if ("projectId".equals(fieldName)) return project;
            if ("sprint".equals(fieldName)) return sprint;
            if ("sprintId".equals(fieldName)) return sprint;
            if ("issue".equals(fieldName)) return issue;
            if ("issueId".equals(fieldName)) return issue;
            if ("number".equals(fieldName)) return number;
            if ("qualitys".equals(fieldName)) return qualitys;
            if ("qualitysIds".equals(fieldName)) return qualitys;
            if ("label".equals(fieldName)) return label;
            if ("description".equals(fieldName)) return description;
            if ("testDescription".equals(fieldName)) return testDescription;
            if ("estimatedWork".equals(fieldName)) return estimatedWork;
            if ("rejectDate".equals(fieldName)) return rejectDate;
            if ("closed".equals(fieldName)) return closed;
            if ("deleted".equals(fieldName)) return deleted;
            if ("dirty".equals(fieldName)) return dirty;
            if ("workEstimationVotingActive".equals(fieldName)) return workEstimationVotingActive;
            if ("workEstimationVotingShowoff".equals(fieldName)) return workEstimationVotingShowoff;
            if ("tasksOrderIds".equals(fieldName)) return tasksOrderIds;
            if ("themes".equals(fieldName)) return themes;
            if ("epic".equals(fieldName)) return epic;
            if ("epicId".equals(fieldName)) return epic;
            if ("externalTrackerId".equals(fieldName)) return externalTrackerId;
            return null;
        }

    }

    public static transient final RequirementMetadata metadata = new RequirementMetadata();

    @Override
    public RequirementMetadata getMetadata() { return metadata; };

    protected static final ilarkesto.core.logging.Log log = ilarkesto.core.logging.Log.get(Requirement.class);

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Requirement> projectBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Requirement>() {
    @Override
        protected Set<Requirement> loadById(final String id) {
        return new ARequirementQuery() {
            @Override
            public boolean test(Requirement entity) {
                return id.equals(entity.getProjectId());
            }
            @Override
            public String toString() {
                return "Requirement:byProject";
            }
        }.list();
        }
    };

    public static Set< Requirement> listByProject(final scrum.client.project.Project project) {
        if (project == null) return new HashSet<Requirement>();
        return projectBackReferencesCache.getById(project.getId());
    }

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Requirement> sprintBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Requirement>() {
    @Override
        protected Set<Requirement> loadById(final String id) {
        return new ARequirementQuery() {
            @Override
            public boolean test(Requirement entity) {
                return id.equals(entity.getSprintId());
            }
            @Override
            public String toString() {
                return "Requirement:bySprint";
            }
        }.list();
        }
    };

    public static Set< Requirement> listBySprint(final scrum.client.sprint.Sprint sprint) {
        if (sprint == null) return new HashSet<Requirement>();
        return sprintBackReferencesCache.getById(sprint.getId());
    }

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Requirement> issueBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Requirement>() {
    @Override
        protected Set<Requirement> loadById(final String id) {
        return new ARequirementQuery() {
            @Override
            public boolean test(Requirement entity) {
                return id.equals(entity.getIssueId());
            }
            @Override
            public String toString() {
                return "Requirement:byIssue";
            }
        }.list();
        }
    };

    public static Set< Requirement> listByIssue(final scrum.client.issues.Issue issue) {
        if (issue == null) return new HashSet<Requirement>();
        return issueBackReferencesCache.getById(issue.getId());
    }

    public static Set< Requirement> listByNumber(final int number) {
        return new ARequirementQuery() {
            @Override
            public boolean test(Requirement entity) {
                return entity.isNumber(number);
            }
            @Override
            public String toString() {
                return "Requirement:byNumber";
            }
        }.list();
    }

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Requirement> qualitysBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Requirement>() {
    @Override
        protected Set<Requirement> loadById(final String id) {
        return new ARequirementQuery() {
            @Override
            public boolean test(Requirement entity) {
                return entity.getQualitysIds().contains(id);
            }
            @Override
            public String toString() {
                return "Requirement:byQualitys";
            }
        }.list();
        }
    };

    public static Set< Requirement> listByQuality(final scrum.client.project.Quality quality) {
        if (quality == null) return new HashSet<Requirement>();
        return qualitysBackReferencesCache.getById(quality.getId());
    }

    public static Set< Requirement> listByLabel(final java.lang.String label) {
        return new ARequirementQuery() {
            @Override
            public boolean test(Requirement entity) {
                return entity.isLabel(label);
            }
            @Override
            public String toString() {
                return "Requirement:byLabel";
            }
        }.list();
    }

    public static Set< Requirement> listByDescription(final java.lang.String description) {
        return new ARequirementQuery() {
            @Override
            public boolean test(Requirement entity) {
                return entity.isDescription(description);
            }
            @Override
            public String toString() {
                return "Requirement:byDescription";
            }
        }.list();
    }

    public static Set< Requirement> listByTestDescription(final java.lang.String testDescription) {
        return new ARequirementQuery() {
            @Override
            public boolean test(Requirement entity) {
                return entity.isTestDescription(testDescription);
            }
            @Override
            public String toString() {
                return "Requirement:byTestDescription";
            }
        }.list();
    }

    public static Set< Requirement> listByEstimatedWork(final java.lang.Float estimatedWork) {
        return new ARequirementQuery() {
            @Override
            public boolean test(Requirement entity) {
                return entity.isEstimatedWork(estimatedWork);
            }
            @Override
            public String toString() {
                return "Requirement:byEstimatedWork";
            }
        }.list();
    }

    public static Set< Requirement> listByRejectDate(final ilarkesto.core.time.Date rejectDate) {
        return new ARequirementQuery() {
            @Override
            public boolean test(Requirement entity) {
                return entity.isRejectDate(rejectDate);
            }
            @Override
            public String toString() {
                return "Requirement:byRejectDate";
            }
        }.list();
    }

    public static Set< Requirement> listByClosed(final boolean closed) {
        return new ARequirementQuery() {
            @Override
            public boolean test(Requirement entity) {
                return entity.isClosed(closed);
            }
            @Override
            public String toString() {
                return "Requirement:byClosed";
            }
        }.list();
    }

    public static Set< Requirement> listByDeleted(final boolean deleted) {
        return new ARequirementQuery() {
            @Override
            public boolean test(Requirement entity) {
                return entity.isDeleted(deleted);
            }
            @Override
            public String toString() {
                return "Requirement:byDeleted";
            }
        }.list();
    }

    public static Set< Requirement> listByDirty(final boolean dirty) {
        return new ARequirementQuery() {
            @Override
            public boolean test(Requirement entity) {
                return entity.isDirty(dirty);
            }
            @Override
            public String toString() {
                return "Requirement:byDirty";
            }
        }.list();
    }

    public static Set< Requirement> listByWorkEstimationVotingActive(final boolean workEstimationVotingActive) {
        return new ARequirementQuery() {
            @Override
            public boolean test(Requirement entity) {
                return entity.isWorkEstimationVotingActive(workEstimationVotingActive);
            }
            @Override
            public String toString() {
                return "Requirement:byWorkEstimationVotingActive";
            }
        }.list();
    }

    public static Set< Requirement> listByWorkEstimationVotingShowoff(final boolean workEstimationVotingShowoff) {
        return new ARequirementQuery() {
            @Override
            public boolean test(Requirement entity) {
                return entity.isWorkEstimationVotingShowoff(workEstimationVotingShowoff);
            }
            @Override
            public String toString() {
                return "Requirement:byWorkEstimationVotingShowoff";
            }
        }.list();
    }

    public static Set< Requirement> listByTasksOrderId(final java.lang.String tasksOrderId) {
        return new ARequirementQuery() {
            @Override
            public boolean test(Requirement entity) {
                return entity.containsTasksOrderId(tasksOrderId);
            }
            @Override
            public String toString() {
                return "Requirement:byTasksOrderIds";
            }
        }.list();
    }

    public static Set< Requirement> listByTheme(final java.lang.String theme) {
        return new ARequirementQuery() {
            @Override
            public boolean test(Requirement entity) {
                return entity.containsTheme(theme);
            }
            @Override
            public String toString() {
                return "Requirement:byThemes";
            }
        }.list();
    }

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Requirement> epicBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Requirement>() {
    @Override
        protected Set<Requirement> loadById(final String id) {
        return new ARequirementQuery() {
            @Override
            public boolean test(Requirement entity) {
                return id.equals(entity.getEpicId());
            }
            @Override
            public String toString() {
                return "Requirement:byEpic";
            }
        }.list();
        }
    };

    public static Set< Requirement> listByEpic(final scrum.client.project.Requirement epic) {
        if (epic == null) return new HashSet<Requirement>();
        return epicBackReferencesCache.getById(epic.getId());
    }

    public static Set< Requirement> listByExternalTrackerId(final java.lang.String externalTrackerId) {
        return new ARequirementQuery() {
            @Override
            public boolean test(Requirement entity) {
                return entity.isExternalTrackerId(externalTrackerId);
            }
            @Override
            public String toString() {
                return "Requirement:byExternalTrackerId";
            }
        }.list();
    }

    @Override
    protected void onAfterPersist() {
        super.onAfterPersist();
        projectBackReferencesCache.clear(getProjectId());
        sprintBackReferencesCache.clear(getSprintId());
        issueBackReferencesCache.clear(getIssueId());
        qualitysBackReferencesCache.clear(getQualitysIds());
        epicBackReferencesCache.clear(getEpicId());
    }

    public abstract boolean isEditable();

    public static Set<Requirement> listByIsEditable() {
        return new ARequirementQuery() {
            @Override
            public boolean test(Requirement entity) {
                return entity.isEditable();
            }
            @Override
            public String toString() {
                return "Requirement:byIsEditable";
            }
        }.list();
    }

    public final boolean isNotEditable() {
        return !isEditable();
    }

    public static Set<Requirement> listByIsNotEditable() {
        return new ARequirementQuery() {
            @Override
            public boolean test(Requirement entity) {
                return entity.isNotEditable();
            }
            @Override
            public String toString() {
                return "Requirement:byIsNotEditable";
            }
        }.list();
    }

    public abstract static class ARequirementQuery extends ilarkesto.core.persistance.AEntityQuery<Requirement> {
    @Override
        public Class<Requirement> getType() {
            return Requirement.class;
        }
    }

    public static Set<Requirement> listAll() {
        return new ilarkesto.core.persistance.AllByTypeQuery(Requirement.class).list();
    }

    public static Requirement getById(String id) {
        return (Requirement) AEntity.getById(id);
    }

    @Override
    public Set<ilarkesto.core.persistance.Entity> getReferencedEntities() {
        Set<ilarkesto.core.persistance.Entity> ret = super.getReferencedEntities();
    // --- references ---
        try { Utl.addIfNotNull(ret, getProject()); } catch(EntityDoesNotExistException ex) {}
        try { Utl.addIfNotNull(ret, getSprint()); } catch(EntityDoesNotExistException ex) {}
        try { Utl.addIfNotNull(ret, getIssue()); } catch(EntityDoesNotExistException ex) {}
        if (qualitysIds!=null) for (String id : qualitysIds) {
            try { ret.add(AEntity.getById(id)); } catch(EntityDoesNotExistException ex) {}
        }
        try { Utl.addIfNotNull(ret, getEpic()); } catch(EntityDoesNotExistException ex) {}
    // --- back references ---
        ret.addAll(getIssues());
        ret.addAll(getRequirements());
        ret.addAll(getSprintReports());
        ret.addAll(getSprintReportWithRejectedRequirementss());
        ret.addAll(getTasks());
        ret.addAll(getRequirementEstimationVotes());
        return ret;
    }

    @Override
    public void storeProperties(Map<String, String> properties) {
        super.storeProperties(properties);
        properties.put("projectId", ilarkesto.core.persistance.Persistence.propertyAsString(this.projectId));
        properties.put("sprintId", ilarkesto.core.persistance.Persistence.propertyAsString(this.sprintId));
        properties.put("issueId", ilarkesto.core.persistance.Persistence.propertyAsString(this.issueId));
        properties.put("number", ilarkesto.core.persistance.Persistence.propertyAsString(this.number));
        properties.put("qualitysIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.qualitysIds));
        properties.put("label", ilarkesto.core.persistance.Persistence.propertyAsString(this.label));
        properties.put("description", ilarkesto.core.persistance.Persistence.propertyAsString(this.description));
        properties.put("testDescription", ilarkesto.core.persistance.Persistence.propertyAsString(this.testDescription));
        properties.put("estimatedWork", ilarkesto.core.persistance.Persistence.propertyAsString(this.estimatedWork));
        properties.put("rejectDate", ilarkesto.core.persistance.Persistence.propertyAsString(this.rejectDate));
        properties.put("closed", ilarkesto.core.persistance.Persistence.propertyAsString(this.closed));
        properties.put("deleted", ilarkesto.core.persistance.Persistence.propertyAsString(this.deleted));
        properties.put("dirty", ilarkesto.core.persistance.Persistence.propertyAsString(this.dirty));
        properties.put("workEstimationVotingActive", ilarkesto.core.persistance.Persistence.propertyAsString(this.workEstimationVotingActive));
        properties.put("workEstimationVotingShowoff", ilarkesto.core.persistance.Persistence.propertyAsString(this.workEstimationVotingShowoff));
        properties.put("tasksOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.tasksOrderIds));
        properties.put("themes", ilarkesto.core.persistance.Persistence.propertyAsString(this.themes));
        properties.put("epicId", ilarkesto.core.persistance.Persistence.propertyAsString(this.epicId));
        properties.put("externalTrackerId", ilarkesto.core.persistance.Persistence.propertyAsString(this.externalTrackerId));
    }

    @Override
    public int compareTo(Requirement other) {
        return ilarkesto.core.localization.GermanComparator.INSTANCE.compare(toString(), other.toString());
    }

    public final Set<scrum.client.issues.Issue> getIssues() {
        return scrum.client.issues.Issue.listByStory((Requirement)this);
    }

    public final Set<scrum.client.project.Requirement> getRequirements() {
        return scrum.client.project.Requirement.listByEpic((Requirement)this);
    }

    public final Set<scrum.client.sprint.SprintReport> getSprintReports() {
        return scrum.client.sprint.SprintReport.listByCompletedRequirement((Requirement)this);
    }

    public final Set<scrum.client.sprint.SprintReport> getSprintReportWithRejectedRequirementss() {
        return scrum.client.sprint.SprintReport.listByRejectedRequirement((Requirement)this);
    }

    public final Set<scrum.client.sprint.Task> getTasks() {
        return scrum.client.sprint.Task.listByRequirement((Requirement)this);
    }

    public final Set<scrum.client.estimation.RequirementEstimationVote> getRequirementEstimationVotes() {
        return scrum.client.estimation.RequirementEstimationVote.listByRequirement((Requirement)this);
    }

    private static final ilarkesto.core.logging.Log LOG = ilarkesto.core.logging.Log.get(GRequirement.class);

    public static final String TYPE = "Requirement";


    // -----------------------------------------------------------
    // - Searchable
    // -----------------------------------------------------------

    @Override
    public boolean matches(ilarkesto.core.search.SearchText search) {
         return search.matches(getLabel(), getDescription(), getTestDescription());
    }
    // -----------------------------------------------------------
    // - project
    // -----------------------------------------------------------

    private String projectId;

    public final String getProjectId() {
        return this.projectId;
    }

    public final scrum.client.project.Project getProject() {
        try {
            return this.projectId == null ? null : (scrum.client.project.Project) AEntity.getById(this.projectId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Requirement.project");
        }
    }

    public final void setProject(scrum.client.project.Project project) {
        project = prepareProject(project);
        if (isProject(project)) return;
        setProjectId(project == null ? null : project.getId());
    }

    public final void setProjectId(String id) {
        if (Utl.equals(projectId, id)) return;
        clearProjectBackReferenceCache(id, this.projectId);
        this.projectId = id;
            updateLastModified();
            fireModified("projectId", ilarkesto.core.persistance.Persistence.propertyAsString(this.projectId));
    }

    private void clearProjectBackReferenceCache(String oldId, String newId) {
        projectBackReferencesCache.clear(oldId);
        projectBackReferencesCache.clear(newId);
    }

    private final void updateProjectId(String id) {
        setProjectId(id);
    }

    protected scrum.client.project.Project prepareProject(scrum.client.project.Project project) {
        return project;
    }

    protected void repairDeadProjectReference(String entityId) {
        if (!isPersisted()) return;
        if (this.projectId == null || entityId.equals(this.projectId)) {
            repairMissingMaster();
        }
    }

    public final boolean isProjectSet() {
        return this.projectId != null;
    }

    public final boolean isProject(scrum.client.project.Project project) {
        if (this.projectId == null && project == null) return true;
        return project != null && project.getId().equals(this.projectId);
    }

    // -----------------------------------------------------------
    // - sprint
    // -----------------------------------------------------------

    private String sprintId;

    public final String getSprintId() {
        return this.sprintId;
    }

    public final scrum.client.sprint.Sprint getSprint() {
        try {
            return this.sprintId == null ? null : (scrum.client.sprint.Sprint) AEntity.getById(this.sprintId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Requirement.sprint");
        }
    }

    public final void setSprint(scrum.client.sprint.Sprint sprint) {
        sprint = prepareSprint(sprint);
        if (isSprint(sprint)) return;
        setSprintId(sprint == null ? null : sprint.getId());
    }

    public final void setSprintId(String id) {
        if (Utl.equals(sprintId, id)) return;
        clearSprintBackReferenceCache(id, this.sprintId);
        this.sprintId = id;
            updateLastModified();
            fireModified("sprintId", ilarkesto.core.persistance.Persistence.propertyAsString(this.sprintId));
    }

    private void clearSprintBackReferenceCache(String oldId, String newId) {
        sprintBackReferencesCache.clear(oldId);
        sprintBackReferencesCache.clear(newId);
    }

    private final void updateSprintId(String id) {
        setSprintId(id);
    }

    protected scrum.client.sprint.Sprint prepareSprint(scrum.client.sprint.Sprint sprint) {
        return sprint;
    }

    protected void repairDeadSprintReference(String entityId) {
        if (!isPersisted()) return;
        if (this.sprintId == null || entityId.equals(this.sprintId)) {
            setSprint(null);
        }
    }

    public final boolean isSprintSet() {
        return this.sprintId != null;
    }

    public final boolean isSprint(scrum.client.sprint.Sprint sprint) {
        if (this.sprintId == null && sprint == null) return true;
        return sprint != null && sprint.getId().equals(this.sprintId);
    }

    // -----------------------------------------------------------
    // - issue
    // -----------------------------------------------------------

    private String issueId;

    public final String getIssueId() {
        return this.issueId;
    }

    public final scrum.client.issues.Issue getIssue() {
        try {
            return this.issueId == null ? null : (scrum.client.issues.Issue) AEntity.getById(this.issueId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Requirement.issue");
        }
    }

    public final void setIssue(scrum.client.issues.Issue issue) {
        issue = prepareIssue(issue);
        if (isIssue(issue)) return;
        setIssueId(issue == null ? null : issue.getId());
    }

    public final void setIssueId(String id) {
        if (Utl.equals(issueId, id)) return;
        clearIssueBackReferenceCache(id, this.issueId);
        this.issueId = id;
            updateLastModified();
            fireModified("issueId", ilarkesto.core.persistance.Persistence.propertyAsString(this.issueId));
    }

    private void clearIssueBackReferenceCache(String oldId, String newId) {
        issueBackReferencesCache.clear(oldId);
        issueBackReferencesCache.clear(newId);
    }

    private final void updateIssueId(String id) {
        setIssueId(id);
    }

    protected scrum.client.issues.Issue prepareIssue(scrum.client.issues.Issue issue) {
        return issue;
    }

    protected void repairDeadIssueReference(String entityId) {
        if (!isPersisted()) return;
        if (this.issueId == null || entityId.equals(this.issueId)) {
            setIssue(null);
        }
    }

    public final boolean isIssueSet() {
        return this.issueId != null;
    }

    public final boolean isIssue(scrum.client.issues.Issue issue) {
        if (this.issueId == null && issue == null) return true;
        return issue != null && issue.getId().equals(this.issueId);
    }

    // -----------------------------------------------------------
    // - number
    // -----------------------------------------------------------

    private int number;

    public final int getNumber() {
        return number;
    }

    public final void setNumber(int number) {
        number = prepareNumber(number);
        if (isNumber(number)) return;
        this.number = number;
            updateLastModified();
            fireModified("number", ilarkesto.core.persistance.Persistence.propertyAsString(this.number));
    }

    private final void updateNumber(int number) {
        if (isNumber(number)) return;
        this.number = number;
            updateLastModified();
            fireModified("number", ilarkesto.core.persistance.Persistence.propertyAsString(this.number));
    }

    protected int prepareNumber(int number) {
        return number;
    }

    public final boolean isNumber(int number) {
        return this.number == number;
    }

    protected final void updateNumber(Object value) {
        setNumber((Integer)value);
    }
    // -----------------------------------------------------------
    // - qualitys
    // -----------------------------------------------------------

    private java.util.Set<String> qualitysIds = new java.util.HashSet<String>();

    public final Collection<String> getQualitysIds() {
        return java.util.Collections .unmodifiableCollection(this.qualitysIds);
    }

    public final java.util.Set<scrum.client.project.Quality> getQualitys() {
        try {
            return (java.util.Set) AEntity.getByIdsAsSet(this.qualitysIds);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Requirement.qualitys");
        }
    }

    public final void setQualitys(Collection<scrum.client.project.Quality> qualitys) {
        qualitys = prepareQualitys(qualitys);
        if (qualitys == null) qualitys = Collections.emptyList();
        java.util.Set<String> ids = ilarkesto.core.persistance.Persistence.getIdsAsSet(qualitys);
        setQualitysIds(ids);
    }

    public final void setQualitysIds(java.util.Set<String> ids) {
        if (Utl.equals(qualitysIds, ids)) return;
        clearQualitysBackReferenceCache(ids, qualitysIds);
        qualitysIds = ids;
            updateLastModified();
            fireModified("qualitysIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.qualitysIds));
    }

    private void clearQualitysBackReferenceCache(Collection<String> oldId, Collection<String> newId) {
        qualitysBackReferencesCache.clear(oldId);
        qualitysBackReferencesCache.clear(newId);
    }

    private final void updateQualitysIds(java.util.Set<String> ids) {
        setQualitysIds(ids);
    }

    protected Collection<scrum.client.project.Quality> prepareQualitys(Collection<scrum.client.project.Quality> qualitys) {
        return qualitys;
    }

    protected void repairDeadQualityReference(String entityId) {
        if (!isPersisted()) return;
        if (this.qualitysIds == null ) return;
        if (this.qualitysIds.remove(entityId)) {
            updateLastModified();
            fireModified("qualitysIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.qualitysIds));
        }
    }

    public final boolean containsQuality(scrum.client.project.Quality quality) {
        if (quality == null) return false;
        if (this.qualitysIds == null) return false;
        return this.qualitysIds.contains(quality.getId());
    }

    public final int getQualitysCount() {
        if (this.qualitysIds == null) return 0;
        return this.qualitysIds.size();
    }

    public final boolean isQualitysEmpty() {
        if (this.qualitysIds == null) return true;
        return this.qualitysIds.isEmpty();
    }

    public final boolean addQuality(scrum.client.project.Quality quality) {
        if (quality == null) throw new IllegalArgumentException("quality == null");
        if (this.qualitysIds == null) this.qualitysIds = new java.util.HashSet<String>();
        boolean added = this.qualitysIds.add(quality.getId());
        if (added) qualitysBackReferencesCache.clear(quality.getId());
        if (added) {
            updateLastModified();
            fireModified("qualitysIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.qualitysIds));
        }
        return added;
    }

    public final boolean addQualitys(Collection<scrum.client.project.Quality> qualitys) {
        if (qualitys == null) throw new IllegalArgumentException("qualitys == null");
        if (this.qualitysIds == null) this.qualitysIds = new java.util.HashSet<String>();
        boolean added = false;
        for (scrum.client.project.Quality quality : qualitys) {
            added = added | this.qualitysIds.add(quality.getId());
        }
        if (added) qualitysBackReferencesCache.clear(this.qualitysIds);
        if (added) {
            updateLastModified();
            fireModified("qualitysIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.qualitysIds));
        }
        return added;
    }

    public final boolean removeQuality(scrum.client.project.Quality quality) {
        if (quality == null) return false;
        if (this.qualitysIds == null) return false;
        boolean removed = this.qualitysIds.remove(quality.getId());
        if (removed) qualitysBackReferencesCache.clear(quality.getId());
        if (removed) {
            updateLastModified();
            fireModified("qualitysIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.qualitysIds));
        }
        return removed;
    }

    public final boolean removeQualitys(Collection<scrum.client.project.Quality> qualitys) {
        if (qualitys == null) return false;
        if (qualitys.isEmpty()) return false;
        if (this.qualitysIds == null) return false;
        boolean removed = false;
        for (scrum.client.project.Quality _element: qualitys) {
            removed = removed | this.qualitysIds.remove(_element);
        }
        if (removed) qualitysBackReferencesCache.clear(this.qualitysIds);
        if (removed) {
            updateLastModified();
            fireModified("qualitysIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.qualitysIds));
        }
        return removed;
    }

    public final boolean clearQualitys() {
        if (this.qualitysIds == null) return false;
        if (this.qualitysIds.isEmpty()) return false;
        qualitysBackReferencesCache.clear(this.qualitysIds);
        this.qualitysIds.clear();
            updateLastModified();
            fireModified("qualitysIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.qualitysIds));
        return true;
    }
    // -----------------------------------------------------------
    // - label
    // -----------------------------------------------------------

    private java.lang.String label;

    public final java.lang.String getLabel() {
        return label;
    }

    public final void setLabel(java.lang.String label) {
        label = prepareLabel(label);
        if (isLabel(label)) return;
        this.label = label;
            updateLastModified();
            fireModified("label", ilarkesto.core.persistance.Persistence.propertyAsString(this.label));
    }

    private final void updateLabel(java.lang.String label) {
        if (isLabel(label)) return;
        this.label = label;
            updateLastModified();
            fireModified("label", ilarkesto.core.persistance.Persistence.propertyAsString(this.label));
    }

    protected java.lang.String prepareLabel(java.lang.String label) {
        // label = Str.removeUnreadableChars(label);
        return label;
    }

    public final boolean isLabelSet() {
        return this.label != null;
    }

    public final boolean isLabel(java.lang.String label) {
        if (this.label == null && label == null) return true;
        return this.label != null && this.label.equals(label);
    }

    protected final void updateLabel(Object value) {
        setLabel((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - description
    // -----------------------------------------------------------

    private java.lang.String description;

    public final java.lang.String getDescription() {
        return description;
    }

    public final void setDescription(java.lang.String description) {
        description = prepareDescription(description);
        if (isDescription(description)) return;
        this.description = description;
            updateLastModified();
            fireModified("description", ilarkesto.core.persistance.Persistence.propertyAsString(this.description));
    }

    private final void updateDescription(java.lang.String description) {
        if (isDescription(description)) return;
        this.description = description;
            updateLastModified();
            fireModified("description", ilarkesto.core.persistance.Persistence.propertyAsString(this.description));
    }

    protected java.lang.String prepareDescription(java.lang.String description) {
        // description = Str.removeUnreadableChars(description);
        return description;
    }

    public final boolean isDescriptionSet() {
        return this.description != null;
    }

    public final boolean isDescription(java.lang.String description) {
        if (this.description == null && description == null) return true;
        return this.description != null && this.description.equals(description);
    }

    protected final void updateDescription(Object value) {
        setDescription((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - testDescription
    // -----------------------------------------------------------

    private java.lang.String testDescription;

    public final java.lang.String getTestDescription() {
        return testDescription;
    }

    public final void setTestDescription(java.lang.String testDescription) {
        testDescription = prepareTestDescription(testDescription);
        if (isTestDescription(testDescription)) return;
        this.testDescription = testDescription;
            updateLastModified();
            fireModified("testDescription", ilarkesto.core.persistance.Persistence.propertyAsString(this.testDescription));
    }

    private final void updateTestDescription(java.lang.String testDescription) {
        if (isTestDescription(testDescription)) return;
        this.testDescription = testDescription;
            updateLastModified();
            fireModified("testDescription", ilarkesto.core.persistance.Persistence.propertyAsString(this.testDescription));
    }

    protected java.lang.String prepareTestDescription(java.lang.String testDescription) {
        // testDescription = Str.removeUnreadableChars(testDescription);
        return testDescription;
    }

    public final boolean isTestDescriptionSet() {
        return this.testDescription != null;
    }

    public final boolean isTestDescription(java.lang.String testDescription) {
        if (this.testDescription == null && testDescription == null) return true;
        return this.testDescription != null && this.testDescription.equals(testDescription);
    }

    protected final void updateTestDescription(Object value) {
        setTestDescription((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - estimatedWork
    // -----------------------------------------------------------

    private java.lang.Float estimatedWork;

    public final java.lang.Float getEstimatedWork() {
        return estimatedWork;
    }

    public final void setEstimatedWork(java.lang.Float estimatedWork) {
        estimatedWork = prepareEstimatedWork(estimatedWork);
        if (isEstimatedWork(estimatedWork)) return;
        this.estimatedWork = estimatedWork;
            updateLastModified();
            fireModified("estimatedWork", ilarkesto.core.persistance.Persistence.propertyAsString(this.estimatedWork));
    }

    private final void updateEstimatedWork(java.lang.Float estimatedWork) {
        if (isEstimatedWork(estimatedWork)) return;
        this.estimatedWork = estimatedWork;
            updateLastModified();
            fireModified("estimatedWork", ilarkesto.core.persistance.Persistence.propertyAsString(this.estimatedWork));
    }

    protected java.lang.Float prepareEstimatedWork(java.lang.Float estimatedWork) {
        return estimatedWork;
    }

    public final boolean isEstimatedWorkSet() {
        return this.estimatedWork != null;
    }

    public final boolean isEstimatedWork(java.lang.Float estimatedWork) {
        if (this.estimatedWork == null && estimatedWork == null) return true;
        return this.estimatedWork != null && this.estimatedWork.equals(estimatedWork);
    }

    protected final void updateEstimatedWork(Object value) {
        setEstimatedWork((java.lang.Float)value);
    }
    // -----------------------------------------------------------
    // - rejectDate
    // -----------------------------------------------------------

    private ilarkesto.core.time.Date rejectDate;

    public final ilarkesto.core.time.Date getRejectDate() {
        return rejectDate;
    }

    public final void setRejectDate(ilarkesto.core.time.Date rejectDate) {
        rejectDate = prepareRejectDate(rejectDate);
        if (isRejectDate(rejectDate)) return;
        this.rejectDate = rejectDate;
            updateLastModified();
            fireModified("rejectDate", ilarkesto.core.persistance.Persistence.propertyAsString(this.rejectDate));
    }

    private final void updateRejectDate(ilarkesto.core.time.Date rejectDate) {
        if (isRejectDate(rejectDate)) return;
        this.rejectDate = rejectDate;
            updateLastModified();
            fireModified("rejectDate", ilarkesto.core.persistance.Persistence.propertyAsString(this.rejectDate));
    }

    protected ilarkesto.core.time.Date prepareRejectDate(ilarkesto.core.time.Date rejectDate) {
        return rejectDate;
    }

    public final boolean isRejectDateSet() {
        return this.rejectDate != null;
    }

    public final boolean isRejectDate(ilarkesto.core.time.Date rejectDate) {
        if (this.rejectDate == null && rejectDate == null) return true;
        return this.rejectDate != null && this.rejectDate.equals(rejectDate);
    }

    protected final void updateRejectDate(Object value) {
        value = value == null ? null : new ilarkesto.core.time.Date((String)value);
        setRejectDate((ilarkesto.core.time.Date)value);
    }
    // -----------------------------------------------------------
    // - closed
    // -----------------------------------------------------------

    private boolean closed;

    public final boolean isClosed() {
        return closed;
    }

    public final void setClosed(boolean closed) {
        closed = prepareClosed(closed);
        if (isClosed(closed)) return;
        this.closed = closed;
            updateLastModified();
            fireModified("closed", ilarkesto.core.persistance.Persistence.propertyAsString(this.closed));
    }

    private final void updateClosed(boolean closed) {
        if (isClosed(closed)) return;
        this.closed = closed;
            updateLastModified();
            fireModified("closed", ilarkesto.core.persistance.Persistence.propertyAsString(this.closed));
    }

    protected boolean prepareClosed(boolean closed) {
        return closed;
    }

    public final boolean isClosed(boolean closed) {
        return this.closed == closed;
    }

    protected final void updateClosed(Object value) {
        setClosed((Boolean)value);
    }
    // -----------------------------------------------------------
    // - deleted
    // -----------------------------------------------------------

    private boolean deleted;

    public final boolean isDeleted() {
        return deleted;
    }

    public final void setDeleted(boolean deleted) {
        deleted = prepareDeleted(deleted);
        if (isDeleted(deleted)) return;
        this.deleted = deleted;
            updateLastModified();
            fireModified("deleted", ilarkesto.core.persistance.Persistence.propertyAsString(this.deleted));
    }

    private final void updateDeleted(boolean deleted) {
        if (isDeleted(deleted)) return;
        this.deleted = deleted;
            updateLastModified();
            fireModified("deleted", ilarkesto.core.persistance.Persistence.propertyAsString(this.deleted));
    }

    protected boolean prepareDeleted(boolean deleted) {
        return deleted;
    }

    public final boolean isDeleted(boolean deleted) {
        return this.deleted == deleted;
    }

    protected final void updateDeleted(Object value) {
        setDeleted((Boolean)value);
    }
    // -----------------------------------------------------------
    // - dirty
    // -----------------------------------------------------------

    private boolean dirty;

    public final boolean isDirty() {
        return dirty;
    }

    public final void setDirty(boolean dirty) {
        dirty = prepareDirty(dirty);
        if (isDirty(dirty)) return;
        this.dirty = dirty;
            updateLastModified();
            fireModified("dirty", ilarkesto.core.persistance.Persistence.propertyAsString(this.dirty));
    }

    private final void updateDirty(boolean dirty) {
        if (isDirty(dirty)) return;
        this.dirty = dirty;
            updateLastModified();
            fireModified("dirty", ilarkesto.core.persistance.Persistence.propertyAsString(this.dirty));
    }

    protected boolean prepareDirty(boolean dirty) {
        return dirty;
    }

    public final boolean isDirty(boolean dirty) {
        return this.dirty == dirty;
    }

    protected final void updateDirty(Object value) {
        setDirty((Boolean)value);
    }
    // -----------------------------------------------------------
    // - workEstimationVotingActive
    // -----------------------------------------------------------

    private boolean workEstimationVotingActive;

    public final boolean isWorkEstimationVotingActive() {
        return workEstimationVotingActive;
    }

    public final void setWorkEstimationVotingActive(boolean workEstimationVotingActive) {
        workEstimationVotingActive = prepareWorkEstimationVotingActive(workEstimationVotingActive);
        if (isWorkEstimationVotingActive(workEstimationVotingActive)) return;
        this.workEstimationVotingActive = workEstimationVotingActive;
            updateLastModified();
            fireModified("workEstimationVotingActive", ilarkesto.core.persistance.Persistence.propertyAsString(this.workEstimationVotingActive));
    }

    private final void updateWorkEstimationVotingActive(boolean workEstimationVotingActive) {
        if (isWorkEstimationVotingActive(workEstimationVotingActive)) return;
        this.workEstimationVotingActive = workEstimationVotingActive;
            updateLastModified();
            fireModified("workEstimationVotingActive", ilarkesto.core.persistance.Persistence.propertyAsString(this.workEstimationVotingActive));
    }

    protected boolean prepareWorkEstimationVotingActive(boolean workEstimationVotingActive) {
        return workEstimationVotingActive;
    }

    public final boolean isWorkEstimationVotingActive(boolean workEstimationVotingActive) {
        return this.workEstimationVotingActive == workEstimationVotingActive;
    }

    protected final void updateWorkEstimationVotingActive(Object value) {
        setWorkEstimationVotingActive((Boolean)value);
    }
    // -----------------------------------------------------------
    // - workEstimationVotingShowoff
    // -----------------------------------------------------------

    private boolean workEstimationVotingShowoff;

    public final boolean isWorkEstimationVotingShowoff() {
        return workEstimationVotingShowoff;
    }

    public final void setWorkEstimationVotingShowoff(boolean workEstimationVotingShowoff) {
        workEstimationVotingShowoff = prepareWorkEstimationVotingShowoff(workEstimationVotingShowoff);
        if (isWorkEstimationVotingShowoff(workEstimationVotingShowoff)) return;
        this.workEstimationVotingShowoff = workEstimationVotingShowoff;
            updateLastModified();
            fireModified("workEstimationVotingShowoff", ilarkesto.core.persistance.Persistence.propertyAsString(this.workEstimationVotingShowoff));
    }

    private final void updateWorkEstimationVotingShowoff(boolean workEstimationVotingShowoff) {
        if (isWorkEstimationVotingShowoff(workEstimationVotingShowoff)) return;
        this.workEstimationVotingShowoff = workEstimationVotingShowoff;
            updateLastModified();
            fireModified("workEstimationVotingShowoff", ilarkesto.core.persistance.Persistence.propertyAsString(this.workEstimationVotingShowoff));
    }

    protected boolean prepareWorkEstimationVotingShowoff(boolean workEstimationVotingShowoff) {
        return workEstimationVotingShowoff;
    }

    public final boolean isWorkEstimationVotingShowoff(boolean workEstimationVotingShowoff) {
        return this.workEstimationVotingShowoff == workEstimationVotingShowoff;
    }

    protected final void updateWorkEstimationVotingShowoff(Object value) {
        setWorkEstimationVotingShowoff((Boolean)value);
    }
    // -----------------------------------------------------------
    // - tasksOrderIds
    // -----------------------------------------------------------

    private java.util.List<java.lang.String> tasksOrderIds = new java.util.ArrayList<java.lang.String>();

    public final java.util.List<java.lang.String> getTasksOrderIds() {
        return new java.util.ArrayList<java.lang.String>(tasksOrderIds);
    }

    public final void setTasksOrderIds(Collection<java.lang.String> tasksOrderIds) {
        tasksOrderIds = prepareTasksOrderIds(tasksOrderIds);
        if (tasksOrderIds == null) tasksOrderIds = Collections.emptyList();
        if (this.tasksOrderIds.equals(tasksOrderIds)) return;
        this.tasksOrderIds = new java.util.ArrayList<java.lang.String>(tasksOrderIds);
            updateLastModified();
            fireModified("tasksOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.tasksOrderIds));
    }

    private final void updateTasksOrderIds(Collection<java.lang.String> tasksOrderIds) {
        if (tasksOrderIds == null) tasksOrderIds = Collections.emptyList();
        if (this.tasksOrderIds.equals(tasksOrderIds)) return;
        this.tasksOrderIds = new java.util.ArrayList<java.lang.String>(tasksOrderIds);
            updateLastModified();
            fireModified("tasksOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.tasksOrderIds));
    }

    protected Collection<java.lang.String> prepareTasksOrderIds(Collection<java.lang.String> tasksOrderIds) {
        return tasksOrderIds;
    }

    public final boolean containsTasksOrderId(java.lang.String tasksOrderId) {
        if (tasksOrderId == null) return false;
        if (this.tasksOrderIds == null) return false;
        return this.tasksOrderIds.contains(tasksOrderId);
    }

    public final int getTasksOrderIdsCount() {
        if (this.tasksOrderIds == null) return 0;
        return this.tasksOrderIds.size();
    }

    public final boolean isTasksOrderIdsEmpty() {
        if (this.tasksOrderIds == null) return true;
        return this.tasksOrderIds.isEmpty();
    }

    public final boolean addTasksOrderId(java.lang.String tasksOrderId) {
        if (tasksOrderId == null) throw new IllegalArgumentException("tasksOrderId == null");
        if (this.tasksOrderIds == null) this.tasksOrderIds = new java.util.ArrayList<java.lang.String>();
        boolean added = this.tasksOrderIds.add(tasksOrderId);
        if (added) {
            updateLastModified();
            fireModified("tasksOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.tasksOrderIds));
        }
        return added;
    }

    public final boolean addTasksOrderIds(Collection<java.lang.String> tasksOrderIds) {
        if (tasksOrderIds == null) throw new IllegalArgumentException("tasksOrderIds == null");
        if (this.tasksOrderIds == null) this.tasksOrderIds = new java.util.ArrayList<java.lang.String>();
        boolean added = false;
        for (java.lang.String tasksOrderId : tasksOrderIds) {
            added = added | this.tasksOrderIds.add(tasksOrderId);
        }
        if (added) {
            updateLastModified();
            fireModified("tasksOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.tasksOrderIds));
        }
        return added;
    }

    public final boolean removeTasksOrderId(java.lang.String tasksOrderId) {
        if (tasksOrderId == null) return false;
        if (this.tasksOrderIds == null) return false;
        boolean removed = this.tasksOrderIds.remove(tasksOrderId);
        if (removed) {
            updateLastModified();
            fireModified("tasksOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.tasksOrderIds));
        }
        return removed;
    }

    public final boolean removeTasksOrderIds(Collection<java.lang.String> tasksOrderIds) {
        if (tasksOrderIds == null) return false;
        if (tasksOrderIds.isEmpty()) return false;
        if (this.tasksOrderIds == null) return false;
        boolean removed = false;
        for (java.lang.String _element: tasksOrderIds) {
            removed = removed | this.tasksOrderIds.remove(_element);
        }
        if (removed) {
            updateLastModified();
            fireModified("tasksOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.tasksOrderIds));
        }
        return removed;
    }

    public final boolean clearTasksOrderIds() {
        if (this.tasksOrderIds == null) return false;
        if (this.tasksOrderIds.isEmpty()) return false;
        this.tasksOrderIds.clear();
            updateLastModified();
            fireModified("tasksOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.tasksOrderIds));
        return true;
    }

    public final String getTasksOrderIdsAsCommaSeparatedString() {
        if (this.tasksOrderIds == null) return null;
        if (this.tasksOrderIds.isEmpty()) return null;
        return Str.concat(this.tasksOrderIds,", ");
    }

    public final void setTasksOrderIdsAsCommaSeparatedString(String tasksOrderIds) {
        setTasksOrderIds(Str.parseCommaSeparatedString(tasksOrderIds));
    }
    // -----------------------------------------------------------
    // - themes
    // -----------------------------------------------------------

    private java.util.List<java.lang.String> themes = new java.util.ArrayList<java.lang.String>();

    public final java.util.List<java.lang.String> getThemes() {
        return new java.util.ArrayList<java.lang.String>(themes);
    }

    public final void setThemes(Collection<java.lang.String> themes) {
        themes = prepareThemes(themes);
        if (themes == null) themes = Collections.emptyList();
        if (this.themes.equals(themes)) return;
        this.themes = new java.util.ArrayList<java.lang.String>(themes);
            updateLastModified();
            fireModified("themes", ilarkesto.core.persistance.Persistence.propertyAsString(this.themes));
    }

    private final void updateThemes(Collection<java.lang.String> themes) {
        if (themes == null) themes = Collections.emptyList();
        if (this.themes.equals(themes)) return;
        this.themes = new java.util.ArrayList<java.lang.String>(themes);
            updateLastModified();
            fireModified("themes", ilarkesto.core.persistance.Persistence.propertyAsString(this.themes));
    }

    protected Collection<java.lang.String> prepareThemes(Collection<java.lang.String> themes) {
        return themes;
    }

    public final boolean containsTheme(java.lang.String theme) {
        if (theme == null) return false;
        if (this.themes == null) return false;
        return this.themes.contains(theme);
    }

    public final int getThemesCount() {
        if (this.themes == null) return 0;
        return this.themes.size();
    }

    public final boolean isThemesEmpty() {
        if (this.themes == null) return true;
        return this.themes.isEmpty();
    }

    public final boolean addTheme(java.lang.String theme) {
        if (theme == null) throw new IllegalArgumentException("theme == null");
        if (this.themes == null) this.themes = new java.util.ArrayList<java.lang.String>();
        boolean added = this.themes.add(theme);
        if (added) {
            updateLastModified();
            fireModified("themes", ilarkesto.core.persistance.Persistence.propertyAsString(this.themes));
        }
        return added;
    }

    public final boolean addThemes(Collection<java.lang.String> themes) {
        if (themes == null) throw new IllegalArgumentException("themes == null");
        if (this.themes == null) this.themes = new java.util.ArrayList<java.lang.String>();
        boolean added = false;
        for (java.lang.String theme : themes) {
            added = added | this.themes.add(theme);
        }
        if (added) {
            updateLastModified();
            fireModified("themes", ilarkesto.core.persistance.Persistence.propertyAsString(this.themes));
        }
        return added;
    }

    public final boolean removeTheme(java.lang.String theme) {
        if (theme == null) return false;
        if (this.themes == null) return false;
        boolean removed = this.themes.remove(theme);
        if (removed) {
            updateLastModified();
            fireModified("themes", ilarkesto.core.persistance.Persistence.propertyAsString(this.themes));
        }
        return removed;
    }

    public final boolean removeThemes(Collection<java.lang.String> themes) {
        if (themes == null) return false;
        if (themes.isEmpty()) return false;
        if (this.themes == null) return false;
        boolean removed = false;
        for (java.lang.String _element: themes) {
            removed = removed | this.themes.remove(_element);
        }
        if (removed) {
            updateLastModified();
            fireModified("themes", ilarkesto.core.persistance.Persistence.propertyAsString(this.themes));
        }
        return removed;
    }

    public final boolean clearThemes() {
        if (this.themes == null) return false;
        if (this.themes.isEmpty()) return false;
        this.themes.clear();
            updateLastModified();
            fireModified("themes", ilarkesto.core.persistance.Persistence.propertyAsString(this.themes));
        return true;
    }

    public final String getThemesAsCommaSeparatedString() {
        if (this.themes == null) return null;
        if (this.themes.isEmpty()) return null;
        return Str.concat(this.themes,", ");
    }

    public final void setThemesAsCommaSeparatedString(String themes) {
        setThemes(Str.parseCommaSeparatedString(themes));
    }
    // -----------------------------------------------------------
    // - epic
    // -----------------------------------------------------------

    private String epicId;

    public final String getEpicId() {
        return this.epicId;
    }

    public final scrum.client.project.Requirement getEpic() {
        try {
            return this.epicId == null ? null : (scrum.client.project.Requirement) AEntity.getById(this.epicId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Requirement.epic");
        }
    }

    public final void setEpic(scrum.client.project.Requirement epic) {
        epic = prepareEpic(epic);
        if (isEpic(epic)) return;
        setEpicId(epic == null ? null : epic.getId());
    }

    public final void setEpicId(String id) {
        if (Utl.equals(epicId, id)) return;
        clearEpicBackReferenceCache(id, this.epicId);
        this.epicId = id;
            updateLastModified();
            fireModified("epicId", ilarkesto.core.persistance.Persistence.propertyAsString(this.epicId));
    }

    private void clearEpicBackReferenceCache(String oldId, String newId) {
        epicBackReferencesCache.clear(oldId);
        epicBackReferencesCache.clear(newId);
    }

    private final void updateEpicId(String id) {
        setEpicId(id);
    }

    protected scrum.client.project.Requirement prepareEpic(scrum.client.project.Requirement epic) {
        return epic;
    }

    protected void repairDeadEpicReference(String entityId) {
        if (!isPersisted()) return;
        if (this.epicId == null || entityId.equals(this.epicId)) {
            setEpic(null);
        }
    }

    public final boolean isEpicSet() {
        return this.epicId != null;
    }

    public final boolean isEpic(scrum.client.project.Requirement epic) {
        if (this.epicId == null && epic == null) return true;
        return epic != null && epic.getId().equals(this.epicId);
    }

    // -----------------------------------------------------------
    // - externalTrackerId
    // -----------------------------------------------------------

    private java.lang.String externalTrackerId;

    public final java.lang.String getExternalTrackerId() {
        return externalTrackerId;
    }

    public final void setExternalTrackerId(java.lang.String externalTrackerId) {
        externalTrackerId = prepareExternalTrackerId(externalTrackerId);
        if (isExternalTrackerId(externalTrackerId)) return;
        this.externalTrackerId = externalTrackerId;
            updateLastModified();
            fireModified("externalTrackerId", ilarkesto.core.persistance.Persistence.propertyAsString(this.externalTrackerId));
    }

    private final void updateExternalTrackerId(java.lang.String externalTrackerId) {
        if (isExternalTrackerId(externalTrackerId)) return;
        this.externalTrackerId = externalTrackerId;
            updateLastModified();
            fireModified("externalTrackerId", ilarkesto.core.persistance.Persistence.propertyAsString(this.externalTrackerId));
    }

    protected java.lang.String prepareExternalTrackerId(java.lang.String externalTrackerId) {
        // externalTrackerId = Str.removeUnreadableChars(externalTrackerId);
        return externalTrackerId;
    }

    public final boolean isExternalTrackerIdSet() {
        return this.externalTrackerId != null;
    }

    public final boolean isExternalTrackerId(java.lang.String externalTrackerId) {
        if (this.externalTrackerId == null && externalTrackerId == null) return true;
        return this.externalTrackerId != null && this.externalTrackerId.equals(externalTrackerId);
    }

    protected final void updateExternalTrackerId(Object value) {
        setExternalTrackerId((java.lang.String)value);
    }

    public void updateProperties(Map<String, String> properties) {
        super.updateProperties(properties);
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            String property = entry.getKey();
            if (property.equals("id")) continue;
            String value = entry.getValue();
            if (property.equals("projectId")) updateProjectId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("sprintId")) updateSprintId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("issueId")) updateIssueId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("number")) updateNumber(ilarkesto.core.persistance.Persistence.parsePropertyint(value));
            if (property.equals("qualitysIds")) updateQualitysIds(ilarkesto.core.persistance.Persistence.parsePropertyReferenceSet(value));
            if (property.equals("label")) updateLabel(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("description")) updateDescription(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("testDescription")) updateTestDescription(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("estimatedWork")) updateEstimatedWork(ilarkesto.core.persistance.Persistence.parsePropertyFloat(value));
            if (property.equals("rejectDate")) updateRejectDate(ilarkesto.core.persistance.Persistence.parsePropertyDate(value));
            if (property.equals("closed")) updateClosed(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("deleted")) updateDeleted(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("dirty")) updateDirty(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("workEstimationVotingActive")) updateWorkEstimationVotingActive(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("workEstimationVotingShowoff")) updateWorkEstimationVotingShowoff(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("tasksOrderIds")) updateTasksOrderIds(ilarkesto.core.persistance.Persistence.parsePropertyStringCollection(value));
            if (property.equals("themes")) updateThemes(ilarkesto.core.persistance.Persistence.parsePropertyStringCollection(value));
            if (property.equals("epicId")) updateEpicId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("externalTrackerId")) updateExternalTrackerId(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
        }
    }

    // --- ensure integrity ---
    @Override
    public void onEnsureIntegrity() {
        super.onEnsureIntegrity();
        if (!isProjectSet()) {
            repairMissingMaster();
        }
        try {
            getProject();
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            LOG.info("Repairing dead project reference");
            repairDeadProjectReference(this.projectId);
        }
        try {
            getSprint();
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            LOG.info("Repairing dead sprint reference");
            repairDeadSprintReference(this.sprintId);
        }
        try {
            getIssue();
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            LOG.info("Repairing dead issue reference");
            repairDeadIssueReference(this.issueId);
        }
        if (this.qualitysIds == null) this.qualitysIds = new java.util.HashSet<String>();
        Set<String> qualitys = new HashSet<String>(this.qualitysIds);
        for (String entityId : qualitys) {
            try {
                AEntity.getById(entityId);
            } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
                LOG.info("Repairing dead quality reference");
                repairDeadQualityReference(entityId);
            }
        }
        if (this.tasksOrderIds == null) this.tasksOrderIds = new java.util.ArrayList<java.lang.String>();
        if (this.themes == null) this.themes = new java.util.ArrayList<java.lang.String>();
        try {
            getEpic();
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            LOG.info("Repairing dead epic reference");
            repairDeadEpicReference(this.epicId);
        }
        Collection<scrum.client.issues.Issue> issue = getIssues();
        Collection<scrum.client.project.Requirement> requirement = getRequirements();
        Collection<scrum.client.sprint.SprintReport> sprintReport = getSprintReports();
        Collection<scrum.client.sprint.SprintReport> sprintReportWithRejectedRequirements = getSprintReportWithRejectedRequirementss();
        Collection<scrum.client.sprint.Task> task = getTasks();
        Collection<scrum.client.estimation.RequirementEstimationVote> requirementEstimationVote = getRequirementEstimationVotes();
    }

    // --- PLUGIN: GwtEntityPropertyEditorClassGeneratorPlugin ---

    private transient NumberModel numberModel;

    public NumberModel getNumberModel() {
        if (numberModel == null) numberModel = createNumberModel();
        return numberModel;
    }

    protected NumberModel createNumberModel() { return new NumberModel(); }

    protected class NumberModel extends ilarkesto.gwt.client.editor.AIntegerEditorModel {

        @Override
        public String getId() {
            return "Requirement_number";
        }

        @Override
        public java.lang.Integer getValue() {
            return getNumber();
        }

        @Override
        public void setValue(java.lang.Integer value) {
            setNumber(value);
        }

            @Override
            public void increment() {
                setNumber(getNumber() + 1);
            }

            @Override
            public void decrement() {
                setNumber(getNumber() - 1);
            }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        protected void onChangeValue(java.lang.Integer oldValue, java.lang.Integer newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient LabelModel labelModel;

    public LabelModel getLabelModel() {
        if (labelModel == null) labelModel = createLabelModel();
        return labelModel;
    }

    protected LabelModel createLabelModel() { return new LabelModel(); }

    protected class LabelModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Requirement_label";
        }

        @Override
        public java.lang.String getValue() {
            return getLabel();
        }

        @Override
        public void setValue(java.lang.String value) {
            setLabel(value);
        }

        @Override
        public boolean isEditable() { return GRequirement.this.isEditable(); }
        @Override
        public String getTooltip() { return "The label should be short (as it appears where the Story is referenced), yet give a hint strong enough to make the content of it come to mind."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient DescriptionModel descriptionModel;

    public DescriptionModel getDescriptionModel() {
        if (descriptionModel == null) descriptionModel = createDescriptionModel();
        return descriptionModel;
    }

    protected DescriptionModel createDescriptionModel() { return new DescriptionModel(); }

    protected class DescriptionModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Requirement_description";
        }

        @Override
        public java.lang.String getValue() {
            return getDescription();
        }

        @Override
        public void setValue(java.lang.String value) {
            setDescription(value);
        }

        @Override
        public boolean isEditable() { return GRequirement.this.isEditable(); }

        @Override
        public boolean isRichtext() { return true; }
        @Override
        public String getTooltip() { return "The description of a Story should make what the label cannot: It should provide information on what is and what is not part of it. Ideally, it is given in terms of a user story: 'As a [user] I want [function] so that [value].'"; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient TestDescriptionModel testDescriptionModel;

    public TestDescriptionModel getTestDescriptionModel() {
        if (testDescriptionModel == null) testDescriptionModel = createTestDescriptionModel();
        return testDescriptionModel;
    }

    protected TestDescriptionModel createTestDescriptionModel() { return new TestDescriptionModel(); }

    protected class TestDescriptionModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Requirement_testDescription";
        }

        @Override
        public java.lang.String getValue() {
            return getTestDescription();
        }

        @Override
        public void setValue(java.lang.String value) {
            setTestDescription(value);
        }

        @Override
        public boolean isEditable() { return GRequirement.this.isEditable(); }

        @Override
        public boolean isRichtext() { return true; }
        @Override
        public String getTooltip() { return "The Test contains requirements that have to be met by the Team in order for the Story to be considered done."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient EstimatedWorkModel estimatedWorkModel;

    public EstimatedWorkModel getEstimatedWorkModel() {
        if (estimatedWorkModel == null) estimatedWorkModel = createEstimatedWorkModel();
        return estimatedWorkModel;
    }

    protected EstimatedWorkModel createEstimatedWorkModel() { return new EstimatedWorkModel(); }

    protected class EstimatedWorkModel extends ilarkesto.gwt.client.editor.AFloatEditorModel {

        @Override
        public String getId() {
            return "Requirement_estimatedWork";
        }

        @Override
        public java.lang.Float getValue() {
            return getEstimatedWork();
        }

        @Override
        public void setValue(java.lang.Float value) {
            setEstimatedWork(value);
        }
        @Override
        public String getTooltip() { return "The estimated work gives a relative estimation of effort that needs to be put into the Story to complete it. The bigger the Story the less important the accuracy of the estimation. Big Stories (Epics) close to being worked on should be split to be smaller."; }

        @Override
        protected void onChangeValue(java.lang.Float oldValue, java.lang.Float newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient RejectDateModel rejectDateModel;

    public RejectDateModel getRejectDateModel() {
        if (rejectDateModel == null) rejectDateModel = createRejectDateModel();
        return rejectDateModel;
    }

    protected RejectDateModel createRejectDateModel() { return new RejectDateModel(); }

    protected class RejectDateModel extends ilarkesto.gwt.client.editor.ADateEditorModel {

        @Override
        public String getId() {
            return "Requirement_rejectDate";
        }

        @Override
        public ilarkesto.core.time.Date getValue() {
            return getRejectDate();
        }

        @Override
        public void setValue(ilarkesto.core.time.Date value) {
            setRejectDate(value);
        }

        @Override
        protected void onChangeValue(ilarkesto.core.time.Date oldValue, ilarkesto.core.time.Date newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient ClosedModel closedModel;

    public ClosedModel getClosedModel() {
        if (closedModel == null) closedModel = createClosedModel();
        return closedModel;
    }

    protected ClosedModel createClosedModel() { return new ClosedModel(); }

    protected class ClosedModel extends ilarkesto.gwt.client.editor.ABooleanEditorModel {

        @Override
        public String getId() {
            return "Requirement_closed";
        }

        @Override
        public java.lang.Boolean getValue() {
            return isClosed();
        }

        @Override
        public void setValue(java.lang.Boolean value) {
            setClosed(value);
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

    private transient DeletedModel deletedModel;

    public DeletedModel getDeletedModel() {
        if (deletedModel == null) deletedModel = createDeletedModel();
        return deletedModel;
    }

    protected DeletedModel createDeletedModel() { return new DeletedModel(); }

    protected class DeletedModel extends ilarkesto.gwt.client.editor.ABooleanEditorModel {

        @Override
        public String getId() {
            return "Requirement_deleted";
        }

        @Override
        public java.lang.Boolean getValue() {
            return isDeleted();
        }

        @Override
        public void setValue(java.lang.Boolean value) {
            setDeleted(value);
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

    private transient DirtyModel dirtyModel;

    public DirtyModel getDirtyModel() {
        if (dirtyModel == null) dirtyModel = createDirtyModel();
        return dirtyModel;
    }

    protected DirtyModel createDirtyModel() { return new DirtyModel(); }

    protected class DirtyModel extends ilarkesto.gwt.client.editor.ABooleanEditorModel {

        @Override
        public String getId() {
            return "Requirement_dirty";
        }

        @Override
        public java.lang.Boolean getValue() {
            return isDirty();
        }

        @Override
        public void setValue(java.lang.Boolean value) {
            setDirty(value);
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

    private transient WorkEstimationVotingActiveModel workEstimationVotingActiveModel;

    public WorkEstimationVotingActiveModel getWorkEstimationVotingActiveModel() {
        if (workEstimationVotingActiveModel == null) workEstimationVotingActiveModel = createWorkEstimationVotingActiveModel();
        return workEstimationVotingActiveModel;
    }

    protected WorkEstimationVotingActiveModel createWorkEstimationVotingActiveModel() { return new WorkEstimationVotingActiveModel(); }

    protected class WorkEstimationVotingActiveModel extends ilarkesto.gwt.client.editor.ABooleanEditorModel {

        @Override
        public String getId() {
            return "Requirement_workEstimationVotingActive";
        }

        @Override
        public java.lang.Boolean getValue() {
            return isWorkEstimationVotingActive();
        }

        @Override
        public void setValue(java.lang.Boolean value) {
            setWorkEstimationVotingActive(value);
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

    private transient WorkEstimationVotingShowoffModel workEstimationVotingShowoffModel;

    public WorkEstimationVotingShowoffModel getWorkEstimationVotingShowoffModel() {
        if (workEstimationVotingShowoffModel == null) workEstimationVotingShowoffModel = createWorkEstimationVotingShowoffModel();
        return workEstimationVotingShowoffModel;
    }

    protected WorkEstimationVotingShowoffModel createWorkEstimationVotingShowoffModel() { return new WorkEstimationVotingShowoffModel(); }

    protected class WorkEstimationVotingShowoffModel extends ilarkesto.gwt.client.editor.ABooleanEditorModel {

        @Override
        public String getId() {
            return "Requirement_workEstimationVotingShowoff";
        }

        @Override
        public java.lang.Boolean getValue() {
            return isWorkEstimationVotingShowoff();
        }

        @Override
        public void setValue(java.lang.Boolean value) {
            setWorkEstimationVotingShowoff(value);
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

    private transient ExternalTrackerIdModel externalTrackerIdModel;

    public ExternalTrackerIdModel getExternalTrackerIdModel() {
        if (externalTrackerIdModel == null) externalTrackerIdModel = createExternalTrackerIdModel();
        return externalTrackerIdModel;
    }

    protected ExternalTrackerIdModel createExternalTrackerIdModel() { return new ExternalTrackerIdModel(); }

    protected class ExternalTrackerIdModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Requirement_externalTrackerId";
        }

        @Override
        public java.lang.String getValue() {
            return getExternalTrackerId();
        }

        @Override
        public void setValue(java.lang.String value) {
            setExternalTrackerId(value);
        }

        @Override
        public boolean isEditable() { return GRequirement.this.isEditable(); }
        @Override
        public String getTooltip() { return "External system ID. From other bug tracker or else."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

}