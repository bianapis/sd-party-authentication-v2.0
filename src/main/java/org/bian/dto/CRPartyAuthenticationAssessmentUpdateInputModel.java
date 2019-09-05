package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyAuthenticationAssessmentUpdateInputModelPartyAuthenticationAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRPartyAuthenticationAssessmentUpdateInputModel
 */
public class CRPartyAuthenticationAssessmentUpdateInputModel   {
  private String partyAuthenticationServicingSessionReference = null;

  private String partyAuthenticationAssessmentInstanceReference = null;

  private CRPartyAuthenticationAssessmentUpdateInputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord = null;

  private Object partyAuthenticationAssessmentUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get partyAuthenticationAssessmentInstanceRecord
   * @return partyAuthenticationAssessmentInstanceRecord
  **/

  public CRPartyAuthenticationAssessmentUpdateInputModelPartyAuthenticationAssessmentInstanceRecord getPartyAuthenticationAssessmentInstanceRecord() {
    return partyAuthenticationAssessmentInstanceRecord;
  }

  public void setPartyAuthenticationAssessmentInstanceRecord(CRPartyAuthenticationAssessmentUpdateInputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord) {
    this.partyAuthenticationAssessmentInstanceRecord = partyAuthenticationAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return partyAuthenticationAssessmentUpdateActionTaskRecord
  **/

  public Object getPartyAuthenticationAssessmentUpdateActionTaskRecord() {
    return partyAuthenticationAssessmentUpdateActionTaskRecord;
  }

  public void setPartyAuthenticationAssessmentUpdateActionTaskRecord(Object partyAuthenticationAssessmentUpdateActionTaskRecord) {
    this.partyAuthenticationAssessmentUpdateActionTaskRecord = partyAuthenticationAssessmentUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

