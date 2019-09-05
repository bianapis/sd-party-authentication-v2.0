package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDeviceEvaluateOutputModelDeviceInstanceRecord;
import org.bian.dto.BQPasswordEvaluateOutputModelPartyAuthenticationAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDeviceEvaluateOutputModel
 */
public class BQDeviceEvaluateOutputModel   {
  private BQPasswordEvaluateOutputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord = null;

  private String deviceInstanceReference = null;

  private String deviceInitiateActionReference = null;

  private Object deviceInitiateActionRecord = null;

  private String deviceInstanceStatus = null;

  private BQDeviceEvaluateOutputModelDeviceInstanceRecord deviceInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Device instance 
   * @return deviceInstanceReference
  **/

  public String getDeviceInstanceReference() {
    return deviceInstanceReference;
  }

  public void setDeviceInstanceReference(String deviceInstanceReference) {
    this.deviceInstanceReference = deviceInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return deviceInitiateActionReference
  **/

  public String getDeviceInitiateActionReference() {
    return deviceInitiateActionReference;
  }

  public void setDeviceInitiateActionReference(String deviceInitiateActionReference) {
    this.deviceInitiateActionReference = deviceInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return deviceInitiateActionRecord
  **/

  public Object getDeviceInitiateActionRecord() {
    return deviceInitiateActionRecord;
  }

  public void setDeviceInitiateActionRecord(Object deviceInitiateActionRecord) {
    this.deviceInitiateActionRecord = deviceInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Device instance (e.g. initialised, pending, active) 
   * @return deviceInstanceStatus
  **/

  public String getDeviceInstanceStatus() {
    return deviceInstanceStatus;
  }

  public void setDeviceInstanceStatus(String deviceInstanceStatus) {
    this.deviceInstanceStatus = deviceInstanceStatus;
  }


  /**
   * Get deviceInstanceRecord
   * @return deviceInstanceRecord
  **/

  public BQDeviceEvaluateOutputModelDeviceInstanceRecord getDeviceInstanceRecord() {
    return deviceInstanceRecord;
  }

  public void setDeviceInstanceRecord(BQDeviceEvaluateOutputModelDeviceInstanceRecord deviceInstanceRecord) {
    this.deviceInstanceRecord = deviceInstanceRecord;
  }


}

