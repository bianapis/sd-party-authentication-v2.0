package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyAuthenticationAssessmentRetrieveOutputModelPartyAuthenticationAssessmentInstanceAnalysis;
import org.bian.dto.CRPartyAuthenticationAssessmentRetrieveOutputModelPartyAuthenticationAssessmentInstanceRecord;
import org.bian.dto.CRPartyAuthenticationAssessmentRetrieveOutputModelPartyAuthenticationAssessmentInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRPartyAuthenticationAssessmentRetrieveOutputModel
 */
public class CRPartyAuthenticationAssessmentRetrieveOutputModel   {
  private CRPartyAuthenticationAssessmentRetrieveOutputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord = null;

  private String partyAuthenticationAssessmentRetrieveActionTaskReference = null;

  private Object partyAuthenticationAssessmentRetrieveActionTaskRecord = null;

  private String partyAuthenticationAssessmentRetrieveActionResponse = null;

  private CRPartyAuthenticationAssessmentRetrieveOutputModelPartyAuthenticationAssessmentInstanceReportRecord partyAuthenticationAssessmentInstanceReportRecord = null;

  private CRPartyAuthenticationAssessmentRetrieveOutputModelPartyAuthenticationAssessmentInstanceAnalysis partyAuthenticationAssessmentInstanceAnalysis = null;


  /**
   * Get partyAuthenticationAssessmentInstanceRecord
   * @return partyAuthenticationAssessmentInstanceRecord
  **/

  public CRPartyAuthenticationAssessmentRetrieveOutputModelPartyAuthenticationAssessmentInstanceRecord getPartyAuthenticationAssessmentInstanceRecord() {
    return partyAuthenticationAssessmentInstanceRecord;
  }

  public void setPartyAuthenticationAssessmentInstanceRecord(CRPartyAuthenticationAssessmentRetrieveOutputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord) {
    this.partyAuthenticationAssessmentInstanceRecord = partyAuthenticationAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Party Authentication Assessment instance retrieve service call 
   * @return partyAuthenticationAssessmentRetrieveActionTaskReference
  **/

  public String getPartyAuthenticationAssessmentRetrieveActionTaskReference() {
    return partyAuthenticationAssessmentRetrieveActionTaskReference;
  }

  public void setPartyAuthenticationAssessmentRetrieveActionTaskReference(String partyAuthenticationAssessmentRetrieveActionTaskReference) {
    this.partyAuthenticationAssessmentRetrieveActionTaskReference = partyAuthenticationAssessmentRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return partyAuthenticationAssessmentRetrieveActionResponse
  **/

  public String getPartyAuthenticationAssessmentRetrieveActionResponse() {
    return partyAuthenticationAssessmentRetrieveActionResponse;
  }

  public void setPartyAuthenticationAssessmentRetrieveActionResponse(String partyAuthenticationAssessmentRetrieveActionResponse) {
    this.partyAuthenticationAssessmentRetrieveActionResponse = partyAuthenticationAssessmentRetrieveActionResponse;
  }


  /**
   * Get partyAuthenticationAssessmentInstanceReportRecord
   * @return partyAuthenticationAssessmentInstanceReportRecord
  **/

  public CRPartyAuthenticationAssessmentRetrieveOutputModelPartyAuthenticationAssessmentInstanceReportRecord getPartyAuthenticationAssessmentInstanceReportRecord() {
    return partyAuthenticationAssessmentInstanceReportRecord;
  }

  public void setPartyAuthenticationAssessmentInstanceReportRecord(CRPartyAuthenticationAssessmentRetrieveOutputModelPartyAuthenticationAssessmentInstanceReportRecord partyAuthenticationAssessmentInstanceReportRecord) {
    this.partyAuthenticationAssessmentInstanceReportRecord = partyAuthenticationAssessmentInstanceReportRecord;
  }


  /**
   * Get partyAuthenticationAssessmentInstanceAnalysis
   * @return partyAuthenticationAssessmentInstanceAnalysis
  **/

  public CRPartyAuthenticationAssessmentRetrieveOutputModelPartyAuthenticationAssessmentInstanceAnalysis getPartyAuthenticationAssessmentInstanceAnalysis() {
    return partyAuthenticationAssessmentInstanceAnalysis;
  }

  public void setPartyAuthenticationAssessmentInstanceAnalysis(CRPartyAuthenticationAssessmentRetrieveOutputModelPartyAuthenticationAssessmentInstanceAnalysis partyAuthenticationAssessmentInstanceAnalysis) {
    this.partyAuthenticationAssessmentInstanceAnalysis = partyAuthenticationAssessmentInstanceAnalysis;
  }


}

