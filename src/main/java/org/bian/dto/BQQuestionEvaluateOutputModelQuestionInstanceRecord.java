package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQQuestionEvaluateOutputModelQuestionInstanceRecord
 */
public class BQQuestionEvaluateOutputModelQuestionInstanceRecord   {
  private String secretQuestionTestResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of the secret question check 
   * @return secretQuestionTestResult
  **/

  public String getSecretQuestionTestResult() {
    return secretQuestionTestResult;
  }

  public void setSecretQuestionTestResult(String secretQuestionTestResult) {
    this.secretQuestionTestResult = secretQuestionTestResult;
  }


}

