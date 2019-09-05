package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDeviceRetrieveOutputModelDeviceInstanceAnalysis;
import org.bian.dto.BQDeviceRetrieveOutputModelDeviceInstanceRecord;
import org.bian.dto.BQDeviceRetrieveOutputModelDeviceInstanceReport;
import org.bian.dto.BQDeviceRetrieveOutputModelPartyAuthenticationAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDeviceRetrieveOutputModel
 */
public class BQDeviceRetrieveOutputModel   {
  private BQDeviceRetrieveOutputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord = null;

  private BQDeviceRetrieveOutputModelDeviceInstanceRecord deviceInstanceRecord = null;

  private String deviceRetrieveActionTaskReference = null;

  private Object deviceRetrieveActionTaskRecord = null;

  private String deviceRetrieveActionResponse = null;

  private BQDeviceRetrieveOutputModelDeviceInstanceReport deviceInstanceReport = null;

  private BQDeviceRetrieveOutputModelDeviceInstanceAnalysis deviceInstanceAnalysis = null;


  /**
   * Get partyAuthenticationAssessmentInstanceRecord
   * @return partyAuthenticationAssessmentInstanceRecord
  **/

  public BQDeviceRetrieveOutputModelPartyAuthenticationAssessmentInstanceRecord getPartyAuthenticationAssessmentInstanceRecord() {
    return partyAuthenticationAssessmentInstanceRecord;
  }

  public void setPartyAuthenticationAssessmentInstanceRecord(BQDeviceRetrieveOutputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord) {
    this.partyAuthenticationAssessmentInstanceRecord = partyAuthenticationAssessmentInstanceRecord;
  }


  /**
   * Get deviceInstanceRecord
   * @return deviceInstanceRecord
  **/

  public BQDeviceRetrieveOutputModelDeviceInstanceRecord getDeviceInstanceRecord() {
    return deviceInstanceRecord;
  }

  public void setDeviceInstanceRecord(BQDeviceRetrieveOutputModelDeviceInstanceRecord deviceInstanceRecord) {
    this.deviceInstanceRecord = deviceInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Device instance retrieve service call 
   * @return deviceRetrieveActionTaskReference
  **/

  public String getDeviceRetrieveActionTaskReference() {
    return deviceRetrieveActionTaskReference;
  }

  public void setDeviceRetrieveActionTaskReference(String deviceRetrieveActionTaskReference) {
    this.deviceRetrieveActionTaskReference = deviceRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return deviceRetrieveActionTaskRecord
  **/

  public Object getDeviceRetrieveActionTaskRecord() {
    return deviceRetrieveActionTaskRecord;
  }

  public void setDeviceRetrieveActionTaskRecord(Object deviceRetrieveActionTaskRecord) {
    this.deviceRetrieveActionTaskRecord = deviceRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return deviceRetrieveActionResponse
  **/

  public String getDeviceRetrieveActionResponse() {
    return deviceRetrieveActionResponse;
  }

  public void setDeviceRetrieveActionResponse(String deviceRetrieveActionResponse) {
    this.deviceRetrieveActionResponse = deviceRetrieveActionResponse;
  }


  /**
   * Get deviceInstanceReport
   * @return deviceInstanceReport
  **/

  public BQDeviceRetrieveOutputModelDeviceInstanceReport getDeviceInstanceReport() {
    return deviceInstanceReport;
  }

  public void setDeviceInstanceReport(BQDeviceRetrieveOutputModelDeviceInstanceReport deviceInstanceReport) {
    this.deviceInstanceReport = deviceInstanceReport;
  }


  /**
   * Get deviceInstanceAnalysis
   * @return deviceInstanceAnalysis
  **/

  public BQDeviceRetrieveOutputModelDeviceInstanceAnalysis getDeviceInstanceAnalysis() {
    return deviceInstanceAnalysis;
  }

  public void setDeviceInstanceAnalysis(BQDeviceRetrieveOutputModelDeviceInstanceAnalysis deviceInstanceAnalysis) {
    this.deviceInstanceAnalysis = deviceInstanceAnalysis;
  }


}

