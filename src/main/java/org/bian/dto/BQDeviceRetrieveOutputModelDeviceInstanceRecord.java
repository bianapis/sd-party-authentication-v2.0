package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDeviceRetrieveOutputModelDeviceInstanceRecord
 */
public class BQDeviceRetrieveOutputModelDeviceInstanceRecord   {
  private String authenticationDeviceReference = null;

  private String authenticationDevicePropertyValue = null;

  private String issuedDeviceInstanceReference = null;

  private String issuedDevicePropertyValue = null;

  private String deviceTestResult = null;


  /**
   * `status: Provisionally Registered`  bian-reference: (as Authentication).AuthenticationTool  general-info: Reference to the device being used for authentication 
   * @return authenticationDeviceReference
  **/

  public String getAuthenticationDeviceReference() {
    return authenticationDeviceReference;
  }

  public void setAuthenticationDeviceReference(String authenticationDeviceReference) {
    this.authenticationDeviceReference = authenticationDeviceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Property of the device being used to authenticate (e.g. phone number, URL) 
   * @return authenticationDevicePropertyValue
  **/

  public String getAuthenticationDevicePropertyValue() {
    return authenticationDevicePropertyValue;
  }

  public void setAuthenticationDevicePropertyValue(String authenticationDevicePropertyValue) {
    this.authenticationDevicePropertyValue = authenticationDevicePropertyValue;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer issued device 
   * @return issuedDeviceInstanceReference
  **/

  public String getIssuedDeviceInstanceReference() {
    return issuedDeviceInstanceReference;
  }

  public void setIssuedDeviceInstanceReference(String issuedDeviceInstanceReference) {
    this.issuedDeviceInstanceReference = issuedDeviceInstanceReference;
  }


  /**
   * `status: Provisionally Registered`  bian-reference: (as Authentication).AuthenticationTool.StoredData.BinaryData `status: Provisionally Registered`  bian-reference: (as Authentication).AuthenticationTool.StoredData.TextualData  general-info: The registered customer device properties - maintained by SD-Issued Device Administration 
   * @return issuedDevicePropertyValue
  **/

  public String getIssuedDevicePropertyValue() {
    return issuedDevicePropertyValue;
  }

  public void setIssuedDevicePropertyValue(String issuedDevicePropertyValue) {
    this.issuedDevicePropertyValue = issuedDevicePropertyValue;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of the device check 
   * @return deviceTestResult
  **/

  public String getDeviceTestResult() {
    return deviceTestResult;
  }

  public void setDeviceTestResult(String deviceTestResult) {
    this.deviceTestResult = deviceTestResult;
  }


}

