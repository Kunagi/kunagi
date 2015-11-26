// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: ilarkesto.mda.legacy.generator.EntityGenerator










package scrum.server.risks;

import java.util.*;
import ilarkesto.core.base.Utl;
import ilarkesto.core.logging.Log;
import ilarkesto.persistence.ADatob;
import ilarkesto.persistence.AEntity;
import ilarkesto.auth.AuthUser;
import ilarkesto.core.base.Str;
import ilarkesto.core.persistance.EntityDoesNotExistException;

public abstract class GRisk
            extends ilarkesto.persistence.AEntity
            implements ilarkesto.auth.ViewProtected<scrum.server.admin.User>, java.lang.Comparable<Risk>, ilarkesto.core.search.Searchable {

    public static class RiskMetadata implements ilarkesto.core.persistance.meta.EntityMetadata {

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata project = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "project";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Risk)entity).getProject();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata number = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "number";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Risk)entity).getNumber();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata label = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "label";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Risk)entity).getLabel();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata description = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "description";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Risk)entity).getDescription();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata probabilityMitigation = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "probabilityMitigation";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Risk)entity).getProbabilityMitigation();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata impactMitigation = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "impactMitigation";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Risk)entity).getImpactMitigation();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata probability = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "probability";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Risk)entity).getProbability();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata impact = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "impact";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Risk)entity).getImpact();
            }

        };

        public static transient ilarkesto.core.persistance.meta.EntityFieldMetadata[] fields = new ilarkesto.core.persistance.meta.EntityFieldMetadata[] {
            project
            ,number
            ,label
            ,description
            ,probabilityMitigation
            ,impactMitigation
            ,probability
            ,impact
        };

        public ilarkesto.core.persistance.meta.EntityFieldMetadata[] getFields() {
            return fields;
        }

        public ilarkesto.core.persistance.meta.EntityFieldMetadata getField(String fieldName) {
            if ("project".equals(fieldName)) return project;
            if ("projectId".equals(fieldName)) return project;
            if ("number".equals(fieldName)) return number;
            if ("label".equals(fieldName)) return label;
            if ("description".equals(fieldName)) return description;
            if ("probabilityMitigation".equals(fieldName)) return probabilityMitigation;
            if ("impactMitigation".equals(fieldName)) return impactMitigation;
            if ("probability".equals(fieldName)) return probability;
            if ("impact".equals(fieldName)) return impact;
            return null;
        }

    }

    public static transient final RiskMetadata metadata = new RiskMetadata();

    @Override
    public RiskMetadata getMetadata() { return metadata; };

    protected static final ilarkesto.core.logging.Log log = ilarkesto.core.logging.Log.get(Risk.class);

    // --- AEntity ---

    public final scrum.server.risks.RiskDao getDao() {
        return riskDao;
    }

    protected void repairDeadDatob(ADatob datob) {
    }

    public abstract static class ARiskQuery extends ilarkesto.core.persistance.AEntityQuery<Risk> {
    @Override
        public Class<Risk> getType() {
            return Risk.class;
        }
    }

    public static Set<Risk> listAll() {
        return new ilarkesto.core.persistance.AllByTypeQuery(Risk.class).list();
    }

    public static Risk getById(String id) {
        return (Risk) AEntity.getById(id);
    }

    @Override
    public Set<ilarkesto.core.persistance.Entity> getReferencedEntities() {
        Set<ilarkesto.core.persistance.Entity> ret = super.getReferencedEntities();
    // --- references ---
        try { Utl.addIfNotNull(ret, getProject()); } catch(EntityDoesNotExistException ex) {}
        return ret;
    }

    @Override
    public void storeProperties(Map<String, String> properties) {
        super.storeProperties(properties);
        properties.put("projectId", ilarkesto.core.persistance.Persistence.propertyAsString(this.projectId));
        properties.put("number", ilarkesto.core.persistance.Persistence.propertyAsString(this.number));
        properties.put("label", ilarkesto.core.persistance.Persistence.propertyAsString(this.label));
        properties.put("description", ilarkesto.core.persistance.Persistence.propertyAsString(this.description));
        properties.put("probabilityMitigation", ilarkesto.core.persistance.Persistence.propertyAsString(this.probabilityMitigation));
        properties.put("impactMitigation", ilarkesto.core.persistance.Persistence.propertyAsString(this.impactMitigation));
        properties.put("probability", ilarkesto.core.persistance.Persistence.propertyAsString(this.probability));
        properties.put("impact", ilarkesto.core.persistance.Persistence.propertyAsString(this.impact));
    }

    @Override
    public int compareTo(Risk other) {
        return ilarkesto.core.localization.GermanComparator.INSTANCE.compare(toString(), other.toString());
    }

    private static final ilarkesto.core.logging.Log LOG = ilarkesto.core.logging.Log.get(GRisk.class);

    public static final String TYPE = "Risk";


    // -----------------------------------------------------------
    // - Searchable
    // -----------------------------------------------------------

    @Override
    public boolean matches(ilarkesto.core.search.SearchText search) {
         return search.matches(getLabel(), getDescription(), getProbabilityMitigation(), getImpactMitigation());
    }
    // -----------------------------------------------------------
    // - project
    // -----------------------------------------------------------

    private String projectId;

    public final String getProjectId() {
        return this.projectId;
    }

    public final scrum.server.project.Project getProject() {
        try {
            return this.projectId == null ? null : (scrum.server.project.Project) AEntity.getById(this.projectId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Risk.project");
        }
    }

    public final void setProject(scrum.server.project.Project project) {
        project = prepareProject(project);
        if (isProject(project)) return;
        setProjectId(project == null ? null : project.getId());
    }

    public final void setProjectId(String id) {
        if (Utl.equals(projectId, id)) return;
        this.projectId = id;
            updateLastModified();
            fireModified("projectId", ilarkesto.core.persistance.Persistence.propertyAsString(this.projectId));
    }

    private final void updateProjectId(String id) {
        setProjectId(id);
    }

    protected scrum.server.project.Project prepareProject(scrum.server.project.Project project) {
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

    public final boolean isProject(scrum.server.project.Project project) {
        if (this.projectId == null && project == null) return true;
        return project != null && project.getId().equals(this.projectId);
    }

    protected final void updateProject(Object value) {
        setProject(value == null ? null : (scrum.server.project.Project)projectDao.getById((String)value));
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
         description = Str.removeControlChars(description);
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
    // - probabilityMitigation
    // -----------------------------------------------------------

    private java.lang.String probabilityMitigation;

    public final java.lang.String getProbabilityMitigation() {
        return probabilityMitigation;
    }

    public final void setProbabilityMitigation(java.lang.String probabilityMitigation) {
        probabilityMitigation = prepareProbabilityMitigation(probabilityMitigation);
        if (isProbabilityMitigation(probabilityMitigation)) return;
        this.probabilityMitigation = probabilityMitigation;
            updateLastModified();
            fireModified("probabilityMitigation", ilarkesto.core.persistance.Persistence.propertyAsString(this.probabilityMitigation));
    }

    private final void updateProbabilityMitigation(java.lang.String probabilityMitigation) {
        if (isProbabilityMitigation(probabilityMitigation)) return;
        this.probabilityMitigation = probabilityMitigation;
            updateLastModified();
            fireModified("probabilityMitigation", ilarkesto.core.persistance.Persistence.propertyAsString(this.probabilityMitigation));
    }

    protected java.lang.String prepareProbabilityMitigation(java.lang.String probabilityMitigation) {
         probabilityMitigation = Str.removeControlChars(probabilityMitigation);
        return probabilityMitigation;
    }

    public final boolean isProbabilityMitigationSet() {
        return this.probabilityMitigation != null;
    }

    public final boolean isProbabilityMitigation(java.lang.String probabilityMitigation) {
        if (this.probabilityMitigation == null && probabilityMitigation == null) return true;
        return this.probabilityMitigation != null && this.probabilityMitigation.equals(probabilityMitigation);
    }

    protected final void updateProbabilityMitigation(Object value) {
        setProbabilityMitigation((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - impactMitigation
    // -----------------------------------------------------------

    private java.lang.String impactMitigation;

    public final java.lang.String getImpactMitigation() {
        return impactMitigation;
    }

    public final void setImpactMitigation(java.lang.String impactMitigation) {
        impactMitigation = prepareImpactMitigation(impactMitigation);
        if (isImpactMitigation(impactMitigation)) return;
        this.impactMitigation = impactMitigation;
            updateLastModified();
            fireModified("impactMitigation", ilarkesto.core.persistance.Persistence.propertyAsString(this.impactMitigation));
    }

    private final void updateImpactMitigation(java.lang.String impactMitigation) {
        if (isImpactMitigation(impactMitigation)) return;
        this.impactMitigation = impactMitigation;
            updateLastModified();
            fireModified("impactMitigation", ilarkesto.core.persistance.Persistence.propertyAsString(this.impactMitigation));
    }

    protected java.lang.String prepareImpactMitigation(java.lang.String impactMitigation) {
         impactMitigation = Str.removeControlChars(impactMitigation);
        return impactMitigation;
    }

    public final boolean isImpactMitigationSet() {
        return this.impactMitigation != null;
    }

    public final boolean isImpactMitigation(java.lang.String impactMitigation) {
        if (this.impactMitigation == null && impactMitigation == null) return true;
        return this.impactMitigation != null && this.impactMitigation.equals(impactMitigation);
    }

    protected final void updateImpactMitigation(Object value) {
        setImpactMitigation((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - probability
    // -----------------------------------------------------------

    private int probability;

    public final int getProbability() {
        return probability;
    }

    public final void setProbability(int probability) {
        probability = prepareProbability(probability);
        if (isProbability(probability)) return;
        this.probability = probability;
            updateLastModified();
            fireModified("probability", ilarkesto.core.persistance.Persistence.propertyAsString(this.probability));
    }

    public abstract List<java.lang.Integer> getProbabilityOptions();

    private final void updateProbability(int probability) {
        if (isProbability(probability)) return;
        this.probability = probability;
            updateLastModified();
            fireModified("probability", ilarkesto.core.persistance.Persistence.propertyAsString(this.probability));
    }

    protected int prepareProbability(int probability) {
        return probability;
    }

    public final boolean isProbability(int probability) {
        return this.probability == probability;
    }

    protected final void updateProbability(Object value) {
        setProbability((Integer)value);
    }
    // -----------------------------------------------------------
    // - impact
    // -----------------------------------------------------------

    private int impact;

    public final int getImpact() {
        return impact;
    }

    public final void setImpact(int impact) {
        impact = prepareImpact(impact);
        if (isImpact(impact)) return;
        this.impact = impact;
            updateLastModified();
            fireModified("impact", ilarkesto.core.persistance.Persistence.propertyAsString(this.impact));
    }

    public abstract List<java.lang.Integer> getImpactOptions();

    private final void updateImpact(int impact) {
        if (isImpact(impact)) return;
        this.impact = impact;
            updateLastModified();
            fireModified("impact", ilarkesto.core.persistance.Persistence.propertyAsString(this.impact));
    }

    protected int prepareImpact(int impact) {
        return impact;
    }

    public final boolean isImpact(int impact) {
        return this.impact == impact;
    }

    protected final void updateImpact(Object value) {
        setImpact((Integer)value);
    }

    public void updateProperties(Map<String, String> properties) {
        super.updateProperties(properties);
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            String property = entry.getKey();
            if (property.equals("id")) continue;
            String value = entry.getValue();
            if (property.equals("projectId")) updateProjectId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("number")) updateNumber(ilarkesto.core.persistance.Persistence.parsePropertyint(value));
            if (property.equals("label")) updateLabel(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("description")) updateDescription(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("probabilityMitigation")) updateProbabilityMitigation(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("impactMitigation")) updateImpactMitigation(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("probability")) updateProbability(ilarkesto.core.persistance.Persistence.parsePropertyint(value));
            if (property.equals("impact")) updateImpact(ilarkesto.core.persistance.Persistence.parsePropertyint(value));
        }
    }

    protected void repairDeadReferences(String entityId) {
        if (!isPersisted()) return;
        super.repairDeadReferences(entityId);
        repairDeadProjectReference(entityId);
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
    }


    // -----------------------------------------------------------
    // - dependencies
    // -----------------------------------------------------------

    static scrum.server.project.ProjectDao projectDao;

    public static final void setProjectDao(scrum.server.project.ProjectDao projectDao) {
        GRisk.projectDao = projectDao;
    }

    static scrum.server.risks.RiskDao riskDao;

    public static final void setRiskDao(scrum.server.risks.RiskDao riskDao) {
        GRisk.riskDao = riskDao;
    }

}