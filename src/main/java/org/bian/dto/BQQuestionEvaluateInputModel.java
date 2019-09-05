package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQQuestionEvaluateInputModelPartyAuthenticationAssessmentInstanceRecord;
import org.bian.dto.BQQuestionEvaluateInputModelQuestionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQQuestionEvaluateInputModel
 */
public class BQQuestionEvaluateInputModel   {
  private BQQuestionEvaluateInputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord = null;

  private String partyAuthenticationAssessmentInstanceReference = null;

  private Object questionInitiateActionRecord = null;

  private BQQuestionEvaluateInputModelQuestionInstanceRecord questionInstanceRecord = null;


  /**
   * Get partyAuthenticationAssessmentInstanceRecord
   * @return partyAuthenticationAssessmentInstanceRecord
  **/

  public BQQuestionEvaluateInputModelPartyAuthenticationAssessmentInstanceRecord getPartyAuthenticationAssessmentInstanceRecord() {
    return partyAuthenticationAssessmentInstanceRecord;
  }

  public void setPartyAuthenticationAssessmentInstanceRecord(BQQuestionEvaluateInputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord) {
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
   * @return questionInitiateActionRecord
  **/

  public Object getQuestionInitiateActionRecord() {
    return questionInitiateActionRecord;
  }

  public void setQuestionInitiateActionRecord(Object questionInitiateActionRecord) {
    this.questionInitiateActionRecord = questionInitiateActionRecord;
  }


  /**
   * Get questionInstanceRecord
   * @return questionInstanceRecord
  **/

  public BQQuestionEvaluateInputModelQuestionInstanceRecord getQuestionInstanceRecord() {
    return questionInstanceRecord;
  }

  public void setQuestionInstanceRecord(BQQuestionEvaluateInputModelQuestionInstanceRecord questionInstanceRecord) {
    this.questionInstanceRecord = questionInstanceRecord;
  }


}

