package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPasswordEvaluateInputModelPartyAuthenticationAssessmentInstanceRecord;
import org.bian.dto.BQPasswordEvaluateInputModelPasswordInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPasswordEvaluateInputModel
 */
public class BQPasswordEvaluateInputModel   {
  private BQPasswordEvaluateInputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord = null;

  private String partyAuthenticationAssessmentInstanceReference = null;

  private Object passwordInitiateActionRecord = null;

  private BQPasswordEvaluateInputModelPasswordInstanceRecord passwordInstanceRecord = null;


  /**
   * Get partyAuthenticationAssessmentInstanceRecord
   * @return partyAuthenticationAssessmentInstanceRecord
  **/

  public BQPasswordEvaluateInputModelPartyAuthenticationAssessmentInstanceRecord getPartyAuthenticationAssessmentInstanceRecord() {
    return partyAuthenticationAssessmentInstanceRecord;
  }

  public void setPartyAuthenticationAssessmentInstanceRecord(BQPasswordEvaluateInputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord) {
    this.partyAuthenticationAssessmentInstanceRecord = partyAuthenticationAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Party Authentication Assessment instance 
   * @return partyAuthenticationAssessmentInstanceReference
  **/

  public String getPartyAuthenticationAssessmentInstanceReference() {
    return partyAuthenticationAssessmentInstanceReference;
  }

  public void setPartyAuthenticationAssessmentInstanceReference(String partyAuthenticationAssessmentInstanceReference) {
    this.partyAuthenticationAssessmentInstanceReference = partyAuthenticationAssessmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return passwordInitiateActionRecord
  **/

  public Object getPasswordInitiateActionRecord() {
    return passwordInitiateActionRecord;
  }

  public void setPasswordInitiateActionRecord(Object passwordInitiateActionRecord) {
    this.passwordInitiateActionRecord = passwordInitiateActionRecord;
  }


  /**
   * Get passwordInstanceRecord
   * @return passwordInstanceRecord
  **/

  public BQPasswordEvaluateInputModelPasswordInstanceRecord getPasswordInstanceRecord() {
    return passwordInstanceRecord;
  }

  public void setPasswordInstanceRecord(BQPasswordEvaluateInputModelPasswordInstanceRecord passwordInstanceRecord) {
    this.passwordInstanceRecord = passwordInstanceRecord;
  }


}

