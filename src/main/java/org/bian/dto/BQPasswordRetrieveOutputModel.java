package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPasswordRetrieveOutputModelPartyAuthenticationAssessmentInstanceRecord;
import org.bian.dto.BQPasswordRetrieveOutputModelPasswordInstanceAnalysis;
import org.bian.dto.BQPasswordRetrieveOutputModelPasswordInstanceRecord;
import org.bian.dto.BQPasswordRetrieveOutputModelPasswordInstanceReport;

import javax.validation.Valid;
  
/**
 * BQPasswordRetrieveOutputModel
 */
public class BQPasswordRetrieveOutputModel   {
  private BQPasswordRetrieveOutputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord = null;

  private BQPasswordRetrieveOutputModelPasswordInstanceRecord passwordInstanceRecord = null;

  private String passwordRetrieveActionTaskReference = null;

  private Object passwordRetrieveActionTaskRecord = null;

  private String passwordRetrieveActionResponse = null;

  private BQPasswordRetrieveOutputModelPasswordInstanceReport passwordInstanceReport = null;

  private BQPasswordRetrieveOutputModelPasswordInstanceAnalysis passwordInstanceAnalysis = null;


  /**
   * Get partyAuthenticationAssessmentInstanceRecord
   * @return partyAuthenticationAssessmentInstanceRecord
  **/

  public BQPasswordRetrieveOutputModelPartyAuthenticationAssessmentInstanceRecord getPartyAuthenticationAssessmentInstanceRecord() {
    return partyAuthenticationAssessmentInstanceRecord;
  }

  public void setPartyAuthenticationAssessmentInstanceRecord(BQPasswordRetrieveOutputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord) {
    this.partyAuthenticationAssessmentInstanceRecord = partyAuthenticationAssessmentInstanceRecord;
  }


  /**
   * Get passwordInstanceRecord
   * @return passwordInstanceRecord
  **/

  public BQPasswordRetrieveOutputModelPasswordInstanceRecord getPasswordInstanceRecord() {
    return passwordInstanceRecord;
  }

  public void setPasswordInstanceRecord(BQPasswordRetrieveOutputModelPasswordInstanceRecord passwordInstanceRecord) {
    this.passwordInstanceRecord = passwordInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Password instance retrieve service call 
   * @return passwordRetrieveActionTaskReference
  **/

  public String getPasswordRetrieveActionTaskReference() {
    return passwordRetrieveActionTaskReference;
  }

  public void setPasswordRetrieveActionTaskReference(String passwordRetrieveActionTaskReference) {
    this.passwordRetrieveActionTaskReference = passwordRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return passwordRetrieveActionResponse
  **/

  public String getPasswordRetrieveActionResponse() {
    return passwordRetrieveActionResponse;
  }

  public void setPasswordRetrieveActionResponse(String passwordRetrieveActionResponse) {
    this.passwordRetrieveActionResponse = passwordRetrieveActionResponse;
  }


  /**
   * Get passwordInstanceReport
   * @return passwordInstanceReport
  **/

  public BQPasswordRetrieveOutputModelPasswordInstanceReport getPasswordInstanceReport() {
    return passwordInstanceReport;
  }

  public void setPasswordInstanceReport(BQPasswordRetrieveOutputModelPasswordInstanceReport passwordInstanceReport) {
    this.passwordInstanceReport = passwordInstanceReport;
  }


  /**
   * Get passwordInstanceAnalysis
   * @return passwordInstanceAnalysis
  **/

  public BQPasswordRetrieveOutputModelPasswordInstanceAnalysis getPasswordInstanceAnalysis() {
    return passwordInstanceAnalysis;
  }

  public void setPasswordInstanceAnalysis(BQPasswordRetrieveOutputModelPasswordInstanceAnalysis passwordInstanceAnalysis) {
    this.passwordInstanceAnalysis = passwordInstanceAnalysis;
  }


}

