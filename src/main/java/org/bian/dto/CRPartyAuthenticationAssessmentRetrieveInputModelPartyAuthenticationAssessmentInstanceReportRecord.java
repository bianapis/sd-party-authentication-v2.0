package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPartyAuthenticationAssessmentRetrieveInputModelPartyAuthenticationAssessmentInstanceReportRecord
 */
public class CRPartyAuthenticationAssessmentRetrieveInputModelPartyAuthenticationAssessmentInstanceReportRecord   {
  private String partyAuthenticationAssessmentInstanceReportReference = null;

  private String partyAuthenticationAssessmentInstanceReportType = null;

  private String partyAuthenticationAssessmentInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return partyAuthenticationAssessmentInstanceReportReference
  **/

  public String getPartyAuthenticationAssessmentInstanceReportReference() {
    return partyAuthenticationAssessmentInstanceReportReference;
  }

  public void setPartyAuthenticationAssessmentInstanceReportReference(String partyAuthenticationAssessmentInstanceReportReference) {
    this.partyAuthenticationAssessmentInstanceReportReference = partyAuthenticationAssessmentInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return partyAuthenticationAssessmentInstanceReportType
  **/

  public String getPartyAuthenticationAssessmentInstanceReportType() {
    return partyAuthenticationAssessmentInstanceReportType;
  }

  public void setPartyAuthenticationAssessmentInstanceReportType(String partyAuthenticationAssessmentInstanceReportType) {
    this.partyAuthenticationAssessmentInstanceReportType = partyAuthenticationAssessmentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return partyAuthenticationAssessmentInstanceReportParameters
  **/

  public String getPartyAuthenticationAssessmentInstanceReportParameters() {
    return partyAuthenticationAssessmentInstanceReportParameters;
  }

  public void setPartyAuthenticationAssessmentInstanceReportParameters(String partyAuthenticationAssessmentInstanceReportParameters) {
    this.partyAuthenticationAssessmentInstanceReportParameters = partyAuthenticationAssessmentInstanceReportParameters;
  }


}

