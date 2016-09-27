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


package com.autodesk.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * ActivityOptional
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.ADSKJavaClientCodegen", date = "2016-09-25T18:48:45.159+03:00")
public class ActivityOptional   {
  @JsonProperty("Id")
  private String id = null;

  @JsonProperty("Instruction")
  private Object instruction = null;

  @JsonProperty("AppPackages")
  private List<String> appPackages = new ArrayList<String>();

  @JsonProperty("RequiredEngineVersion")
  private String requiredEngineVersion = null;

  @JsonProperty("Parameters")
  private Object parameters = null;

  @JsonProperty("AllowedChildProcesses")
  private List<Object> allowedChildProcesses = new ArrayList<Object>();

  @JsonProperty("Version")
  private Integer version = null;

  @JsonProperty("Description")
  private String description = null;

  @JsonProperty("HostApplication")
  private String hostApplication = null;

  @JsonProperty("IsPublic")
  private Boolean isPublic = null;

  public ActivityOptional id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ActivityOptional instruction(Object instruction) {
    this.instruction = instruction;
    return this;
  }

   /**
   * Get instruction
   * @return instruction
  **/
  @ApiModelProperty(example = "null", value = "")
  public Object getInstruction() {
    return instruction;
  }

  public void setInstruction(Object instruction) {
    this.instruction = instruction;
  }

  public ActivityOptional appPackages(List<String> appPackages) {
    this.appPackages = appPackages;
    return this;
  }

   /**
   * Get appPackages
   * @return appPackages
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getAppPackages() {
    return appPackages;
  }

  public void setAppPackages(List<String> appPackages) {
    this.appPackages = appPackages;
  }

  public ActivityOptional requiredEngineVersion(String requiredEngineVersion) {
    this.requiredEngineVersion = requiredEngineVersion;
    return this;
  }

   /**
   * Get requiredEngineVersion
   * @return requiredEngineVersion
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRequiredEngineVersion() {
    return requiredEngineVersion;
  }

  public void setRequiredEngineVersion(String requiredEngineVersion) {
    this.requiredEngineVersion = requiredEngineVersion;
  }

  public ActivityOptional parameters(Object parameters) {
    this.parameters = parameters;
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @ApiModelProperty(example = "null", value = "")
  public Object getParameters() {
    return parameters;
  }

  public void setParameters(Object parameters) {
    this.parameters = parameters;
  }

  public ActivityOptional allowedChildProcesses(List<Object> allowedChildProcesses) {
    this.allowedChildProcesses = allowedChildProcesses;
    return this;
  }

   /**
   * Get allowedChildProcesses
   * @return allowedChildProcesses
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Object> getAllowedChildProcesses() {
    return allowedChildProcesses;
  }

  public void setAllowedChildProcesses(List<Object> allowedChildProcesses) {
    this.allowedChildProcesses = allowedChildProcesses;
  }

  public ActivityOptional version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public ActivityOptional description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ActivityOptional hostApplication(String hostApplication) {
    this.hostApplication = hostApplication;
    return this;
  }

   /**
   * Get hostApplication
   * @return hostApplication
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getHostApplication() {
    return hostApplication;
  }

  public void setHostApplication(String hostApplication) {
    this.hostApplication = hostApplication;
  }

  public ActivityOptional isPublic(Boolean isPublic) {
    this.isPublic = isPublic;
    return this;
  }

   /**
   * Get isPublic
   * @return isPublic
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsPublic() {
    return isPublic;
  }

  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityOptional activityOptional = (ActivityOptional) o;
    return Objects.equals(this.id, activityOptional.id) &&
        Objects.equals(this.instruction, activityOptional.instruction) &&
        Objects.equals(this.appPackages, activityOptional.appPackages) &&
        Objects.equals(this.requiredEngineVersion, activityOptional.requiredEngineVersion) &&
        Objects.equals(this.parameters, activityOptional.parameters) &&
        Objects.equals(this.allowedChildProcesses, activityOptional.allowedChildProcesses) &&
        Objects.equals(this.version, activityOptional.version) &&
        Objects.equals(this.description, activityOptional.description) &&
        Objects.equals(this.hostApplication, activityOptional.hostApplication) &&
        Objects.equals(this.isPublic, activityOptional.isPublic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, instruction, appPackages, requiredEngineVersion, parameters, allowedChildProcesses, version, description, hostApplication, isPublic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityOptional {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
    sb.append("    appPackages: ").append(toIndentedString(appPackages)).append("\n");
    sb.append("    requiredEngineVersion: ").append(toIndentedString(requiredEngineVersion)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    allowedChildProcesses: ").append(toIndentedString(allowedChildProcesses)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hostApplication: ").append(toIndentedString(hostApplication)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
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
