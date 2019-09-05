package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPasswordEvaluateOutputModelPartyAuthenticationAssessmentInstanceRecord;
import org.bian.dto.BQQuestionEvaluateOutputModelQuestionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQQuestionEvaluateOutputModel
 */
public class BQQuestionEvaluateOutputModel   {
  private BQPasswordEvaluateOutputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord = null;

  private String questionInstanceReference = null;

  private String questionInitiateActionReference = null;

  private Object questionInitiateActionRecord = null;

  private String questionInstanceStatus = null;

  private BQQuestionEvaluateOutputModelQuestionInstanceRecord questionInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Question instance 
   * @return questionInstanceReference
  **/

  public String getQuestionInstanceReference() {
    return questionInstanceReference;
  }

  public void setQuestionInstanceReference(String questionInstanceReference) {
    this.questionInstanceReference = questionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return questionInitiateActionReference
  **/

  public String getQuestionInitiateActionReference() {
    return questionInitiateActionReference;
  }

  public void setQuestionInitiateActionReference(String questionInitiateActionReference) {
    this.questionInitiateActionReference = questionInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return questionInitiateActionRecord
  **/

  public Object getQuestionInitiateActionRecord() {
    return questionInitiateActionRecord;
  }

  public void setQuestionInitiateActionRecord(Object questionInitiateActionRecord) {
    this.questionInitiateActionRecord = questionInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Question instance (e.g. initialised, pending, active) 
   * @return questionInstanceStatus
  **/

  public String getQuestionInstanceStatus() {
    return questionInstanceStatus;
  }

  public void setQuestionInstanceStatus(String questionInstanceStatus) {
    this.questionInstanceStatus = questionInstanceStatus;
  }


  /**
   * Get questionInstanceRecord
   * @return questionInstanceRecord
  **/

  public BQQuestionEvaluateOutputModelQuestionInstanceRecord getQuestionInstanceRecord() {
    return questionInstanceRecord;
  }

  public void setQuestionInstanceRecord(BQQuestionEvaluateOutputModelQuestionInstanceRecord questionInstanceRecord) {
    this.questionInstanceRecord = questionInstanceRecord;
  }


}

