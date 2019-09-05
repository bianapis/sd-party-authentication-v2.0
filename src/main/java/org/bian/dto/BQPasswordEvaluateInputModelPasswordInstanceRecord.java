package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPasswordEvaluateInputModelPasswordInstanceRecord
 */
public class BQPasswordEvaluateInputModelPasswordInstanceRecord   {
  private String authenticationReferenceDataReference = null;

  private String authenticationReferenceDataType = null;

  private String authenticationReferenceDataValue = null;

  private String authenticationPasswordReference = null;

  private String authenticationPasswordTemplate = null;

  private String authenticationPasswordStoredValue = null;

  private String authenticationPasswordValidFromToDate = null;

  private String authenticationPasswordPresentedValue = null;


  /**
   * `status: Provisionally Registered`  bian-reference: (as Authentication).SubmittedAuthenticationData.AuthenticationDataScheme(as GenericDataScheme).Label  general-info: Reference to a customer reference data item to be compared with submitted value 
   * @return authenticationReferenceDataReference
  **/

  public String getAuthenticationReferenceDataReference() {
    return authenticationReferenceDataReference;
  }

  public void setAuthenticationReferenceDataReference(String authenticationReferenceDataReference) {
    this.authenticationReferenceDataReference = authenticationReferenceDataReference;
  }


  /**
   * `status: Provisionally Registered`  bian-reference: (as Authentication).SubmittedAuthenticationData.AuthenticationDataScheme(as GenericDataScheme).Format  general-info: Defines reference data item type submitted for comparison 
   * @return authenticationReferenceDataType
  **/

  public String getAuthenticationReferenceDataType() {
    return authenticationReferenceDataType;
  }

  public void setAuthenticationReferenceDataType(String authenticationReferenceDataType) {
    this.authenticationReferenceDataType = authenticationReferenceDataType;
  }


  /**
   * `status: Provisionally Registered`  bian-reference: (as Authentication).SubmittedAuthenticationData(as GenericData).TextualData `status: Provisionally Registered`  bian-reference: (as Authentication).SubmittedAuthenticationData(as GenericData).BinaryData  general-info: The customer provided value is matched to the bank's maintained value 
   * @return authenticationReferenceDataValue
  **/

  public String getAuthenticationReferenceDataValue() {
    return authenticationReferenceDataValue;
  }

  public void setAuthenticationReferenceDataValue(String authenticationReferenceDataValue) {
    this.authenticationReferenceDataValue = authenticationReferenceDataValue;
  }


  /**
   * `status: Provisionally Registered`  bian-reference: CustomerContactPerson(as Role).Player(as Person).PersonProfile.StoredAuthenticationData  general-info: Reference to an issued password 
   * @return authenticationPasswordReference
  **/

  public String getAuthenticationPasswordReference() {
    return authenticationPasswordReference;
  }

  public void setAuthenticationPasswordReference(String authenticationPasswordReference) {
    this.authenticationPasswordReference = authenticationPasswordReference;
  }


  /**
   * `status: Provisionally Registered`  bian-reference: (as Authentication).SubmittedAuthenticationData.AuthenticationDataScheme(as GenericDataScheme).Format  general-info: Defines allowed values/format for an issued password 
   * @return authenticationPasswordTemplate
  **/

  public String getAuthenticationPasswordTemplate() {
    return authenticationPasswordTemplate;
  }

  public void setAuthenticationPasswordTemplate(String authenticationPasswordTemplate) {
    this.authenticationPasswordTemplate = authenticationPasswordTemplate;
  }


  /**
   * `status: Provisionally Registered`  bian-reference: CustomerContactPerson(as Role).Player(as Person).PersonProfile.StoredAuthenticationData(as GenericData).TextualData `status: Provisionally Registered`  bian-reference: CustomerContactPerson(as Role).Player(as Person).PersonProfile.StoredAuthenticationData(as GenericData).BinaryData  general-info: The bank maintained value (can be customer provided or a bank generated value - encryption applies) 
   * @return authenticationPasswordStoredValue
  **/

  public String getAuthenticationPasswordStoredValue() {
    return authenticationPasswordStoredValue;
  }

  public void setAuthenticationPasswordStoredValue(String authenticationPasswordStoredValue) {
    this.authenticationPasswordStoredValue = authenticationPasswordStoredValue;
  }


  /**
   * `status: Provisionally Registered`  bian-reference: CustomerContactPerson(as Role).Player(as Person).PersonProfile.StoredAuthenticationData(as GenericData).ValidityPeriod  general-info: The valid period for the stored password 
   * @return authenticationPasswordValidFromToDate
  **/

  public String getAuthenticationPasswordValidFromToDate() {
    return authenticationPasswordValidFromToDate;
  }

  public void setAuthenticationPasswordValidFromToDate(String authenticationPasswordValidFromToDate) {
    this.authenticationPasswordValidFromToDate = authenticationPasswordValidFromToDate;
  }


  /**
   * `status: Provisionally Registered`  bian-reference: CustomerContactPerson(as Role).Player(as Person).PersonProfile.StoredAuthenticationData(as GenericData).TextualData `status: Provisionally Registered`  bian-reference: CustomerContactPerson(as Role).Player(as Person).PersonProfile.StoredAuthenticationData(as GenericData).BinaryData  general-info: The customer provided value is matched to the bank's maintained value 
   * @return authenticationPasswordPresentedValue
  **/

  public String getAuthenticationPasswordPresentedValue() {
    return authenticationPasswordPresentedValue;
  }

  public void setAuthenticationPasswordPresentedValue(String authenticationPasswordPresentedValue) {
    this.authenticationPasswordPresentedValue = authenticationPasswordPresentedValue;
  }


}

