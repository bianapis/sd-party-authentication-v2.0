package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPasswordRetrieveOutputModelPasswordInstanceReport
 */
public class BQPasswordRetrieveOutputModelPasswordInstanceReport   {
  private Object passwordInstanceReportRecord = null;

  private String passwordInstanceReportType = null;

  private String passwordInstanceReportParameters = null;

  private Object passwordInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return passwordInstanceReportRecord
  **/

  public Object getPasswordInstanceReportRecord() {
    return passwordInstanceReportRecord;
  }

  public void setPasswordInstanceReportRecord(Object passwordInstanceReportRecord) {
    this.passwordInstanceReportRecord = passwordInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return passwordInstanceReportType
  **/

  public String getPasswordInstanceReportType() {
    return passwordInstanceReportType;
  }

  public void setPasswordInstanceReportType(String passwordInstanceReportType) {
    this.passwordInstanceReportType = passwordInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return passwordInstanceReportParameters
  **/

  public String getPasswordInstanceReportParameters() {
    return passwordInstanceReportParameters;
  }

  public void setPasswordInstanceReportParameters(String passwordInstanceReportParameters) {
    this.passwordInstanceReportParameters = passwordInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return passwordInstanceReport
  **/

  public Object getPasswordInstanceReport() {
    return passwordInstanceReport;
  }

  public void setPasswordInstanceReport(Object passwordInstanceReport) {
    this.passwordInstanceReport = passwordInstanceReport;
  }


}

