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


package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.JsonApiLink;


/**
 * provides the links used for paging
 */
@ApiModel(description = "provides the links used for paging")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.ADSKJavaClientCodegen", date = "2016-09-25T18:48:45.159+03:00")
public class JsonApiLinksPaging   {
  @JsonProperty("first")
  private JsonApiLink first = null;

  @JsonProperty("prev")
  private JsonApiLink prev = null;

  @JsonProperty("next")
  private JsonApiLink next = null;

  @JsonProperty("last")
  private JsonApiLink last = null;

  public JsonApiLinksPaging first(JsonApiLink first) {
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @ApiModelProperty(example = "null", value = "")
  public JsonApiLink getFirst() {
    return first;
  }

  public void setFirst(JsonApiLink first) {
    this.first = first;
  }

  public JsonApiLinksPaging prev(JsonApiLink prev) {
    this.prev = prev;
    return this;
  }

   /**
   * Get prev
   * @return prev
  **/
  @ApiModelProperty(example = "null", value = "")
  public JsonApiLink getPrev() {
    return prev;
  }

  public void setPrev(JsonApiLink prev) {
    this.prev = prev;
  }

  public JsonApiLinksPaging next(JsonApiLink next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @ApiModelProperty(example = "null", value = "")
  public JsonApiLink getNext() {
    return next;
  }

  public void setNext(JsonApiLink next) {
    this.next = next;
  }

  public JsonApiLinksPaging last(JsonApiLink last) {
    this.last = last;
    return this;
  }

   /**
   * Get last
   * @return last
  **/
  @ApiModelProperty(example = "null", value = "")
  public JsonApiLink getLast() {
    return last;
  }

  public void setLast(JsonApiLink last) {
    this.last = last;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonApiLinksPaging jsonApiLinksPaging = (JsonApiLinksPaging) o;
    return Objects.equals(this.first, jsonApiLinksPaging.first) &&
        Objects.equals(this.prev, jsonApiLinksPaging.prev) &&
        Objects.equals(this.next, jsonApiLinksPaging.next) &&
        Objects.equals(this.last, jsonApiLinksPaging.last);
  }

  @Override
  public int hashCode() {
    return Objects.hash(first, prev, next, last);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonApiLinksPaging {\n");
    
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

