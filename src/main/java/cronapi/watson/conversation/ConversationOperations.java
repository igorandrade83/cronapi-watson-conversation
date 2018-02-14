package cronapi.watson.conversation;

import com.ibm.watson.developer_cloud.conversation.v1.Conversation;
import com.ibm.watson.developer_cloud.conversation.v1.model.*;
import cronapi.CronapiMetaData;

import java.util.Map;

@CronapiMetaData(categoryName = "Watson Conversation", categoryTags = {"Watson", "Conversation"})
public final class ConversationOperations {

  @CronapiMetaData(
      name = "{{createWorkspaceName}}",
      description = "{{createWorkspaceDescription}}"
  )
  public static Workspace createWorkspace(String versionDate, String username, String password, String endPoint,
                                          Map<String, String> headers, CreateWorkspaceOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.createWorkspace(options).execute();
  }

  @CronapiMetaData(
      name = "{{deleteWorkspaceName}}",
      description = "{{deleteWorkspaceDescription}}"
  )
  public static void deleteWorkspace(String versionDate, String username, String password, String endPoint,
                                     Map<String, String> headers, DeleteWorkspaceOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    service.deleteWorkspace(options).execute();
  }

  @CronapiMetaData(
      name = "{{getWorkspaceName}}",
      description = "{{getWorkspaceDescription}}"
  )
  public static WorkspaceExport getWorkspace(String versionDate, String username, String password, String endPoint,
                                             Map<String, String> headers, GetWorkspaceOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getWorkspace(options).execute();
  }

  @CronapiMetaData(
      name = "{{listWorkspacesName}}",
      description = "{{listWorkspacesDescription}}"
  )
  public static WorkspaceCollection listWorkspaces(String versionDate, String username, String password, String endPoint,
                                                   Map<String, String> headers, ListWorkspacesOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listWorkspaces(options).execute();
  }

  @CronapiMetaData(
      name = "{{updateWorkspaceName}}",
      description = "{{updateWorkspaceDescription}}"
  )
  public static Workspace updateWorkspace(String versionDate, String username, String password, String endPoint,
                                          Map<String, String> headers, UpdateWorkspaceOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.updateWorkspace(options).execute();
  }

  @CronapiMetaData(
      name = "{{messageName}}",
      description = "{{messageDescription}}"
  )
  public static MessageResponse message(String versionDate, String username, String password, String endPoint,
                                        Map<String, String> headers, MessageOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.message(options).execute();
  }

  @CronapiMetaData(
      name = "{{createIntentName}}",
      description = "{{createIntentDescription}}"
  )
  public static Intent createIntent(String versionDate, String username, String password, String endPoint,
                                    Map<String, String> headers, CreateIntentOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.createIntent(options).execute();
  }

  @CronapiMetaData(
      name = "{{deleteIntentName}}",
      description = "{{deleteIntentDescription}}"
  )
  public static Void deleteIntent(String versionDate, String username, String password, String endPoint,
                                  Map<String, String> headers, DeleteIntentOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.deleteIntent(options).execute();
  }

  @CronapiMetaData(
      name = "{{getIntentName}}",
      description = "{{getIntentDescription}}"
  )
  public static IntentExport getIntent(String versionDate, String username, String password, String endPoint,
                                       Map<String, String> headers, GetIntentOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getIntent(options).execute();
  }

  @CronapiMetaData(
      name = "{{listIntentsName}}",
      description = "{{listIntentsDescription}}"
  )
  public static IntentCollection listIntents(String versionDate, String username, String password, String endPoint,
                                             Map<String, String> headers, ListIntentsOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listIntents(options).execute();
  }

  @CronapiMetaData(
      name = "{{updateIntentName}}",
      description = "{{updateIntentDescription}}"
  )
  public static Intent updateIntent(String versionDate, String username, String password, String endPoint,
                                    Map<String, String> headers, UpdateIntentOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.updateIntent(options).execute();
  }

  @CronapiMetaData(
      name = "{{createExampleName}}",
      description = "{{createExampleDescription}}"
  )
  public static Example createExample(String versionDate, String username, String password, String endPoint,
                                      Map<String, String> headers, CreateExampleOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.createExample(options).execute();
  }

  @CronapiMetaData(
      name = "{{deleteExampleName}}",
      description = "{{deleteExampleDescription}}"
  )
  public static Void deleteExample(String versionDate, String username, String password, String endPoint,
                                   Map<String, String> headers, DeleteExampleOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.deleteExample(options).execute();
  }

