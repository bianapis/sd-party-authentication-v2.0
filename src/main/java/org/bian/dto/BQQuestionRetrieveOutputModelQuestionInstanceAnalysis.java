package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQQuestionRetrieveOutputModelQuestionInstanceAnalysis
 */
public class BQQuestionRetrieveOutputModelQuestionInstanceAnalysis   {
  private Object questionInstanceAnalysisRecord = null;

  private String questionInstanceAnalysisReportType = null;

  private String questionInstanceAnalysisParameters = null;

  private Object questionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return questionInstanceAnalysisRecord
  **/

  public Object getQuestionInstanceAnalysisRecord() {
    return questionInstanceAnalysisRecord;
  }

  public void setQuestionInstanceAnalysisRecord(Object questionInstanceAnalysisRecord) {
    this.questionInstanceAnalysisRecord = questionInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return questionInstanceAnalysisReportType
  **/

  public String getQuestionInstanceAnalysisReportType() {
    return questionInstanceAnalysisReportType;
  }

  public void setQuestionInstanceAnalysisReportType(String questionInstanceAnalysisReportType) {
    this.questionInstanceAnalysisReportType = questionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return questionInstanceAnalysisParameters
  **/

  public String getQuestionInstanceAnalysisParameters() {
    return questionInstanceAnalysisParameters;
  }

  public void setQuestionInstanceAnalysisParameters(String questionInstanceAnalysisParameters) {
    this.questionInstanceAnalysisParameters = questionInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return questionInstanceAnalysisReport
  **/

  public Object getQuestionInstanceAnalysisReport() {
    return questionInstanceAnalysisReport;
  }

  public void setQuestionInstanceAnalysisReport(Object questionInstanceAnalysisReport) {
    this.questionInstanceAnalysisReport = questionInstanceAnalysisReport;
  }


}

