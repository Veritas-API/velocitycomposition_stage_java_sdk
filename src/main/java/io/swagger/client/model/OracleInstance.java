/*
 * Velocity-Sandbox
 * API to create a Velocity Sandbox
 *
 * OpenAPI spec version: 1.0.0
 * Contact: alay.vakil@veritas.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * OracleInstance
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-12T22:01:48.152Z")
public class OracleInstance {
  @SerializedName("hostName")
  private String hostName = null;

  @SerializedName("instanceName")
  private String instanceName = null;

  @SerializedName("oracleHomePath")
  private String oracleHomePath = null;

  @SerializedName("racNodeName")
  private String racNodeName = null;

  public OracleInstance hostName(String hostName) {
    this.hostName = hostName;
    return this;
  }

   /**
   * Get hostName
   * @return hostName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public OracleInstance instanceName(String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

   /**
   * Get instanceName
   * @return instanceName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getInstanceName() {
    return instanceName;
  }

  public void setInstanceName(String instanceName) {
    this.instanceName = instanceName;
  }

  public OracleInstance oracleHomePath(String oracleHomePath) {
    this.oracleHomePath = oracleHomePath;
    return this;
  }

   /**
   * Get oracleHomePath
   * @return oracleHomePath
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOracleHomePath() {
    return oracleHomePath;
  }

  public void setOracleHomePath(String oracleHomePath) {
    this.oracleHomePath = oracleHomePath;
  }

  public OracleInstance racNodeName(String racNodeName) {
    this.racNodeName = racNodeName;
    return this;
  }

   /**
   * Get racNodeName
   * @return racNodeName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRacNodeName() {
    return racNodeName;
  }

  public void setRacNodeName(String racNodeName) {
    this.racNodeName = racNodeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OracleInstance oracleInstance = (OracleInstance) o;
    return Objects.equals(this.hostName, oracleInstance.hostName) &&
        Objects.equals(this.instanceName, oracleInstance.instanceName) &&
        Objects.equals(this.oracleHomePath, oracleInstance.oracleHomePath) &&
        Objects.equals(this.racNodeName, oracleInstance.racNodeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostName, instanceName, oracleHomePath, racNodeName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OracleInstance {\n");
    
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    oracleHomePath: ").append(toIndentedString(oracleHomePath)).append("\n");
    sb.append("    racNodeName: ").append(toIndentedString(racNodeName)).append("\n");
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

