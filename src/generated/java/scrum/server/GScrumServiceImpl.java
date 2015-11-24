// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: ilarkesto.mda.legacy.generator.GwtServiceImplGenerator










package scrum.server;

import java.util.*;

public abstract class GScrumServiceImpl
            extends ilarkesto.gwt.server.AGwtServiceImpl
            implements scrum.client.ScrumService {

    protected abstract void onUpdateEntities(GwtConversation conversation, java.util.Collection<java.util.Map<String, String>> modified, java.util.Collection<String> deleted);

    @Override
    public scrum.client.DataTransferObject updateEntities(final int conversationNumber, final java.util.Collection<java.util.Map<String, String>> modified, final java.util.Collection<String> deleted) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: updateEntities");
        WebSession session = (WebSession) getSession();
        String threads = ilarkesto.base.Threads.getAllThreadsInfo();
        synchronized (getSyncObject()) {
            if (rt.getRuntime() > 1000) log.warn("ServiceCall updateEntities waited for sync", rt.getRuntimeFormated(), ">>> Threads before:\n", threads, "Threads after:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:updateEntities");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.updateEntities()", new Runnable() { public void run() {

                    onUpdateEntities(conversation, modified, deleted);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "updateEntities", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "updateEntities" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("updateEntities")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"updateEntities", modified, deleted, "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"updateEntities", modified, deleted);
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
        }
    }

    protected abstract void onException(GwtConversation conversation);

    @Override
    public scrum.client.DataTransferObject exception(final int conversationNumber) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: exception");
        WebSession session = (WebSession) getSession();
        String threads = ilarkesto.base.Threads.getAllThreadsInfo();
        synchronized (getSyncObject()) {
            if (rt.getRuntime() > 1000) log.warn("ServiceCall exception waited for sync", rt.getRuntimeFormated(), ">>> Threads before:\n", threads, "Threads after:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:exception");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.exception()", new Runnable() { public void run() {

                    onException(conversation);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "exception", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "exception" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("exception")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"exception", "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"exception");
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
        }
    }

    protected abstract void onChangePassword(GwtConversation conversation, java.lang.String newPassword, java.lang.String oldPassword);

    @Override
    public scrum.client.DataTransferObject changePassword(final int conversationNumber, final java.lang.String newPassword, final java.lang.String oldPassword) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: changePassword");
        WebSession session = (WebSession) getSession();
        String threads = ilarkesto.base.Threads.getAllThreadsInfo();
        synchronized (getSyncObject()) {
            if (rt.getRuntime() > 1000) log.warn("ServiceCall changePassword waited for sync", rt.getRuntimeFormated(), ">>> Threads before:\n", threads, "Threads after:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:changePassword");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.changePassword()", new Runnable() { public void run() {

                    onChangePassword(conversation, newPassword, oldPassword);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "changePassword", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "changePassword" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("changePassword")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"changePassword", newPassword, oldPassword, "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"changePassword", newPassword, oldPassword);
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
        }
    }

    protected abstract void onLogout(GwtConversation conversation);

    @Override
    public scrum.client.DataTransferObject logout(final int conversationNumber) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: logout");
        WebSession session = (WebSession) getSession();
        String threads = ilarkesto.base.Threads.getAllThreadsInfo();
        synchronized (getSyncObject()) {
            if (rt.getRuntime() > 1000) log.warn("ServiceCall logout waited for sync", rt.getRuntimeFormated(), ">>> Threads before:\n", threads, "Threads after:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:logout");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.logout()", new Runnable() { public void run() {

                    onLogout(conversation);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "logout", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "logout" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("logout")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"logout", "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"logout");
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
        }
    }

    protected abstract void onResetPassword(GwtConversation conversation, java.lang.String userId);

    @Override
    public scrum.client.DataTransferObject resetPassword(final int conversationNumber, final java.lang.String userId) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: resetPassword");
        WebSession session = (WebSession) getSession();
        String threads = ilarkesto.base.Threads.getAllThreadsInfo();
        synchronized (getSyncObject()) {
            if (rt.getRuntime() > 1000) log.warn("ServiceCall resetPassword waited for sync", rt.getRuntimeFormated(), ">>> Threads before:\n", threads, "Threads after:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:resetPassword");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.resetPassword()", new Runnable() { public void run() {

                    onResetPassword(conversation, userId);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "resetPassword", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "resetPassword" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("resetPassword")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"resetPassword", userId, "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"resetPassword", userId);
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
        }
    }

    protected abstract void onSendTestEmail(GwtConversation conversation);

    @Override
    public scrum.client.DataTransferObject sendTestEmail(final int conversationNumber) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: sendTestEmail");
        WebSession session = (WebSession) getSession();
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:sendTestEmail");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.sendTestEmail()", new Runnable() { public void run() {

                    onSendTestEmail(conversation);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "sendTestEmail", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "sendTestEmail" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("sendTestEmail")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"sendTestEmail", "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"sendTestEmail");
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
    }

    protected abstract void onTestLdap(GwtConversation conversation);

    @Override
    public scrum.client.DataTransferObject testLdap(final int conversationNumber) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: testLdap");
        WebSession session = (WebSession) getSession();
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:testLdap");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.testLdap()", new Runnable() { public void run() {

                    onTestLdap(conversation);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "testLdap", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "testLdap" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("testLdap")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"testLdap", "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"testLdap");
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
    }

    protected abstract void onUpdateSystemMessage(GwtConversation conversation, scrum.client.admin.SystemMessage systemMessage);

    @Override
    public scrum.client.DataTransferObject updateSystemMessage(final int conversationNumber, final scrum.client.admin.SystemMessage systemMessage) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: updateSystemMessage");
        WebSession session = (WebSession) getSession();
        String threads = ilarkesto.base.Threads.getAllThreadsInfo();
        synchronized (getSyncObject()) {
            if (rt.getRuntime() > 1000) log.warn("ServiceCall updateSystemMessage waited for sync", rt.getRuntimeFormated(), ">>> Threads before:\n", threads, "Threads after:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:updateSystemMessage");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.updateSystemMessage()", new Runnable() { public void run() {

                    onUpdateSystemMessage(conversation, systemMessage);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "updateSystemMessage", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "updateSystemMessage" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("updateSystemMessage")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"updateSystemMessage", systemMessage, "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"updateSystemMessage", systemMessage);
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
        }
    }

    protected abstract void onRequestComments(GwtConversation conversation, java.lang.String parentId);

    @Override
    public scrum.client.DataTransferObject requestComments(final int conversationNumber, final java.lang.String parentId) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: requestComments");
        WebSession session = (WebSession) getSession();
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:requestComments");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.requestComments()", new Runnable() { public void run() {

                    onRequestComments(conversation, parentId);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "requestComments", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "requestComments" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("requestComments")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"requestComments", parentId, "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"requestComments", parentId);
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
    }

    protected abstract void onRequestForum(GwtConversation conversation, boolean all);

    @Override
    public scrum.client.DataTransferObject requestForum(final int conversationNumber, final boolean all) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: requestForum");
        WebSession session = (WebSession) getSession();
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:requestForum");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.requestForum()", new Runnable() { public void run() {

                    onRequestForum(conversation, all);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "requestForum", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "requestForum" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("requestForum")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"requestForum", all, "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"requestForum", all);
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
    }

    protected abstract void onPing(GwtConversation conversation);

    @Override
    public scrum.client.DataTransferObject ping(final int conversationNumber) {
        WebSession session = (WebSession) getSession();
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:ping");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.ping()", new Runnable() { public void run() {

                    onPing(conversation);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "ping", ex, context);
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
    }

    protected abstract void onStartConversation(GwtConversation conversation);

    @Override
    public scrum.client.DataTransferObject startConversation(final int conversationNumber) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: startConversation");
        WebSession session = (WebSession) getSession();
        String threads = ilarkesto.base.Threads.getAllThreadsInfo();
        synchronized (getSyncObject()) {
            if (rt.getRuntime() > 1000) log.warn("ServiceCall startConversation waited for sync", rt.getRuntimeFormated(), ">>> Threads before:\n", threads, "Threads after:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:startConversation");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.startConversation()", new Runnable() { public void run() {

                    onStartConversation(conversation);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "startConversation", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "startConversation" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("startConversation")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"startConversation", "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"startConversation");
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
        }
    }

    protected abstract void onTouchLastActivity(GwtConversation conversation);

    @Override
    public scrum.client.DataTransferObject touchLastActivity(final int conversationNumber) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: touchLastActivity");
        WebSession session = (WebSession) getSession();
        String threads = ilarkesto.base.Threads.getAllThreadsInfo();
        synchronized (getSyncObject()) {
            if (rt.getRuntime() > 1000) log.warn("ServiceCall touchLastActivity waited for sync", rt.getRuntimeFormated(), ">>> Threads before:\n", threads, "Threads after:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:touchLastActivity");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.touchLastActivity()", new Runnable() { public void run() {

                    onTouchLastActivity(conversation);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "touchLastActivity", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "touchLastActivity" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("touchLastActivity")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"touchLastActivity", "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"touchLastActivity");
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
        }
    }

    protected abstract void onRequestEntity(GwtConversation conversation, java.lang.String entityId);

    @Override
    public scrum.client.DataTransferObject requestEntity(final int conversationNumber, final java.lang.String entityId) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: requestEntity");
        WebSession session = (WebSession) getSession();
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:requestEntity");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.requestEntity()", new Runnable() { public void run() {

                    onRequestEntity(conversation, entityId);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "requestEntity", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "requestEntity" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("requestEntity")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"requestEntity", entityId, "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"requestEntity", entityId);
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
    }

    protected abstract void onRequestEntityByReference(GwtConversation conversation, java.lang.String reference);

    @Override
    public scrum.client.DataTransferObject requestEntityByReference(final int conversationNumber, final java.lang.String reference) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: requestEntityByReference");
        WebSession session = (WebSession) getSession();
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:requestEntityByReference");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.requestEntityByReference()", new Runnable() { public void run() {

                    onRequestEntityByReference(conversation, reference);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "requestEntityByReference", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "requestEntityByReference" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("requestEntityByReference")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"requestEntityByReference", reference, "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"requestEntityByReference", reference);
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
    }

    protected abstract void onSleep(GwtConversation conversation, long millis);

    @Override
    public scrum.client.DataTransferObject sleep(final int conversationNumber, final long millis) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: sleep");
        WebSession session = (WebSession) getSession();
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:sleep");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.sleep()", new Runnable() { public void run() {

                    onSleep(conversation, millis);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "sleep", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "sleep" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("sleep")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"sleep", millis, "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"sleep", millis);
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
    }

    protected abstract void onActivateRequirementEstimationVoting(GwtConversation conversation, java.lang.String requirementId);

    @Override
    public scrum.client.DataTransferObject activateRequirementEstimationVoting(final int conversationNumber, final java.lang.String requirementId) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: activateRequirementEstimationVoting");
        WebSession session = (WebSession) getSession();
        String threads = ilarkesto.base.Threads.getAllThreadsInfo();
        synchronized (getSyncObject()) {
            if (rt.getRuntime() > 1000) log.warn("ServiceCall activateRequirementEstimationVoting waited for sync", rt.getRuntimeFormated(), ">>> Threads before:\n", threads, "Threads after:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:activateRequirementEstimationVoting");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.activateRequirementEstimationVoting()", new Runnable() { public void run() {

                    onActivateRequirementEstimationVoting(conversation, requirementId);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "activateRequirementEstimationVoting", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "activateRequirementEstimationVoting" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("activateRequirementEstimationVoting")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"activateRequirementEstimationVoting", requirementId, "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"activateRequirementEstimationVoting", requirementId);
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
        }
    }

    protected abstract void onRequestRequirementEstimationVotes(GwtConversation conversation, java.lang.String requirementId);

    @Override
    public scrum.client.DataTransferObject requestRequirementEstimationVotes(final int conversationNumber, final java.lang.String requirementId) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: requestRequirementEstimationVotes");
        WebSession session = (WebSession) getSession();
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:requestRequirementEstimationVotes");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.requestRequirementEstimationVotes()", new Runnable() { public void run() {

                    onRequestRequirementEstimationVotes(conversation, requirementId);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "requestRequirementEstimationVotes", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "requestRequirementEstimationVotes" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("requestRequirementEstimationVotes")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"requestRequirementEstimationVotes", requirementId, "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"requestRequirementEstimationVotes", requirementId);
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
    }

    protected abstract void onRequestImpediments(GwtConversation conversation);

    @Override
    public scrum.client.DataTransferObject requestImpediments(final int conversationNumber) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: requestImpediments");
        WebSession session = (WebSession) getSession();
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:requestImpediments");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.requestImpediments()", new Runnable() { public void run() {

                    onRequestImpediments(conversation);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "requestImpediments", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "requestImpediments" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("requestImpediments")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"requestImpediments", "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"requestImpediments");
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
    }

    protected abstract void onConvertIssueToStory(GwtConversation conversation, java.lang.String issueId);

    @Override
    public scrum.client.DataTransferObject convertIssueToStory(final int conversationNumber, final java.lang.String issueId) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: convertIssueToStory");
        WebSession session = (WebSession) getSession();
        String threads = ilarkesto.base.Threads.getAllThreadsInfo();
        synchronized (getSyncObject()) {
            if (rt.getRuntime() > 1000) log.warn("ServiceCall convertIssueToStory waited for sync", rt.getRuntimeFormated(), ">>> Threads before:\n", threads, "Threads after:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:convertIssueToStory");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.convertIssueToStory()", new Runnable() { public void run() {

                    onConvertIssueToStory(conversation, issueId);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "convertIssueToStory", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "convertIssueToStory" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("convertIssueToStory")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"convertIssueToStory", issueId, "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"convertIssueToStory", issueId);
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
        }
    }

    protected abstract void onRequestAcceptedIssues(GwtConversation conversation);

    @Override
    public scrum.client.DataTransferObject requestAcceptedIssues(final int conversationNumber) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: requestAcceptedIssues");
        WebSession session = (WebSession) getSession();
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:requestAcceptedIssues");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.requestAcceptedIssues()", new Runnable() { public void run() {

                    onRequestAcceptedIssues(conversation);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "requestAcceptedIssues", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "requestAcceptedIssues" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("requestAcceptedIssues")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"requestAcceptedIssues", "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"requestAcceptedIssues");
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
    }

    protected abstract void onRequestClosedIssues(GwtConversation conversation);

    @Override
    public scrum.client.DataTransferObject requestClosedIssues(final int conversationNumber) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: requestClosedIssues");
        WebSession session = (WebSession) getSession();
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:requestClosedIssues");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.requestClosedIssues()", new Runnable() { public void run() {

                    onRequestClosedIssues(conversation);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "requestClosedIssues", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "requestClosedIssues" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("requestClosedIssues")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"requestClosedIssues", "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"requestClosedIssues");
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
    }

    protected abstract void onRequestReleaseIssues(GwtConversation conversation, java.lang.String releaseId);

    @Override
    public scrum.client.DataTransferObject requestReleaseIssues(final int conversationNumber, final java.lang.String releaseId) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: requestReleaseIssues");
        WebSession session = (WebSession) getSession();
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:requestReleaseIssues");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.requestReleaseIssues()", new Runnable() { public void run() {

                    onRequestReleaseIssues(conversation, releaseId);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "requestReleaseIssues", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "requestReleaseIssues" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("requestReleaseIssues")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"requestReleaseIssues", releaseId, "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"requestReleaseIssues", releaseId);
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
    }

    protected abstract void onSendIssueReplyEmail(GwtConversation conversation, java.lang.String issueId, java.lang.String from, java.lang.String to, java.lang.String subject, java.lang.String text);

    @Override
    public scrum.client.DataTransferObject sendIssueReplyEmail(final int conversationNumber, final java.lang.String issueId, final java.lang.String from, final java.lang.String to, final java.lang.String subject, final java.lang.String text) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: sendIssueReplyEmail");
        WebSession session = (WebSession) getSession();
        String threads = ilarkesto.base.Threads.getAllThreadsInfo();
        synchronized (getSyncObject()) {
            if (rt.getRuntime() > 1000) log.warn("ServiceCall sendIssueReplyEmail waited for sync", rt.getRuntimeFormated(), ">>> Threads before:\n", threads, "Threads after:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:sendIssueReplyEmail");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.sendIssueReplyEmail()", new Runnable() { public void run() {

                    onSendIssueReplyEmail(conversation, issueId, from, to, subject, text);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "sendIssueReplyEmail", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "sendIssueReplyEmail" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("sendIssueReplyEmail")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"sendIssueReplyEmail", issueId, from, to, subject, text, "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"sendIssueReplyEmail", issueId, from, to, subject, text);
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
        }
    }

    protected abstract void onRequestChanges(GwtConversation conversation, java.lang.String parentId);

    @Override
    public scrum.client.DataTransferObject requestChanges(final int conversationNumber, final java.lang.String parentId) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: requestChanges");
        WebSession session = (WebSession) getSession();
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:requestChanges");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.requestChanges()", new Runnable() { public void run() {

                    onRequestChanges(conversation, parentId);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "requestChanges", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "requestChanges" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("requestChanges")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"requestChanges", parentId, "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"requestChanges", parentId);
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
    }

    protected abstract void onRequestProjectEvents(GwtConversation conversation);

    @Override
    public scrum.client.DataTransferObject requestProjectEvents(final int conversationNumber) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: requestProjectEvents");
        WebSession session = (WebSession) getSession();
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:requestProjectEvents");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.requestProjectEvents()", new Runnable() { public void run() {

                    onRequestProjectEvents(conversation);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "requestProjectEvents", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "requestProjectEvents" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("requestProjectEvents")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"requestProjectEvents", "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"requestProjectEvents");
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
    }

    protected abstract void onCloseProject(GwtConversation conversation);

    @Override
    public scrum.client.DataTransferObject closeProject(final int conversationNumber) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: closeProject");
        WebSession session = (WebSession) getSession();
        String threads = ilarkesto.base.Threads.getAllThreadsInfo();
        synchronized (getSyncObject()) {
            if (rt.getRuntime() > 1000) log.warn("ServiceCall closeProject waited for sync", rt.getRuntimeFormated(), ">>> Threads before:\n", threads, "Threads after:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:closeProject");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.closeProject()", new Runnable() { public void run() {

                    onCloseProject(conversation);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "closeProject", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "closeProject" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("closeProject")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"closeProject", "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"closeProject");
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
        }
    }

    protected abstract void onCreateExampleProject(GwtConversation conversation);

    @Override
    public scrum.client.DataTransferObject createExampleProject(final int conversationNumber) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: createExampleProject");
        WebSession session = (WebSession) getSession();
        String threads = ilarkesto.base.Threads.getAllThreadsInfo();
        synchronized (getSyncObject()) {
            if (rt.getRuntime() > 1000) log.warn("ServiceCall createExampleProject waited for sync", rt.getRuntimeFormated(), ">>> Threads before:\n", threads, "Threads after:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:createExampleProject");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.createExampleProject()", new Runnable() { public void run() {

                    onCreateExampleProject(conversation);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "createExampleProject", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "createExampleProject" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("createExampleProject")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"createExampleProject", "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"createExampleProject");
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
        }
    }

    protected abstract void onDeleteStory(GwtConversation conversation, java.lang.String storyId);

    @Override
    public scrum.client.DataTransferObject deleteStory(final int conversationNumber, final java.lang.String storyId) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: deleteStory");
        WebSession session = (WebSession) getSession();
        String threads = ilarkesto.base.Threads.getAllThreadsInfo();
        synchronized (getSyncObject()) {
            if (rt.getRuntime() > 1000) log.warn("ServiceCall deleteStory waited for sync", rt.getRuntimeFormated(), ">>> Threads before:\n", threads, "Threads after:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:deleteStory");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.deleteStory()", new Runnable() { public void run() {

                    onDeleteStory(conversation, storyId);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "deleteStory", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "deleteStory" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("deleteStory")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"deleteStory", storyId, "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"deleteStory", storyId);
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
        }
    }

    protected abstract void onMoveRequirementToProject(GwtConversation conversation, java.lang.String destinationProjectId, java.lang.String requirementId);

    @Override
    public scrum.client.DataTransferObject moveRequirementToProject(final int conversationNumber, final java.lang.String destinationProjectId, final java.lang.String requirementId) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: moveRequirementToProject");
        WebSession session = (WebSession) getSession();
        String threads = ilarkesto.base.Threads.getAllThreadsInfo();
        synchronized (getSyncObject()) {
            if (rt.getRuntime() > 1000) log.warn("ServiceCall moveRequirementToProject waited for sync", rt.getRuntimeFormated(), ">>> Threads before:\n", threads, "Threads after:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:moveRequirementToProject");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.moveRequirementToProject()", new Runnable() { public void run() {

                    onMoveRequirementToProject(conversation, destinationProjectId, requirementId);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "moveRequirementToProject", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "moveRequirementToProject" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("moveRequirementToProject")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"moveRequirementToProject", destinationProjectId, requirementId, "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"moveRequirementToProject", destinationProjectId, requirementId);
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
        }
    }

    protected abstract void onSelectProject(GwtConversation conversation, java.lang.String projectId);

    @Override
    public scrum.client.DataTransferObject selectProject(final int conversationNumber, final java.lang.String projectId) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: selectProject");
        WebSession session = (WebSession) getSession();
        String threads = ilarkesto.base.Threads.getAllThreadsInfo();
        synchronized (getSyncObject()) {
            if (rt.getRuntime() > 1000) log.warn("ServiceCall selectProject waited for sync", rt.getRuntimeFormated(), ">>> Threads before:\n", threads, "Threads after:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:selectProject");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.selectProject()", new Runnable() { public void run() {

                    onSelectProject(conversation, projectId);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "selectProject", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "selectProject" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("selectProject")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"selectProject", projectId, "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"selectProject", projectId);
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
        }
    }

    protected abstract void onUpdateProjectHomepage(GwtConversation conversation);

    @Override
    public scrum.client.DataTransferObject updateProjectHomepage(final int conversationNumber) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: updateProjectHomepage");
        WebSession session = (WebSession) getSession();
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:updateProjectHomepage");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.updateProjectHomepage()", new Runnable() { public void run() {

                    onUpdateProjectHomepage(conversation);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "updateProjectHomepage", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "updateProjectHomepage" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("updateProjectHomepage")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"updateProjectHomepage", "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"updateProjectHomepage");
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
    }

    protected abstract void onPublishRelease(GwtConversation conversation, java.lang.String releaseId);

    @Override
    public scrum.client.DataTransferObject publishRelease(final int conversationNumber, final java.lang.String releaseId) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: publishRelease");
        WebSession session = (WebSession) getSession();
        String threads = ilarkesto.base.Threads.getAllThreadsInfo();
        synchronized (getSyncObject()) {
            if (rt.getRuntime() > 1000) log.warn("ServiceCall publishRelease waited for sync", rt.getRuntimeFormated(), ">>> Threads before:\n", threads, "Threads after:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:publishRelease");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.publishRelease()", new Runnable() { public void run() {

                    onPublishRelease(conversation, releaseId);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "publishRelease", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "publishRelease" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("publishRelease")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"publishRelease", releaseId, "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"publishRelease", releaseId);
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
        }
    }

    protected abstract void onRequestRisks(GwtConversation conversation);

    @Override
    public scrum.client.DataTransferObject requestRisks(final int conversationNumber) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: requestRisks");
        WebSession session = (WebSession) getSession();
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:requestRisks");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.requestRisks()", new Runnable() { public void run() {

                    onRequestRisks(conversation);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "requestRisks", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "requestRisks" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("requestRisks")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"requestRisks", "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"requestRisks");
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
    }

    protected abstract void onSearch(GwtConversation conversation, java.lang.String text);

    @Override
    public scrum.client.DataTransferObject search(final int conversationNumber, final java.lang.String text) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: search");
        WebSession session = (WebSession) getSession();
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:search");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.search()", new Runnable() { public void run() {

                    onSearch(conversation, text);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "search", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "search" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("search")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"search", text, "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"search", text);
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
    }

    protected abstract void onCreateIssueFromTask(GwtConversation conversation, java.lang.String taskId);

    @Override
    public scrum.client.DataTransferObject createIssueFromTask(final int conversationNumber, final java.lang.String taskId) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: createIssueFromTask");
        WebSession session = (WebSession) getSession();
        String threads = ilarkesto.base.Threads.getAllThreadsInfo();
        synchronized (getSyncObject()) {
            if (rt.getRuntime() > 1000) log.warn("ServiceCall createIssueFromTask waited for sync", rt.getRuntimeFormated(), ">>> Threads before:\n", threads, "Threads after:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:createIssueFromTask");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.createIssueFromTask()", new Runnable() { public void run() {

                    onCreateIssueFromTask(conversation, taskId);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "createIssueFromTask", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "createIssueFromTask" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("createIssueFromTask")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"createIssueFromTask", taskId, "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"createIssueFromTask", taskId);
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
        }
    }

    protected abstract void onKickStoryFromSprint(GwtConversation conversation, java.lang.String storyId);

    @Override
    public scrum.client.DataTransferObject kickStoryFromSprint(final int conversationNumber, final java.lang.String storyId) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: kickStoryFromSprint");
        WebSession session = (WebSession) getSession();
        String threads = ilarkesto.base.Threads.getAllThreadsInfo();
        synchronized (getSyncObject()) {
            if (rt.getRuntime() > 1000) log.warn("ServiceCall kickStoryFromSprint waited for sync", rt.getRuntimeFormated(), ">>> Threads before:\n", threads, "Threads after:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:kickStoryFromSprint");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.kickStoryFromSprint()", new Runnable() { public void run() {

                    onKickStoryFromSprint(conversation, storyId);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "kickStoryFromSprint", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "kickStoryFromSprint" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("kickStoryFromSprint")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"kickStoryFromSprint", storyId, "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"kickStoryFromSprint", storyId);
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
        }
    }

    protected abstract void onPullStoryToSprint(GwtConversation conversation, java.lang.String storyId);

    @Override
    public scrum.client.DataTransferObject pullStoryToSprint(final int conversationNumber, final java.lang.String storyId) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: pullStoryToSprint");
        WebSession session = (WebSession) getSession();
        String threads = ilarkesto.base.Threads.getAllThreadsInfo();
        synchronized (getSyncObject()) {
            if (rt.getRuntime() > 1000) log.warn("ServiceCall pullStoryToSprint waited for sync", rt.getRuntimeFormated(), ">>> Threads before:\n", threads, "Threads after:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:pullStoryToSprint");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.pullStoryToSprint()", new Runnable() { public void run() {

                    onPullStoryToSprint(conversation, storyId);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "pullStoryToSprint", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "pullStoryToSprint" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("pullStoryToSprint")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"pullStoryToSprint", storyId, "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"pullStoryToSprint", storyId);
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
        }
    }

    protected abstract void onRequestHistory(GwtConversation conversation);

    @Override
    public scrum.client.DataTransferObject requestHistory(final int conversationNumber) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: requestHistory");
        WebSession session = (WebSession) getSession();
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:requestHistory");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.requestHistory()", new Runnable() { public void run() {

                    onRequestHistory(conversation);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "requestHistory", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "requestHistory" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("requestHistory")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"requestHistory", "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"requestHistory");
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
    }

    protected abstract void onRequestHistorySprint(GwtConversation conversation, java.lang.String sprintId);

    @Override
    public scrum.client.DataTransferObject requestHistorySprint(final int conversationNumber, final java.lang.String sprintId) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: requestHistorySprint");
        WebSession session = (WebSession) getSession();
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:requestHistorySprint");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.requestHistorySprint()", new Runnable() { public void run() {

                    onRequestHistorySprint(conversation, sprintId);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "requestHistorySprint", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "requestHistorySprint" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("requestHistorySprint")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"requestHistorySprint", sprintId, "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"requestHistorySprint", sprintId);
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
    }

    protected abstract void onSwitchToNextSprint(GwtConversation conversation);

    @Override
    public scrum.client.DataTransferObject switchToNextSprint(final int conversationNumber) {
        ilarkesto.core.base.RuntimeTracker rt = new ilarkesto.core.base.RuntimeTracker();
        log.debug("Handling service call: switchToNextSprint");
        WebSession session = (WebSession) getSession();
        String threads = ilarkesto.base.Threads.getAllThreadsInfo();
        synchronized (getSyncObject()) {
            if (rt.getRuntime() > 1000) log.warn("ServiceCall switchToNextSprint waited for sync", rt.getRuntimeFormated(), ">>> Threads before:\n", threads, "Threads after:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            final GwtConversation conversation;
            try {
                conversation = session.getGwtConversation(conversationNumber);
            } catch (Throwable ex) {
                log.info("Getting conversation failed:", conversationNumber);
                scrum.client.DataTransferObject dto = new scrum.client.DataTransferObject();
                dto.addError(new ilarkesto.gwt.client.ErrorWrapper(ex));
                return dto;
            }
            final ilarkesto.di.Context context = ilarkesto.di.Context.get();
            context.setName("gwt-srv:switchToNextSprint");
            context.bindCurrentThread();
            try {
                ilarkesto.core.persistance.Persistence.runInTransaction("GwtService.switchToNextSprint()", new Runnable() { public void run() {

                    onSwitchToNextSprint(conversation);

                }});
                onServiceMethodExecuted(context);
            } catch (Exception ex) {
                handleServiceMethodException(conversationNumber, "switchToNextSprint", ex, context);
            }
            long runtime = rt.getRuntime();
            logRuntime(conversation, "switchToNextSprint" ,runtime);
            if (runtime > getMaxServiceCallExecutionTime("switchToNextSprint")) {
                log.warn("ServiceCall served in", rt.getRuntimeFormated(),"switchToNextSprint", "Threads:\n", ilarkesto.base.Threads.getAllThreadsInfo());
            } else {
                log.info("ServiceCall served in", rt.getRuntimeFormated(),"switchToNextSprint");
            }
            return (scrum.client.DataTransferObject) conversation.popNextData();
        }
    }

}