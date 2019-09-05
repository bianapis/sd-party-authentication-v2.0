package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDocumentEvaluateOutputModelDocumentInstanceRecord
 */
public class BQDocumentEvaluateOutputModelDocumentInstanceRecord   {
  private String authenticationDocumentComparisonTestResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of comparing the presented document to the stored value 
   * @return authenticationDocumentComparisonTestResult
  **/

  public String getAuthenticationDocumentComparisonTestResult() {
    return authenticationDocumentComparisonTestResult;
  }

  public void setAuthenticationDocumentComparisonTestResult(String authenticationDocumentComparisonTestResult) {
    this.authenticationDocumentComparisonTestResult = authenticationDocumentComparisonTestResult;
  }


}

