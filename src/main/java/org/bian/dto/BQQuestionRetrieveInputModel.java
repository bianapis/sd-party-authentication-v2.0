package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQQuestionRetrieveInputModelQuestionInstanceAnalysis;
import org.bian.dto.BQQuestionRetrieveInputModelQuestionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQQuestionRetrieveInputModel
 */
public class BQQuestionRetrieveInputModel   {
  private Object questionRetrieveActionTaskRecord = null;

  private String questionRetrieveActionRequest = null;

  private BQQuestionRetrieveInputModelQuestionInstanceReport questionInstanceReport = null;

  private BQQuestionRetrieveInputModelQuestionInstanceAnalysis questionInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return questionRetrieveActionRequest
  **/

  public String getQuestionRetrieveActionRequest() {
    return questionRetrieveActionRequest;
  }

  public void setQuestionRetrieveActionRequest(String questionRetrieveActionRequest) {
    this.questionRetrieveActionRequest = questionRetrieveActionRequest;
  }


  /**
   * Get questionInstanceReport
   * @return questionInstanceReport
  **/

  public BQQuestionRetrieveInputModelQuestionInstanceReport getQuestionInstanceReport() {
    return questionInstanceReport;
  }

  public void setQuestionInstanceReport(BQQuestionRetrieveInputModelQuestionInstanceReport questionInstanceReport) {
    this.questionInstanceReport = questionInstanceReport;
  }


  /**
   * Get questionInstanceAnalysis
   * @return questionInstanceAnalysis
  **/

  public BQQuestionRetrieveInputModelQuestionInstanceAnalysis getQuestionInstanceAnalysis() {
    return questionInstanceAnalysis;
  }

  public void setQuestionInstanceAnalysis(BQQuestionRetrieveInputModelQuestionInstanceAnalysis questionInstanceAnalysis) {
    this.questionInstanceAnalysis = questionInstanceAnalysis;
  }


}

