package cronapi.watson.conversation;

import com.ibm.watson.developer_cloud.conversation.v1.Conversation;
import com.ibm.watson.developer_cloud.conversation.v1.model.Counterexample;
import com.ibm.watson.developer_cloud.conversation.v1.model.CounterexampleCollection;
import com.ibm.watson.developer_cloud.conversation.v1.model.CreateCounterexampleOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.CreateDialogNodeOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.CreateEntityOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.CreateExampleOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.CreateIntentOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.CreateSynonymOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.CreateValueOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.CreateWorkspaceOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.DeleteCounterexampleOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.DeleteDialogNodeOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.DeleteEntityOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.DeleteExampleOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.DeleteIntentOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.DeleteSynonymOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.DeleteValueOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.DeleteWorkspaceOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.DialogNode;
import com.ibm.watson.developer_cloud.conversation.v1.model.DialogNodeCollection;
import com.ibm.watson.developer_cloud.conversation.v1.model.Entity;
import com.ibm.watson.developer_cloud.conversation.v1.model.EntityCollection;
import com.ibm.watson.developer_cloud.conversation.v1.model.EntityExport;
import com.ibm.watson.developer_cloud.conversation.v1.model.Example;
import com.ibm.watson.developer_cloud.conversation.v1.model.ExampleCollection;
import com.ibm.watson.developer_cloud.conversation.v1.model.GetCounterexampleOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.GetDialogNodeOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.GetEntityOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.GetExampleOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.GetIntentOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.GetSynonymOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.GetValueOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.GetWorkspaceOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.Intent;
import com.ibm.watson.developer_cloud.conversation.v1.model.IntentCollection;
import com.ibm.watson.developer_cloud.conversation.v1.model.IntentExport;
import com.ibm.watson.developer_cloud.conversation.v1.model.ListAllLogsOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.ListCounterexamplesOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.ListDialogNodesOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.ListEntitiesOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.ListExamplesOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.ListIntentsOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.ListLogsOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.ListSynonymsOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.ListValuesOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.ListWorkspacesOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.LogCollection;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageResponse;
import com.ibm.watson.developer_cloud.conversation.v1.model.Synonym;
import com.ibm.watson.developer_cloud.conversation.v1.model.SynonymCollection;
import com.ibm.watson.developer_cloud.conversation.v1.model.UpdateCounterexampleOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.UpdateDialogNodeOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.UpdateEntityOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.UpdateExampleOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.UpdateIntentOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.UpdateSynonymOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.UpdateValueOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.UpdateWorkspaceOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.Value;
import com.ibm.watson.developer_cloud.conversation.v1.model.ValueCollection;
import com.ibm.watson.developer_cloud.conversation.v1.model.ValueExport;
import com.ibm.watson.developer_cloud.conversation.v1.model.Workspace;
import com.ibm.watson.developer_cloud.conversation.v1.model.WorkspaceCollection;
import com.ibm.watson.developer_cloud.conversation.v1.model.WorkspaceExport;
import cronapi.CronapiMetaData;
import java.util.Map;

@CronapiMetaData
public final class ConversationOperations {

  @CronapiMetaData
  public static Workspace createWorkspace(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, CreateWorkspaceOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.createWorkspace(options).execute();
  }

  @CronapiMetaData
  public static void deleteWorkspace(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, DeleteWorkspaceOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    service.deleteWorkspace(options).execute();
  }

  @CronapiMetaData
  public static WorkspaceExport getWorkspace(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, GetWorkspaceOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getWorkspace(options).execute();
  }

  @CronapiMetaData
  public static WorkspaceCollection listWorkspaces(String versionDate, String username,
      String password, String endPoint,
      Map<String, String> headers, ListWorkspacesOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listWorkspaces(options).execute();
  }

  @CronapiMetaData
  public static Workspace updateWorkspace(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, UpdateWorkspaceOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.updateWorkspace(options).execute();
  }

  @CronapiMetaData
  public static MessageResponse message(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, MessageOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.message(options).execute();
  }

  @CronapiMetaData
  public static Intent createIntent(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, CreateIntentOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.createIntent(options).execute();
  }

  @CronapiMetaData
  public static Void deleteIntent(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, DeleteIntentOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.deleteIntent(options).execute();
  }

  @CronapiMetaData
  public static IntentExport getIntent(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, GetIntentOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getIntent(options).execute();
  }

  @CronapiMetaData
  public static IntentCollection listIntents(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, ListIntentsOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listIntents(options).execute();
  }

  @CronapiMetaData
  public static Intent updateIntent(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, UpdateIntentOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.updateIntent(options).execute();
  }

