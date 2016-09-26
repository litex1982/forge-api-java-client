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

import io.swagger.client.model.CreateItem;
import io.swagger.client.model.CreateStorage;
import io.swagger.client.model.CreateVersion;


import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.ADSKJavaClientCodegen", date = "2016-09-25T18:48:45.159+03:00")
public class ProjectsApi {
  private ApiClient apiClient;

  public ProjectsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProjectsApi(ApiClient apiClient) {
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
   * Returns a project for a given &#x60;project_id&#x60;. 
   * @param hubId the &#x60;hub id&#x60; for the current operation (required)
   * @param projectId the &#x60;project id&#x60; (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> getProject(String hubId, String projectId, Authentication auth, ThreeLeggedCredentials credentials) throws ApiException {

    Object localVarPostBody = null;
    
    // verify the required parameter 'hubId' is set
    if (hubId == null) {
      throw new ApiException(400, "Missing the required parameter 'hubId' when calling getProject");
    }
    
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling getProject");
    }
    
    // create path and map variables
    String localVarPath = "/project/v1/hubs/{hub_id}/projects/{project_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "hub_id" + "\\}", apiClient.escapeString(hubId.toString()))
      .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

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
   * Returns health information for the &#x60;project&#x60; domain. The health check assesses the current working status of the &#39;project&#39; domain service. 
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> getProjectHealth(Authentication auth, ThreeLeggedCredentials credentials) throws ApiException {

    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/project/v1/health".replaceAll("\\{format\\}","json");

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
   * Returns the hub for a given &#x60;project_id&#x60;. 
   * @param hubId the &#x60;hub id&#x60; for the current operation (required)
   * @param projectId the &#x60;project id&#x60; (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> getProjectHub(String hubId, String projectId, Authentication auth, ThreeLeggedCredentials credentials) throws ApiException {

    Object localVarPostBody = null;
    
    // verify the required parameter 'hubId' is set
    if (hubId == null) {
      throw new ApiException(400, "Missing the required parameter 'hubId' when calling getProjectHub");
    }
    
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling getProjectHub");
    }
    
    // create path and map variables
    String localVarPath = "/project/v1/hubs/{hub_id}/projects/{project_id}/hub".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "hub_id" + "\\}", apiClient.escapeString(hubId.toString()))
      .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

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
   * Creates a new item in the &#39;data&#39; domain service. 
   * @param projectId the &#x60;project id&#x60; (required)
   * @param body describe the item to be created (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> postItem(String projectId, CreateItem body, Authentication auth, ThreeLeggedCredentials credentials) throws ApiException {

    Object localVarPostBody = body;
    
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling postItem");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postItem");
    }
    
    // create path and map variables
    String localVarPath = "/data/v1/projects/{project_id}/items".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(auth, credentials, localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarReturnType);
      }
  /**
   * 
   * Creates a storage location in the OSS where data can be uploaded to. 
   * @param projectId the &#x60;project id&#x60; (required)
   * @param body describe the file the storage is created for (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> postStorage(String projectId, CreateStorage body, Authentication auth, ThreeLeggedCredentials credentials) throws ApiException {

    Object localVarPostBody = body;
    
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling postStorage");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postStorage");
    }
    
    // create path and map variables
    String localVarPath = "/data/v1/projects/{project_id}/storage".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(auth, credentials, localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarReturnType);
      }
  /**
   * 
   * Creates a new version of an item in the &#39;data&#39; domain service. 
   * @param projectId the &#x60;project id&#x60; (required)
   * @param body describe the version to be created (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> postVersion(String projectId, CreateVersion body, Authentication auth, ThreeLeggedCredentials credentials) throws ApiException {

    Object localVarPostBody = body;
    
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling postVersion");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postVersion");
    }
    
    // create path and map variables
    String localVarPath = "/data/v1/projects/{project_id}/versions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(auth, credentials, localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarReturnType);
      }
}
