package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyAuthenticationAssessmentRequestInputModelPartyAuthenticationAssessmentInstanceRecord;
import org.bian.dto.CRPartyAuthenticationAssessmentRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRPartyAuthenticationAssessmentRequestInputModel
 */
public class CRPartyAuthenticationAssessmentRequestInputModel   {
  private String partyAuthenticationServicingSessionReference = null;

  private String partyAuthenticationAssessmentInstanceReference = null;

  private CRPartyAuthenticationAssessmentRequestInputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord = null;

  private Object partyAuthenticationAssessmentRequestActionTaskRecord = null;

  private CRPartyAuthenticationAssessmentRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRPartyAuthenticationAssessmentRequestInputModelPartyAuthenticationAssessmentInstanceRecord getPartyAuthenticationAssessmentInstanceRecord() {
    return partyAuthenticationAssessmentInstanceRecord;
  }

  public void setPartyAuthenticationAssessmentInstanceRecord(CRPartyAuthenticationAssessmentRequestInputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord) {
    this.partyAuthenticationAssessmentInstanceRecord = partyAuthenticationAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return partyAuthenticationAssessmentRequestActionTaskRecord
  **/

  public Object getPartyAuthenticationAssessmentRequestActionTaskRecord() {
    return partyAuthenticationAssessmentRequestActionTaskRecord;
  }

  public void setPartyAuthenticationAssessmentRequestActionTaskRecord(Object partyAuthenticationAssessmentRequestActionTaskRecord) {
    this.partyAuthenticationAssessmentRequestActionTaskRecord = partyAuthenticationAssessmentRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRPartyAuthenticationAssessmentRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRPartyAuthenticationAssessmentRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

