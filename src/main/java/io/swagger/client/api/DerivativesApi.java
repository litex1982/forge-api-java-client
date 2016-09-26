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

import io.swagger.client.model.Diagnostics;
import io.swagger.client.model.Result;
import io.swagger.client.model.Formats;
import java.util.Date;
import io.swagger.client.model.Manifest;
import io.swagger.client.model.Metadata;
import io.swagger.client.model.InputStream;
import io.swagger.client.model.Job;
import io.swagger.client.model.JobPayload;


import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.ADSKJavaClientCodegen", date = "2016-09-25T18:48:45.159+03:00")
public class DerivativesApi {
  private ApiClient apiClient;

  public DerivativesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DerivativesApi(ApiClient apiClient) {
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
   * Deletes the manifest and all its translated output files (derivatives). However, it does not delete the design source file. 
   * @param urn The Base64 (URL Safe) encoded design URN  (required)
   * @return Result
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Result> deleteManifest(String urn, Authentication auth, ThreeLeggedCredentials credentials) throws ApiException {

    Object localVarPostBody = null;
    
    // verify the required parameter 'urn' is set
    if (urn == null) {
      throw new ApiException(400, "Missing the required parameter 'urn' when calling deleteManifest");
    }
    
    // create path and map variables
    String localVarPath = "/modelderivative/v2/designdata/{urn}/manifest".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "urn" + "\\}", apiClient.escapeString(urn.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/vnd.api+json", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI(auth, credentials, localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarReturnType);
      }
  /**
   * 
   * Downloads a selected derivative. To download the file, you need to specify the file’s URN, which you retrieve by calling the [GET {urn}/manifest](https://developer.autodesk.com/en/docs/model-derivative/v2/reference/http/urn-manifest-GET) endpoint.  Note that the Model Derivative API uses 2 types of URNs. The **design URN** is generated when you upload the source design file to Forge, and is used when calling most of the Model Derivative endpoints. A **derivative URN** is generated for each translated output file format, and is used for downloading the output design files.  You can set the range of bytes that are returned when downloading the derivative, using the range header. 
   * @param urn The Base64 (URL Safe) encoded design URN  (required)
   * @param derivativeUrn The URL-encoded URN of the derivatives. The URN is retrieved from the GET :urn/manifest endpoint.  (required)
   * @param range This is the standard RFC 2616 range request header. It only supports one range specifier per request: 1. Range:bytes&#x3D;0-63 (returns the first 64 bytes) 2. Range:bytes&#x3D;64-127 (returns the second set of 64 bytes) 3. Range:bytes&#x3D;1022- (returns all the bytes from offset 1022 to the end) 4. If the range header is not specified, the whole content is returned.  (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> getDerivativeManifest(String urn, String derivativeUrn, Integer range, Authentication auth, ThreeLeggedCredentials credentials) throws ApiException {

    Object localVarPostBody = null;
    
    // verify the required parameter 'urn' is set
    if (urn == null) {
      throw new ApiException(400, "Missing the required parameter 'urn' when calling getDerivativeManifest");
    }
    
    // verify the required parameter 'derivativeUrn' is set
    if (derivativeUrn == null) {
      throw new ApiException(400, "Missing the required parameter 'derivativeUrn' when calling getDerivativeManifest");
    }
    
    // create path and map variables
    String localVarPath = "/modelderivative/v2/designdata/{urn}/manifest/{derivativeUrn}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "urn" + "\\}", apiClient.escapeString(urn.toString()))
      .replaceAll("\\{" + "derivativeUrn" + "\\}", apiClient.escapeString(derivativeUrn.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (range != null)
      localVarHeaderParams.put("Range", apiClient.parameterToString(range));

    
    final String[] localVarAccepts = {
      "application/octet-stream"
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
   * Returns an up-to-date list of Forge-supported translations, that you can use to identify which types of derivatives are supported for each source file type. You can set this endpoint to only return the list of supported translations if they have been updated since a specified date.  See the [Supported Translation Formats table](https://developer.autodesk.com/en/docs/model-derivative/v2/overview/supported-translations) for more details about supported translations.  Note that we are constantly adding new file formats to the list of Forge translations. 
   * @param ifModifiedSince The supported formats are only returned if they were modified since the specified date. An invalid date returns the latest supported format list. If the supported formats have not been modified since the specified date, the endpoint returns a &#x60;NOT MODIFIED&#x60; (304) response.  (optional)
   * @param acceptEncoding If specified with &#x60;gzip&#x60; or &#x60;*&#x60;, content will be compressed and returned in a GZIP format.  (optional)
   * @return Formats
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Formats> getFormats(Date ifModifiedSince, String acceptEncoding, Authentication auth, ThreeLeggedCredentials credentials) throws ApiException {

    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/modelderivative/v2/designdata/formats".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (ifModifiedSince != null)
      localVarHeaderParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));
if (acceptEncoding != null)
      localVarHeaderParams.put("Accept-Encoding", apiClient.parameterToString(acceptEncoding));

    
    final String[] localVarAccepts = {
      "application/vnd.api+json", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    GenericType<Formats> localVarReturnType = new GenericType<Formats>() {};
    return apiClient.invokeAPI(auth, credentials, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarReturnType);
      }
  /**
   * 
   * Returns information about derivatives that correspond to a specific source file, including derviative URNs and statuses.  The URNs of the derivatives are used to download the generated derivatives when calling the [GET {urn}/manifest/{derivativeurn}](https://developer.autodesk.com/en/docs/model-derivative/v2/reference/http/urn-manifest-derivativeurn-GET) endpoint.  The statuses are used to verify whether the translation of requested output files is complete.  Note that different output files might complete their translation processes at different times, and therefore may have different &#x60;status&#x60; values.  When translating a source file a second time, the previously created manifest is not deleted; it appends the information (only new translations) to the manifest. 
   * @param urn The Base64 (URL Safe) encoded design URN  (required)
   * @param acceptEncoding If specified with &#x60;gzip&#x60; or &#x60;*&#x60;, content will be compressed and returned in a GZIP format.  (optional)
   * @return Manifest
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Manifest> getManifest(String urn, String acceptEncoding, Authentication auth, ThreeLeggedCredentials credentials) throws ApiException {

    Object localVarPostBody = null;
    
    // verify the required parameter 'urn' is set
    if (urn == null) {
      throw new ApiException(400, "Missing the required parameter 'urn' when calling getManifest");
    }
    
    // create path and map variables
    String localVarPath = "/modelderivative/v2/designdata/{urn}/manifest".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "urn" + "\\}", apiClient.escapeString(urn.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (acceptEncoding != null)
      localVarHeaderParams.put("Accept-Encoding", apiClient.parameterToString(acceptEncoding));

    
    final String[] localVarAccepts = {
      "application/vnd.api+json", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    GenericType<Manifest> localVarReturnType = new GenericType<Manifest>() {};
    return apiClient.invokeAPI(auth, credentials, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarReturnType);
      }
  /**
   * 
   * Returns a list of model view (metadata) IDs for a design model. The metadata ID enables end users to select an object tree and properties for a specific model view.  Although most design apps (e.g., Fusion and Inventor) only allow a single model view (object tree and set of properties), some apps (e.g., Revit) allow users to design models with multiple model views (e.g., HVAC, architecture, perspective).  Note that you can only retrieve metadata from an input file that has been translated into an SVF file. 
   * @param urn The Base64 (URL Safe) encoded design URN  (required)
   * @param acceptEncoding If specified with &#x60;gzip&#x60; or &#x60;*&#x60;, content will be compressed and returned in a GZIP format.  (optional)
   * @return Metadata
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Metadata> getMetadata(String urn, String acceptEncoding, Authentication auth, ThreeLeggedCredentials credentials) throws ApiException {

    Object localVarPostBody = null;
    
    // verify the required parameter 'urn' is set
    if (urn == null) {
      throw new ApiException(400, "Missing the required parameter 'urn' when calling getMetadata");
    }
    
    // create path and map variables
    String localVarPath = "/modelderivative/v2/designdata/{urn}/metadata".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "urn" + "\\}", apiClient.escapeString(urn.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (acceptEncoding != null)
      localVarHeaderParams.put("Accept-Encoding", apiClient.parameterToString(acceptEncoding));

    
    final String[] localVarAccepts = {
      "application/vnd.api+json", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    GenericType<Metadata> localVarReturnType = new GenericType<Metadata>() {};
    return apiClient.invokeAPI(auth, credentials, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarReturnType);
      }
  /**
   * 
   * Returns an object tree, i.e., a hierarchical list of objects for a model view.  To call this endpoint you first need to call the [GET {urn}/metadata](https://developer.autodesk.com/en/docs/model-derivative/v2/reference/http/urn-metadata-GET) endpoint, to determine which model view (object tree and set of properties) to use.  Although most design apps (e.g., Fusion and Inventor) only allow a single model view, some apps (e.g., Revit) allow users to design models with multiple model views (e.g., HVAC, architecture, perspective).  Note that you can only retrieve metadata from an input file that has been translated into an SVF file. 
   * @param urn The Base64 (URL Safe) encoded design URN  (required)
   * @param guid Unique model view ID. Call [GET {urn}/metadata](https://developer.autodesk.com/en/docs/model-derivative/v2/reference/http/urn-metadata-GET) to get the ID  (required)
   * @param acceptEncoding If specified with &#x60;gzip&#x60; or &#x60;*&#x60;, content will be compressed and returned in a GZIP format.  (optional)
   * @return Metadata
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Metadata> getModelviewMetadata(String urn, String guid, String acceptEncoding, Authentication auth, ThreeLeggedCredentials credentials) throws ApiException {

    Object localVarPostBody = null;
    
    // verify the required parameter 'urn' is set
    if (urn == null) {
      throw new ApiException(400, "Missing the required parameter 'urn' when calling getModelviewMetadata");
    }
    
    // verify the required parameter 'guid' is set
    if (guid == null) {
      throw new ApiException(400, "Missing the required parameter 'guid' when calling getModelviewMetadata");
    }
    
    // create path and map variables
    String localVarPath = "/modelderivative/v2/designdata/{urn}/metadata/{guid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "urn" + "\\}", apiClient.escapeString(urn.toString()))
      .replaceAll("\\{" + "guid" + "\\}", apiClient.escapeString(guid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (acceptEncoding != null)
      localVarHeaderParams.put("Accept-Encoding", apiClient.parameterToString(acceptEncoding));

    
    final String[] localVarAccepts = {
      "application/vnd.api+json", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    GenericType<Metadata> localVarReturnType = new GenericType<Metadata>() {};
    return apiClient.invokeAPI(auth, credentials, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarReturnType);
      }
  /**
   * 
   * Returns a list of properties for each object in an object tree. Properties are returned according to object ID and do not follow a hierarchical structure.  The following image displays a typical list of properties for a Revit object:  ![](https://developer.doc.autodesk.com/bPlouYTd/7/_images/Properties.png)  To call this endpoint you need to first call the [GET {urn}/metadata](https://developer.autodesk.com/en/docs/model-derivative/v2/reference/http/urn-metadata-GET) endpoint, which returns a list of model view (metadata) IDs for a design input model. Select a model view (metadata) ID to use when calling the Get Properties endpoint.  Note that you can only get properties from a design input file that was previously translated into an SVF file. 
   * @param urn The Base64 (URL Safe) encoded design URN  (required)
   * @param guid Unique model view ID. Call [GET {urn}/metadata](https://developer.autodesk.com/en/docs/model-derivative/v2/reference/http/urn-metadata-GET) to get the ID  (required)
   * @param acceptEncoding If specified with &#x60;gzip&#x60; or &#x60;*&#x60;, content will be compressed and returned in a GZIP format.  (optional)
   * @return Metadata
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Metadata> getModelviewProperties(String urn, String guid, String acceptEncoding, Authentication auth, ThreeLeggedCredentials credentials) throws ApiException {

    Object localVarPostBody = null;
    
    // verify the required parameter 'urn' is set
    if (urn == null) {
      throw new ApiException(400, "Missing the required parameter 'urn' when calling getModelviewProperties");
    }
    
    // verify the required parameter 'guid' is set
    if (guid == null) {
      throw new ApiException(400, "Missing the required parameter 'guid' when calling getModelviewProperties");
    }
    
    // create path and map variables
    String localVarPath = "/modelderivative/v2/designdata/{urn}/metadata/{guid}/properties".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "urn" + "\\}", apiClient.escapeString(urn.toString()))
      .replaceAll("\\{" + "guid" + "\\}", apiClient.escapeString(guid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (acceptEncoding != null)
      localVarHeaderParams.put("Accept-Encoding", apiClient.parameterToString(acceptEncoding));

    
    final String[] localVarAccepts = {
      "application/vnd.api+json", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    GenericType<Metadata> localVarReturnType = new GenericType<Metadata>() {};
    return apiClient.invokeAPI(auth, credentials, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarReturnType);
      }
  /**
   * 
   * Returns the thumbnail for the source file. 
   * @param urn The Base64 (URL Safe) encoded design URN  (required)
   * @param width The desired width of the thumbnail. Possible values are 100, 200 and 400.  (optional)
   * @param height The desired height of the thumbnail. Possible values are 100, 200 and 400.  (optional)
   * @return InputStream
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InputStream> getThumbnail(String urn, Integer width, Integer height, Authentication auth, ThreeLeggedCredentials credentials) throws ApiException {

    Object localVarPostBody = null;
    
    // verify the required parameter 'urn' is set
    if (urn == null) {
      throw new ApiException(400, "Missing the required parameter 'urn' when calling getThumbnail");
    }
    
    // create path and map variables
    String localVarPath = "/modelderivative/v2/designdata/{urn}/thumbnail".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "urn" + "\\}", apiClient.escapeString(urn.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "width", width));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "height", height));

    
    
    final String[] localVarAccepts = {
      "application/octet-stream"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    GenericType<InputStream> localVarReturnType = new GenericType<InputStream>() {};
    return apiClient.invokeAPI(auth, credentials, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarReturnType);
      }
  /**
   * 
   * Translate a source file from one format to another.  Derivatives are stored in a manifest that is updated each time this endpoint is used on a source file.  Note that this endpoint is asynchronous and initiates a process that runs in the background, rather than keeping an open HTTP connection until completion. Use the [GET {urn}/manifest](https://developer.autodesk.com/en/docs/model-derivative/v2/reference/http/urn-manifest-GET) endpoint to poll for the job’s completion. 
   * @param job  (required)
   * @param xAdsForce &#x60;true&#x60;: the endpoint replaces previously translated output file types with the newly generated derivatives  &#x60;false&#x60; (default): previously created derivatives are not replaced  (optional, default to false)
   * @return Job
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Job> translate(JobPayload job, Boolean xAdsForce, Authentication auth, ThreeLeggedCredentials credentials) throws ApiException {

    Object localVarPostBody = job;
    
    // verify the required parameter 'job' is set
    if (job == null) {
      throw new ApiException(400, "Missing the required parameter 'job' when calling translate");
    }
    
    // create path and map variables
    String localVarPath = "/modelderivative/v2/designdata/job".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (xAdsForce != null)
      localVarHeaderParams.put("x-ads-force", apiClient.parameterToString(xAdsForce));

    
    final String[] localVarAccepts = {
      "application/vnd.api+json", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    GenericType<Job> localVarReturnType = new GenericType<Job>() {};
    return apiClient.invokeAPI(auth, credentials, localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarReturnType);
      }
}
