package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPasswordRetrieveInputModelPasswordInstanceReport
 */
public class BQPasswordRetrieveInputModelPasswordInstanceReport   {
  private String passwordInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return passwordInstanceReportReference
  **/

  public String getPasswordInstanceReportReference() {
    return passwordInstanceReportReference;
  }

  public void setPasswordInstanceReportReference(String passwordInstanceReportReference) {
    this.passwordInstanceReportReference = passwordInstanceReportReference;
  }


}

