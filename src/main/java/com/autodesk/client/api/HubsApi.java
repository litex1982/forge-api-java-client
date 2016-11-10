/*
 * Forge SDK
 * The Forge Platform contains an expanding collection of web service components that can be used with Autodesk cloud-based products or your own technologies. Take advantage of Autodesk’s expertise in design and engineering.
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

package com.autodesk.client.api;

import com.sun.jersey.api.client.GenericType;

import com.autodesk.client.ApiException;
import com.autodesk.client.ApiClient;
import com.autodesk.client.Configuration;
import com.autodesk.client.model.*;
import com.autodesk.client.Pair;
import com.autodesk.client.auth.Credentials;
import com.autodesk.client.auth.Authentication;
import com.autodesk.client.ApiResponse;

import java.io.File;

import com.autodesk.client.model.Hub;
import com.autodesk.client.model.Forbidden;
import com.autodesk.client.model.NotFound;
import com.autodesk.client.model.Projects;
import com.autodesk.client.model.Hubs;


import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class HubsApi {
  private ApiClient apiClient;

  public HubsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public HubsApi(ApiClient apiClient) {
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
   * Returns data on a specific &#x60;hub_id&#x60;. 
   * @param hubId the &#x60;hub id&#x60; for the current operation (required)
   * @return Hub
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Hub> getHub(String hubId,  Authentication oauth2, Credentials credentials) throws ApiException, Exception {

    Object localVarPostBody = null;
    
    // verify the required parameter 'hubId' is set
    if (hubId == null) {
      throw new ApiException(400, "Missing the required parameter 'hubId' when calling getHub");
    }
    
    // create path and map variables
    String localVarPath = "/project/v1/hubs/{hub_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "hub_id" + "\\}", apiClient.escapeString(hubId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/vnd.api+json", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/vnd.api+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    GenericType<Hub> localVarReturnType = new GenericType<Hub>() {};
    return apiClient.invokeAPI(oauth2, credentials, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarReturnType);
      }
  /**
   * 
   * Returns a collection of projects for a given &#x60;hub_id&#x60;. A project represents an A360 project or a BIM 360 project which is set up under an A360 hub or BIM 360 account, respectively. Within a hub or an account, multiple projects can be created to be used. 
   * @param hubId the &#x60;hub id&#x60; for the current operation (required)
   * @param filterId filter by the &#x60;id&#x60; of the &#x60;ref&#x60; target (optional)
   * @param filterExtensionType filter by the extension type (optional)
   * @return Projects
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Projects> getHubProjects(String hubId, List<String> filterId, List<String> filterExtensionType,  Authentication oauth2, Credentials credentials) throws ApiException, Exception {

    Object localVarPostBody = null;
    
    // verify the required parameter 'hubId' is set
    if (hubId == null) {
      throw new ApiException(400, "Missing the required parameter 'hubId' when calling getHubProjects");
    }
    
    // create path and map variables
    String localVarPath = "/project/v1/hubs/{hub_id}/projects".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "hub_id" + "\\}", apiClient.escapeString(hubId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[id]", filterId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[extension.type]", filterExtensionType));

    
    
    final String[] localVarAccepts = {
      "application/vnd.api+json", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/vnd.api+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    GenericType<Projects> localVarReturnType = new GenericType<Projects>() {};
    return apiClient.invokeAPI(oauth2, credentials, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarReturnType);
      }
  /**
   * 
   * Returns a collection of accessible hubs for this member. A Hub represents an A360 Team/Personal hub or a BIM 360 account. 
   * @param filterId filter by the &#x60;id&#x60; of the &#x60;ref&#x60; target (optional)
   * @param filterExtensionType filter by the extension type (optional)
   * @return Hubs
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Hubs> getHubs(List<String> filterId, List<String> filterExtensionType,  Authentication oauth2, Credentials credentials) throws ApiException, Exception {

    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/project/v1/hubs".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[id]", filterId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[extension.type]", filterExtensionType));

    
    
    final String[] localVarAccepts = {
      "application/vnd.api+json", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/vnd.api+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    GenericType<Hubs> localVarReturnType = new GenericType<Hubs>() {};
    return apiClient.invokeAPI(oauth2, credentials, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarReturnType);
      }
}