  @CronapiMetaData(
      name = "{{getExampleName}}",
      description = "{{getExampleDescription}}"
  )
  public static Example getExample(String versionDate, String username, String password, String endPoint,
                                   Map<String, String> headers, GetExampleOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getExample(options).execute();
  }

  @CronapiMetaData(
      name = "{{listExamplesName}}",
      description = "{{listExamplesDescription}}"
  )
  public static ExampleCollection listExamples(String versionDate, String username, String password, String endPoint,
                                               Map<String, String> headers, ListExamplesOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listExamples(options).execute();
  }

  @CronapiMetaData(
      name = "{{updateExampleName}}",
      description = "{{updateExampleDescription}}"
  )
  public static Example updateExample(String versionDate, String username, String password, String endPoint,
                                      Map<String, String> headers, UpdateExampleOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.updateExample(options).execute();
  }

  @CronapiMetaData(
      name = "{{createEntityName}}",
      description = "{{createEntityDescription}}"
  )
  public static Entity createEntity(String versionDate, String username, String password, String endPoint,
                                    Map<String, String> headers, CreateEntityOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.createEntity(options).execute();
  }

  @CronapiMetaData(
      name = "{{deleteEntityName}}",
      description = "{{deleteEntityDescription}}"
  )
  public static void deleteEntity(String versionDate, String username, String password, String endPoint,
                                  Map<String, String> headers, DeleteEntityOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    service.deleteEntity(options).execute();
  }

  @CronapiMetaData(
      name = "{{getEntityName}}",
      description = "{{getEntityDescription}}"
  )
  public static EntityExport getEntity(String versionDate, String username, String password, String endPoint,
                                       Map<String, String> headers, GetEntityOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getEntity(options).execute();
  }

  @CronapiMetaData(
      name = "{{listEntitiesName}}",
      description = "{{listEntitiesDescription}}"
  )
  public static EntityCollection listEntities(String versionDate, String username, String password, String endPoint,
                                              Map<String, String> headers, ListEntitiesOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listEntities(options).execute();
  }

  @CronapiMetaData(
      name = "{{updateEntityName}}",
      description = "{{updateEntityDescription}}"
  )
  public static Entity updateEntity(String versionDate, String username, String password, String endPoint,
                                    Map<String, String> headers, UpdateEntityOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.updateEntity(options).execute();
  }

  @CronapiMetaData(
      name = "{{createValueName}}",
      description = "{{createValueDescription}}"
  )
  public static Value createValue(String versionDate, String username, String password, String endPoint,
                                  Map<String, String> headers, CreateValueOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.createValue(options).execute();
  }

  @CronapiMetaData(
      name = "{{deleteValueName}}",
      description = "{{deleteValueDescription}}"
  )
  public static void deleteValue(String versionDate, String username, String password, String endPoint,
                                 Map<String, String> headers, DeleteValueOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    service.deleteValue(options).execute();
  }

  @CronapiMetaData(
      name = "{{getValueName}}",
      description = "{{getValueDescription}}"
  )
  public static ValueExport getValue(String versionDate, String username, String password, String endPoint,
                                     Map<String, String> headers, GetValueOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getValue(options).execute();
  }

  @CronapiMetaData(
      name = "{{listValuesName}}",
      description = "{{listValuesDescription}}"
  )
  public static ValueCollection listValues(String versionDate, String username, String password, String endPoint,
                                           Map<String, String> headers, ListValuesOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listValues(options).execute();
  }

  @CronapiMetaData(
      name = "{{updateValueName}}",
      description = "{{updateValueDescription}}"
  )
  public static Value updateValue(String versionDate, String username, String password, String endPoint,
                                  Map<String, String> headers, UpdateValueOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.updateValue(options).execute();
  }

  @CronapiMetaData(
      name = "{{createSynonymName}}",
      description = "{{createSynonymDescription}}"
  )
  public static Synonym createSynonym(String versionDate, String username, String password, String endPoint,
                                      Map<String, String> headers, CreateSynonymOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.createSynonym(options).execute();
  }

  @CronapiMetaData(
      name = "{{deleteSynonymName}}",
      description = "{{deleteSynonymDescription}}"
  )
  public static void deleteSynonym(String versionDate, String username, String password, String endPoint,
                                   Map<String, String> headers, DeleteSynonymOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    service.deleteSynonym(options).execute();
  }

  @CronapiMetaData(
      name = "{{getSynonymName}}",
      description = "{{getSynonymDescription}}"
  )
  public static Synonym getSynonym(String versionDate, String username, String password, String endPoint,
                                   Map<String, String> headers, GetSynonymOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getSynonym(options).execute();
  }

