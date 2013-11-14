// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: ilarkesto.mda.legacy.generator.DaoGenerator










package scrum.server.project;

import java.util.*;
import ilarkesto.core.logging.Log;
import ilarkesto.auth.Auth;
import ilarkesto.base.Cache;
import ilarkesto.persistence.EntityEvent;
import ilarkesto.fp.Predicate;

public abstract class GRequirementDao
            extends ilarkesto.persistence.ADao<Requirement> {

    public final String getEntityName() {
        return Requirement.TYPE;
    }

    public final Class getEntityClass() {
        return Requirement.class;
    }

    public Set<Requirement> getEntitiesVisibleForUser(final scrum.server.admin.User user) {
        return getEntities(new Predicate<Requirement>() {
            public boolean test(Requirement e) {
                return Auth.isVisible(e, user);
            }
        });
    }

    // --- clear caches ---
    public void clearCaches() {
        requirementsByProjectCache.clear();
        projectsCache = null;
        requirementsBySprintCache.clear();
        sprintsCache = null;
        requirementsByIssueCache.clear();
        issuesCache = null;
        requirementsByNumberCache.clear();
        numbersCache = null;
        requirementsByQualityCache.clear();
        qualitysCache = null;
        requirementsByLabelCache.clear();
        labelsCache = null;
        requirementsByDescriptionCache.clear();
        descriptionsCache = null;
        requirementsByTestDescriptionCache.clear();
        testDescriptionsCache = null;
        requirementsByEstimatedWorkCache.clear();
        estimatedWorksCache = null;
        requirementsByRejectDateCache.clear();
        rejectDatesCache = null;
        requirementsByClosedCache.clear();
        requirementsBySuspendedCache.clear();
        requirementsByDirtyCache.clear();
        requirementsByWorkEstimationVotingActiveCache.clear();
        requirementsByWorkEstimationVotingShowoffCache.clear();
        requirementsByTasksOrderIdCache.clear();
        tasksOrderIdsCache = null;
        requirementsByThemeCache.clear();
        themesCache = null;
        requirementsByEpicCache.clear();
        epicsCache = null;
    }

    @Override
    public void entityDeleted(EntityEvent event) {
        super.entityDeleted(event);
        if (event.getEntity() instanceof Requirement) {
            clearCaches();
        }
    }

    @Override
    public void entitySaved(EntityEvent event) {
        super.entitySaved(event);
        if (event.getEntity() instanceof Requirement) {
            clearCaches();
        }
    }

    // -----------------------------------------------------------
    // - project
    // -----------------------------------------------------------

    private final Cache<scrum.server.project.Project,Set<Requirement>> requirementsByProjectCache = new Cache<scrum.server.project.Project,Set<Requirement>>(
            new Cache.Factory<scrum.server.project.Project,Set<Requirement>>() {
                public Set<Requirement> create(scrum.server.project.Project project) {
                    return getEntities(new IsProject(project));
                }
            });

    public final Set<Requirement> getRequirementsByProject(scrum.server.project.Project project) {
        return new HashSet<Requirement>(requirementsByProjectCache.get(project));
    }
    private Set<scrum.server.project.Project> projectsCache;

    public final Set<scrum.server.project.Project> getProjects() {
        if (projectsCache == null) {
            projectsCache = new HashSet<scrum.server.project.Project>();
            for (Requirement e : getEntities()) {
                if (e.isProjectSet()) projectsCache.add(e.getProject());
            }
        }
        return projectsCache;
    }

    private static class IsProject implements Predicate<Requirement> {

        private scrum.server.project.Project value;

        public IsProject(scrum.server.project.Project value) {
            this.value = value;
        }

        public boolean test(Requirement e) {
            return e.isProject(value);
        }

    }

    // -----------------------------------------------------------
    // - sprint
    // -----------------------------------------------------------

    private final Cache<scrum.server.sprint.Sprint,Set<Requirement>> requirementsBySprintCache = new Cache<scrum.server.sprint.Sprint,Set<Requirement>>(
            new Cache.Factory<scrum.server.sprint.Sprint,Set<Requirement>>() {
                public Set<Requirement> create(scrum.server.sprint.Sprint sprint) {
                    return getEntities(new IsSprint(sprint));
                }
            });

    public final Set<Requirement> getRequirementsBySprint(scrum.server.sprint.Sprint sprint) {
        return new HashSet<Requirement>(requirementsBySprintCache.get(sprint));
    }
    private Set<scrum.server.sprint.Sprint> sprintsCache;

    public final Set<scrum.server.sprint.Sprint> getSprints() {
        if (sprintsCache == null) {
            sprintsCache = new HashSet<scrum.server.sprint.Sprint>();
            for (Requirement e : getEntities()) {
                if (e.isSprintSet()) sprintsCache.add(e.getSprint());
            }
        }
        return sprintsCache;
    }

    private static class IsSprint implements Predicate<Requirement> {

        private scrum.server.sprint.Sprint value;

        public IsSprint(scrum.server.sprint.Sprint value) {
            this.value = value;
        }

        public boolean test(Requirement e) {
            return e.isSprint(value);
        }

    }

    // -----------------------------------------------------------
    // - issue
    // -----------------------------------------------------------

    private final Cache<scrum.server.issues.Issue,Set<Requirement>> requirementsByIssueCache = new Cache<scrum.server.issues.Issue,Set<Requirement>>(
            new Cache.Factory<scrum.server.issues.Issue,Set<Requirement>>() {
                public Set<Requirement> create(scrum.server.issues.Issue issue) {
                    return getEntities(new IsIssue(issue));
                }
            });

    public final Set<Requirement> getRequirementsByIssue(scrum.server.issues.Issue issue) {
        return new HashSet<Requirement>(requirementsByIssueCache.get(issue));
    }
    private Set<scrum.server.issues.Issue> issuesCache;

    public final Set<scrum.server.issues.Issue> getIssues() {
        if (issuesCache == null) {
            issuesCache = new HashSet<scrum.server.issues.Issue>();
            for (Requirement e : getEntities()) {
                if (e.isIssueSet()) issuesCache.add(e.getIssue());
            }
        }
        return issuesCache;
    }

    private static class IsIssue implements Predicate<Requirement> {

        private scrum.server.issues.Issue value;

        public IsIssue(scrum.server.issues.Issue value) {
            this.value = value;
        }

        public boolean test(Requirement e) {
            return e.isIssue(value);
        }

    }

    // -----------------------------------------------------------
    // - number
    // -----------------------------------------------------------

    private final Cache<Integer,Set<Requirement>> requirementsByNumberCache = new Cache<Integer,Set<Requirement>>(
            new Cache.Factory<Integer,Set<Requirement>>() {
                public Set<Requirement> create(Integer number) {
                    return getEntities(new IsNumber(number));
                }
            });

    public final Set<Requirement> getRequirementsByNumber(int number) {
        return new HashSet<Requirement>(requirementsByNumberCache.get(number));
    }
    private Set<Integer> numbersCache;

    public final Set<Integer> getNumbers() {
        if (numbersCache == null) {
            numbersCache = new HashSet<Integer>();
            for (Requirement e : getEntities()) {
                numbersCache.add(e.getNumber());
            }
        }
        return numbersCache;
    }

    private static class IsNumber implements Predicate<Requirement> {

        private int value;

        public IsNumber(int value) {
            this.value = value;
        }

        public boolean test(Requirement e) {
            return e.isNumber(value);
        }

    }

    // -----------------------------------------------------------
    // - qualitys
    // -----------------------------------------------------------

    private final Cache<scrum.server.project.Quality,Set<Requirement>> requirementsByQualityCache = new Cache<scrum.server.project.Quality,Set<Requirement>>(
            new Cache.Factory<scrum.server.project.Quality,Set<Requirement>>() {
                public Set<Requirement> create(scrum.server.project.Quality quality) {
                    return getEntities(new ContainsQuality(quality));
                }
            });

    public final Set<Requirement> getRequirementsByQuality(scrum.server.project.Quality quality) {
        return new HashSet<Requirement>(requirementsByQualityCache.get(quality));
    }
    private Set<scrum.server.project.Quality> qualitysCache;

    public final Set<scrum.server.project.Quality> getQualitys() {
        if (qualitysCache == null) {
            qualitysCache = new HashSet<scrum.server.project.Quality>();
            for (Requirement e : getEntities()) {
                qualitysCache.addAll(e.getQualitys());
            }
        }
        return qualitysCache;
    }

    private static class ContainsQuality implements Predicate<Requirement> {

        private scrum.server.project.Quality value;

        public ContainsQuality(scrum.server.project.Quality value) {
            this.value = value;
        }

        public boolean test(Requirement e) {
            return e.containsQuality(value);
        }

    }

    // -----------------------------------------------------------
    // - label
    // -----------------------------------------------------------

    private final Cache<java.lang.String,Set<Requirement>> requirementsByLabelCache = new Cache<java.lang.String,Set<Requirement>>(
            new Cache.Factory<java.lang.String,Set<Requirement>>() {
                public Set<Requirement> create(java.lang.String label) {
                    return getEntities(new IsLabel(label));
                }
            });

    public final Set<Requirement> getRequirementsByLabel(java.lang.String label) {
        return new HashSet<Requirement>(requirementsByLabelCache.get(label));
    }
    private Set<java.lang.String> labelsCache;

    public final Set<java.lang.String> getLabels() {
        if (labelsCache == null) {
            labelsCache = new HashSet<java.lang.String>();
            for (Requirement e : getEntities()) {
                if (e.isLabelSet()) labelsCache.add(e.getLabel());
            }
        }
        return labelsCache;
    }

    private static class IsLabel implements Predicate<Requirement> {

        private java.lang.String value;

        public IsLabel(java.lang.String value) {
            this.value = value;
        }

        public boolean test(Requirement e) {
            return e.isLabel(value);
        }

    }

    // -----------------------------------------------------------
    // - description
    // -----------------------------------------------------------

    private final Cache<java.lang.String,Set<Requirement>> requirementsByDescriptionCache = new Cache<java.lang.String,Set<Requirement>>(
            new Cache.Factory<java.lang.String,Set<Requirement>>() {
                public Set<Requirement> create(java.lang.String description) {
                    return getEntities(new IsDescription(description));
                }
            });

    public final Set<Requirement> getRequirementsByDescription(java.lang.String description) {
        return new HashSet<Requirement>(requirementsByDescriptionCache.get(description));
    }
    private Set<java.lang.String> descriptionsCache;

    public final Set<java.lang.String> getDescriptions() {
        if (descriptionsCache == null) {
            descriptionsCache = new HashSet<java.lang.String>();
            for (Requirement e : getEntities()) {
                if (e.isDescriptionSet()) descriptionsCache.add(e.getDescription());
            }
        }
        return descriptionsCache;
    }

    private static class IsDescription implements Predicate<Requirement> {

        private java.lang.String value;

        public IsDescription(java.lang.String value) {
            this.value = value;
        }

        public boolean test(Requirement e) {
            return e.isDescription(value);
        }

    }

    // -----------------------------------------------------------
    // - testDescription
    // -----------------------------------------------------------

    private final Cache<java.lang.String,Set<Requirement>> requirementsByTestDescriptionCache = new Cache<java.lang.String,Set<Requirement>>(
            new Cache.Factory<java.lang.String,Set<Requirement>>() {
                public Set<Requirement> create(java.lang.String testDescription) {
                    return getEntities(new IsTestDescription(testDescription));
                }
            });

    public final Set<Requirement> getRequirementsByTestDescription(java.lang.String testDescription) {
        return new HashSet<Requirement>(requirementsByTestDescriptionCache.get(testDescription));
    }
    private Set<java.lang.String> testDescriptionsCache;

    public final Set<java.lang.String> getTestDescriptions() {
        if (testDescriptionsCache == null) {
            testDescriptionsCache = new HashSet<java.lang.String>();
            for (Requirement e : getEntities()) {
                if (e.isTestDescriptionSet()) testDescriptionsCache.add(e.getTestDescription());
            }
        }
        return testDescriptionsCache;
    }

    private static class IsTestDescription implements Predicate<Requirement> {

        private java.lang.String value;

        public IsTestDescription(java.lang.String value) {
            this.value = value;
        }

        public boolean test(Requirement e) {
            return e.isTestDescription(value);
        }

    }

    // -----------------------------------------------------------
    // - estimatedWork
    // -----------------------------------------------------------

    private final Cache<java.lang.Float,Set<Requirement>> requirementsByEstimatedWorkCache = new Cache<java.lang.Float,Set<Requirement>>(
            new Cache.Factory<java.lang.Float,Set<Requirement>>() {
                public Set<Requirement> create(java.lang.Float estimatedWork) {
                    return getEntities(new IsEstimatedWork(estimatedWork));
                }
            });

    public final Set<Requirement> getRequirementsByEstimatedWork(java.lang.Float estimatedWork) {
        return new HashSet<Requirement>(requirementsByEstimatedWorkCache.get(estimatedWork));
    }
    private Set<java.lang.Float> estimatedWorksCache;

    public final Set<java.lang.Float> getEstimatedWorks() {
        if (estimatedWorksCache == null) {
            estimatedWorksCache = new HashSet<java.lang.Float>();
            for (Requirement e : getEntities()) {
                if (e.isEstimatedWorkSet()) estimatedWorksCache.add(e.getEstimatedWork());
            }
        }
        return estimatedWorksCache;
    }

    private static class IsEstimatedWork implements Predicate<Requirement> {

        private java.lang.Float value;

        public IsEstimatedWork(java.lang.Float value) {
            this.value = value;
        }

        public boolean test(Requirement e) {
            return e.isEstimatedWork(value);
        }

    }

    // -----------------------------------------------------------
    // - rejectDate
    // -----------------------------------------------------------

    private final Cache<ilarkesto.core.time.Date,Set<Requirement>> requirementsByRejectDateCache = new Cache<ilarkesto.core.time.Date,Set<Requirement>>(
            new Cache.Factory<ilarkesto.core.time.Date,Set<Requirement>>() {
                public Set<Requirement> create(ilarkesto.core.time.Date rejectDate) {
                    return getEntities(new IsRejectDate(rejectDate));
                }
            });

    public final Set<Requirement> getRequirementsByRejectDate(ilarkesto.core.time.Date rejectDate) {
        return new HashSet<Requirement>(requirementsByRejectDateCache.get(rejectDate));
    }
    private Set<ilarkesto.core.time.Date> rejectDatesCache;

    public final Set<ilarkesto.core.time.Date> getRejectDates() {
        if (rejectDatesCache == null) {
            rejectDatesCache = new HashSet<ilarkesto.core.time.Date>();
            for (Requirement e : getEntities()) {
                if (e.isRejectDateSet()) rejectDatesCache.add(e.getRejectDate());
            }
        }
        return rejectDatesCache;
    }

    private static class IsRejectDate implements Predicate<Requirement> {

        private ilarkesto.core.time.Date value;

        public IsRejectDate(ilarkesto.core.time.Date value) {
            this.value = value;
        }

        public boolean test(Requirement e) {
            return e.isRejectDate(value);
        }

    }

    // -----------------------------------------------------------
    // - closed
    // -----------------------------------------------------------

    private final Cache<Boolean,Set<Requirement>> requirementsByClosedCache = new Cache<Boolean,Set<Requirement>>(
            new Cache.Factory<Boolean,Set<Requirement>>() {
                public Set<Requirement> create(Boolean closed) {
                    return getEntities(new IsClosed(closed));
                }
            });

    public final Set<Requirement> getRequirementsByClosed(boolean closed) {
        return new HashSet<Requirement>(requirementsByClosedCache.get(closed));
    }

    private static class IsClosed implements Predicate<Requirement> {

        private boolean value;

        public IsClosed(boolean value) {
            this.value = value;
        }

        public boolean test(Requirement e) {
            return value == e.isClosed();
        }

    }

    // -----------------------------------------------------------
    // - suspended
    // -----------------------------------------------------------

    private final Cache<Boolean,Set<Requirement>> requirementsBySuspendedCache = new Cache<Boolean,Set<Requirement>>(
            new Cache.Factory<Boolean,Set<Requirement>>() {
                public Set<Requirement> create(Boolean suspended) {
                    return getEntities(new IsSuspended(suspended));
                }
            });

    public final Set<Requirement> getRequirementsBySuspended(boolean suspended) {
        return new HashSet<Requirement>(requirementsBySuspendedCache.get(suspended));
    }

    private static class IsSuspended implements Predicate<Requirement> {

        private boolean value;

        public IsSuspended(boolean value) {
            this.value = value;
        }

        public boolean test(Requirement e) {
            return value == e.isSuspended();
        }

    }

    // -----------------------------------------------------------
    // - dirty
    // -----------------------------------------------------------

    private final Cache<Boolean,Set<Requirement>> requirementsByDirtyCache = new Cache<Boolean,Set<Requirement>>(
            new Cache.Factory<Boolean,Set<Requirement>>() {
                public Set<Requirement> create(Boolean dirty) {
                    return getEntities(new IsDirty(dirty));
                }
            });

    public final Set<Requirement> getRequirementsByDirty(boolean dirty) {
        return new HashSet<Requirement>(requirementsByDirtyCache.get(dirty));
    }

    private static class IsDirty implements Predicate<Requirement> {

        private boolean value;

        public IsDirty(boolean value) {
            this.value = value;
        }

        public boolean test(Requirement e) {
            return value == e.isDirty();
        }

    }

    // -----------------------------------------------------------
    // - workEstimationVotingActive
    // -----------------------------------------------------------

    private final Cache<Boolean,Set<Requirement>> requirementsByWorkEstimationVotingActiveCache = new Cache<Boolean,Set<Requirement>>(
            new Cache.Factory<Boolean,Set<Requirement>>() {
                public Set<Requirement> create(Boolean workEstimationVotingActive) {
                    return getEntities(new IsWorkEstimationVotingActive(workEstimationVotingActive));
                }
            });

    public final Set<Requirement> getRequirementsByWorkEstimationVotingActive(boolean workEstimationVotingActive) {
        return new HashSet<Requirement>(requirementsByWorkEstimationVotingActiveCache.get(workEstimationVotingActive));
    }

    private static class IsWorkEstimationVotingActive implements Predicate<Requirement> {

        private boolean value;

        public IsWorkEstimationVotingActive(boolean value) {
            this.value = value;
        }

        public boolean test(Requirement e) {
            return value == e.isWorkEstimationVotingActive();
        }

    }

    // -----------------------------------------------------------
    // - workEstimationVotingShowoff
    // -----------------------------------------------------------

    private final Cache<Boolean,Set<Requirement>> requirementsByWorkEstimationVotingShowoffCache = new Cache<Boolean,Set<Requirement>>(
            new Cache.Factory<Boolean,Set<Requirement>>() {
                public Set<Requirement> create(Boolean workEstimationVotingShowoff) {
                    return getEntities(new IsWorkEstimationVotingShowoff(workEstimationVotingShowoff));
                }
            });

    public final Set<Requirement> getRequirementsByWorkEstimationVotingShowoff(boolean workEstimationVotingShowoff) {
        return new HashSet<Requirement>(requirementsByWorkEstimationVotingShowoffCache.get(workEstimationVotingShowoff));
    }

    private static class IsWorkEstimationVotingShowoff implements Predicate<Requirement> {

        private boolean value;

        public IsWorkEstimationVotingShowoff(boolean value) {
            this.value = value;
        }

        public boolean test(Requirement e) {
            return value == e.isWorkEstimationVotingShowoff();
        }

    }

    // -----------------------------------------------------------
    // - tasksOrderIds
    // -----------------------------------------------------------

    private final Cache<java.lang.String,Set<Requirement>> requirementsByTasksOrderIdCache = new Cache<java.lang.String,Set<Requirement>>(
            new Cache.Factory<java.lang.String,Set<Requirement>>() {
                public Set<Requirement> create(java.lang.String tasksOrderId) {
                    return getEntities(new ContainsTasksOrderId(tasksOrderId));
                }
            });

    public final Set<Requirement> getRequirementsByTasksOrderId(java.lang.String tasksOrderId) {
        return new HashSet<Requirement>(requirementsByTasksOrderIdCache.get(tasksOrderId));
    }
    private Set<java.lang.String> tasksOrderIdsCache;

    public final Set<java.lang.String> getTasksOrderIds() {
        if (tasksOrderIdsCache == null) {
            tasksOrderIdsCache = new HashSet<java.lang.String>();
            for (Requirement e : getEntities()) {
                tasksOrderIdsCache.addAll(e.getTasksOrderIds());
            }
        }
        return tasksOrderIdsCache;
    }

    private static class ContainsTasksOrderId implements Predicate<Requirement> {

        private java.lang.String value;

        public ContainsTasksOrderId(java.lang.String value) {
            this.value = value;
        }

        public boolean test(Requirement e) {
            return e.containsTasksOrderId(value);
        }

    }

    // -----------------------------------------------------------
    // - themes
    // -----------------------------------------------------------

    private final Cache<java.lang.String,Set<Requirement>> requirementsByThemeCache = new Cache<java.lang.String,Set<Requirement>>(
            new Cache.Factory<java.lang.String,Set<Requirement>>() {
                public Set<Requirement> create(java.lang.String theme) {
                    return getEntities(new ContainsTheme(theme));
                }
            });

    public final Set<Requirement> getRequirementsByTheme(java.lang.String theme) {
        return new HashSet<Requirement>(requirementsByThemeCache.get(theme));
    }
    private Set<java.lang.String> themesCache;

    public final Set<java.lang.String> getThemes() {
        if (themesCache == null) {
            themesCache = new HashSet<java.lang.String>();
            for (Requirement e : getEntities()) {
                themesCache.addAll(e.getThemes());
            }
        }
        return themesCache;
    }

    private static class ContainsTheme implements Predicate<Requirement> {

        private java.lang.String value;

        public ContainsTheme(java.lang.String value) {
            this.value = value;
        }

        public boolean test(Requirement e) {
            return e.containsTheme(value);
        }

    }

    // -----------------------------------------------------------
    // - epic
    // -----------------------------------------------------------

    private final Cache<scrum.server.project.Requirement,Set<Requirement>> requirementsByEpicCache = new Cache<scrum.server.project.Requirement,Set<Requirement>>(
            new Cache.Factory<scrum.server.project.Requirement,Set<Requirement>>() {
                public Set<Requirement> create(scrum.server.project.Requirement epic) {
                    return getEntities(new IsEpic(epic));
                }
            });

    public final Set<Requirement> getRequirementsByEpic(scrum.server.project.Requirement epic) {
        return new HashSet<Requirement>(requirementsByEpicCache.get(epic));
    }
    private Set<scrum.server.project.Requirement> epicsCache;

    public final Set<scrum.server.project.Requirement> getEpics() {
        if (epicsCache == null) {
            epicsCache = new HashSet<scrum.server.project.Requirement>();
            for (Requirement e : getEntities()) {
                if (e.isEpicSet()) epicsCache.add(e.getEpic());
            }
        }
        return epicsCache;
    }

    private static class IsEpic implements Predicate<Requirement> {

        private scrum.server.project.Requirement value;

        public IsEpic(scrum.server.project.Requirement value) {
            this.value = value;
        }

        public boolean test(Requirement e) {
            return e.isEpic(value);
        }

    }

    // --- valueObject classes ---
    @Override
    protected Set<Class> getValueObjectClasses() {
        Set<Class> ret = new HashSet<Class>(super.getValueObjectClasses());
        return ret;
    }

    @Override
    public Map<String, Class> getAliases() {
        Map<String, Class> aliases = new HashMap<String, Class>(super.getAliases());
        return aliases;
    }

    // --- dependencies ---

    scrum.server.project.ProjectDao projectDao;

    public void setProjectDao(scrum.server.project.ProjectDao projectDao) {
        this.projectDao = projectDao;
    }

    scrum.server.sprint.SprintDao sprintDao;

    public void setSprintDao(scrum.server.sprint.SprintDao sprintDao) {
        this.sprintDao = sprintDao;
    }

    scrum.server.issues.IssueDao issueDao;

    public void setIssueDao(scrum.server.issues.IssueDao issueDao) {
        this.issueDao = issueDao;
    }

    scrum.server.project.QualityDao qualityDao;

    public void setQualityDao(scrum.server.project.QualityDao qualityDao) {
        this.qualityDao = qualityDao;
    }

}