package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBehavioralRetrieveOutputModelBehavioralInstanceAnalysis
 */
public class BQBehavioralRetrieveOutputModelBehavioralInstanceAnalysis   {
  private Object behavioralInstanceAnalysisRecord = null;

  private String behavioralInstanceAnalysisReportType = null;

  private String behavioralInstanceAnalysisParameters = null;

  private Object behavioralInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return behavioralInstanceAnalysisRecord
  **/

  public Object getBehavioralInstanceAnalysisRecord() {
    return behavioralInstanceAnalysisRecord;
  }

  public void setBehavioralInstanceAnalysisRecord(Object behavioralInstanceAnalysisRecord) {
    this.behavioralInstanceAnalysisRecord = behavioralInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return behavioralInstanceAnalysisReportType
  **/

  public String getBehavioralInstanceAnalysisReportType() {
    return behavioralInstanceAnalysisReportType;
  }

  public void setBehavioralInstanceAnalysisReportType(String behavioralInstanceAnalysisReportType) {
    this.behavioralInstanceAnalysisReportType = behavioralInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return behavioralInstanceAnalysisParameters
  **/

  public String getBehavioralInstanceAnalysisParameters() {
    return behavioralInstanceAnalysisParameters;
  }

  public void setBehavioralInstanceAnalysisParameters(String behavioralInstanceAnalysisParameters) {
    this.behavioralInstanceAnalysisParameters = behavioralInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return behavioralInstanceAnalysisReport
  **/

  public Object getBehavioralInstanceAnalysisReport() {
    return behavioralInstanceAnalysisReport;
  }

  public void setBehavioralInstanceAnalysisReport(Object behavioralInstanceAnalysisReport) {
    this.behavioralInstanceAnalysisReport = behavioralInstanceAnalysisReport;
  }


}

