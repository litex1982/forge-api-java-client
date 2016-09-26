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
import java.util.ArrayList;
import java.util.List;


/**
 * FormatsFormats
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.ADSKJavaClientCodegen", date = "2016-09-25T18:48:45.159+03:00")
public class FormatsFormats   {
  @JsonProperty("svf")
  private List<String> svf = new ArrayList<String>();

  @JsonProperty("thumbnail")
  private List<String> thumbnail = new ArrayList<String>();

  @JsonProperty("stl")
  private List<String> stl = new ArrayList<String>();

  @JsonProperty("step")
  private List<String> step = new ArrayList<String>();

  @JsonProperty("iges")
  private List<String> iges = new ArrayList<String>();

  @JsonProperty("obj")
  private List<String> obj = new ArrayList<String>();

  public FormatsFormats svf(List<String> svf) {
    this.svf = svf;
    return this;
  }

   /**
   * Get svf
   * @return svf
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getSvf() {
    return svf;
  }

  public void setSvf(List<String> svf) {
    this.svf = svf;
  }

  public FormatsFormats thumbnail(List<String> thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

   /**
   * Get thumbnail
   * @return thumbnail
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(List<String> thumbnail) {
    this.thumbnail = thumbnail;
  }

  public FormatsFormats stl(List<String> stl) {
    this.stl = stl;
    return this;
  }

   /**
   * Get stl
   * @return stl
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getStl() {
    return stl;
  }

  public void setStl(List<String> stl) {
    this.stl = stl;
  }

  public FormatsFormats step(List<String> step) {
    this.step = step;
    return this;
  }

   /**
   * Get step
   * @return step
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getStep() {
    return step;
  }

  public void setStep(List<String> step) {
    this.step = step;
  }

  public FormatsFormats iges(List<String> iges) {
    this.iges = iges;
    return this;
  }

   /**
   * Get iges
   * @return iges
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getIges() {
    return iges;
  }

  public void setIges(List<String> iges) {
    this.iges = iges;
  }

  public FormatsFormats obj(List<String> obj) {
    this.obj = obj;
    return this;
  }

   /**
   * Get obj
   * @return obj
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getObj() {
    return obj;
  }

  public void setObj(List<String> obj) {
    this.obj = obj;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormatsFormats formatsFormats = (FormatsFormats) o;
    return Objects.equals(this.svf, formatsFormats.svf) &&
        Objects.equals(this.thumbnail, formatsFormats.thumbnail) &&
        Objects.equals(this.stl, formatsFormats.stl) &&
        Objects.equals(this.step, formatsFormats.step) &&
        Objects.equals(this.iges, formatsFormats.iges) &&
        Objects.equals(this.obj, formatsFormats.obj);
  }

  @Override
  public int hashCode() {
    return Objects.hash(svf, thumbnail, stl, step, iges, obj);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormatsFormats {\n");
    
    sb.append("    svf: ").append(toIndentedString(svf)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    stl: ").append(toIndentedString(stl)).append("\n");
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
    sb.append("    iges: ").append(toIndentedString(iges)).append("\n");
    sb.append("    obj: ").append(toIndentedString(obj)).append("\n");
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

