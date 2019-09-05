package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDeviceEvaluateInputModelDeviceInstanceRecord;
import org.bian.dto.BQDeviceEvaluateInputModelPartyAuthenticationAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDeviceEvaluateInputModel
 */
public class BQDeviceEvaluateInputModel   {
  private BQDeviceEvaluateInputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord = null;

  private String partyAuthenticationAssessmentInstanceReference = null;

  private Object deviceInitiateActionRecord = null;

  private BQDeviceEvaluateInputModelDeviceInstanceRecord deviceInstanceRecord = null;


  /**
   * Get partyAuthenticationAssessmentInstanceRecord
   * @return partyAuthenticationAssessmentInstanceRecord
  **/

  public BQDeviceEvaluateInputModelPartyAuthenticationAssessmentInstanceRecord getPartyAuthenticationAssessmentInstanceRecord() {
    return partyAuthenticationAssessmentInstanceRecord;
  }

  public void setPartyAuthenticationAssessmentInstanceRecord(BQDeviceEvaluateInputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord) {
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
   * @return deviceInitiateActionRecord
  **/

  public Object getDeviceInitiateActionRecord() {
    return deviceInitiateActionRecord;
  }

  public void setDeviceInitiateActionRecord(Object deviceInitiateActionRecord) {
    this.deviceInitiateActionRecord = deviceInitiateActionRecord;
  }


  /**
   * Get deviceInstanceRecord
   * @return deviceInstanceRecord
  **/

  public BQDeviceEvaluateInputModelDeviceInstanceRecord getDeviceInstanceRecord() {
    return deviceInstanceRecord;
  }

  public void setDeviceInstanceRecord(BQDeviceEvaluateInputModelDeviceInstanceRecord deviceInstanceRecord) {
    this.deviceInstanceRecord = deviceInstanceRecord;
  }


}

