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

import com.autodesk.client.model.AppPackage;
import com.autodesk.client.model.AppPackageOptional;
import com.autodesk.client.model.AppPackageVersion;


import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AppPackagesApi {
  private ApiClient apiClient;

  public AppPackagesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AppPackagesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Creates an AppPackage module.
   * 
   * @param appPackage  (required)
   * @return AppPackage
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AppPackage> createAppPackage(AppPackage appPackage,  Authentication oauth2, Credentials credentials) throws ApiException, Exception {

    Object localVarPostBody = appPackage;
    
    // verify the required parameter 'appPackage' is set
    if (appPackage == null) {
      throw new ApiException(400, "Missing the required parameter 'appPackage' when calling createAppPackage");
    }
    
    // create path and map variables
    String localVarPath = "/autocad.io/us-east/v2/AppPackages".replaceAll("\\{format\\}","json");

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

    GenericType<AppPackage> localVarReturnType = new GenericType<AppPackage>() {};
    return apiClient.invokeAPI(oauth2, credentials, localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarReturnType);
      }
  /**
   * Removes a specific AppPackage.
   * 
   * @param id  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteAppPackage(String id,  Authentication oauth2, Credentials credentials) throws ApiException, Exception {

    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteAppPackage");
    }
    
    // create path and map variables
    String localVarPath = "/autocad.io/us-east/v2/AppPackages('{id}')".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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


    return apiClient.invokeAPI(oauth2, credentials, localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, null);
  }
  /**
   * Removes the version history of the specified AppPackage.
   * 
   * @param id  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteAppPackageHistory(String id,  Authentication oauth2, Credentials credentials) throws ApiException, Exception {

    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteAppPackageHistory");
    }
    
    // create path and map variables
    String localVarPath = "/autocad.io/us-east/v2/AppPackages('{id}')/Operations.DeleteHistory".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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


    return apiClient.invokeAPI(oauth2, credentials, localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, null);
  }
  /**
   * Returns the details of all AppPackages.
   * 
   * @return List<AppPackage>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<AppPackage>> getAllAppPackages( Authentication oauth2, Credentials credentials) throws ApiException, Exception {

    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/autocad.io/us-east/v2/AppPackages".replaceAll("\\{format\\}","json");

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

    GenericType<List<AppPackage>> localVarReturnType = new GenericType<List<AppPackage>>() {};
    return apiClient.invokeAPI(oauth2, credentials, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarReturnType);
      }
  /**
   * Returns the details of a specific AppPackage.
   * 
   * @param id  (required)
   * @return AppPackage
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AppPackage> getAppPackage(String id,  Authentication oauth2, Credentials credentials) throws ApiException, Exception {

    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getAppPackage");
    }
    
    // create path and map variables
    String localVarPath = "/autocad.io/us-east/v2/AppPackages('{id}')".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    GenericType<AppPackage> localVarReturnType = new GenericType<AppPackage>() {};
    return apiClient.invokeAPI(oauth2, credentials, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarReturnType);
      }
  /**
   * Returns all old versions of a specified AppPackage.
   * 
   * @param id  (required)
   * @return List<AppPackage>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<AppPackage>> getAppPackageVersions(String id,  Authentication oauth2, Credentials credentials) throws ApiException, Exception {

    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getAppPackageVersions");
    }
    
    // create path and map variables
    String localVarPath = "/autocad.io/us-east/v2/AppPackages('{id}')/Operations.GetVersions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    GenericType<List<AppPackage>> localVarReturnType = new GenericType<List<AppPackage>>() {};
    return apiClient.invokeAPI(oauth2, credentials, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarReturnType);
      }
  /**
   * Requests a pre-signed URL for uploading a zip file that contains the binaries for this AppPackage.
   * 
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> getUploadUrl( Authentication oauth2, Credentials credentials) throws ApiException, Exception {

    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/autocad.io/us-east/v2/AppPackages/Operations.GetUploadUrl".replaceAll("\\{format\\}","json");

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


    return apiClient.invokeAPI(oauth2, credentials, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, null);
  }
  /**
   * Requests a pre-signed URL for uploading a zip file that contains the binaries for this AppPackage. Unlike the GetUploadUrl method that takes no parameters, this method allows the client to request that the pre-signed URL to be issued so that the subsequent HTTP PUT operation will require Content-Type&#x3D;binary/octet-stream.
   * 
   * @param require  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> getUploadUrlWithRequireContentType(Boolean require,  Authentication oauth2, Credentials credentials) throws ApiException, Exception {

    Object localVarPostBody = null;
    
    // verify the required parameter 'require' is set
    if (require == null) {
      throw new ApiException(400, "Missing the required parameter 'require' when calling getUploadUrlWithRequireContentType");
    }
    
    // create path and map variables
    String localVarPath = "/autocad.io/us-east/v2/AppPackage/Operations.GetUploadUrl(RequireContentType={require})".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "require" + "\\}", apiClient.escapeString(require.toString()));

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


    return apiClient.invokeAPI(oauth2, credentials, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, null);
  }
  /**
   * Updates an AppPackage by specifying only the changed attributes.
   * 
   * @param id  (required)
   * @param appPackage  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> patchAppPackage(String id, AppPackageOptional appPackage,  Authentication oauth2, Credentials credentials) throws ApiException, Exception {

    Object localVarPostBody = appPackage;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling patchAppPackage");
    }
    
    // verify the required parameter 'appPackage' is set
    if (appPackage == null) {
      throw new ApiException(400, "Missing the required parameter 'appPackage' when calling patchAppPackage");
    }
    
    // create path and map variables
    String localVarPath = "/autocad.io/us-east/v2/AppPackages('{id}')".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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


    return apiClient.invokeAPI(oauth2, credentials, localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, null);
  }
  /**
   * Sets the AppPackage to the specified version.
   * 
   * @param id  (required)
   * @param appPackageVersion  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> setAppPackageVersion(String id, AppPackageVersion appPackageVersion,  Authentication oauth2, Credentials credentials) throws ApiException, Exception {

    Object localVarPostBody = appPackageVersion;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling setAppPackageVersion");
    }
    
    // verify the required parameter 'appPackageVersion' is set
    if (appPackageVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'appPackageVersion' when calling setAppPackageVersion");
    }
    
    // create path and map variables
    String localVarPath = "/autocad.io/us-east/v2/AppPackages('{id}')/Operations.SetVersion".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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


    return apiClient.invokeAPI(oauth2, credentials, localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, null);
  }
  /**
   * Updates an AppPackage by redefining the entire Activity object.
   * 
   * @param id  (required)
   * @param appPackage  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> updateAppPackage(String id, AppPackage appPackage,  Authentication oauth2, Credentials credentials) throws ApiException, Exception {

    Object localVarPostBody = appPackage;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateAppPackage");
    }
    
    // verify the required parameter 'appPackage' is set
    if (appPackage == null) {
      throw new ApiException(400, "Missing the required parameter 'appPackage' when calling updateAppPackage");
    }
    
    // create path and map variables
    String localVarPath = "/autocad.io/us-east/v2/AppPackages('{id}')".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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


    return apiClient.invokeAPI(oauth2, credentials, localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, null);
  }
}
