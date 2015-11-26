// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: scrum.mda.KunagiModelApplication$1










package scrum.client.sprint;

import java.util.*;
import ilarkesto.core.base.Utl;
import ilarkesto.core.logging.Log;
import ilarkesto.core.base.Str;
import ilarkesto.core.persistance.AEntity;
import ilarkesto.core.persistance.EntityDoesNotExistException;

public abstract class GSprint
            extends scrum.client.common.AScrumGwtEntity
            implements java.lang.Comparable<Sprint> {

    public static class SprintMetadata implements ilarkesto.core.persistance.meta.EntityMetadata {

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata number = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "number";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Sprint)entity).getNumber();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata project = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "project";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Sprint)entity).getProject();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata label = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "label";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Sprint)entity).getLabel();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata goal = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "goal";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Sprint)entity).getGoal();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata begin = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "begin";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Sprint)entity).getBegin();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata end = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "end";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Sprint)entity).getEnd();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata originallyEnd = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "originallyEnd";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Sprint)entity).getOriginallyEnd();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata velocity = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "velocity";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Sprint)entity).getVelocity();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata completedRequirementsData = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "completedRequirementsData";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Sprint)entity).getCompletedRequirementsData();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata incompletedRequirementsData = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "incompletedRequirementsData";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Sprint)entity).getIncompletedRequirementsData();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata planningNote = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "planningNote";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Sprint)entity).getPlanningNote();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata reviewNote = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "reviewNote";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Sprint)entity).getReviewNote();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata retrospectiveNote = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "retrospectiveNote";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Sprint)entity).getRetrospectiveNote();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata requirementsOrderIds = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "requirementsOrderIds";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Sprint)entity).getRequirementsOrderIds();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata productOwners = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "productOwners";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Sprint)entity).getProductOwners();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata scrumMasters = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "scrumMasters";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Sprint)entity).getScrumMasters();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata teamMembers = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "teamMembers";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Sprint)entity).getTeamMembers();
            }

        };

        public static transient ilarkesto.core.persistance.meta.EntityFieldMetadata[] fields = new ilarkesto.core.persistance.meta.EntityFieldMetadata[] {
            number
            ,project
            ,label
            ,goal
            ,begin
            ,end
            ,originallyEnd
            ,velocity
            ,completedRequirementsData
            ,incompletedRequirementsData
            ,planningNote
            ,reviewNote
            ,retrospectiveNote
            ,requirementsOrderIds
            ,productOwners
            ,scrumMasters
            ,teamMembers
        };

        public ilarkesto.core.persistance.meta.EntityFieldMetadata[] getFields() {
            return fields;
        }

        public ilarkesto.core.persistance.meta.EntityFieldMetadata getField(String fieldName) {
            if ("number".equals(fieldName)) return number;
            if ("project".equals(fieldName)) return project;
            if ("projectId".equals(fieldName)) return project;
            if ("label".equals(fieldName)) return label;
            if ("goal".equals(fieldName)) return goal;
            if ("begin".equals(fieldName)) return begin;
            if ("end".equals(fieldName)) return end;
            if ("originallyEnd".equals(fieldName)) return originallyEnd;
            if ("velocity".equals(fieldName)) return velocity;
            if ("completedRequirementsData".equals(fieldName)) return completedRequirementsData;
            if ("incompletedRequirementsData".equals(fieldName)) return incompletedRequirementsData;
            if ("planningNote".equals(fieldName)) return planningNote;
            if ("reviewNote".equals(fieldName)) return reviewNote;
            if ("retrospectiveNote".equals(fieldName)) return retrospectiveNote;
            if ("requirementsOrderIds".equals(fieldName)) return requirementsOrderIds;
            if ("productOwners".equals(fieldName)) return productOwners;
            if ("productOwnersIds".equals(fieldName)) return productOwners;
            if ("scrumMasters".equals(fieldName)) return scrumMasters;
            if ("scrumMastersIds".equals(fieldName)) return scrumMasters;
            if ("teamMembers".equals(fieldName)) return teamMembers;
            if ("teamMembersIds".equals(fieldName)) return teamMembers;
            return null;
        }

    }

    public static transient final SprintMetadata metadata = new SprintMetadata();

    @Override
    public SprintMetadata getMetadata() { return metadata; };

    protected static final ilarkesto.core.logging.Log log = ilarkesto.core.logging.Log.get(Sprint.class);

    public static Set< Sprint> listByNumber(final int number) {
        return new ASprintQuery() {
            @Override
            public boolean test(Sprint entity) {
                return entity.isNumber(number);
            }
            @Override
            public String toString() {
                return "Sprint:byNumber";
            }
        }.list();
    }

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Sprint> projectBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Sprint>() {
    @Override
        protected Set<Sprint> loadById(final String id) {
        return new ASprintQuery() {
            @Override
            public boolean test(Sprint entity) {
                return id.equals(entity.getProjectId());
            }
            @Override
            public String toString() {
                return "Sprint:byProject";
            }
        }.list();
        }
    };

    public static Set< Sprint> listByProject(final scrum.client.project.Project project) {
        if (project == null) return new HashSet<Sprint>();
        return projectBackReferencesCache.getById(project.getId());
    }

    public static Set< Sprint> listByLabel(final java.lang.String label) {
        return new ASprintQuery() {
            @Override
            public boolean test(Sprint entity) {
                return entity.isLabel(label);
            }
            @Override
            public String toString() {
                return "Sprint:byLabel";
            }
        }.list();
    }

    public static Set< Sprint> listByGoal(final java.lang.String goal) {
        return new ASprintQuery() {
            @Override
            public boolean test(Sprint entity) {
                return entity.isGoal(goal);
            }
            @Override
            public String toString() {
                return "Sprint:byGoal";
            }
        }.list();
    }

    public static Set< Sprint> listByBegin(final ilarkesto.core.time.Date begin) {
        return new ASprintQuery() {
            @Override
            public boolean test(Sprint entity) {
                return entity.isBegin(begin);
            }
            @Override
            public String toString() {
                return "Sprint:byBegin";
            }
        }.list();
    }

    public static Set< Sprint> listByEnd(final ilarkesto.core.time.Date end) {
        return new ASprintQuery() {
            @Override
            public boolean test(Sprint entity) {
                return entity.isEnd(end);
            }
            @Override
            public String toString() {
                return "Sprint:byEnd";
            }
        }.list();
    }

    public static Set< Sprint> listByOriginallyEnd(final ilarkesto.core.time.Date originallyEnd) {
        return new ASprintQuery() {
            @Override
            public boolean test(Sprint entity) {
                return entity.isOriginallyEnd(originallyEnd);
            }
            @Override
            public String toString() {
                return "Sprint:byOriginallyEnd";
            }
        }.list();
    }

    public static Set< Sprint> listByVelocity(final java.lang.Float velocity) {
        return new ASprintQuery() {
            @Override
            public boolean test(Sprint entity) {
                return entity.isVelocity(velocity);
            }
            @Override
            public String toString() {
                return "Sprint:byVelocity";
            }
        }.list();
    }

    public static Set< Sprint> listByCompletedRequirementsData(final java.lang.String completedRequirementsData) {
        return new ASprintQuery() {
            @Override
            public boolean test(Sprint entity) {
                return entity.isCompletedRequirementsData(completedRequirementsData);
            }
            @Override
            public String toString() {
                return "Sprint:byCompletedRequirementsData";
            }
        }.list();
    }

    public static Set< Sprint> listByIncompletedRequirementsData(final java.lang.String incompletedRequirementsData) {
        return new ASprintQuery() {
            @Override
            public boolean test(Sprint entity) {
                return entity.isIncompletedRequirementsData(incompletedRequirementsData);
            }
            @Override
            public String toString() {
                return "Sprint:byIncompletedRequirementsData";
            }
        }.list();
    }

    public static Set< Sprint> listByPlanningNote(final java.lang.String planningNote) {
        return new ASprintQuery() {
            @Override
            public boolean test(Sprint entity) {
                return entity.isPlanningNote(planningNote);
            }
            @Override
            public String toString() {
                return "Sprint:byPlanningNote";
            }
        }.list();
    }

    public static Set< Sprint> listByReviewNote(final java.lang.String reviewNote) {
        return new ASprintQuery() {
            @Override
            public boolean test(Sprint entity) {
                return entity.isReviewNote(reviewNote);
            }
            @Override
            public String toString() {
                return "Sprint:byReviewNote";
            }
        }.list();
    }

    public static Set< Sprint> listByRetrospectiveNote(final java.lang.String retrospectiveNote) {
        return new ASprintQuery() {
            @Override
            public boolean test(Sprint entity) {
                return entity.isRetrospectiveNote(retrospectiveNote);
            }
            @Override
            public String toString() {
                return "Sprint:byRetrospectiveNote";
            }
        }.list();
    }

    public static Set< Sprint> listByRequirementsOrderId(final java.lang.String requirementsOrderId) {
        return new ASprintQuery() {
            @Override
            public boolean test(Sprint entity) {
                return entity.containsRequirementsOrderId(requirementsOrderId);
            }
            @Override
            public String toString() {
                return "Sprint:byRequirementsOrderIds";
            }
        }.list();
    }

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Sprint> productOwnersBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Sprint>() {
    @Override
        protected Set<Sprint> loadById(final String id) {
        return new ASprintQuery() {
            @Override
            public boolean test(Sprint entity) {
                return entity.getProductOwnersIds().contains(id);
            }
            @Override
            public String toString() {
                return "Sprint:byProductOwners";
            }
        }.list();
        }
    };

    public static Set< Sprint> listByProductOwner(final scrum.client.admin.User productOwner) {
        if (productOwner == null) return new HashSet<Sprint>();
        return productOwnersBackReferencesCache.getById(productOwner.getId());
    }

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Sprint> scrumMastersBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Sprint>() {
    @Override
        protected Set<Sprint> loadById(final String id) {
        return new ASprintQuery() {
            @Override
            public boolean test(Sprint entity) {
                return entity.getScrumMastersIds().contains(id);
            }
            @Override
            public String toString() {
                return "Sprint:byScrumMasters";
            }
        }.list();
        }
    };

    public static Set< Sprint> listByScrumMaster(final scrum.client.admin.User scrumMaster) {
        if (scrumMaster == null) return new HashSet<Sprint>();
        return scrumMastersBackReferencesCache.getById(scrumMaster.getId());
    }

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Sprint> teamMembersBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Sprint>() {
    @Override
        protected Set<Sprint> loadById(final String id) {
        return new ASprintQuery() {
            @Override
            public boolean test(Sprint entity) {
                return entity.getTeamMembersIds().contains(id);
            }
            @Override
            public String toString() {
                return "Sprint:byTeamMembers";
            }
        }.list();
        }
    };

    public static Set< Sprint> listByTeamMember(final scrum.client.admin.User teamMember) {
        if (teamMember == null) return new HashSet<Sprint>();
        return teamMembersBackReferencesCache.getById(teamMember.getId());
    }

    @Override
    protected void onAfterPersist() {
        super.onAfterPersist();
        projectBackReferencesCache.clear(getProjectId());
        productOwnersBackReferencesCache.clear(getProductOwnersIds());
        scrumMastersBackReferencesCache.clear(getScrumMastersIds());
        teamMembersBackReferencesCache.clear(getTeamMembersIds());
    }

    public abstract boolean isEditable();

    public static Set<Sprint> listByIsEditable() {
        return new ASprintQuery() {
            @Override
            public boolean test(Sprint entity) {
                return entity.isEditable();
            }
            @Override
            public String toString() {
                return "Sprint:byIsEditable";
            }
        }.list();
    }

    public final boolean isNotEditable() {
        return !isEditable();
    }

    public static Set<Sprint> listByIsNotEditable() {
        return new ASprintQuery() {
            @Override
            public boolean test(Sprint entity) {
                return entity.isNotEditable();
            }
            @Override
            public String toString() {
                return "Sprint:byIsNotEditable";
            }
        }.list();
    }

    public abstract boolean isPlanningEditable();

    public static Set<Sprint> listByIsPlanningEditable() {
        return new ASprintQuery() {
            @Override
            public boolean test(Sprint entity) {
                return entity.isPlanningEditable();
            }
            @Override
            public String toString() {
                return "Sprint:byIsPlanningEditable";
            }
        }.list();
    }

    public final boolean isNotPlanningEditable() {
        return !isPlanningEditable();
    }

    public static Set<Sprint> listByIsNotPlanningEditable() {
        return new ASprintQuery() {
            @Override
            public boolean test(Sprint entity) {
                return entity.isNotPlanningEditable();
            }
            @Override
            public String toString() {
                return "Sprint:byIsNotPlanningEditable";
            }
        }.list();
    }

    public abstract boolean isReviewEditable();

    public static Set<Sprint> listByIsReviewEditable() {
        return new ASprintQuery() {
            @Override
            public boolean test(Sprint entity) {
                return entity.isReviewEditable();
            }
            @Override
            public String toString() {
                return "Sprint:byIsReviewEditable";
            }
        }.list();
    }

    public final boolean isNotReviewEditable() {
        return !isReviewEditable();
    }

    public static Set<Sprint> listByIsNotReviewEditable() {
        return new ASprintQuery() {
            @Override
            public boolean test(Sprint entity) {
                return entity.isNotReviewEditable();
            }
            @Override
            public String toString() {
                return "Sprint:byIsNotReviewEditable";
            }
        }.list();
    }

    public abstract boolean isRetrospectiveEditable();

    public static Set<Sprint> listByIsRetrospectiveEditable() {
        return new ASprintQuery() {
            @Override
            public boolean test(Sprint entity) {
                return entity.isRetrospectiveEditable();
            }
            @Override
            public String toString() {
                return "Sprint:byIsRetrospectiveEditable";
            }
        }.list();
    }

    public final boolean isNotRetrospectiveEditable() {
        return !isRetrospectiveEditable();
    }

    public static Set<Sprint> listByIsNotRetrospectiveEditable() {
        return new ASprintQuery() {
            @Override
            public boolean test(Sprint entity) {
                return entity.isNotRetrospectiveEditable();
            }
            @Override
            public String toString() {
                return "Sprint:byIsNotRetrospectiveEditable";
            }
        }.list();
    }

    public abstract boolean isDatesEditable();

    public static Set<Sprint> listByIsDatesEditable() {
        return new ASprintQuery() {
            @Override
            public boolean test(Sprint entity) {
                return entity.isDatesEditable();
            }
            @Override
            public String toString() {
                return "Sprint:byIsDatesEditable";
            }
        }.list();
    }

    public final boolean isNotDatesEditable() {
        return !isDatesEditable();
    }

    public static Set<Sprint> listByIsNotDatesEditable() {
        return new ASprintQuery() {
            @Override
            public boolean test(Sprint entity) {
                return entity.isNotDatesEditable();
            }
            @Override
            public String toString() {
                return "Sprint:byIsNotDatesEditable";
            }
        }.list();
    }

    public abstract static class ASprintQuery extends ilarkesto.core.persistance.AEntityQuery<Sprint> {
    @Override
        public Class<Sprint> getType() {
            return Sprint.class;
        }
    }

    public static Set<Sprint> listAll() {
        return new ilarkesto.core.persistance.AllByTypeQuery(Sprint.class).list();
    }

    public static Sprint getById(String id) {
        return (Sprint) AEntity.getById(id);
    }

    @Override
    public Set<ilarkesto.core.persistance.Entity> getReferencedEntities() {
        Set<ilarkesto.core.persistance.Entity> ret = super.getReferencedEntities();
    // --- references ---
        try { Utl.addIfNotNull(ret, getProject()); } catch(EntityDoesNotExistException ex) {}
        if (productOwnersIds!=null) for (String id : productOwnersIds) {
            try { ret.add(AEntity.getById(id)); } catch(EntityDoesNotExistException ex) {}
        }
        if (scrumMastersIds!=null) for (String id : scrumMastersIds) {
            try { ret.add(AEntity.getById(id)); } catch(EntityDoesNotExistException ex) {}
        }
        if (teamMembersIds!=null) for (String id : teamMembersIds) {
            try { ret.add(AEntity.getById(id)); } catch(EntityDoesNotExistException ex) {}
        }
    // --- back references ---
        ret.addAll(getCurrentSprintProjects());
        ret.addAll(getNextSprintProjects());
        ret.addAll(getSprintDaySnapshots());
        Utl.addIfNotNull(ret, getSprintReport());
        ret.addAll(getRequirements());
        ret.addAll(getReleases());
        ret.addAll(getClosedTasksInPasts());
        Utl.addIfNotNull(ret, getProjectSprintSnapshot());
        return ret;
    }

    @Override
    public void storeProperties(Map<String, String> properties) {
        super.storeProperties(properties);
        properties.put("number", ilarkesto.core.persistance.Persistence.propertyAsString(this.number));
        properties.put("projectId", ilarkesto.core.persistance.Persistence.propertyAsString(this.projectId));
        properties.put("label", ilarkesto.core.persistance.Persistence.propertyAsString(this.label));
        properties.put("goal", ilarkesto.core.persistance.Persistence.propertyAsString(this.goal));
        properties.put("begin", ilarkesto.core.persistance.Persistence.propertyAsString(this.begin));
        properties.put("end", ilarkesto.core.persistance.Persistence.propertyAsString(this.end));
        properties.put("originallyEnd", ilarkesto.core.persistance.Persistence.propertyAsString(this.originallyEnd));
        properties.put("velocity", ilarkesto.core.persistance.Persistence.propertyAsString(this.velocity));
        properties.put("completedRequirementsData", ilarkesto.core.persistance.Persistence.propertyAsString(this.completedRequirementsData));
        properties.put("incompletedRequirementsData", ilarkesto.core.persistance.Persistence.propertyAsString(this.incompletedRequirementsData));
        properties.put("planningNote", ilarkesto.core.persistance.Persistence.propertyAsString(this.planningNote));
        properties.put("reviewNote", ilarkesto.core.persistance.Persistence.propertyAsString(this.reviewNote));
        properties.put("retrospectiveNote", ilarkesto.core.persistance.Persistence.propertyAsString(this.retrospectiveNote));
        properties.put("requirementsOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.requirementsOrderIds));
        properties.put("productOwnersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.productOwnersIds));
        properties.put("scrumMastersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.scrumMastersIds));
        properties.put("teamMembersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.teamMembersIds));
    }

    @Override
    public int compareTo(Sprint other) {
        return ilarkesto.core.localization.GermanComparator.INSTANCE.compare(toString(), other.toString());
    }

    public final Set<scrum.client.project.Project> getCurrentSprintProjects() {
        return scrum.client.project.Project.listByCurrentSprint((Sprint)this);
    }

    public final Set<scrum.client.project.Project> getNextSprintProjects() {
        return scrum.client.project.Project.listByNextSprint((Sprint)this);
    }

    public final Set<scrum.client.sprint.SprintDaySnapshot> getSprintDaySnapshots() {
        return scrum.client.sprint.SprintDaySnapshot.listBySprint((Sprint)this);
    }

    public final scrum.client.sprint.SprintReport getSprintReport() {
        return scrum.client.sprint.SprintReport.getBySprint((Sprint)this);
    }

    public final Set<scrum.client.project.Requirement> getRequirements() {
        return scrum.client.project.Requirement.listBySprint((Sprint)this);
    }

    public final Set<scrum.client.release.Release> getReleases() {
        return scrum.client.release.Release.listBySprint((Sprint)this);
    }

    public final Set<scrum.client.sprint.Task> getClosedTasksInPasts() {
        return scrum.client.sprint.Task.listByClosedInPastSprint((Sprint)this);
    }

    public final scrum.client.project.ProjectSprintSnapshot getProjectSprintSnapshot() {
        return scrum.client.project.ProjectSprintSnapshot.getBySprint((Sprint)this);
    }

    private static final ilarkesto.core.logging.Log LOG = ilarkesto.core.logging.Log.get(GSprint.class);

    public static final String TYPE = "Sprint";


    // -----------------------------------------------------------
    // - Searchable
    // -----------------------------------------------------------

    @Override
    public boolean matches(ilarkesto.core.search.SearchText search) {
         return search.matches(getLabel(), getGoal(), getPlanningNote(), getReviewNote(), getRetrospectiveNote());
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
            throw ex.setCallerInfo("Sprint.project");
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
         label = Str.removeControlChars(label);
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
    // - goal
    // -----------------------------------------------------------

    private java.lang.String goal;

    public final java.lang.String getGoal() {
        return goal;
    }

    public final void setGoal(java.lang.String goal) {
        goal = prepareGoal(goal);
        if (isGoal(goal)) return;
        this.goal = goal;
            updateLastModified();
            fireModified("goal", ilarkesto.core.persistance.Persistence.propertyAsString(this.goal));
    }

    public abstract String getGoalTemplate();

    private final void updateGoal(java.lang.String goal) {
        if (isGoal(goal)) return;
        this.goal = goal;
            updateLastModified();
            fireModified("goal", ilarkesto.core.persistance.Persistence.propertyAsString(this.goal));
    }

    protected java.lang.String prepareGoal(java.lang.String goal) {
         goal = Str.removeControlChars(goal);
        return goal;
    }

    public final boolean isGoalSet() {
        return this.goal != null;
    }

    public final boolean isGoal(java.lang.String goal) {
        if (this.goal == null && goal == null) return true;
        return this.goal != null && this.goal.equals(goal);
    }

    protected final void updateGoal(Object value) {
        setGoal((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - begin
    // -----------------------------------------------------------

    private ilarkesto.core.time.Date begin;

    public final ilarkesto.core.time.Date getBegin() {
        return begin;
    }

    public final void setBegin(ilarkesto.core.time.Date begin) {
        begin = prepareBegin(begin);
        if (isBegin(begin)) return;
        this.begin = begin;
            updateLastModified();
            fireModified("begin", ilarkesto.core.persistance.Persistence.propertyAsString(this.begin));
    }

    private final void updateBegin(ilarkesto.core.time.Date begin) {
        if (isBegin(begin)) return;
        this.begin = begin;
            updateLastModified();
            fireModified("begin", ilarkesto.core.persistance.Persistence.propertyAsString(this.begin));
    }

    protected ilarkesto.core.time.Date prepareBegin(ilarkesto.core.time.Date begin) {
        return begin;
    }

    public final boolean isBeginSet() {
        return this.begin != null;
    }

    public final boolean isBegin(ilarkesto.core.time.Date begin) {
        if (this.begin == null && begin == null) return true;
        return this.begin != null && this.begin.equals(begin);
    }

    protected final void updateBegin(Object value) {
        value = value == null ? null : new ilarkesto.core.time.Date((String)value);
        setBegin((ilarkesto.core.time.Date)value);
    }
    // -----------------------------------------------------------
    // - end
    // -----------------------------------------------------------

    private ilarkesto.core.time.Date end;

    public final ilarkesto.core.time.Date getEnd() {
        return end;
    }

    public final void setEnd(ilarkesto.core.time.Date end) {
        end = prepareEnd(end);
        if (isEnd(end)) return;
        this.end = end;
            updateLastModified();
            fireModified("end", ilarkesto.core.persistance.Persistence.propertyAsString(this.end));
    }

    private final void updateEnd(ilarkesto.core.time.Date end) {
        if (isEnd(end)) return;
        this.end = end;
            updateLastModified();
            fireModified("end", ilarkesto.core.persistance.Persistence.propertyAsString(this.end));
    }

    protected ilarkesto.core.time.Date prepareEnd(ilarkesto.core.time.Date end) {
        return end;
    }

    public final boolean isEndSet() {
        return this.end != null;
    }

    public final boolean isEnd(ilarkesto.core.time.Date end) {
        if (this.end == null && end == null) return true;
        return this.end != null && this.end.equals(end);
    }

    protected final void updateEnd(Object value) {
        value = value == null ? null : new ilarkesto.core.time.Date((String)value);
        setEnd((ilarkesto.core.time.Date)value);
    }
    // -----------------------------------------------------------
    // - originallyEnd
    // -----------------------------------------------------------

    private ilarkesto.core.time.Date originallyEnd;

    public final ilarkesto.core.time.Date getOriginallyEnd() {
        return originallyEnd;
    }

    public final void setOriginallyEnd(ilarkesto.core.time.Date originallyEnd) {
        originallyEnd = prepareOriginallyEnd(originallyEnd);
        if (isOriginallyEnd(originallyEnd)) return;
        this.originallyEnd = originallyEnd;
            updateLastModified();
            fireModified("originallyEnd", ilarkesto.core.persistance.Persistence.propertyAsString(this.originallyEnd));
    }

    private final void updateOriginallyEnd(ilarkesto.core.time.Date originallyEnd) {
        if (isOriginallyEnd(originallyEnd)) return;
        this.originallyEnd = originallyEnd;
            updateLastModified();
            fireModified("originallyEnd", ilarkesto.core.persistance.Persistence.propertyAsString(this.originallyEnd));
    }

    protected ilarkesto.core.time.Date prepareOriginallyEnd(ilarkesto.core.time.Date originallyEnd) {
        return originallyEnd;
    }

    public final boolean isOriginallyEndSet() {
        return this.originallyEnd != null;
    }

    public final boolean isOriginallyEnd(ilarkesto.core.time.Date originallyEnd) {
        if (this.originallyEnd == null && originallyEnd == null) return true;
        return this.originallyEnd != null && this.originallyEnd.equals(originallyEnd);
    }

    protected final void updateOriginallyEnd(Object value) {
        value = value == null ? null : new ilarkesto.core.time.Date((String)value);
        setOriginallyEnd((ilarkesto.core.time.Date)value);
    }
    // -----------------------------------------------------------
    // - velocity
    // -----------------------------------------------------------

    private java.lang.Float velocity;

    public final java.lang.Float getVelocity() {
        return velocity;
    }

    public final void setVelocity(java.lang.Float velocity) {
        velocity = prepareVelocity(velocity);
        if (isVelocity(velocity)) return;
        this.velocity = velocity;
            updateLastModified();
            fireModified("velocity", ilarkesto.core.persistance.Persistence.propertyAsString(this.velocity));
    }

    private final void updateVelocity(java.lang.Float velocity) {
        if (isVelocity(velocity)) return;
        this.velocity = velocity;
            updateLastModified();
            fireModified("velocity", ilarkesto.core.persistance.Persistence.propertyAsString(this.velocity));
    }

    protected java.lang.Float prepareVelocity(java.lang.Float velocity) {
        return velocity;
    }

    public final boolean isVelocitySet() {
        return this.velocity != null;
    }

    public final boolean isVelocity(java.lang.Float velocity) {
        if (this.velocity == null && velocity == null) return true;
        return this.velocity != null && this.velocity.equals(velocity);
    }

    protected final void updateVelocity(Object value) {
        setVelocity((java.lang.Float)value);
    }
    // -----------------------------------------------------------
    // - completedRequirementsData
    // -----------------------------------------------------------

    private java.lang.String completedRequirementsData;

    public final java.lang.String getCompletedRequirementsData() {
        return completedRequirementsData;
    }

    public final void setCompletedRequirementsData(java.lang.String completedRequirementsData) {
        completedRequirementsData = prepareCompletedRequirementsData(completedRequirementsData);
        if (isCompletedRequirementsData(completedRequirementsData)) return;
        this.completedRequirementsData = completedRequirementsData;
            updateLastModified();
            fireModified("completedRequirementsData", ilarkesto.core.persistance.Persistence.propertyAsString(this.completedRequirementsData));
    }

    private final void updateCompletedRequirementsData(java.lang.String completedRequirementsData) {
        if (isCompletedRequirementsData(completedRequirementsData)) return;
        this.completedRequirementsData = completedRequirementsData;
            updateLastModified();
            fireModified("completedRequirementsData", ilarkesto.core.persistance.Persistence.propertyAsString(this.completedRequirementsData));
    }

    protected java.lang.String prepareCompletedRequirementsData(java.lang.String completedRequirementsData) {
         completedRequirementsData = Str.removeControlChars(completedRequirementsData);
        return completedRequirementsData;
    }

    public final boolean isCompletedRequirementsDataSet() {
        return this.completedRequirementsData != null;
    }

    public final boolean isCompletedRequirementsData(java.lang.String completedRequirementsData) {
        if (this.completedRequirementsData == null && completedRequirementsData == null) return true;
        return this.completedRequirementsData != null && this.completedRequirementsData.equals(completedRequirementsData);
    }

    protected final void updateCompletedRequirementsData(Object value) {
        setCompletedRequirementsData((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - incompletedRequirementsData
    // -----------------------------------------------------------

    private java.lang.String incompletedRequirementsData;

    public final java.lang.String getIncompletedRequirementsData() {
        return incompletedRequirementsData;
    }

    public final void setIncompletedRequirementsData(java.lang.String incompletedRequirementsData) {
        incompletedRequirementsData = prepareIncompletedRequirementsData(incompletedRequirementsData);
        if (isIncompletedRequirementsData(incompletedRequirementsData)) return;
        this.incompletedRequirementsData = incompletedRequirementsData;
            updateLastModified();
            fireModified("incompletedRequirementsData", ilarkesto.core.persistance.Persistence.propertyAsString(this.incompletedRequirementsData));
    }

    private final void updateIncompletedRequirementsData(java.lang.String incompletedRequirementsData) {
        if (isIncompletedRequirementsData(incompletedRequirementsData)) return;
        this.incompletedRequirementsData = incompletedRequirementsData;
            updateLastModified();
            fireModified("incompletedRequirementsData", ilarkesto.core.persistance.Persistence.propertyAsString(this.incompletedRequirementsData));
    }

    protected java.lang.String prepareIncompletedRequirementsData(java.lang.String incompletedRequirementsData) {
         incompletedRequirementsData = Str.removeControlChars(incompletedRequirementsData);
        return incompletedRequirementsData;
    }

    public final boolean isIncompletedRequirementsDataSet() {
        return this.incompletedRequirementsData != null;
    }

    public final boolean isIncompletedRequirementsData(java.lang.String incompletedRequirementsData) {
        if (this.incompletedRequirementsData == null && incompletedRequirementsData == null) return true;
        return this.incompletedRequirementsData != null && this.incompletedRequirementsData.equals(incompletedRequirementsData);
    }

    protected final void updateIncompletedRequirementsData(Object value) {
        setIncompletedRequirementsData((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - planningNote
    // -----------------------------------------------------------

    private java.lang.String planningNote;

    public final java.lang.String getPlanningNote() {
        return planningNote;
    }

    public final void setPlanningNote(java.lang.String planningNote) {
        planningNote = preparePlanningNote(planningNote);
        if (isPlanningNote(planningNote)) return;
        this.planningNote = planningNote;
            updateLastModified();
            fireModified("planningNote", ilarkesto.core.persistance.Persistence.propertyAsString(this.planningNote));
    }

    public abstract String getPlanningNoteTemplate();

    private final void updatePlanningNote(java.lang.String planningNote) {
        if (isPlanningNote(planningNote)) return;
        this.planningNote = planningNote;
            updateLastModified();
            fireModified("planningNote", ilarkesto.core.persistance.Persistence.propertyAsString(this.planningNote));
    }

    protected java.lang.String preparePlanningNote(java.lang.String planningNote) {
         planningNote = Str.removeControlChars(planningNote);
        return planningNote;
    }

    public final boolean isPlanningNoteSet() {
        return this.planningNote != null;
    }

    public final boolean isPlanningNote(java.lang.String planningNote) {
        if (this.planningNote == null && planningNote == null) return true;
        return this.planningNote != null && this.planningNote.equals(planningNote);
    }

    protected final void updatePlanningNote(Object value) {
        setPlanningNote((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - reviewNote
    // -----------------------------------------------------------

    private java.lang.String reviewNote;

    public final java.lang.String getReviewNote() {
        return reviewNote;
    }

    public final void setReviewNote(java.lang.String reviewNote) {
        reviewNote = prepareReviewNote(reviewNote);
        if (isReviewNote(reviewNote)) return;
        this.reviewNote = reviewNote;
            updateLastModified();
            fireModified("reviewNote", ilarkesto.core.persistance.Persistence.propertyAsString(this.reviewNote));
    }

    public abstract String getReviewNoteTemplate();

    private final void updateReviewNote(java.lang.String reviewNote) {
        if (isReviewNote(reviewNote)) return;
        this.reviewNote = reviewNote;
            updateLastModified();
            fireModified("reviewNote", ilarkesto.core.persistance.Persistence.propertyAsString(this.reviewNote));
    }

    protected java.lang.String prepareReviewNote(java.lang.String reviewNote) {
         reviewNote = Str.removeControlChars(reviewNote);
        return reviewNote;
    }

    public final boolean isReviewNoteSet() {
        return this.reviewNote != null;
    }

    public final boolean isReviewNote(java.lang.String reviewNote) {
        if (this.reviewNote == null && reviewNote == null) return true;
        return this.reviewNote != null && this.reviewNote.equals(reviewNote);
    }

    protected final void updateReviewNote(Object value) {
        setReviewNote((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - retrospectiveNote
    // -----------------------------------------------------------

    private java.lang.String retrospectiveNote;

    public final java.lang.String getRetrospectiveNote() {
        return retrospectiveNote;
    }

    public final void setRetrospectiveNote(java.lang.String retrospectiveNote) {
        retrospectiveNote = prepareRetrospectiveNote(retrospectiveNote);
        if (isRetrospectiveNote(retrospectiveNote)) return;
        this.retrospectiveNote = retrospectiveNote;
            updateLastModified();
            fireModified("retrospectiveNote", ilarkesto.core.persistance.Persistence.propertyAsString(this.retrospectiveNote));
    }

    public abstract String getRetrospectiveNoteTemplate();

    private final void updateRetrospectiveNote(java.lang.String retrospectiveNote) {
        if (isRetrospectiveNote(retrospectiveNote)) return;
        this.retrospectiveNote = retrospectiveNote;
            updateLastModified();
            fireModified("retrospectiveNote", ilarkesto.core.persistance.Persistence.propertyAsString(this.retrospectiveNote));
    }

    protected java.lang.String prepareRetrospectiveNote(java.lang.String retrospectiveNote) {
         retrospectiveNote = Str.removeControlChars(retrospectiveNote);
        return retrospectiveNote;
    }

    public final boolean isRetrospectiveNoteSet() {
        return this.retrospectiveNote != null;
    }

    public final boolean isRetrospectiveNote(java.lang.String retrospectiveNote) {
        if (this.retrospectiveNote == null && retrospectiveNote == null) return true;
        return this.retrospectiveNote != null && this.retrospectiveNote.equals(retrospectiveNote);
    }

    protected final void updateRetrospectiveNote(Object value) {
        setRetrospectiveNote((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - requirementsOrderIds
    // -----------------------------------------------------------

    private java.util.List<java.lang.String> requirementsOrderIds = new java.util.ArrayList<java.lang.String>();

    public final java.util.List<java.lang.String> getRequirementsOrderIds() {
        return new java.util.ArrayList<java.lang.String>(requirementsOrderIds);
    }

    public final void setRequirementsOrderIds(Collection<java.lang.String> requirementsOrderIds) {
        requirementsOrderIds = prepareRequirementsOrderIds(requirementsOrderIds);
        if (requirementsOrderIds == null) requirementsOrderIds = Collections.emptyList();
        if (this.requirementsOrderIds.equals(requirementsOrderIds)) return;
        this.requirementsOrderIds = new java.util.ArrayList<java.lang.String>(requirementsOrderIds);
            updateLastModified();
            fireModified("requirementsOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.requirementsOrderIds));
    }

    private final void updateRequirementsOrderIds(Collection<java.lang.String> requirementsOrderIds) {
        if (requirementsOrderIds == null) requirementsOrderIds = Collections.emptyList();
        if (this.requirementsOrderIds.equals(requirementsOrderIds)) return;
        this.requirementsOrderIds = new java.util.ArrayList<java.lang.String>(requirementsOrderIds);
            updateLastModified();
            fireModified("requirementsOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.requirementsOrderIds));
    }

    protected Collection<java.lang.String> prepareRequirementsOrderIds(Collection<java.lang.String> requirementsOrderIds) {
        return requirementsOrderIds;
    }

    public final boolean containsRequirementsOrderId(java.lang.String requirementsOrderId) {
        if (requirementsOrderId == null) return false;
        if (this.requirementsOrderIds == null) return false;
        return this.requirementsOrderIds.contains(requirementsOrderId);
    }

    public final int getRequirementsOrderIdsCount() {
        if (this.requirementsOrderIds == null) return 0;
        return this.requirementsOrderIds.size();
    }

    public final boolean isRequirementsOrderIdsEmpty() {
        if (this.requirementsOrderIds == null) return true;
        return this.requirementsOrderIds.isEmpty();
    }

    public final boolean addRequirementsOrderId(java.lang.String requirementsOrderId) {
        if (requirementsOrderId == null) throw new IllegalArgumentException("requirementsOrderId == null");
        if (this.requirementsOrderIds == null) this.requirementsOrderIds = new java.util.ArrayList<java.lang.String>();
        boolean added = this.requirementsOrderIds.add(requirementsOrderId);
        if (added) {
            updateLastModified();
            fireModified("requirementsOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.requirementsOrderIds));
        }
        return added;
    }

    public final boolean addRequirementsOrderIds(Collection<java.lang.String> requirementsOrderIds) {
        if (requirementsOrderIds == null) throw new IllegalArgumentException("requirementsOrderIds == null");
        if (this.requirementsOrderIds == null) this.requirementsOrderIds = new java.util.ArrayList<java.lang.String>();
        boolean added = false;
        for (java.lang.String requirementsOrderId : requirementsOrderIds) {
            added = added | this.requirementsOrderIds.add(requirementsOrderId);
        }
        if (added) {
            updateLastModified();
            fireModified("requirementsOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.requirementsOrderIds));
        }
        return added;
    }

    public final boolean removeRequirementsOrderId(java.lang.String requirementsOrderId) {
        if (requirementsOrderId == null) return false;
        if (this.requirementsOrderIds == null) return false;
        boolean removed = this.requirementsOrderIds.remove(requirementsOrderId);
        if (removed) {
            updateLastModified();
            fireModified("requirementsOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.requirementsOrderIds));
        }
        return removed;
    }

    public final boolean removeRequirementsOrderIds(Collection<java.lang.String> requirementsOrderIds) {
        if (requirementsOrderIds == null) return false;
        if (requirementsOrderIds.isEmpty()) return false;
        if (this.requirementsOrderIds == null) return false;
        boolean removed = false;
        for (java.lang.String _element: requirementsOrderIds) {
            removed = removed | this.requirementsOrderIds.remove(_element);
        }
        if (removed) {
            updateLastModified();
            fireModified("requirementsOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.requirementsOrderIds));
        }
        return removed;
    }

    public final boolean clearRequirementsOrderIds() {
        if (this.requirementsOrderIds == null) return false;
        if (this.requirementsOrderIds.isEmpty()) return false;
        this.requirementsOrderIds.clear();
            updateLastModified();
            fireModified("requirementsOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.requirementsOrderIds));
        return true;
    }

    public final String getRequirementsOrderIdsAsCommaSeparatedString() {
        if (this.requirementsOrderIds == null) return null;
        if (this.requirementsOrderIds.isEmpty()) return null;
        return Str.concat(this.requirementsOrderIds,", ");
    }

    public final void setRequirementsOrderIdsAsCommaSeparatedString(String requirementsOrderIds) {
        setRequirementsOrderIds(Str.parseCommaSeparatedString(requirementsOrderIds));
    }
    // -----------------------------------------------------------
    // - productOwners
    // -----------------------------------------------------------

    private java.util.Set<String> productOwnersIds = new java.util.HashSet<String>();

    public final Collection<String> getProductOwnersIds() {
        return java.util.Collections .unmodifiableCollection(this.productOwnersIds);
    }

    public final java.util.Set<scrum.client.admin.User> getProductOwners() {
        try {
            return (java.util.Set) AEntity.getByIdsAsSet(this.productOwnersIds);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Sprint.productOwners");
        }
    }

    public final void setProductOwners(Collection<scrum.client.admin.User> productOwners) {
        productOwners = prepareProductOwners(productOwners);
        if (productOwners == null) productOwners = Collections.emptyList();
        java.util.Set<String> ids = ilarkesto.core.persistance.Persistence.getIdsAsSet(productOwners);
        setProductOwnersIds(ids);
    }

    public final void setProductOwnersIds(java.util.Set<String> ids) {
        if (Utl.equals(productOwnersIds, ids)) return;
        clearProductOwnersBackReferenceCache(ids, productOwnersIds);
        productOwnersIds = ids;
            updateLastModified();
            fireModified("productOwnersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.productOwnersIds));
    }

    private void clearProductOwnersBackReferenceCache(Collection<String> oldId, Collection<String> newId) {
        productOwnersBackReferencesCache.clear(oldId);
        productOwnersBackReferencesCache.clear(newId);
    }

    private final void updateProductOwnersIds(java.util.Set<String> ids) {
        setProductOwnersIds(ids);
    }

    protected Collection<scrum.client.admin.User> prepareProductOwners(Collection<scrum.client.admin.User> productOwners) {
        return productOwners;
    }

    protected void repairDeadProductOwnerReference(String entityId) {
        if (!isPersisted()) return;
        if (this.productOwnersIds == null ) return;
        if (this.productOwnersIds.remove(entityId)) {
            updateLastModified();
            fireModified("productOwnersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.productOwnersIds));
        }
    }

    public final boolean containsProductOwner(scrum.client.admin.User productOwner) {
        if (productOwner == null) return false;
        if (this.productOwnersIds == null) return false;
        return this.productOwnersIds.contains(productOwner.getId());
    }

    public final int getProductOwnersCount() {
        if (this.productOwnersIds == null) return 0;
        return this.productOwnersIds.size();
    }

    public final boolean isProductOwnersEmpty() {
        if (this.productOwnersIds == null) return true;
        return this.productOwnersIds.isEmpty();
    }

    public final boolean addProductOwner(scrum.client.admin.User productOwner) {
        if (productOwner == null) throw new IllegalArgumentException("productOwner == null");
        if (this.productOwnersIds == null) this.productOwnersIds = new java.util.HashSet<String>();
        boolean added = this.productOwnersIds.add(productOwner.getId());
        if (added) productOwnersBackReferencesCache.clear(productOwner.getId());
        if (added) {
            updateLastModified();
            fireModified("productOwnersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.productOwnersIds));
        }
        return added;
    }

    public final boolean addProductOwners(Collection<scrum.client.admin.User> productOwners) {
        if (productOwners == null) throw new IllegalArgumentException("productOwners == null");
        if (this.productOwnersIds == null) this.productOwnersIds = new java.util.HashSet<String>();
        boolean added = false;
        for (scrum.client.admin.User productOwner : productOwners) {
            added = added | this.productOwnersIds.add(productOwner.getId());
        }
        if (added) productOwnersBackReferencesCache.clear(this.productOwnersIds);
        if (added) {
            updateLastModified();
            fireModified("productOwnersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.productOwnersIds));
        }
        return added;
    }

    public final boolean removeProductOwner(scrum.client.admin.User productOwner) {
        if (productOwner == null) return false;
        if (this.productOwnersIds == null) return false;
        boolean removed = this.productOwnersIds.remove(productOwner.getId());
        if (removed) productOwnersBackReferencesCache.clear(productOwner.getId());
        if (removed) {
            updateLastModified();
            fireModified("productOwnersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.productOwnersIds));
        }
        return removed;
    }

    public final boolean removeProductOwners(Collection<scrum.client.admin.User> productOwners) {
        if (productOwners == null) return false;
        if (productOwners.isEmpty()) return false;
        if (this.productOwnersIds == null) return false;
        boolean removed = false;
        for (scrum.client.admin.User _element: productOwners) {
            removed = removed | this.productOwnersIds.remove(_element);
        }
        if (removed) productOwnersBackReferencesCache.clear(this.productOwnersIds);
        if (removed) {
            updateLastModified();
            fireModified("productOwnersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.productOwnersIds));
        }
        return removed;
    }

    public final boolean clearProductOwners() {
        if (this.productOwnersIds == null) return false;
        if (this.productOwnersIds.isEmpty()) return false;
        productOwnersBackReferencesCache.clear(this.productOwnersIds);
        this.productOwnersIds.clear();
            updateLastModified();
            fireModified("productOwnersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.productOwnersIds));
        return true;
    }
    // -----------------------------------------------------------
    // - scrumMasters
    // -----------------------------------------------------------

    private java.util.Set<String> scrumMastersIds = new java.util.HashSet<String>();

    public final Collection<String> getScrumMastersIds() {
        return java.util.Collections .unmodifiableCollection(this.scrumMastersIds);
    }

    public final java.util.Set<scrum.client.admin.User> getScrumMasters() {
        try {
            return (java.util.Set) AEntity.getByIdsAsSet(this.scrumMastersIds);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Sprint.scrumMasters");
        }
    }

    public final void setScrumMasters(Collection<scrum.client.admin.User> scrumMasters) {
        scrumMasters = prepareScrumMasters(scrumMasters);
        if (scrumMasters == null) scrumMasters = Collections.emptyList();
        java.util.Set<String> ids = ilarkesto.core.persistance.Persistence.getIdsAsSet(scrumMasters);
        setScrumMastersIds(ids);
    }

    public final void setScrumMastersIds(java.util.Set<String> ids) {
        if (Utl.equals(scrumMastersIds, ids)) return;
        clearScrumMastersBackReferenceCache(ids, scrumMastersIds);
        scrumMastersIds = ids;
            updateLastModified();
            fireModified("scrumMastersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.scrumMastersIds));
    }

    private void clearScrumMastersBackReferenceCache(Collection<String> oldId, Collection<String> newId) {
        scrumMastersBackReferencesCache.clear(oldId);
        scrumMastersBackReferencesCache.clear(newId);
    }

    private final void updateScrumMastersIds(java.util.Set<String> ids) {
        setScrumMastersIds(ids);
    }

    protected Collection<scrum.client.admin.User> prepareScrumMasters(Collection<scrum.client.admin.User> scrumMasters) {
        return scrumMasters;
    }

    protected void repairDeadScrumMasterReference(String entityId) {
        if (!isPersisted()) return;
        if (this.scrumMastersIds == null ) return;
        if (this.scrumMastersIds.remove(entityId)) {
            updateLastModified();
            fireModified("scrumMastersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.scrumMastersIds));
        }
    }

    public final boolean containsScrumMaster(scrum.client.admin.User scrumMaster) {
        if (scrumMaster == null) return false;
        if (this.scrumMastersIds == null) return false;
        return this.scrumMastersIds.contains(scrumMaster.getId());
    }

    public final int getScrumMastersCount() {
        if (this.scrumMastersIds == null) return 0;
        return this.scrumMastersIds.size();
    }

    public final boolean isScrumMastersEmpty() {
        if (this.scrumMastersIds == null) return true;
        return this.scrumMastersIds.isEmpty();
    }

    public final boolean addScrumMaster(scrum.client.admin.User scrumMaster) {
        if (scrumMaster == null) throw new IllegalArgumentException("scrumMaster == null");
        if (this.scrumMastersIds == null) this.scrumMastersIds = new java.util.HashSet<String>();
        boolean added = this.scrumMastersIds.add(scrumMaster.getId());
        if (added) scrumMastersBackReferencesCache.clear(scrumMaster.getId());
        if (added) {
            updateLastModified();
            fireModified("scrumMastersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.scrumMastersIds));
        }
        return added;
    }

    public final boolean addScrumMasters(Collection<scrum.client.admin.User> scrumMasters) {
        if (scrumMasters == null) throw new IllegalArgumentException("scrumMasters == null");
        if (this.scrumMastersIds == null) this.scrumMastersIds = new java.util.HashSet<String>();
        boolean added = false;
        for (scrum.client.admin.User scrumMaster : scrumMasters) {
            added = added | this.scrumMastersIds.add(scrumMaster.getId());
        }
        if (added) scrumMastersBackReferencesCache.clear(this.scrumMastersIds);
        if (added) {
            updateLastModified();
            fireModified("scrumMastersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.scrumMastersIds));
        }
        return added;
    }

    public final boolean removeScrumMaster(scrum.client.admin.User scrumMaster) {
        if (scrumMaster == null) return false;
        if (this.scrumMastersIds == null) return false;
        boolean removed = this.scrumMastersIds.remove(scrumMaster.getId());
        if (removed) scrumMastersBackReferencesCache.clear(scrumMaster.getId());
        if (removed) {
            updateLastModified();
            fireModified("scrumMastersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.scrumMastersIds));
        }
        return removed;
    }

    public final boolean removeScrumMasters(Collection<scrum.client.admin.User> scrumMasters) {
        if (scrumMasters == null) return false;
        if (scrumMasters.isEmpty()) return false;
        if (this.scrumMastersIds == null) return false;
        boolean removed = false;
        for (scrum.client.admin.User _element: scrumMasters) {
            removed = removed | this.scrumMastersIds.remove(_element);
        }
        if (removed) scrumMastersBackReferencesCache.clear(this.scrumMastersIds);
        if (removed) {
            updateLastModified();
            fireModified("scrumMastersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.scrumMastersIds));
        }
        return removed;
    }

    public final boolean clearScrumMasters() {
        if (this.scrumMastersIds == null) return false;
        if (this.scrumMastersIds.isEmpty()) return false;
        scrumMastersBackReferencesCache.clear(this.scrumMastersIds);
        this.scrumMastersIds.clear();
            updateLastModified();
            fireModified("scrumMastersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.scrumMastersIds));
        return true;
    }
    // -----------------------------------------------------------
    // - teamMembers
    // -----------------------------------------------------------

    private java.util.Set<String> teamMembersIds = new java.util.HashSet<String>();

    public final Collection<String> getTeamMembersIds() {
        return java.util.Collections .unmodifiableCollection(this.teamMembersIds);
    }

    public final java.util.Set<scrum.client.admin.User> getTeamMembers() {
        try {
            return (java.util.Set) AEntity.getByIdsAsSet(this.teamMembersIds);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Sprint.teamMembers");
        }
    }

    public final void setTeamMembers(Collection<scrum.client.admin.User> teamMembers) {
        teamMembers = prepareTeamMembers(teamMembers);
        if (teamMembers == null) teamMembers = Collections.emptyList();
        java.util.Set<String> ids = ilarkesto.core.persistance.Persistence.getIdsAsSet(teamMembers);
        setTeamMembersIds(ids);
    }

    public final void setTeamMembersIds(java.util.Set<String> ids) {
        if (Utl.equals(teamMembersIds, ids)) return;
        clearTeamMembersBackReferenceCache(ids, teamMembersIds);
        teamMembersIds = ids;
            updateLastModified();
            fireModified("teamMembersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.teamMembersIds));
    }

    private void clearTeamMembersBackReferenceCache(Collection<String> oldId, Collection<String> newId) {
        teamMembersBackReferencesCache.clear(oldId);
        teamMembersBackReferencesCache.clear(newId);
    }

    private final void updateTeamMembersIds(java.util.Set<String> ids) {
        setTeamMembersIds(ids);
    }

    protected Collection<scrum.client.admin.User> prepareTeamMembers(Collection<scrum.client.admin.User> teamMembers) {
        return teamMembers;
    }

    protected void repairDeadTeamMemberReference(String entityId) {
        if (!isPersisted()) return;
        if (this.teamMembersIds == null ) return;
        if (this.teamMembersIds.remove(entityId)) {
            updateLastModified();
            fireModified("teamMembersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.teamMembersIds));
        }
    }

    public final boolean containsTeamMember(scrum.client.admin.User teamMember) {
        if (teamMember == null) return false;
        if (this.teamMembersIds == null) return false;
        return this.teamMembersIds.contains(teamMember.getId());
    }

    public final int getTeamMembersCount() {
        if (this.teamMembersIds == null) return 0;
        return this.teamMembersIds.size();
    }

    public final boolean isTeamMembersEmpty() {
        if (this.teamMembersIds == null) return true;
        return this.teamMembersIds.isEmpty();
    }

    public final boolean addTeamMember(scrum.client.admin.User teamMember) {
        if (teamMember == null) throw new IllegalArgumentException("teamMember == null");
        if (this.teamMembersIds == null) this.teamMembersIds = new java.util.HashSet<String>();
        boolean added = this.teamMembersIds.add(teamMember.getId());
        if (added) teamMembersBackReferencesCache.clear(teamMember.getId());
        if (added) {
            updateLastModified();
            fireModified("teamMembersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.teamMembersIds));
        }
        return added;
    }

    public final boolean addTeamMembers(Collection<scrum.client.admin.User> teamMembers) {
        if (teamMembers == null) throw new IllegalArgumentException("teamMembers == null");
        if (this.teamMembersIds == null) this.teamMembersIds = new java.util.HashSet<String>();
        boolean added = false;
        for (scrum.client.admin.User teamMember : teamMembers) {
            added = added | this.teamMembersIds.add(teamMember.getId());
        }
        if (added) teamMembersBackReferencesCache.clear(this.teamMembersIds);
        if (added) {
            updateLastModified();
            fireModified("teamMembersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.teamMembersIds));
        }
        return added;
    }

    public final boolean removeTeamMember(scrum.client.admin.User teamMember) {
        if (teamMember == null) return false;
        if (this.teamMembersIds == null) return false;
        boolean removed = this.teamMembersIds.remove(teamMember.getId());
        if (removed) teamMembersBackReferencesCache.clear(teamMember.getId());
        if (removed) {
            updateLastModified();
            fireModified("teamMembersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.teamMembersIds));
        }
        return removed;
    }

    public final boolean removeTeamMembers(Collection<scrum.client.admin.User> teamMembers) {
        if (teamMembers == null) return false;
        if (teamMembers.isEmpty()) return false;
        if (this.teamMembersIds == null) return false;
        boolean removed = false;
        for (scrum.client.admin.User _element: teamMembers) {
            removed = removed | this.teamMembersIds.remove(_element);
        }
        if (removed) teamMembersBackReferencesCache.clear(this.teamMembersIds);
        if (removed) {
            updateLastModified();
            fireModified("teamMembersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.teamMembersIds));
        }
        return removed;
    }

    public final boolean clearTeamMembers() {
        if (this.teamMembersIds == null) return false;
        if (this.teamMembersIds.isEmpty()) return false;
        teamMembersBackReferencesCache.clear(this.teamMembersIds);
        this.teamMembersIds.clear();
            updateLastModified();
            fireModified("teamMembersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.teamMembersIds));
        return true;
    }

    public void updateProperties(Map<String, String> properties) {
        super.updateProperties(properties);
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            String property = entry.getKey();
            if (property.equals("id")) continue;
            String value = entry.getValue();
            if (property.equals("number")) updateNumber(ilarkesto.core.persistance.Persistence.parsePropertyint(value));
            if (property.equals("projectId")) updateProjectId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("label")) updateLabel(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("goal")) updateGoal(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("begin")) updateBegin(ilarkesto.core.persistance.Persistence.parsePropertyDate(value));
            if (property.equals("end")) updateEnd(ilarkesto.core.persistance.Persistence.parsePropertyDate(value));
            if (property.equals("originallyEnd")) updateOriginallyEnd(ilarkesto.core.persistance.Persistence.parsePropertyDate(value));
            if (property.equals("velocity")) updateVelocity(ilarkesto.core.persistance.Persistence.parsePropertyFloat(value));
            if (property.equals("completedRequirementsData")) updateCompletedRequirementsData(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("incompletedRequirementsData")) updateIncompletedRequirementsData(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("planningNote")) updatePlanningNote(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("reviewNote")) updateReviewNote(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("retrospectiveNote")) updateRetrospectiveNote(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("requirementsOrderIds")) updateRequirementsOrderIds(ilarkesto.core.persistance.Persistence.parsePropertyStringCollection(value));
            if (property.equals("productOwnersIds")) updateProductOwnersIds(ilarkesto.core.persistance.Persistence.parsePropertyReferenceSet(value));
            if (property.equals("scrumMastersIds")) updateScrumMastersIds(ilarkesto.core.persistance.Persistence.parsePropertyReferenceSet(value));
            if (property.equals("teamMembersIds")) updateTeamMembersIds(ilarkesto.core.persistance.Persistence.parsePropertyReferenceSet(value));
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
        if (this.requirementsOrderIds == null) this.requirementsOrderIds = new java.util.ArrayList<java.lang.String>();
        if (this.productOwnersIds == null) this.productOwnersIds = new java.util.HashSet<String>();
        Set<String> productOwners = new HashSet<String>(this.productOwnersIds);
        for (String entityId : productOwners) {
            try {
                AEntity.getById(entityId);
            } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
                LOG.info("Repairing dead productOwner reference");
                repairDeadProductOwnerReference(entityId);
            }
        }
        if (this.scrumMastersIds == null) this.scrumMastersIds = new java.util.HashSet<String>();
        Set<String> scrumMasters = new HashSet<String>(this.scrumMastersIds);
        for (String entityId : scrumMasters) {
            try {
                AEntity.getById(entityId);
            } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
                LOG.info("Repairing dead scrumMaster reference");
                repairDeadScrumMasterReference(entityId);
            }
        }
        if (this.teamMembersIds == null) this.teamMembersIds = new java.util.HashSet<String>();
        Set<String> teamMembers = new HashSet<String>(this.teamMembersIds);
        for (String entityId : teamMembers) {
            try {
                AEntity.getById(entityId);
            } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
                LOG.info("Repairing dead teamMember reference");
                repairDeadTeamMemberReference(entityId);
            }
        }
        Collection<scrum.client.project.Project> currentSprintProject = getCurrentSprintProjects();
        Collection<scrum.client.project.Project> nextSprintProject = getNextSprintProjects();
        Collection<scrum.client.sprint.SprintDaySnapshot> sprintDaySnapshot = getSprintDaySnapshots();
        scrum.client.sprint.SprintReport sprintReport = getSprintReport();
        Collection<scrum.client.project.Requirement> requirement = getRequirements();
        Collection<scrum.client.release.Release> release = getReleases();
        Collection<scrum.client.sprint.Task> closedTasksInPast = getClosedTasksInPasts();
        scrum.client.project.ProjectSprintSnapshot projectSprintSnapshot = getProjectSprintSnapshot();
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
            return "Sprint_number";
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
            return "Sprint_label";
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
        public boolean isEditable() { return GSprint.this.isEditable(); }
        @Override
        public String getTooltip() { return "The label should be short (as it appears where the Sprint is referenced), yet give a hint strong enough to make the content of it come to mind."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient GoalModel goalModel;

    public GoalModel getGoalModel() {
        if (goalModel == null) goalModel = createGoalModel();
        return goalModel;
    }

    protected GoalModel createGoalModel() { return new GoalModel(); }

    protected class GoalModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Sprint_goal";
        }

        @Override
        public java.lang.String getValue() {
            return getGoal();
        }

        @Override
        public void setValue(java.lang.String value) {
            setGoal(value);
        }

        @Override
        public boolean isEditable() { return GSprint.this.isEditable(); }

        @Override
        public boolean isRichtext() { return true; }

        @Override
        public String getTemplate() { return getGoalTemplate(); }
        @Override
        public String getTooltip() { return "The goal is used to summarize the purpose of this Sprint. Naturally, it should be a description on why it is important that the Stories currently high in the Product Backlog should be realized next."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient BeginModel beginModel;

    public BeginModel getBeginModel() {
        if (beginModel == null) beginModel = createBeginModel();
        return beginModel;
    }

    protected BeginModel createBeginModel() { return new BeginModel(); }

    protected class BeginModel extends ilarkesto.gwt.client.editor.ADateEditorModel {

        @Override
        public String getId() {
            return "Sprint_begin";
        }

        @Override
        public ilarkesto.core.time.Date getValue() {
            return getBegin();
        }

        @Override
        public void setValue(ilarkesto.core.time.Date value) {
            setBegin(value);
        }

        @Override
        public boolean isEditable() { return GSprint.this.isDatesEditable(); }
        @Override
        public String getTooltip() { return "The date the Team starts working on the Sprint."; }

        @Override
        protected void onChangeValue(ilarkesto.core.time.Date oldValue, ilarkesto.core.time.Date newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient EndModel endModel;

    public EndModel getEndModel() {
        if (endModel == null) endModel = createEndModel();
        return endModel;
    }

    protected EndModel createEndModel() { return new EndModel(); }

    protected class EndModel extends ilarkesto.gwt.client.editor.ADateEditorModel {

        @Override
        public String getId() {
            return "Sprint_end";
        }

        @Override
        public ilarkesto.core.time.Date getValue() {
            return getEnd();
        }

        @Override
        public void setValue(ilarkesto.core.time.Date value) {
            setEnd(value);
        }

        @Override
        public boolean isEditable() { return GSprint.this.isDatesEditable(); }
        @Override
        public String getTooltip() { return "The date by which the Team will finish working on this Sprint. A Sprint Review meeting should be scheduled to present results."; }

        @Override
        protected void onChangeValue(ilarkesto.core.time.Date oldValue, ilarkesto.core.time.Date newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient OriginallyEndModel originallyEndModel;

    public OriginallyEndModel getOriginallyEndModel() {
        if (originallyEndModel == null) originallyEndModel = createOriginallyEndModel();
        return originallyEndModel;
    }

    protected OriginallyEndModel createOriginallyEndModel() { return new OriginallyEndModel(); }

    protected class OriginallyEndModel extends ilarkesto.gwt.client.editor.ADateEditorModel {

        @Override
        public String getId() {
            return "Sprint_originallyEnd";
        }

        @Override
        public ilarkesto.core.time.Date getValue() {
            return getOriginallyEnd();
        }

        @Override
        public void setValue(ilarkesto.core.time.Date value) {
            setOriginallyEnd(value);
        }

        @Override
        protected void onChangeValue(ilarkesto.core.time.Date oldValue, ilarkesto.core.time.Date newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient VelocityModel velocityModel;

    public VelocityModel getVelocityModel() {
        if (velocityModel == null) velocityModel = createVelocityModel();
        return velocityModel;
    }

    protected VelocityModel createVelocityModel() { return new VelocityModel(); }

    protected class VelocityModel extends ilarkesto.gwt.client.editor.AFloatEditorModel {

        @Override
        public String getId() {
            return "Sprint_velocity";
        }

        @Override
        public java.lang.Float getValue() {
            return getVelocity();
        }

        @Override
        public void setValue(java.lang.Float value) {
            setVelocity(value);
        }

        @Override
        protected void onChangeValue(java.lang.Float oldValue, java.lang.Float newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient CompletedRequirementsDataModel completedRequirementsDataModel;

    public CompletedRequirementsDataModel getCompletedRequirementsDataModel() {
        if (completedRequirementsDataModel == null) completedRequirementsDataModel = createCompletedRequirementsDataModel();
        return completedRequirementsDataModel;
    }

    protected CompletedRequirementsDataModel createCompletedRequirementsDataModel() { return new CompletedRequirementsDataModel(); }

    protected class CompletedRequirementsDataModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Sprint_completedRequirementsData";
        }

        @Override
        public java.lang.String getValue() {
            return getCompletedRequirementsData();
        }

        @Override
        public void setValue(java.lang.String value) {
            setCompletedRequirementsData(value);
        }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient IncompletedRequirementsDataModel incompletedRequirementsDataModel;

    public IncompletedRequirementsDataModel getIncompletedRequirementsDataModel() {
        if (incompletedRequirementsDataModel == null) incompletedRequirementsDataModel = createIncompletedRequirementsDataModel();
        return incompletedRequirementsDataModel;
    }

    protected IncompletedRequirementsDataModel createIncompletedRequirementsDataModel() { return new IncompletedRequirementsDataModel(); }

    protected class IncompletedRequirementsDataModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Sprint_incompletedRequirementsData";
        }

        @Override
        public java.lang.String getValue() {
            return getIncompletedRequirementsData();
        }

        @Override
        public void setValue(java.lang.String value) {
            setIncompletedRequirementsData(value);
        }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient PlanningNoteModel planningNoteModel;

    public PlanningNoteModel getPlanningNoteModel() {
        if (planningNoteModel == null) planningNoteModel = createPlanningNoteModel();
        return planningNoteModel;
    }

    protected PlanningNoteModel createPlanningNoteModel() { return new PlanningNoteModel(); }

    protected class PlanningNoteModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Sprint_planningNote";
        }

        @Override
        public java.lang.String getValue() {
            return getPlanningNote();
        }

        @Override
        public void setValue(java.lang.String value) {
            setPlanningNote(value);
        }

        @Override
        public boolean isEditable() { return GSprint.this.isPlanningEditable(); }

        @Override
        public boolean isRichtext() { return true; }

        @Override
        public String getTemplate() { return getPlanningNoteTemplate(); }
        @Override
        public String getTooltip() { return "Things that come up during Sprint Planning that might affect the Sprint or be of interest for stakeholders (illness, vacation and other influences; discussion results, agreements, etc."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient ReviewNoteModel reviewNoteModel;

    public ReviewNoteModel getReviewNoteModel() {
        if (reviewNoteModel == null) reviewNoteModel = createReviewNoteModel();
        return reviewNoteModel;
    }

    protected ReviewNoteModel createReviewNoteModel() { return new ReviewNoteModel(); }

    protected class ReviewNoteModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Sprint_reviewNote";
        }

        @Override
        public java.lang.String getValue() {
            return getReviewNote();
        }

        @Override
        public void setValue(java.lang.String value) {
            setReviewNote(value);
        }

        @Override
        public boolean isEditable() { return GSprint.this.isReviewEditable(); }

        @Override
        public boolean isRichtext() { return true; }

        @Override
        public String getTemplate() { return getReviewNoteTemplate(); }
        @Override
        public String getTooltip() { return "Things that come up during the Sprint Review that might be of interest for stakeholders."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient RetrospectiveNoteModel retrospectiveNoteModel;

    public RetrospectiveNoteModel getRetrospectiveNoteModel() {
        if (retrospectiveNoteModel == null) retrospectiveNoteModel = createRetrospectiveNoteModel();
        return retrospectiveNoteModel;
    }

    protected RetrospectiveNoteModel createRetrospectiveNoteModel() { return new RetrospectiveNoteModel(); }

    protected class RetrospectiveNoteModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Sprint_retrospectiveNote";
        }

        @Override
        public java.lang.String getValue() {
            return getRetrospectiveNote();
        }

        @Override
        public void setValue(java.lang.String value) {
            setRetrospectiveNote(value);
        }

        @Override
        public boolean isEditable() { return GSprint.this.isRetrospectiveEditable(); }

        @Override
        public boolean isRichtext() { return true; }

        @Override
        public String getTemplate() { return getRetrospectiveNoteTemplate(); }
        @Override
        public String getTooltip() { return "Things that come up during Sprint Retrospectives that are important in the future or might be of interest for stakeholders."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

}