package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPartyAuthenticationAssessmentRetrieveOutputModelPartyAuthenticationAssessmentInstanceAnalysis
 */
public class CRPartyAuthenticationAssessmentRetrieveOutputModelPartyAuthenticationAssessmentInstanceAnalysis   {
  private String partyAuthenticationAssessmentInstanceAnalysisData = null;

  private String partyAuthenticationAssessmentInstanceAnalysisReportType = null;

  private Object partyAuthenticationAssessmentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return partyAuthenticationAssessmentInstanceAnalysisData
  **/

  public String getPartyAuthenticationAssessmentInstanceAnalysisData() {
    return partyAuthenticationAssessmentInstanceAnalysisData;
  }

  public void setPartyAuthenticationAssessmentInstanceAnalysisData(String partyAuthenticationAssessmentInstanceAnalysisData) {
    this.partyAuthenticationAssessmentInstanceAnalysisData = partyAuthenticationAssessmentInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return partyAuthenticationAssessmentInstanceAnalysisReportType
  **/

  public String getPartyAuthenticationAssessmentInstanceAnalysisReportType() {
    return partyAuthenticationAssessmentInstanceAnalysisReportType;
  }

  public void setPartyAuthenticationAssessmentInstanceAnalysisReportType(String partyAuthenticationAssessmentInstanceAnalysisReportType) {
    this.partyAuthenticationAssessmentInstanceAnalysisReportType = partyAuthenticationAssessmentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return partyAuthenticationAssessmentInstanceAnalysisReport
  **/

  public Object getPartyAuthenticationAssessmentInstanceAnalysisReport() {
    return partyAuthenticationAssessmentInstanceAnalysisReport;
  }

  public void setPartyAuthenticationAssessmentInstanceAnalysisReport(Object partyAuthenticationAssessmentInstanceAnalysisReport) {
    this.partyAuthenticationAssessmentInstanceAnalysisReport = partyAuthenticationAssessmentInstanceAnalysisReport;
  }


}

