package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPasswordRetrieveOutputModelPasswordInstanceAnalysis
 */
public class BQPasswordRetrieveOutputModelPasswordInstanceAnalysis   {
  private Object passwordInstanceAnalysisRecord = null;

  private String passwordInstanceAnalysisReportType = null;

  private String passwordInstanceAnalysisParameters = null;

  private Object passwordInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return passwordInstanceAnalysisRecord
  **/

  public Object getPasswordInstanceAnalysisRecord() {
    return passwordInstanceAnalysisRecord;
  }

  public void setPasswordInstanceAnalysisRecord(Object passwordInstanceAnalysisRecord) {
    this.passwordInstanceAnalysisRecord = passwordInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return passwordInstanceAnalysisReportType
  **/

  public String getPasswordInstanceAnalysisReportType() {
    return passwordInstanceAnalysisReportType;
  }

  public void setPasswordInstanceAnalysisReportType(String passwordInstanceAnalysisReportType) {
    this.passwordInstanceAnalysisReportType = passwordInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return passwordInstanceAnalysisParameters
  **/

  public String getPasswordInstanceAnalysisParameters() {
    return passwordInstanceAnalysisParameters;
  }

  public void setPasswordInstanceAnalysisParameters(String passwordInstanceAnalysisParameters) {
    this.passwordInstanceAnalysisParameters = passwordInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return passwordInstanceAnalysisReport
  **/

  public Object getPasswordInstanceAnalysisReport() {
    return passwordInstanceAnalysisReport;
  }

  public void setPasswordInstanceAnalysisReport(Object passwordInstanceAnalysisReport) {
    this.passwordInstanceAnalysisReport = passwordInstanceAnalysisReport;
  }


}

