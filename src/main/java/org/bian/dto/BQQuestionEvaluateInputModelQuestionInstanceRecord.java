package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQQuestionEvaluateInputModelQuestionInstanceRecord
 */
public class BQQuestionEvaluateInputModelQuestionInstanceRecord   {
  private String authenticationSecretQuestionReference = null;

  private String authenticationSecretQuestionTemplate = null;

  private String authenticationSecretQuestionValue = null;


  /**
   * `status: Provisionally Registered`  bian-reference: CustomerContactPerson(as Role).Player(as Person).PersonProfile.StoredAuthenticationData  general-info: Reference to the selected secret question 
   * @return authenticationSecretQuestionReference
  **/

  public String getAuthenticationSecretQuestionReference() {
    return authenticationSecretQuestionReference;
  }

  public void setAuthenticationSecretQuestionReference(String authenticationSecretQuestionReference) {
    this.authenticationSecretQuestionReference = authenticationSecretQuestionReference;
  }


  /**
   * `status: Provisionally Registered`  bian-reference: (as Authentication).SubmittedAuthenticationData.AuthenticationDataScheme(as GenericDataScheme).Format  general-info: Template includes the question text and provided customer response - given value is compared to the stored value 
   * @return authenticationSecretQuestionTemplate
  **/

  public String getAuthenticationSecretQuestionTemplate() {
    return authenticationSecretQuestionTemplate;
  }

  public void setAuthenticationSecretQuestionTemplate(String authenticationSecretQuestionTemplate) {
    this.authenticationSecretQuestionTemplate = authenticationSecretQuestionTemplate;
  }


  /**
   * `status: Provisionally Registered`  bian-reference: CustomerContactPerson(as Role).Player(as Person).PersonProfile.StoredAuthenticationData(as GenericData).BinaryData `status: Provisionally Registered`  bian-reference: CustomerContactPerson(as Role).Player(as Person).PersonProfile.StoredAuthenticationData(as GenericData).ValidityPeriod  general-info: This is the stored value, the provided value is compared to this 
   * @return authenticationSecretQuestionValue
  **/

  public String getAuthenticationSecretQuestionValue() {
    return authenticationSecretQuestionValue;
  }

  public void setAuthenticationSecretQuestionValue(String authenticationSecretQuestionValue) {
    this.authenticationSecretQuestionValue = authenticationSecretQuestionValue;
  }


}

