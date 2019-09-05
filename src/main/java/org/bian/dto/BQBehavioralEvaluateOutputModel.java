package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBehavioralEvaluateOutputModelBehavioralInstanceRecord;
import org.bian.dto.BQPasswordEvaluateOutputModelPartyAuthenticationAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBehavioralEvaluateOutputModel
 */
public class BQBehavioralEvaluateOutputModel   {
  private BQPasswordEvaluateOutputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord = null;

  private String behavioralInstanceReference = null;

  private String behavioralInitiateActionReference = null;

  private Object behavioralInitiateActionRecord = null;

  private String behavioralInstanceStatus = null;

  private BQBehavioralEvaluateOutputModelBehavioralInstanceRecord behavioralInstanceRecord = null;


  /**
   * Get partyAuthenticationAssessmentInstanceRecord
   * @return partyAuthenticationAssessmentInstanceRecord
  **/

  public BQPasswordEvaluateOutputModelPartyAuthenticationAssessmentInstanceRecord getPartyAuthenticationAssessmentInstanceRecord() {
    return partyAuthenticationAssessmentInstanceRecord;
  }

  public void setPartyAuthenticationAssessmentInstanceRecord(BQPasswordEvaluateOutputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord) {
    this.partyAuthenticationAssessmentInstanceRecord = partyAuthenticationAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Behavioral instance 
   * @return behavioralInstanceReference
  **/

  public String getBehavioralInstanceReference() {
    return behavioralInstanceReference;
  }

  public void setBehavioralInstanceReference(String behavioralInstanceReference) {
    this.behavioralInstanceReference = behavioralInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return behavioralInitiateActionReference
  **/

  public String getBehavioralInitiateActionReference() {
    return behavioralInitiateActionReference;
  }

  public void setBehavioralInitiateActionReference(String behavioralInitiateActionReference) {
    this.behavioralInitiateActionReference = behavioralInitiateActionReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Behavioral instance (e.g. initialised, pending, active) 
   * @return behavioralInstanceStatus
  **/

  public String getBehavioralInstanceStatus() {
    return behavioralInstanceStatus;
  }

  public void setBehavioralInstanceStatus(String behavioralInstanceStatus) {
    this.behavioralInstanceStatus = behavioralInstanceStatus;
  }


  /**
   * Get behavioralInstanceRecord
   * @return behavioralInstanceRecord
  **/

  public BQBehavioralEvaluateOutputModelBehavioralInstanceRecord getBehavioralInstanceRecord() {
    return behavioralInstanceRecord;
  }

  public void setBehavioralInstanceRecord(BQBehavioralEvaluateOutputModelBehavioralInstanceRecord behavioralInstanceRecord) {
    this.behavioralInstanceRecord = behavioralInstanceRecord;
  }


}

