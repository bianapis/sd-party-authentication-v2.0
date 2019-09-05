package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBehavioralRetrieveInputModelBehavioralInstanceAnalysis;
import org.bian.dto.BQBehavioralRetrieveInputModelBehavioralInstanceReport;

import javax.validation.Valid;
  
/**
 * BQBehavioralRetrieveInputModel
 */
public class BQBehavioralRetrieveInputModel   {
  private Object behavioralRetrieveActionTaskRecord = null;

  private String behavioralRetrieveActionRequest = null;

  private BQBehavioralRetrieveInputModelBehavioralInstanceReport behavioralInstanceReport = null;

  private BQBehavioralRetrieveInputModelBehavioralInstanceAnalysis behavioralInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return behavioralRetrieveActionRequest
  **/

  public String getBehavioralRetrieveActionRequest() {
    return behavioralRetrieveActionRequest;
  }

  public void setBehavioralRetrieveActionRequest(String behavioralRetrieveActionRequest) {
    this.behavioralRetrieveActionRequest = behavioralRetrieveActionRequest;
  }


  /**
   * Get behavioralInstanceReport
   * @return behavioralInstanceReport
  **/

  public BQBehavioralRetrieveInputModelBehavioralInstanceReport getBehavioralInstanceReport() {
    return behavioralInstanceReport;
  }

  public void setBehavioralInstanceReport(BQBehavioralRetrieveInputModelBehavioralInstanceReport behavioralInstanceReport) {
    this.behavioralInstanceReport = behavioralInstanceReport;
  }


  /**
   * Get behavioralInstanceAnalysis
   * @return behavioralInstanceAnalysis
  **/

  public BQBehavioralRetrieveInputModelBehavioralInstanceAnalysis getBehavioralInstanceAnalysis() {
    return behavioralInstanceAnalysis;
  }

  public void setBehavioralInstanceAnalysis(BQBehavioralRetrieveInputModelBehavioralInstanceAnalysis behavioralInstanceAnalysis) {
    this.behavioralInstanceAnalysis = behavioralInstanceAnalysis;
  }


}

