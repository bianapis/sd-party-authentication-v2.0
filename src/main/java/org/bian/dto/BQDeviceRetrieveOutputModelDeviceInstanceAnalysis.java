package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDeviceRetrieveOutputModelDeviceInstanceAnalysis
 */
public class BQDeviceRetrieveOutputModelDeviceInstanceAnalysis   {
  private Object deviceInstanceAnalysisRecord = null;

  private String deviceInstanceAnalysisReportType = null;

  private String deviceInstanceAnalysisParameters = null;

  private Object deviceInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return deviceInstanceAnalysisRecord
  **/

  public Object getDeviceInstanceAnalysisRecord() {
    return deviceInstanceAnalysisRecord;
  }

  public void setDeviceInstanceAnalysisRecord(Object deviceInstanceAnalysisRecord) {
    this.deviceInstanceAnalysisRecord = deviceInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return deviceInstanceAnalysisReportType
  **/

  public String getDeviceInstanceAnalysisReportType() {
    return deviceInstanceAnalysisReportType;
  }

  public void setDeviceInstanceAnalysisReportType(String deviceInstanceAnalysisReportType) {
    this.deviceInstanceAnalysisReportType = deviceInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return deviceInstanceAnalysisParameters
  **/

  public String getDeviceInstanceAnalysisParameters() {
    return deviceInstanceAnalysisParameters;
  }

  public void setDeviceInstanceAnalysisParameters(String deviceInstanceAnalysisParameters) {
    this.deviceInstanceAnalysisParameters = deviceInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return deviceInstanceAnalysisReport
  **/

  public Object getDeviceInstanceAnalysisReport() {
    return deviceInstanceAnalysisReport;
  }

  public void setDeviceInstanceAnalysisReport(Object deviceInstanceAnalysisReport) {
    this.deviceInstanceAnalysisReport = deviceInstanceAnalysisReport;
  }


}