  @CronapiMetaData(
      name = "{{listSynonymsName}}",
      description = "{{listSynonymsDescription}}"
  )
  public static SynonymCollection listSynonyms(String versionDate, String username, String password, String endPoint,
                                               Map<String, String> headers, ListSynonymsOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listSynonyms(options).execute();
  }

  @CronapiMetaData(
      name = "{{updateSynonymName}}",
      description = "{{updateSynonymDescription}}"
  )
  public static Synonym updateSynonym(String versionDate, String username, String password, String endPoint,
                                      Map<String, String> headers, UpdateSynonymOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.updateSynonym(options).execute();
  }

  @CronapiMetaData(
      name = "{{createDialogNodeName}}",
      description = "{{createDialogNodeDescription}}"
  )
  public static DialogNode createDialogNode(String versionDate, String username, String password, String endPoint,
                                            Map<String, String> headers, CreateDialogNodeOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.createDialogNode(options).execute();
  }

  @CronapiMetaData(
      name = "{{deleteDialogNodeName}}",
      description = "{{deleteDialogNodeDescription}}"
  )
  public static Void deleteDialogNode(String versionDate, String username, String password, String endPoint,
                                      Map<String, String> headers, DeleteDialogNodeOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.deleteDialogNode(options).execute();
  }

  @CronapiMetaData(
      name = "{{getDialogNodeName}}",
      description = "{{getDialogNodeDescription}}"
  )
  public static DialogNode getDialogNode(String versionDate, String username, String password, String endPoint,
                                         Map<String, String> headers, GetDialogNodeOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getDialogNode(options).execute();
  }

  @CronapiMetaData(
      name = "{{listDialogNodesName}}",
      description = "{{listDialogNodesDescription}}"
  )
  public static DialogNodeCollection listDialogNodes(String versionDate, String username, String password, String endPoint,
                                                     Map<String, String> headers, ListDialogNodesOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listDialogNodes(options).execute();
  }

  @CronapiMetaData(
      name = "{{updateDialogNodeName}}",
      description = "{{updateDialogNodeDescription}}"
  )
  public static DialogNode updateDialogNode(String versionDate, String username, String password, String endPoint,
                                            Map<String, String> headers, UpdateDialogNodeOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.updateDialogNode(options).execute();
  }

  @CronapiMetaData(
      name = "{{listAllLogsName}}",
      description = "{{listAllLogsDescription}}"
  )
  public static LogCollection listAllLogs(String versionDate, String username, String password, String endPoint,
                                          Map<String, String> headers, ListAllLogsOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listAllLogs(options).execute();
  }

  @CronapiMetaData(
      name = "{{listLogsName}}",
      description = "{{listLogsDescription}}"
  )
  public static LogCollection listLogs(String versionDate, String username, String password, String endPoint,
                                       Map<String, String> headers, ListLogsOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listLogs(options).execute();
  }

  @CronapiMetaData(
      name = "{{createCounterexampleName}}",
      description = "{{createCounterexampleDescription}}"
  )
  public static Counterexample createCounterexample(String versionDate, String username, String password, String endPoint,
                                                    Map<String, String> headers, CreateCounterexampleOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.createCounterexample(options).execute();
  }

  @CronapiMetaData(
      name = "{{deleteCounterexampleName}}",
      description = "{{deleteCounterexampleDescription}}"
  )
  public static void deleteCounterexample(String versionDate, String username, String password, String endPoint,
                                          Map<String, String> headers, DeleteCounterexampleOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    service.deleteCounterexample(options).execute();
  }


  @CronapiMetaData(
      name = "{{getCounterexampleName}}",
      description = "{{getCounterexampleDescription}}"
  )
  public static Counterexample getCounterexample(String versionDate, String username, String password, String endPoint,
                                                 Map<String, String> headers, GetCounterexampleOptions options) {

    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getCounterexample(options).execute();
  }

  @CronapiMetaData(
      name = "{{listCounterexamplesName}}",
      description = "{{listCounterexamplesDescription}}"
  )
  public static CounterexampleCollection listCounterexamples(String versionDate, String username, String password, String endPoint,
                                                             Map<String, String> headers, ListCounterexamplesOptions options) {
    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listCounterexamples(options).execute();
  }

  @CronapiMetaData(
      name = "{{updateCounterexampleName}}",
      description = "{{updateCounterexampleDescription}}"
  )
  public static Counterexample updateCounterexample(String versionDate, String username, String password, String endPoint,
                                                    Map<String, String> headers, UpdateCounterexampleOptions options) {

    Conversation service = new Conversation(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.updateCounterexample(options).execute();
  }
}
