package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBehavioralEvaluateOutputModelBehavioralInstanceRecord
 */
public class BQBehavioralEvaluateOutputModelBehavioralInstanceRecord   {
  private String behavioralTestResult = null;


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

