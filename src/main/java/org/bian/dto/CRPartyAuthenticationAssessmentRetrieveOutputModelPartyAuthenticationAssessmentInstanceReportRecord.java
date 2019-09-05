package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPartyAuthenticationAssessmentRetrieveOutputModelPartyAuthenticationAssessmentInstanceReportRecord
 */
public class CRPartyAuthenticationAssessmentRetrieveOutputModelPartyAuthenticationAssessmentInstanceReportRecord   {
  private String partyAuthenticationAssessmentInstanceReportData = null;

  private String partyAuthenticationAssessmentInstanceReportType = null;

  private Object partyAuthenticationAssessmentInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return partyAuthenticationAssessmentInstanceReportData
  **/

  public String getPartyAuthenticationAssessmentInstanceReportData() {
    return partyAuthenticationAssessmentInstanceReportData;
  }

  public void setPartyAuthenticationAssessmentInstanceReportData(String partyAuthenticationAssessmentInstanceReportData) {
    this.partyAuthenticationAssessmentInstanceReportData = partyAuthenticationAssessmentInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return partyAuthenticationAssessmentInstanceReport
  **/

  public Object getPartyAuthenticationAssessmentInstanceReport() {
    return partyAuthenticationAssessmentInstanceReport;
  }

  public void setPartyAuthenticationAssessmentInstanceReport(Object partyAuthenticationAssessmentInstanceReport) {
    this.partyAuthenticationAssessmentInstanceReport = partyAuthenticationAssessmentInstanceReport;
  }


}

