package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyAuthenticationAssessmentExecuteInputModelExecuteRecordType;
import org.bian.dto.CRPartyAuthenticationAssessmentExecuteInputModelPartyAuthenticationAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRPartyAuthenticationAssessmentExecuteInputModel
 */
public class CRPartyAuthenticationAssessmentExecuteInputModel   {
  private String partyAuthenticationServicingSessionReference = null;

  private String partyAuthenticationAssessmentInstanceReference = null;

  private CRPartyAuthenticationAssessmentExecuteInputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord = null;

  private Object partyAuthenticationAssessmentExecuteActionTaskRecord = null;

  private CRPartyAuthenticationAssessmentExecuteInputModelExecuteRecordType executeRecordType = null;


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

  public CRPartyAuthenticationAssessmentExecuteInputModelPartyAuthenticationAssessmentInstanceRecord getPartyAuthenticationAssessmentInstanceRecord() {
    return partyAuthenticationAssessmentInstanceRecord;
  }

  public void setPartyAuthenticationAssessmentInstanceRecord(CRPartyAuthenticationAssessmentExecuteInputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord) {
    this.partyAuthenticationAssessmentInstanceRecord = partyAuthenticationAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return partyAuthenticationAssessmentExecuteActionTaskRecord
  **/

  public Object getPartyAuthenticationAssessmentExecuteActionTaskRecord() {
    return partyAuthenticationAssessmentExecuteActionTaskRecord;
  }

  public void setPartyAuthenticationAssessmentExecuteActionTaskRecord(Object partyAuthenticationAssessmentExecuteActionTaskRecord) {
    this.partyAuthenticationAssessmentExecuteActionTaskRecord = partyAuthenticationAssessmentExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRPartyAuthenticationAssessmentExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRPartyAuthenticationAssessmentExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