  @CronapiMetaData
  public static Example createExample(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, CreateExampleOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.createExample(options).execute();
  }

  @CronapiMetaData
  public static Void deleteExample(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, DeleteExampleOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.deleteExample(options).execute();
  }

  @CronapiMetaData
  public static Example getExample(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, GetExampleOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getExample(options).execute();
  }

  @CronapiMetaData
  public static ExampleCollection listExamples(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, ListExamplesOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listExamples(options).execute();
  }

  @CronapiMetaData
  public static Example updateExample(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, UpdateExampleOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.updateExample(options).execute();
  }

  @CronapiMetaData
  public static Entity createEntity(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, CreateEntityOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.createEntity(options).execute();
  }

  @CronapiMetaData
  public static void deleteEntity(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, DeleteEntityOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    service.deleteEntity(options).execute();
  }

  @CronapiMetaData
  public static EntityExport getEntity(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, GetEntityOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getEntity(options).execute();
  }

  @CronapiMetaData
  public static EntityCollection listEntities(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, ListEntitiesOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listEntities(options).execute();
  }

  @CronapiMetaData
  public static Entity updateEntity(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, UpdateEntityOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.updateEntity(options).execute();
  }

  @CronapiMetaData
  public static Value createValue(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, CreateValueOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.createValue(options).execute();
  }

  @CronapiMetaData
  public static void deleteValue(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, DeleteValueOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    service.deleteValue(options).execute();
  }

  @CronapiMetaData
  public static ValueExport getValue(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, GetValueOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getValue(options).execute();
  }

  @CronapiMetaData
  public static ValueCollection listValues(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, ListValuesOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listValues(options).execute();
  }

  @CronapiMetaData
  public static Value updateValue(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, UpdateValueOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.updateValue(options).execute();
  }

  @CronapiMetaData
  public static Synonym createSynonym(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, CreateSynonymOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.createSynonym(options).execute();
  }

  @CronapiMetaData
  public static void deleteSynonym(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, DeleteSynonymOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    service.deleteSynonym(options).execute();
  }

  @CronapiMetaData
  public static Synonym getSynonym(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, GetSynonymOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getSynonym(options).execute();
  }

  @CronapiMetaData
  public static SynonymCollection listSynonyms(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, ListSynonymsOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listSynonyms(options).execute();
  }

  @CronapiMetaData
  public static Synonym updateSynonym(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, UpdateSynonymOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.updateSynonym(options).execute();
  }

  @CronapiMetaData
  public static DialogNode createDialogNode(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, CreateDialogNodeOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.createDialogNode(options).execute();
  }

  @CronapiMetaData
  public static Void deleteDialogNode(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, DeleteDialogNodeOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.deleteDialogNode(options).execute();
  }

  @CronapiMetaData
  public static DialogNode getDialogNode(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, GetDialogNodeOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getDialogNode(options).execute();
  }

  @CronapiMetaData
  public static DialogNodeCollection listDialogNodes(String versionDate, String username,
      String password, String endPoint,
      Map<String, String> headers, ListDialogNodesOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listDialogNodes(options).execute();
  }

  @CronapiMetaData
  public static DialogNode updateDialogNode(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, UpdateDialogNodeOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.updateDialogNode(options).execute();
  }

  @CronapiMetaData
  public static LogCollection listAllLogs(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, ListAllLogsOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listAllLogs(options).execute();
  }

  @CronapiMetaData
  public static LogCollection listLogs(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, ListLogsOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listLogs(options).execute();
  }

  @CronapiMetaData
  public static Counterexample createCounterexample(String versionDate, String username,
      String password, String endPoint,
      Map<String, String> headers, CreateCounterexampleOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.createCounterexample(options).execute();
  }

  @CronapiMetaData
  public static void deleteCounterexample(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, DeleteCounterexampleOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    service.deleteCounterexample(options).execute();
  }


  @CronapiMetaData
  public static Counterexample getCounterexample(String versionDate, String username,
      String password, String endPoint,
      Map<String, String> headers, GetCounterexampleOptions options) {

    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getCounterexample(options).execute();
  }

  @CronapiMetaData
  public static CounterexampleCollection listCounterexamples(String versionDate, String username,
      String password, String endPoint,
      Map<String, String> headers, ListCounterexamplesOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listCounterexamples(options).execute();
  }

  @CronapiMetaData
  public static Counterexample updateCounterexample(String versionDate, String username,
      String password, String endPoint,
      Map<String, String> headers, UpdateCounterexampleOptions options) {

    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.updateCounterexample(options).execute();
  }
}
