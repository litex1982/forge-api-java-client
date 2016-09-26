/**
 * Forge SDK
 * The Forge Platform contains an expanding collection of web service components that can be used with Autodesk cloud-based products or your own technologies. From visualizing data to 3D printing, take advantage of Autodesk’s expertise in design and engineering.
 *
 * OpenAPI spec version: 0.1.0
 * Contact: forge.help@autodesk.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.model.*;
import io.swagger.client.Pair;
import io.swagger.client.auth.Authentication;
import io.swagger.client.auth.OAuth2ThreeLegged;
import io.swagger.client.auth.ThreeLeggedCredentials;
import io.swagger.client.ApiResponse;

import java.io.File;

import io.swagger.client.model.JsonApiCollection;
import io.swagger.client.model.CreateRef;


import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.ADSKJavaClientCodegen", date = "2016-09-25T18:48:45.159+03:00")
public class FoldersApi {
  private ApiClient apiClient;

  public FoldersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FoldersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 
   * Returns the folder by ID for any folder within a given project. All folders or sub-folders within a project are associated with their own unique ID, including the root folder. 
   * @param projectId the &#x60;project id&#x60; (required)
   * @param folderId the &#x60;folder id&#x60; (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> getFolder(String projectId, String folderId, Authentication auth, ThreeLeggedCredentials credentials) throws ApiException {

    Object localVarPostBody = null;
    
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling getFolder");
    }
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling getFolder");
    }
    
    // create path and map variables
    String localVarPath = "/data/v1/projects/{project_id}/folders/{folder_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
      .replaceAll("\\{" + "folder_id" + "\\}", apiClient.escapeString(folderId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/vnd.api+json", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);


    return apiClient.invokeAPI(auth, credentials, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, null);
  }
  /**
   * 
   * Returns a collection of items and folders within a folder. Items represent word documents, fusion design files, drawings, spreadsheets, etc. 
   * @param projectId the &#x60;project id&#x60; (required)
   * @param folderId the &#x60;folder id&#x60; (required)
   * @param filterType filter by the &#x60;type&#x60; of the &#x60;ref&#x60; target (optional)
   * @param filterId filter by the &#x60;id&#x60; of the &#x60;ref&#x60; target (optional)
   * @param filterExtensionType filter by the extension type (optional)
   * @param pageNumber specify the page number (optional)
   * @param pageLimit specify the maximal number of elements per page (optional)
   * @return JsonApiCollection
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<JsonApiCollection> getFolderContents(String projectId, String folderId, List<String> filterType, List<String> filterId, List<String> filterExtensionType, Integer pageNumber, Integer pageLimit, Authentication auth, ThreeLeggedCredentials credentials) throws ApiException {

    Object localVarPostBody = null;
    
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling getFolderContents");
    }
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling getFolderContents");
    }
    
    // create path and map variables
    String localVarPath = "/data/v1/projects/{project_id}/folders/{folder_id}/contents".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
      .replaceAll("\\{" + "folder_id" + "\\}", apiClient.escapeString(folderId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[type]", filterType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[id]", filterId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[extension.type]", filterExtensionType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    
    
    final String[] localVarAccepts = {
      "application/vnd.api+json", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    GenericType<JsonApiCollection> localVarReturnType = new GenericType<JsonApiCollection>() {};
    return apiClient.invokeAPI(auth, credentials, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarReturnType);
      }
  /**
   * 
   * Returns the parent folder (if it exists). In a project, subfolders and resource items are stored under a folder except the root folder which does not have a parent of its own. 
   * @param projectId the &#x60;project id&#x60; (required)
   * @param folderId the &#x60;folder id&#x60; (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> getFolderParent(String projectId, String folderId, Authentication auth, ThreeLeggedCredentials credentials) throws ApiException {

    Object localVarPostBody = null;
    
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling getFolderParent");
    }
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling getFolderParent");
    }
    
    // create path and map variables
    String localVarPath = "/data/v1/projects/{project_id}/folders/{folder_id}/parent".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
      .replaceAll("\\{" + "folder_id" + "\\}", apiClient.escapeString(folderId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/vnd.api+json", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);


    return apiClient.invokeAPI(auth, credentials, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, null);
  }
  /**
   * 
   * Returns the resources (&#x60;items&#x60;, &#x60;folders&#x60;, and &#x60;versions&#x60;) which have a custom relationship with the given &#x60;folder_id&#x60;. Custom relationships can be established between a folder and other resources within the &#39;data&#39; domain service (folders, items, and versions). 
   * @param projectId the &#x60;project id&#x60; (required)
   * @param folderId the &#x60;folder id&#x60; (required)
   * @param filterType filter by the &#x60;type&#x60; of the &#x60;ref&#x60; target (optional)
   * @param filterId filter by the &#x60;id&#x60; of the &#x60;ref&#x60; target (optional)
   * @param filterExtensionType filter by the extension type (optional)
   * @return JsonApiCollection
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<JsonApiCollection> getFolderRefs(String projectId, String folderId, List<String> filterType, List<String> filterId, List<String> filterExtensionType, Authentication auth, ThreeLeggedCredentials credentials) throws ApiException {

    Object localVarPostBody = null;
    
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling getFolderRefs");
    }
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling getFolderRefs");
    }
    
    // create path and map variables
    String localVarPath = "/data/v1/projects/{project_id}/folders/{folder_id}/refs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
      .replaceAll("\\{" + "folder_id" + "\\}", apiClient.escapeString(folderId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[type]", filterType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[id]", filterId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[extension.type]", filterExtensionType));

    
    
    final String[] localVarAccepts = {
      "application/vnd.api+json", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    GenericType<JsonApiCollection> localVarReturnType = new GenericType<JsonApiCollection>() {};
    return apiClient.invokeAPI(auth, credentials, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarReturnType);
      }
  /**
   * 
   * Returns the custom relationships that are associated to the given &#x60;folder_id&#x60;. Custom relationships can be established between a folder and other resources within the &#39;data&#39; domain service (folders, items, and versions). 
   * @param projectId the &#x60;project id&#x60; (required)
   * @param folderId the &#x60;folder id&#x60; (required)
   * @param filterType filter by the &#x60;type&#x60; of the &#x60;ref&#x60; target (optional)
   * @param filterId filter by the &#x60;id&#x60; of the &#x60;ref&#x60; target (optional)
   * @param filterRefType filter by &#x60;refType&#x60; (optional)
   * @param filterDirection filter by the direction of the reference (optional)
   * @param filterExtensionType filter by the extension type (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> getFolderRelationshipsRefs(String projectId, String folderId, List<String> filterType, List<String> filterId, List<String> filterRefType, String filterDirection, List<String> filterExtensionType, Authentication auth, ThreeLeggedCredentials credentials) throws ApiException {

    Object localVarPostBody = null;
    
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling getFolderRelationshipsRefs");
    }
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling getFolderRelationshipsRefs");
    }
    
    // create path and map variables
    String localVarPath = "/data/v1/projects/{project_id}/folders/{folder_id}/relationships/refs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
      .replaceAll("\\{" + "folder_id" + "\\}", apiClient.escapeString(folderId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[type]", filterType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[id]", filterId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[refType]", filterRefType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[direction]", filterDirection));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[extension.type]", filterExtensionType));

    
    
    final String[] localVarAccepts = {
      "application/vnd.api+json", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(auth, credentials, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarReturnType);
      }
  /**
   * 
   * Creates a custom relationship between a folder and another resource within the &#39;data&#39; domain service (folder, item, or version). 
   * @param projectId the &#x60;project id&#x60; (required)
   * @param folderId the &#x60;folder id&#x60; (required)
   * @param body describe the ref to be created (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> postFolderRelationshipsRef(String projectId, String folderId, CreateRef body, Authentication auth, ThreeLeggedCredentials credentials) throws ApiException {

    Object localVarPostBody = body;
    
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling postFolderRelationshipsRef");
    }
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling postFolderRelationshipsRef");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postFolderRelationshipsRef");
    }
    
    // create path and map variables
    String localVarPath = "/data/v1/projects/{project_id}/folders/{folder_id}/relationships/refs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
      .replaceAll("\\{" + "folder_id" + "\\}", apiClient.escapeString(folderId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/vnd.api+json", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);


    return apiClient.invokeAPI(auth, credentials, localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, null);
  }
}
