package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBehavioralRetrieveOutputModelBehavioralInstanceAnalysis;
import org.bian.dto.BQBehavioralRetrieveOutputModelBehavioralInstanceRecord;
import org.bian.dto.BQBehavioralRetrieveOutputModelBehavioralInstanceReport;
import org.bian.dto.BQBehavioralRetrieveOutputModelPartyAuthenticationAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBehavioralRetrieveOutputModel
 */
public class BQBehavioralRetrieveOutputModel   {
  private BQBehavioralRetrieveOutputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord = null;

  private BQBehavioralRetrieveOutputModelBehavioralInstanceRecord behavioralInstanceRecord = null;

  private String behavioralRetrieveActionTaskReference = null;

  private Object behavioralRetrieveActionTaskRecord = null;

  private String behavioralRetrieveActionResponse = null;

  private BQBehavioralRetrieveOutputModelBehavioralInstanceReport behavioralInstanceReport = null;

  private BQBehavioralRetrieveOutputModelBehavioralInstanceAnalysis behavioralInstanceAnalysis = null;


  /**
   * Get partyAuthenticationAssessmentInstanceRecord
   * @return partyAuthenticationAssessmentInstanceRecord
  **/

  public BQBehavioralRetrieveOutputModelPartyAuthenticationAssessmentInstanceRecord getPartyAuthenticationAssessmentInstanceRecord() {
    return partyAuthenticationAssessmentInstanceRecord;
  }

  public void setPartyAuthenticationAssessmentInstanceRecord(BQBehavioralRetrieveOutputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord) {
    this.partyAuthenticationAssessmentInstanceRecord = partyAuthenticationAssessmentInstanceRecord;
  }


  /**
   * Get behavioralInstanceRecord
   * @return behavioralInstanceRecord
  **/

  public BQBehavioralRetrieveOutputModelBehavioralInstanceRecord getBehavioralInstanceRecord() {
    return behavioralInstanceRecord;
  }

  public void setBehavioralInstanceRecord(BQBehavioralRetrieveOutputModelBehavioralInstanceRecord behavioralInstanceRecord) {
    this.behavioralInstanceRecord = behavioralInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Behavioral instance retrieve service call 
   * @return behavioralRetrieveActionTaskReference
  **/

  public String getBehavioralRetrieveActionTaskReference() {
    return behavioralRetrieveActionTaskReference;
  }

  public void setBehavioralRetrieveActionTaskReference(String behavioralRetrieveActionTaskReference) {
    this.behavioralRetrieveActionTaskReference = behavioralRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return behavioralRetrieveActionTaskRecord
  **/

  public Object getBehavioralRetrieveActionTaskRecord() {
    return behavioralRetrieveActionTaskRecord;
  }

  public void setBehavioralRetrieveActionTaskRecord(Object behavioralRetrieveActionTaskRecord) {
    this.behavioralRetrieveActionTaskRecord = behavioralRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return behavioralRetrieveActionResponse
  **/

  public String getBehavioralRetrieveActionResponse() {
    return behavioralRetrieveActionResponse;
  }

  public void setBehavioralRetrieveActionResponse(String behavioralRetrieveActionResponse) {
    this.behavioralRetrieveActionResponse = behavioralRetrieveActionResponse;
  }


  /**
   * Get behavioralInstanceReport
   * @return behavioralInstanceReport
  **/

  public BQBehavioralRetrieveOutputModelBehavioralInstanceReport getBehavioralInstanceReport() {
    return behavioralInstanceReport;
  }

  public void setBehavioralInstanceReport(BQBehavioralRetrieveOutputModelBehavioralInstanceReport behavioralInstanceReport) {
    this.behavioralInstanceReport = behavioralInstanceReport;
  }


  /**
   * Get behavioralInstanceAnalysis
   * @return behavioralInstanceAnalysis
  **/

  public BQBehavioralRetrieveOutputModelBehavioralInstanceAnalysis getBehavioralInstanceAnalysis() {
    return behavioralInstanceAnalysis;
  }

  public void setBehavioralInstanceAnalysis(BQBehavioralRetrieveOutputModelBehavioralInstanceAnalysis behavioralInstanceAnalysis) {
    this.behavioralInstanceAnalysis = behavioralInstanceAnalysis;
  }


}

