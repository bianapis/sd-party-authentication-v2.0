package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDeviceRetrieveInputModelDeviceInstanceAnalysis
 */
public class BQDeviceRetrieveInputModelDeviceInstanceAnalysis   {
  private String deviceInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return deviceInstanceAnalysisReference
  **/

  public String getDeviceInstanceAnalysisReference() {
    return deviceInstanceAnalysisReference;
  }

  public void setDeviceInstanceAnalysisReference(String deviceInstanceAnalysisReference) {
    this.deviceInstanceAnalysisReference = deviceInstanceAnalysisReference;
  }


}

