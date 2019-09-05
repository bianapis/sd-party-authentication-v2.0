package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQQuestionRetrieveOutputModelQuestionInstanceReport
 */
public class BQQuestionRetrieveOutputModelQuestionInstanceReport   {
  private Object questionInstanceReportRecord = null;

  private String questionInstanceReportType = null;

  private String questionInstanceReportParameters = null;

  private Object questionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return questionInstanceReportRecord
  **/

  public Object getQuestionInstanceReportRecord() {
    return questionInstanceReportRecord;
  }

  public void setQuestionInstanceReportRecord(Object questionInstanceReportRecord) {
    this.questionInstanceReportRecord = questionInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return questionInstanceReportType
  **/

  public String getQuestionInstanceReportType() {
    return questionInstanceReportType;
  }

  public void setQuestionInstanceReportType(String questionInstanceReportType) {
    this.questionInstanceReportType = questionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return questionInstanceReportParameters
  **/

  public String getQuestionInstanceReportParameters() {
    return questionInstanceReportParameters;
  }

  public void setQuestionInstanceReportParameters(String questionInstanceReportParameters) {
    this.questionInstanceReportParameters = questionInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return questionInstanceReport
  **/

  public Object getQuestionInstanceReport() {
    return questionInstanceReport;
  }

  public void setQuestionInstanceReport(Object questionInstanceReport) {
    this.questionInstanceReport = questionInstanceReport;
  }


}

