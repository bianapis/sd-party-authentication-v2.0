package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDeviceEvaluateOutputModelDeviceInstanceRecord
 */
public class BQDeviceEvaluateOutputModelDeviceInstanceRecord   {
  private String deviceTestResult = null;


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

