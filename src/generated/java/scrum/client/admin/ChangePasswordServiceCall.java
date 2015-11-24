// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: ilarkesto.mda.legacy.generator.GwtServiceCallGenerator










package scrum.client.admin;

import java.util.*;

@com.google.gwt.user.client.rpc.RemoteServiceRelativePath("scrum")
public class ChangePasswordServiceCall
            extends ilarkesto.gwt.client.AServiceCall<scrum.client.DataTransferObject> {

    private static scrum.client.ScrumServiceAsync service;

    java.lang.String newPassword;
    java.lang.String oldPassword;

    public ChangePasswordServiceCall(java.lang.String newPassword, java.lang.String oldPassword) {
        this.newPassword = newPassword;
        this.oldPassword = oldPassword;
    }

    @Override
    protected void onExecute(int conversationNumber, com.google.gwt.user.client.rpc.AsyncCallback<scrum.client.DataTransferObject> callback) {
        if (service==null) {
            service = (scrum.client.ScrumServiceAsync) com.google.gwt.core.client.GWT.create(scrum.client.ScrumService.class);
            initializeService(service, "scrum");
        }
        service.changePassword(conversationNumber, newPassword, oldPassword, callback);
    }

    @Override
    public String toString() {
        return "changePassword";
    }

}