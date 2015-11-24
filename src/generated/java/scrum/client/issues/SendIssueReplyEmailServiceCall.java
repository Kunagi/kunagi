// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: ilarkesto.mda.legacy.generator.GwtServiceCallGenerator










package scrum.client.issues;

import java.util.*;

@com.google.gwt.user.client.rpc.RemoteServiceRelativePath("scrum")
public class SendIssueReplyEmailServiceCall
            extends ilarkesto.gwt.client.AServiceCall<scrum.client.DataTransferObject> {

    private static scrum.client.ScrumServiceAsync service;

    java.lang.String issueId;
    java.lang.String from;
    java.lang.String to;
    java.lang.String subject;
    java.lang.String text;

    public SendIssueReplyEmailServiceCall(java.lang.String issueId, java.lang.String from, java.lang.String to, java.lang.String subject, java.lang.String text) {
        this.issueId = issueId;
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.text = text;
    }

    @Override
    protected void onExecute(int conversationNumber, com.google.gwt.user.client.rpc.AsyncCallback<scrum.client.DataTransferObject> callback) {
        if (service==null) {
            service = (scrum.client.ScrumServiceAsync) com.google.gwt.core.client.GWT.create(scrum.client.ScrumService.class);
            initializeService(service, "scrum");
        }
        service.sendIssueReplyEmail(conversationNumber, issueId, from, to, subject, text, callback);
    }

    @Override
    public String toString() {
        return "sendIssueReplyEmail";
    }

}