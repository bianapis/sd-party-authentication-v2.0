package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPasswordRetrieveInputModelPasswordInstanceAnalysis;
import org.bian.dto.BQPasswordRetrieveInputModelPasswordInstanceReport;

import javax.validation.Valid;
  
/**
 * BQPasswordRetrieveInputModel
 */
public class BQPasswordRetrieveInputModel   {
  private Object passwordRetrieveActionTaskRecord = null;

  private String passwordRetrieveActionRequest = null;

  private BQPasswordRetrieveInputModelPasswordInstanceReport passwordInstanceReport = null;

  private BQPasswordRetrieveInputModelPasswordInstanceAnalysis passwordInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return passwordRetrieveActionTaskRecord
  **/

  public Object getPasswordRetrieveActionTaskRecord() {
    return passwordRetrieveActionTaskRecord;
  }

  public void setPasswordRetrieveActionTaskRecord(Object passwordRetrieveActionTaskRecord) {
    this.passwordRetrieveActionTaskRecord = passwordRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return passwordRetrieveActionRequest
  **/

  public String getPasswordRetrieveActionRequest() {
    return passwordRetrieveActionRequest;
  }

  public void setPasswordRetrieveActionRequest(String passwordRetrieveActionRequest) {
    this.passwordRetrieveActionRequest = passwordRetrieveActionRequest;
  }


  /**
   * Get passwordInstanceReport
   * @return passwordInstanceReport
  **/

  public BQPasswordRetrieveInputModelPasswordInstanceReport getPasswordInstanceReport() {
    return passwordInstanceReport;
  }

  public void setPasswordInstanceReport(BQPasswordRetrieveInputModelPasswordInstanceReport passwordInstanceReport) {
    this.passwordInstanceReport = passwordInstanceReport;
  }


  /**
   * Get passwordInstanceAnalysis
   * @return passwordInstanceAnalysis
  **/

  public BQPasswordRetrieveInputModelPasswordInstanceAnalysis getPasswordInstanceAnalysis() {
    return passwordInstanceAnalysis;
  }

  public void setPasswordInstanceAnalysis(BQPasswordRetrieveInputModelPasswordInstanceAnalysis passwordInstanceAnalysis) {
    this.passwordInstanceAnalysis = passwordInstanceAnalysis;
  }


}

