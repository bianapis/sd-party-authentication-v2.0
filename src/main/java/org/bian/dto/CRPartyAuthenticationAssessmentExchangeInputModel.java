package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyAuthenticationAssessmentExchangeInputModelPartyAuthenticationAssessmentExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRPartyAuthenticationAssessmentExchangeInputModel
 */
public class CRPartyAuthenticationAssessmentExchangeInputModel   {
  private String partyAuthenticationServicingSessionReference = null;

  private String partyAuthenticationAssessmentInstanceReference = null;

  private Object partyAuthenticationAssessmentExchangeActionTaskRecord = null;

  private CRPartyAuthenticationAssessmentExchangeInputModelPartyAuthenticationAssessmentExchangeActionRequest partyAuthenticationAssessmentExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return partyAuthenticationServicingSessionReference
  **/

  public String getPartyAuthenticationServicingSessionReference() {
    return partyAuthenticationServicingSessionReference;
  }

  public void setPartyAuthenticationServicingSessionReference(String partyAuthenticationServicingSessionReference) {
    this.partyAuthenticationServicingSessionReference = partyAuthenticationServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Party Authentication Assessment instance 
   * @return partyAuthenticationAssessmentInstanceReference
  **/

  public String getPartyAuthenticationAssessmentInstanceReference() {
    return partyAuthenticationAssessmentInstanceReference;
  }

  public void setPartyAuthenticationAssessmentInstanceReference(String partyAuthenticationAssessmentInstanceReference) {
    this.partyAuthenticationAssessmentInstanceReference = partyAuthenticationAssessmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return partyAuthenticationAssessmentExchangeActionTaskRecord
  **/

  public Object getPartyAuthenticationAssessmentExchangeActionTaskRecord() {
    return partyAuthenticationAssessmentExchangeActionTaskRecord;
  }

  public void setPartyAuthenticationAssessmentExchangeActionTaskRecord(Object partyAuthenticationAssessmentExchangeActionTaskRecord) {
    this.partyAuthenticationAssessmentExchangeActionTaskRecord = partyAuthenticationAssessmentExchangeActionTaskRecord;
  }


  /**
   * Get partyAuthenticationAssessmentExchangeActionRequest
   * @return partyAuthenticationAssessmentExchangeActionRequest
  **/

  public CRPartyAuthenticationAssessmentExchangeInputModelPartyAuthenticationAssessmentExchangeActionRequest getPartyAuthenticationAssessmentExchangeActionRequest() {
    return partyAuthenticationAssessmentExchangeActionRequest;
  }

  public void setPartyAuthenticationAssessmentExchangeActionRequest(CRPartyAuthenticationAssessmentExchangeInputModelPartyAuthenticationAssessmentExchangeActionRequest partyAuthenticationAssessmentExchangeActionRequest) {
    this.partyAuthenticationAssessmentExchangeActionRequest = partyAuthenticationAssessmentExchangeActionRequest;
  }


}

