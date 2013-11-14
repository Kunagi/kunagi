// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: ilarkesto.mda.legacy.generator.GwtEntityGenerator










package scrum.client.project;

import java.util.*;
import ilarkesto.core.logging.Log;
import scrum.client.common.*;
import ilarkesto.gwt.client.*;

public abstract class GRequirement
            extends scrum.client.common.AScrumGwtEntity {

    protected scrum.client.Dao getDao() {
        return scrum.client.Dao.get();
    }

    public abstract boolean isEditable();

    public GRequirement() {
    }

    public GRequirement(Map data) {
        super(data);
        updateProperties(data);
    }

    public static final String ENTITY_TYPE = "requirement";

    @Override
    public final String getEntityType() {
        return ENTITY_TYPE;
    }

    // --- project ---

    private String projectId;

    public final scrum.client.project.Project getProject() {
        if (projectId == null) return null;
        return getDao().getProject(this.projectId);
    }

    public final boolean isProjectSet() {
        return projectId != null;
    }

    public final Requirement setProject(scrum.client.project.Project project) {
        String id = project == null ? null : project.getId();
        if (equals(this.projectId, id)) return (Requirement) this;
        this.projectId = id;
        propertyChanged("projectId", this.projectId);
        return (Requirement)this;
    }

    public final boolean isProject(scrum.client.project.Project project) {
        String id = project==null ? null : project.getId();
        return equals(this.projectId, id);
    }

    // --- sprint ---

    private String sprintId;

    public final scrum.client.sprint.Sprint getSprint() {
        if (sprintId == null) return null;
        return getDao().getSprint(this.sprintId);
    }

    public final boolean isSprintSet() {
        return sprintId != null;
    }

    public final Requirement setSprint(scrum.client.sprint.Sprint sprint) {
        String id = sprint == null ? null : sprint.getId();
        if (equals(this.sprintId, id)) return (Requirement) this;
        this.sprintId = id;
        propertyChanged("sprintId", this.sprintId);
        return (Requirement)this;
    }

    public final boolean isSprint(scrum.client.sprint.Sprint sprint) {
        String id = sprint==null ? null : sprint.getId();
        return equals(this.sprintId, id);
    }

    // --- issue ---

    private String issueId;

    public final scrum.client.issues.Issue getIssue() {
        if (issueId == null) return null;
        return getDao().getIssue(this.issueId);
    }

    public final boolean isIssueSet() {
        return issueId != null;
    }

    public final Requirement setIssue(scrum.client.issues.Issue issue) {
        String id = issue == null ? null : issue.getId();
        if (equals(this.issueId, id)) return (Requirement) this;
        this.issueId = id;
        propertyChanged("issueId", this.issueId);
        return (Requirement)this;
    }

    public final boolean isIssue(scrum.client.issues.Issue issue) {
        String id = issue==null ? null : issue.getId();
        return equals(this.issueId, id);
    }

    // --- number ---

    private int number ;

    public final int getNumber() {
        return this.number ;
    }

    public final Requirement setNumber(int number) {
        if (isNumber(number)) return (Requirement)this;
        this.number = number ;
        propertyChanged("number", this.number);
        return (Requirement)this;
    }

    public final boolean isNumber(int number) {
        return equals(this.number, number);
    }

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
        protected void onChangeValue(java.lang.Integer oldValue, java.lang.Integer newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    // --- qualitys ---

    private Set<String> qualitysIds = new HashSet<String>();

    public final java.util.Set<scrum.client.project.Quality> getQualitys() {
        if ( qualitysIds.isEmpty()) return Collections.emptySet();
        return getDao().getQualitys(this.qualitysIds);
    }

    public final void setQualitys(Collection<scrum.client.project.Quality> values) {
        qualitysIds = ilarkesto.gwt.client.Gwt.getIdsAsSet(values);
        propertyChanged("qualitysIds", this.qualitysIds);
    }

    public final void addQuality(scrum.client.project.Quality quality) {
        String id = quality.getId();
        if (qualitysIds.contains(id)) return;
        qualitysIds.add(id);
        propertyChanged("qualitysIds", this.qualitysIds);
    }

    public final void removeQuality(scrum.client.project.Quality quality) {
        String id = quality.getId();
        if (!qualitysIds.contains(id)) return;
        qualitysIds.remove(id);
        propertyChanged("qualitysIds", this.qualitysIds);
    }

    public final boolean containsQuality(scrum.client.project.Quality quality) {
        return qualitysIds.contains(quality.getId());
    }


    // --- label ---

    private java.lang.String label ;

    public final java.lang.String getLabel() {
        return this.label ;
    }

    public final Requirement setLabel(java.lang.String label) {
        if (isLabel(label)) return (Requirement)this;
        if (ilarkesto.core.base.Str.isBlank(label)) throw new RuntimeException("Field is mandatory.");
        this.label = label ;
        propertyChanged("label", this.label);
        return (Requirement)this;
    }

    public final boolean isLabel(java.lang.String label) {
        return equals(this.label, label);
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
        public boolean isMandatory() { return true; }

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

    // --- description ---

    private java.lang.String description ;

    public final java.lang.String getDescription() {
        return this.description ;
    }

    public final Requirement setDescription(java.lang.String description) {
        if (isDescription(description)) return (Requirement)this;
        this.description = description ;
        propertyChanged("description", this.description);
        return (Requirement)this;
    }

    public final boolean isDescription(java.lang.String description) {
        return equals(this.description, description);
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

    // --- testDescription ---

    private java.lang.String testDescription ;

    public final java.lang.String getTestDescription() {
        return this.testDescription ;
    }

    public final Requirement setTestDescription(java.lang.String testDescription) {
        if (isTestDescription(testDescription)) return (Requirement)this;
        this.testDescription = testDescription ;
        propertyChanged("testDescription", this.testDescription);
        return (Requirement)this;
    }

    public final boolean isTestDescription(java.lang.String testDescription) {
        return equals(this.testDescription, testDescription);
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

    // --- estimatedWork ---

    private java.lang.Float estimatedWork ;

    public final java.lang.Float getEstimatedWork() {
        return this.estimatedWork ;
    }

    public final Requirement setEstimatedWork(java.lang.Float estimatedWork) {
        if (isEstimatedWork(estimatedWork)) return (Requirement)this;
        this.estimatedWork = estimatedWork ;
        propertyChanged("estimatedWork", this.estimatedWork);
        return (Requirement)this;
    }

    public final boolean isEstimatedWork(java.lang.Float estimatedWork) {
        return equals(this.estimatedWork, estimatedWork);
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

    // --- rejectDate ---

    private ilarkesto.core.time.Date rejectDate ;

    public final ilarkesto.core.time.Date getRejectDate() {
        return this.rejectDate ;
    }

    public final Requirement setRejectDate(ilarkesto.core.time.Date rejectDate) {
        if (isRejectDate(rejectDate)) return (Requirement)this;
        this.rejectDate = rejectDate ;
        propertyChanged("rejectDate", this.rejectDate);
        return (Requirement)this;
    }

    public final boolean isRejectDate(ilarkesto.core.time.Date rejectDate) {
        return equals(this.rejectDate, rejectDate);
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

    // --- closed ---

    private boolean closed ;

    public final boolean isClosed() {
        return this.closed ;
    }

    public final Requirement setClosed(boolean closed) {
        if (isClosed(closed)) return (Requirement)this;
        this.closed = closed ;
        propertyChanged("closed", this.closed);
        return (Requirement)this;
    }

    public final boolean isClosed(boolean closed) {
        return equals(this.closed, closed);
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
        protected void onChangeValue(java.lang.Boolean oldValue, java.lang.Boolean newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    // --- suspended ---

    private boolean suspended ;

    public final boolean isSuspended() {
        return this.suspended ;
    }

    public final Requirement setSuspended(boolean suspended) {
        if (isSuspended(suspended)) return (Requirement)this;
        this.suspended = suspended ;
        propertyChanged("suspended", this.suspended);
        return (Requirement)this;
    }

    public final boolean isSuspended(boolean suspended) {
        return equals(this.suspended, suspended);
    }

    private transient SuspendedModel suspendedModel;

    public SuspendedModel getSuspendedModel() {
        if (suspendedModel == null) suspendedModel = createSuspendedModel();
        return suspendedModel;
    }

    protected SuspendedModel createSuspendedModel() { return new SuspendedModel(); }

    protected class SuspendedModel extends ilarkesto.gwt.client.editor.ABooleanEditorModel {

        @Override
        public String getId() {
            return "Requirement_suspended";
        }

        @Override
        public java.lang.Boolean getValue() {
            return isSuspended();
        }

        @Override
        public void setValue(java.lang.Boolean value) {
            setSuspended(value);
        }

        @Override
        protected void onChangeValue(java.lang.Boolean oldValue, java.lang.Boolean newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    // --- dirty ---

    private boolean dirty ;

    public final boolean isDirty() {
        return this.dirty ;
    }

    public final Requirement setDirty(boolean dirty) {
        if (isDirty(dirty)) return (Requirement)this;
        this.dirty = dirty ;
        propertyChanged("dirty", this.dirty);
        return (Requirement)this;
    }

    public final boolean isDirty(boolean dirty) {
        return equals(this.dirty, dirty);
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
        protected void onChangeValue(java.lang.Boolean oldValue, java.lang.Boolean newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    // --- workEstimationVotingActive ---

    private boolean workEstimationVotingActive ;

    public final boolean isWorkEstimationVotingActive() {
        return this.workEstimationVotingActive ;
    }

    public final Requirement setWorkEstimationVotingActive(boolean workEstimationVotingActive) {
        if (isWorkEstimationVotingActive(workEstimationVotingActive)) return (Requirement)this;
        this.workEstimationVotingActive = workEstimationVotingActive ;
        propertyChanged("workEstimationVotingActive", this.workEstimationVotingActive);
        return (Requirement)this;
    }

    public final boolean isWorkEstimationVotingActive(boolean workEstimationVotingActive) {
        return equals(this.workEstimationVotingActive, workEstimationVotingActive);
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
        protected void onChangeValue(java.lang.Boolean oldValue, java.lang.Boolean newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    // --- workEstimationVotingShowoff ---

    private boolean workEstimationVotingShowoff ;

    public final boolean isWorkEstimationVotingShowoff() {
        return this.workEstimationVotingShowoff ;
    }

    public final Requirement setWorkEstimationVotingShowoff(boolean workEstimationVotingShowoff) {
        if (isWorkEstimationVotingShowoff(workEstimationVotingShowoff)) return (Requirement)this;
        this.workEstimationVotingShowoff = workEstimationVotingShowoff ;
        propertyChanged("workEstimationVotingShowoff", this.workEstimationVotingShowoff);
        return (Requirement)this;
    }

    public final boolean isWorkEstimationVotingShowoff(boolean workEstimationVotingShowoff) {
        return equals(this.workEstimationVotingShowoff, workEstimationVotingShowoff);
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
        protected void onChangeValue(java.lang.Boolean oldValue, java.lang.Boolean newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    // --- tasksOrderIds ---

    private java.util.List<java.lang.String> tasksOrderIds = new java.util.ArrayList<java.lang.String>();

    public final java.util.List<java.lang.String> getTasksOrderIds() {
        return new java.util.ArrayList<java.lang.String>(tasksOrderIds);
    }

    public final void setTasksOrderIds(java.util.List<java.lang.String> tasksOrderIds) {
        if (tasksOrderIds == null) throw new IllegalArgumentException("null is not allowed");
        if (this.tasksOrderIds.equals(tasksOrderIds)) return;
        this.tasksOrderIds = new java.util.ArrayList<java.lang.String>(tasksOrderIds);
        propertyChanged("tasksOrderIds", this.tasksOrderIds);
    }

    public final boolean containsTasksOrderId(java.lang.String tasksOrderId) {
        return tasksOrderIds.contains(tasksOrderId);
    }


    // --- themes ---

    private java.util.List<java.lang.String> themes = new java.util.ArrayList<java.lang.String>();

    public final java.util.List<java.lang.String> getThemes() {
        return new java.util.ArrayList<java.lang.String>(themes);
    }

    public final void setThemes(java.util.List<java.lang.String> themes) {
        if (themes == null) throw new IllegalArgumentException("null is not allowed");
        if (this.themes.equals(themes)) return;
        this.themes = new java.util.ArrayList<java.lang.String>(themes);
        propertyChanged("themes", this.themes);
    }

    public final boolean containsTheme(java.lang.String theme) {
        return themes.contains(theme);
    }


    // --- epic ---

    private String epicId;

    public final scrum.client.project.Requirement getEpic() {
        if (epicId == null) return null;
        return getDao().getRequirement(this.epicId);
    }

    public final boolean isEpicSet() {
        return epicId != null;
    }

    public final Requirement setEpic(scrum.client.project.Requirement epic) {
        String id = epic == null ? null : epic.getId();
        if (equals(this.epicId, id)) return (Requirement) this;
        this.epicId = id;
        propertyChanged("epicId", this.epicId);
        return (Requirement)this;
    }

    public final boolean isEpic(scrum.client.project.Requirement epic) {
        String id = epic==null ? null : epic.getId();
        return equals(this.epicId, id);
    }

    // --- update properties by map ---

    public void updateProperties(Map props) {
        projectId = (String) props.get("projectId");
        sprintId = (String) props.get("sprintId");
        issueId = (String) props.get("issueId");
        number  = (Integer) props.get("number");
        qualitysIds = (Set<String>) props.get("qualitysIds");
        label  = (java.lang.String) props.get("label");
        description  = (java.lang.String) props.get("description");
        testDescription  = (java.lang.String) props.get("testDescription");
        estimatedWork  = (java.lang.Float) props.get("estimatedWork");
        String rejectDateAsString = (String) props.get("rejectDate");
        rejectDate  =  rejectDateAsString == null ? null : new ilarkesto.core.time.Date(rejectDateAsString);
        closed  = (Boolean) props.get("closed");
        suspended  = (Boolean) props.get("suspended");
        dirty  = (Boolean) props.get("dirty");
        workEstimationVotingActive  = (Boolean) props.get("workEstimationVotingActive");
        workEstimationVotingShowoff  = (Boolean) props.get("workEstimationVotingShowoff");
        tasksOrderIds  = (java.util.List<java.lang.String>) props.get("tasksOrderIds");
        themes  = (java.util.List<java.lang.String>) props.get("themes");
        epicId = (String) props.get("epicId");
        updateLocalModificationTime();
    }

    @Override
    public void storeProperties(Map properties) {
        super.storeProperties(properties);
        properties.put("projectId", this.projectId);
        properties.put("sprintId", this.sprintId);
        properties.put("issueId", this.issueId);
        properties.put("number", this.number);
        properties.put("qualitysIds", this.qualitysIds);
        properties.put("label", this.label);
        properties.put("description", this.description);
        properties.put("testDescription", this.testDescription);
        properties.put("estimatedWork", this.estimatedWork);
        properties.put("rejectDate", this.rejectDate == null ? null : this.rejectDate.toString());
        properties.put("closed", this.closed);
        properties.put("suspended", this.suspended);
        properties.put("dirty", this.dirty);
        properties.put("workEstimationVotingActive", this.workEstimationVotingActive);
        properties.put("workEstimationVotingShowoff", this.workEstimationVotingShowoff);
        properties.put("tasksOrderIds", this.tasksOrderIds);
        properties.put("themes", this.themes);
        properties.put("epicId", this.epicId);
    }

    public final java.util.List<scrum.client.issues.Issue> getIssues() {
        return getDao().getIssuesByStory((Requirement)this);
    }

    public final java.util.List<scrum.client.project.Requirement> getRequirements() {
        return getDao().getRequirementsByEpic((Requirement)this);
    }

    public final java.util.List<scrum.client.sprint.SprintReport> getSprintReports() {
        return getDao().getSprintReportsByCompletedRequirement((Requirement)this);
    }

    public final java.util.List<scrum.client.sprint.Task> getTasks() {
        return getDao().getTasksByRequirement((Requirement)this);
    }

    public final java.util.List<scrum.client.estimation.RequirementEstimationVote> getRequirementEstimationVotes() {
        return getDao().getRequirementEstimationVotesByRequirement((Requirement)this);
    }

    @Override
    public boolean matchesKey(String key) {
        if (super.matchesKey(key)) return true;
        if (matchesKey(getLabel(), key)) return true;
        if (matchesKey(getDescription(), key)) return true;
        if (matchesKey(getTestDescription(), key)) return true;
        return false;
    }

}