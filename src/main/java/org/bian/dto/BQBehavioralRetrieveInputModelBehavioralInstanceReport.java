package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBehavioralRetrieveInputModelBehavioralInstanceReport
 */
public class BQBehavioralRetrieveInputModelBehavioralInstanceReport   {
  private String behavioralInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return behavioralInstanceReportReference
  **/

  public String getBehavioralInstanceReportReference() {
    return behavioralInstanceReportReference;
  }

  public void setBehavioralInstanceReportReference(String behavioralInstanceReportReference) {
    this.behavioralInstanceReportReference = behavioralInstanceReportReference;
  }


}

