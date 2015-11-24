// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: ilarkesto.mda.legacy.generator.GwtServiceCallGenerator










package scrum.client.base;

import java.util.*;

@com.google.gwt.user.client.rpc.RemoteServiceRelativePath("scrum")
public class UpdateEntitiesServiceCall
            extends ilarkesto.gwt.client.AServiceCall<scrum.client.DataTransferObject> {

    private static scrum.client.ScrumServiceAsync service;

    java.util.Collection<java.util.Map<String, String>> modified;
    java.util.Collection<String> deleted;

    public UpdateEntitiesServiceCall(java.util.Collection<java.util.Map<String, String>> modified, java.util.Collection<String> deleted) {
        this.modified = modified;
        this.deleted = deleted;
    }

    @Override
    protected void onExecute(int conversationNumber, com.google.gwt.user.client.rpc.AsyncCallback<scrum.client.DataTransferObject> callback) {
        if (service==null) {
            service = (scrum.client.ScrumServiceAsync) com.google.gwt.core.client.GWT.create(scrum.client.ScrumService.class);
            initializeService(service, "scrum");
        }
        service.updateEntities(conversationNumber, modified, deleted, callback);
    }

    @Override
    public String toString() {
        return "updateEntities";
    }

}