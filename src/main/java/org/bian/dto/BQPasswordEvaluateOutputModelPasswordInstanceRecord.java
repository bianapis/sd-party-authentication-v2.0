package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPasswordEvaluateOutputModelPasswordInstanceRecord
 */
public class BQPasswordEvaluateOutputModelPasswordInstanceRecord   {
  private String authenticationPasswordTestResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of the reference data and password checks 
   * @return authenticationPasswordTestResult
  **/

  public String getAuthenticationPasswordTestResult() {
    return authenticationPasswordTestResult;
  }

  public void setAuthenticationPasswordTestResult(String authenticationPasswordTestResult) {
    this.authenticationPasswordTestResult = authenticationPasswordTestResult;
  }


}

