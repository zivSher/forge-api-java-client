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


package com.autodesk.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Object json response
 */
@ApiModel(description = "Object json response")

public class ObjectDetails   {
  @JsonProperty("bucketKey")
  private String bucketKey = null;

  @JsonProperty("objectId")
  private String objectId = null;

  @JsonProperty("objectKey")
  private String objectKey = null;

  @JsonProperty("sha1")
  private byte[] sha1 = null;

  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("contentType")
  private String contentType = null;

  @JsonProperty("location")
  private String location = null;

  public ObjectDetails bucketKey(String bucketKey) {
    this.bucketKey = bucketKey;
    return this;
  }

   /**
   * Bucket key
   * @return bucketKey
  **/
  @ApiModelProperty(example = "null", value = "Bucket key")
  public String getBucketKey() {
    return bucketKey;
  }

  public void setBucketKey(String bucketKey) {
    this.bucketKey = bucketKey;
  }

  public ObjectDetails objectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

   /**
   * Object URN
   * @return objectId
  **/
  @ApiModelProperty(example = "null", value = "Object URN")
  public String getObjectId() {
    return objectId;
  }

  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }

  public ObjectDetails objectKey(String objectKey) {
    this.objectKey = objectKey;
    return this;
  }

   /**
   * Object name
   * @return objectKey
  **/
  @ApiModelProperty(example = "null", value = "Object name")
  public String getObjectKey() {
    return objectKey;
  }

  public void setObjectKey(String objectKey) {
    this.objectKey = objectKey;
  }

  public ObjectDetails sha1(byte[] sha1) {
    this.sha1 = sha1;
    return this;
  }

   /**
   * Object SHA1
   * @return sha1
  **/
  @ApiModelProperty(example = "null", value = "Object SHA1")
  public byte[] getSha1() {
    return sha1;
  }

  public void setSha1(byte[] sha1) {
    this.sha1 = sha1;
  }

  public ObjectDetails size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Object size
   * @return size
  **/
  @ApiModelProperty(example = "null", value = "Object size")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public ObjectDetails contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * Object content-type
   * @return contentType
  **/
  @ApiModelProperty(example = "null", value = "Object content-type")
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public ObjectDetails location(String location) {
    this.location = location;
    return this;
  }

   /**
   * URL to download the object
   * @return location
  **/
  @ApiModelProperty(example = "null", value = "URL to download the object")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectDetails objectDetails = (ObjectDetails) o;
    return Objects.equals(this.bucketKey, objectDetails.bucketKey) &&
        Objects.equals(this.objectId, objectDetails.objectId) &&
        Objects.equals(this.objectKey, objectDetails.objectKey) &&
        Objects.equals(this.sha1, objectDetails.sha1) &&
        Objects.equals(this.size, objectDetails.size) &&
        Objects.equals(this.contentType, objectDetails.contentType) &&
        Objects.equals(this.location, objectDetails.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketKey, objectId, objectKey, sha1, size, contentType, location);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectDetails {\n");
    
    sb.append("    bucketKey: ").append(toIndentedString(bucketKey)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    objectKey: ").append(toIndentedString(objectKey)).append("\n");
    sb.append("    sha1: ").append(toIndentedString(sha1)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

