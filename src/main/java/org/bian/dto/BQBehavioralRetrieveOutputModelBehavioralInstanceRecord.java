package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBehavioralRetrieveOutputModelBehavioralInstanceRecord
 */
public class BQBehavioralRetrieveOutputModelBehavioralInstanceRecord   {
  private String authenticationBehavioralType = null;

  private Object authenticationBehavioralRecord = null;

  private String registeredBehavioralInstanceReference = null;

  private Object registeredBehavioralInstanceRecord = null;

  private String behavioralTestResult = null;


  /**
   * `status: Provisionally Registered`  bian-reference: (as Authentication).SubmittedAuthenticationData.AuthenticationDataScheme(as GenericDataScheme).Format  general-info: The type of behavioral record being used for authentication 
   * @return authenticationBehavioralType
  **/

  public String getAuthenticationBehavioralType() {
    return authenticationBehavioralType;
  }

  public void setAuthenticationBehavioralType(String authenticationBehavioralType) {
    this.authenticationBehavioralType = authenticationBehavioralType;
  }


  /**
   * `status: Provisionally Registered`  bian-reference: (as Authentication).SubmittedAuthenticationData(as GenericData).BinaryData  general-info: The behavioral record submitted for authentication 
   * @return authenticationBehavioralRecord
  **/

  public Object getAuthenticationBehavioralRecord() {
    return authenticationBehavioralRecord;
  }

  public void setAuthenticationBehavioralRecord(Object authenticationBehavioralRecord) {
    this.authenticationBehavioralRecord = authenticationBehavioralRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the registered customer behavioral record 
   * @return registeredBehavioralInstanceReference
  **/

  public String getRegisteredBehavioralInstanceReference() {
    return registeredBehavioralInstanceReference;
  }

  public void setRegisteredBehavioralInstanceReference(String registeredBehavioralInstanceReference) {
    this.registeredBehavioralInstanceReference = registeredBehavioralInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Registered customer behavioral record - maintained by SD-Issued Device Administration 
   * @return registeredBehavioralInstanceRecord
  **/

  public Object getRegisteredBehavioralInstanceRecord() {
    return registeredBehavioralInstanceRecord;
  }

  public void setRegisteredBehavioralInstanceRecord(Object registeredBehavioralInstanceRecord) {
    this.registeredBehavioralInstanceRecord = registeredBehavioralInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of the behavioral check 
   * @return behavioralTestResult
  **/

  public String getBehavioralTestResult() {
    return behavioralTestResult;
  }

  public void setBehavioralTestResult(String behavioralTestResult) {
    this.behavioralTestResult = behavioralTestResult;
  }


}

