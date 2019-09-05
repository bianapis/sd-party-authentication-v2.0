package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPartyAuthenticationAssessmentRetrieveInputModelPartyAuthenticationAssessmentInstanceAnalysis
 */
public class CRPartyAuthenticationAssessmentRetrieveInputModelPartyAuthenticationAssessmentInstanceAnalysis   {
  private String partyAuthenticationAssessmentInstanceAnalysisReference = null;

  private String partyAuthenticationAssessmentInstanceAnalysisReportType = null;

  private String partyAuthenticationAssessmentInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return partyAuthenticationAssessmentInstanceAnalysisReference
  **/

  public String getPartyAuthenticationAssessmentInstanceAnalysisReference() {
    return partyAuthenticationAssessmentInstanceAnalysisReference;
  }

  public void setPartyAuthenticationAssessmentInstanceAnalysisReference(String partyAuthenticationAssessmentInstanceAnalysisReference) {
    this.partyAuthenticationAssessmentInstanceAnalysisReference = partyAuthenticationAssessmentInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return partyAuthenticationAssessmentInstanceAnalysisParameters
  **/

  public String getPartyAuthenticationAssessmentInstanceAnalysisParameters() {
    return partyAuthenticationAssessmentInstanceAnalysisParameters;
  }

  public void setPartyAuthenticationAssessmentInstanceAnalysisParameters(String partyAuthenticationAssessmentInstanceAnalysisParameters) {
    this.partyAuthenticationAssessmentInstanceAnalysisParameters = partyAuthenticationAssessmentInstanceAnalysisParameters;
  }


}

