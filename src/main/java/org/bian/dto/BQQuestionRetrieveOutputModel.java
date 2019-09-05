package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQQuestionRetrieveOutputModelPartyAuthenticationAssessmentInstanceRecord;
import org.bian.dto.BQQuestionRetrieveOutputModelQuestionInstanceAnalysis;
import org.bian.dto.BQQuestionRetrieveOutputModelQuestionInstanceRecord;
import org.bian.dto.BQQuestionRetrieveOutputModelQuestionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQQuestionRetrieveOutputModel
 */
public class BQQuestionRetrieveOutputModel   {
  private BQQuestionRetrieveOutputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord = null;

  private BQQuestionRetrieveOutputModelQuestionInstanceRecord questionInstanceRecord = null;

  private String questionRetrieveActionTaskReference = null;

  private Object questionRetrieveActionTaskRecord = null;

  private String questionRetrieveActionResponse = null;

  private BQQuestionRetrieveOutputModelQuestionInstanceReport questionInstanceReport = null;

  private BQQuestionRetrieveOutputModelQuestionInstanceAnalysis questionInstanceAnalysis = null;


  /**
   * Get partyAuthenticationAssessmentInstanceRecord
   * @return partyAuthenticationAssessmentInstanceRecord
  **/

  public BQQuestionRetrieveOutputModelPartyAuthenticationAssessmentInstanceRecord getPartyAuthenticationAssessmentInstanceRecord() {
    return partyAuthenticationAssessmentInstanceRecord;
  }

  public void setPartyAuthenticationAssessmentInstanceRecord(BQQuestionRetrieveOutputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord) {
    this.partyAuthenticationAssessmentInstanceRecord = partyAuthenticationAssessmentInstanceRecord;
  }


  /**
   * Get questionInstanceRecord
   * @return questionInstanceRecord
  **/

  public BQQuestionRetrieveOutputModelQuestionInstanceRecord getQuestionInstanceRecord() {
    return questionInstanceRecord;
  }

  public void setQuestionInstanceRecord(BQQuestionRetrieveOutputModelQuestionInstanceRecord questionInstanceRecord) {
    this.questionInstanceRecord = questionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Question instance retrieve service call 
   * @return questionRetrieveActionTaskReference
  **/

  public String getQuestionRetrieveActionTaskReference() {
    return questionRetrieveActionTaskReference;
  }

  public void setQuestionRetrieveActionTaskReference(String questionRetrieveActionTaskReference) {
    this.questionRetrieveActionTaskReference = questionRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return questionRetrieveActionTaskRecord
  **/

  public Object getQuestionRetrieveActionTaskRecord() {
    return questionRetrieveActionTaskRecord;
  }

  public void setQuestionRetrieveActionTaskRecord(Object questionRetrieveActionTaskRecord) {
    this.questionRetrieveActionTaskRecord = questionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return questionRetrieveActionResponse
  **/

  public String getQuestionRetrieveActionResponse() {
    return questionRetrieveActionResponse;
  }

  public void setQuestionRetrieveActionResponse(String questionRetrieveActionResponse) {
    this.questionRetrieveActionResponse = questionRetrieveActionResponse;
  }


  /**
   * Get questionInstanceReport
   * @return questionInstanceReport
  **/

  public BQQuestionRetrieveOutputModelQuestionInstanceReport getQuestionInstanceReport() {
    return questionInstanceReport;
  }

  public void setQuestionInstanceReport(BQQuestionRetrieveOutputModelQuestionInstanceReport questionInstanceReport) {
    this.questionInstanceReport = questionInstanceReport;
  }


  /**
   * Get questionInstanceAnalysis
   * @return questionInstanceAnalysis
  **/

  public BQQuestionRetrieveOutputModelQuestionInstanceAnalysis getQuestionInstanceAnalysis() {
    return questionInstanceAnalysis;
  }

  public void setQuestionInstanceAnalysis(BQQuestionRetrieveOutputModelQuestionInstanceAnalysis questionInstanceAnalysis) {
    this.questionInstanceAnalysis = questionInstanceAnalysis;
  }


}

