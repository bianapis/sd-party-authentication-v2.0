package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyAuthenticationAssessmentRetrieveInputModelPartyAuthenticationAssessmentInstanceAnalysis;
import org.bian.dto.CRPartyAuthenticationAssessmentRetrieveInputModelPartyAuthenticationAssessmentInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRPartyAuthenticationAssessmentRetrieveInputModel
 */
public class CRPartyAuthenticationAssessmentRetrieveInputModel   {
  private Object partyAuthenticationAssessmentRetrieveActionTaskRecord = null;

  private String partyAuthenticationAssessmentRetrieveActionRequest = null;

  private CRPartyAuthenticationAssessmentRetrieveInputModelPartyAuthenticationAssessmentInstanceReportRecord partyAuthenticationAssessmentInstanceReportRecord = null;

  private CRPartyAuthenticationAssessmentRetrieveInputModelPartyAuthenticationAssessmentInstanceAnalysis partyAuthenticationAssessmentInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return partyAuthenticationAssessmentRetrieveActionTaskRecord
  **/

  public Object getPartyAuthenticationAssessmentRetrieveActionTaskRecord() {
    return partyAuthenticationAssessmentRetrieveActionTaskRecord;
  }

  public void setPartyAuthenticationAssessmentRetrieveActionTaskRecord(Object partyAuthenticationAssessmentRetrieveActionTaskRecord) {
    this.partyAuthenticationAssessmentRetrieveActionTaskRecord = partyAuthenticationAssessmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return partyAuthenticationAssessmentRetrieveActionRequest
  **/

  public String getPartyAuthenticationAssessmentRetrieveActionRequest() {
    return partyAuthenticationAssessmentRetrieveActionRequest;
  }

  public void setPartyAuthenticationAssessmentRetrieveActionRequest(String partyAuthenticationAssessmentRetrieveActionRequest) {
    this.partyAuthenticationAssessmentRetrieveActionRequest = partyAuthenticationAssessmentRetrieveActionRequest;
  }


  /**
   * Get partyAuthenticationAssessmentInstanceReportRecord
   * @return partyAuthenticationAssessmentInstanceReportRecord
  **/

  public CRPartyAuthenticationAssessmentRetrieveInputModelPartyAuthenticationAssessmentInstanceReportRecord getPartyAuthenticationAssessmentInstanceReportRecord() {
    return partyAuthenticationAssessmentInstanceReportRecord;
  }

  public void setPartyAuthenticationAssessmentInstanceReportRecord(CRPartyAuthenticationAssessmentRetrieveInputModelPartyAuthenticationAssessmentInstanceReportRecord partyAuthenticationAssessmentInstanceReportRecord) {
    this.partyAuthenticationAssessmentInstanceReportRecord = partyAuthenticationAssessmentInstanceReportRecord;
  }


  /**
   * Get partyAuthenticationAssessmentInstanceAnalysis
   * @return partyAuthenticationAssessmentInstanceAnalysis
  **/

  public CRPartyAuthenticationAssessmentRetrieveInputModelPartyAuthenticationAssessmentInstanceAnalysis getPartyAuthenticationAssessmentInstanceAnalysis() {
    return partyAuthenticationAssessmentInstanceAnalysis;
  }

  public void setPartyAuthenticationAssessmentInstanceAnalysis(CRPartyAuthenticationAssessmentRetrieveInputModelPartyAuthenticationAssessmentInstanceAnalysis partyAuthenticationAssessmentInstanceAnalysis) {
    this.partyAuthenticationAssessmentInstanceAnalysis = partyAuthenticationAssessmentInstanceAnalysis;
  }


}

