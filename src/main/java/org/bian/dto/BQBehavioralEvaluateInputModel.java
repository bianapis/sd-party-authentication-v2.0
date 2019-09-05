package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBehavioralEvaluateInputModelBehavioralInstanceRecord;
import org.bian.dto.BQBehavioralEvaluateInputModelPartyAuthenticationAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBehavioralEvaluateInputModel
 */
public class BQBehavioralEvaluateInputModel   {
  private BQBehavioralEvaluateInputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord = null;

  private String partyAuthenticationAssessmentInstanceReference = null;

  private Object behavioralInitiateActionRecord = null;

  private BQBehavioralEvaluateInputModelBehavioralInstanceRecord behavioralInstanceRecord = null;


  /**
   * Get partyAuthenticationAssessmentInstanceRecord
   * @return partyAuthenticationAssessmentInstanceRecord
  **/

  public BQBehavioralEvaluateInputModelPartyAuthenticationAssessmentInstanceRecord getPartyAuthenticationAssessmentInstanceRecord() {
    return partyAuthenticationAssessmentInstanceRecord;
  }

  public void setPartyAuthenticationAssessmentInstanceRecord(BQBehavioralEvaluateInputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord) {
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
   * @return behavioralInitiateActionRecord
  **/

  public Object getBehavioralInitiateActionRecord() {
    return behavioralInitiateActionRecord;
  }

  public void setBehavioralInitiateActionRecord(Object behavioralInitiateActionRecord) {
    this.behavioralInitiateActionRecord = behavioralInitiateActionRecord;
  }


  /**
   * Get behavioralInstanceRecord
   * @return behavioralInstanceRecord
  **/

  public BQBehavioralEvaluateInputModelBehavioralInstanceRecord getBehavioralInstanceRecord() {
    return behavioralInstanceRecord;
  }

  public void setBehavioralInstanceRecord(BQBehavioralEvaluateInputModelBehavioralInstanceRecord behavioralInstanceRecord) {
    this.behavioralInstanceRecord = behavioralInstanceRecord;
  }


}

