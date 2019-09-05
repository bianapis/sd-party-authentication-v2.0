package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPartyAuthenticationAssessmentExchangeOutputModel
 */
public class CRPartyAuthenticationAssessmentExchangeOutputModel   {
  private String partyAuthenticationAssessmentExchangeActionTaskReference = null;

  private Object partyAuthenticationAssessmentExchangeActionTaskRecord = null;

  private String partyAuthenticationAssessmentExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Party Authentication Assessment instance exchange service call 
   * @return partyAuthenticationAssessmentExchangeActionTaskReference
  **/

  public String getPartyAuthenticationAssessmentExchangeActionTaskReference() {
    return partyAuthenticationAssessmentExchangeActionTaskReference;
  }

  public void setPartyAuthenticationAssessmentExchangeActionTaskReference(String partyAuthenticationAssessmentExchangeActionTaskReference) {
    this.partyAuthenticationAssessmentExchangeActionTaskReference = partyAuthenticationAssessmentExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return partyAuthenticationAssessmentExchangeActionResponse
  **/

  public String getPartyAuthenticationAssessmentExchangeActionResponse() {
    return partyAuthenticationAssessmentExchangeActionResponse;
  }

  public void setPartyAuthenticationAssessmentExchangeActionResponse(String partyAuthenticationAssessmentExchangeActionResponse) {
    this.partyAuthenticationAssessmentExchangeActionResponse = partyAuthenticationAssessmentExchangeActionResponse;
  }


}

