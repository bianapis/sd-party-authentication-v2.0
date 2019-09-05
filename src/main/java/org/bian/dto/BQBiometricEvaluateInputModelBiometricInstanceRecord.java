package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBiometricEvaluateInputModelBiometricInstanceRecord
 */
public class BQBiometricEvaluateInputModelBiometricInstanceRecord   {
  private String authenticationBiometricType = null;

  private Object authenticationBiometricRecord = null;

  private String registeredBiometricInstanceReference = null;

  private Object registeredBiometricInstanceRecord = null;


  /**
   * `status: Provisionally Registered`  bian-reference: (as Authentication).SubmittedAuthenticationData.AuthenticationDataScheme(as GenericDataScheme).Format  general-info: The type of biometric record being used for authentication 
   * @return authenticationBiometricType
  **/

  public String getAuthenticationBiometricType() {
    return authenticationBiometricType;
  }

  public void setAuthenticationBiometricType(String authenticationBiometricType) {
    this.authenticationBiometricType = authenticationBiometricType;
  }


  /**
   * `status: Provisionally Registered`  bian-reference: (as Authentication).SubmittedAuthenticationData(as GenericData).BinaryData  general-info: The biometric record submitted for authentication (e.g. face scan, fingerprint, signature) 
   * @return authenticationBiometricRecord
  **/

  public Object getAuthenticationBiometricRecord() {
    return authenticationBiometricRecord;
  }

  public void setAuthenticationBiometricRecord(Object authenticationBiometricRecord) {
    this.authenticationBiometricRecord = authenticationBiometricRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The registered customer biometric record reference - maintained as an issued device instance 
   * @return registeredBiometricInstanceReference
  **/

  public String getRegisteredBiometricInstanceReference() {
    return registeredBiometricInstanceReference;
  }

  public void setRegisteredBiometricInstanceReference(String registeredBiometricInstanceReference) {
    this.registeredBiometricInstanceReference = registeredBiometricInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The registered customer biometric record - maintained by SD-Issued Device Administration 
   * @return registeredBiometricInstanceRecord
  **/

  public Object getRegisteredBiometricInstanceRecord() {
    return registeredBiometricInstanceRecord;
  }

  public void setRegisteredBiometricInstanceRecord(Object registeredBiometricInstanceRecord) {
    this.registeredBiometricInstanceRecord = registeredBiometricInstanceRecord;
  }


}

