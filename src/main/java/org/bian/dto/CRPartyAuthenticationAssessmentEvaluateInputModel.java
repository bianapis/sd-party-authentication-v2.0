package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyAuthenticationAssessmentEvaluateInputModelPartyAuthenticationAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRPartyAuthenticationAssessmentEvaluateInputModel
 */
public class CRPartyAuthenticationAssessmentEvaluateInputModel   {
  private String partyAuthenticationServicingSessionReference = null;

  private Object partyAuthenticationAssessmentEvaluateActionRecord = null;

  private String partyAuthenticationAssessmentInstanceStatus = null;

  private CRPartyAuthenticationAssessmentEvaluateInputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Evaluate service call input and output record 
   * @return partyAuthenticationAssessmentEvaluateActionRecord
  **/

  public Object getPartyAuthenticationAssessmentEvaluateActionRecord() {
    return partyAuthenticationAssessmentEvaluateActionRecord;
  }

  public void setPartyAuthenticationAssessmentEvaluateActionRecord(Object partyAuthenticationAssessmentEvaluateActionRecord) {
    this.partyAuthenticationAssessmentEvaluateActionRecord = partyAuthenticationAssessmentEvaluateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Party Authentication Assessment instance (e.g. initialised, pending, active) 
   * @return partyAuthenticationAssessmentInstanceStatus
  **/

  public String getPartyAuthenticationAssessmentInstanceStatus() {
    return partyAuthenticationAssessmentInstanceStatus;
  }

  public void setPartyAuthenticationAssessmentInstanceStatus(String partyAuthenticationAssessmentInstanceStatus) {
    this.partyAuthenticationAssessmentInstanceStatus = partyAuthenticationAssessmentInstanceStatus;
  }


  /**
   * Get partyAuthenticationAssessmentInstanceRecord
   * @return partyAuthenticationAssessmentInstanceRecord
  **/

  public CRPartyAuthenticationAssessmentEvaluateInputModelPartyAuthenticationAssessmentInstanceRecord getPartyAuthenticationAssessmentInstanceRecord() {
    return partyAuthenticationAssessmentInstanceRecord;
  }

  public void setPartyAuthenticationAssessmentInstanceRecord(CRPartyAuthenticationAssessmentEvaluateInputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord) {
    this.partyAuthenticationAssessmentInstanceRecord = partyAuthenticationAssessmentInstanceRecord;
  }


}

