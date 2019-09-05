package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPasswordEvaluateOutputModelPartyAuthenticationAssessmentInstanceRecord;
import org.bian.dto.BQPasswordEvaluateOutputModelPasswordInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPasswordEvaluateOutputModel
 */
public class BQPasswordEvaluateOutputModel   {
  private BQPasswordEvaluateOutputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord = null;

  private String passwordInstanceReference = null;

  private String passwordInitiateActionReference = null;

  private Object passwordInitiateActionRecord = null;

  private String passwordInstanceStatus = null;

  private BQPasswordEvaluateOutputModelPasswordInstanceRecord passwordInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Password instance 
   * @return passwordInstanceReference
  **/

  public String getPasswordInstanceReference() {
    return passwordInstanceReference;
  }

  public void setPasswordInstanceReference(String passwordInstanceReference) {
    this.passwordInstanceReference = passwordInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return passwordInitiateActionReference
  **/

  public String getPasswordInitiateActionReference() {
    return passwordInitiateActionReference;
  }

  public void setPasswordInitiateActionReference(String passwordInitiateActionReference) {
    this.passwordInitiateActionReference = passwordInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return passwordInitiateActionRecord
  **/

  public Object getPasswordInitiateActionRecord() {
    return passwordInitiateActionRecord;
  }

  public void setPasswordInitiateActionRecord(Object passwordInitiateActionRecord) {
    this.passwordInitiateActionRecord = passwordInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Password instance (e.g. initialised, pending, active) 
   * @return passwordInstanceStatus
  **/

  public String getPasswordInstanceStatus() {
    return passwordInstanceStatus;
  }

  public void setPasswordInstanceStatus(String passwordInstanceStatus) {
    this.passwordInstanceStatus = passwordInstanceStatus;
  }


  /**
   * Get passwordInstanceRecord
   * @return passwordInstanceRecord
  **/

  public BQPasswordEvaluateOutputModelPasswordInstanceRecord getPasswordInstanceRecord() {
    return passwordInstanceRecord;
  }

  public void setPasswordInstanceRecord(BQPasswordEvaluateOutputModelPasswordInstanceRecord passwordInstanceRecord) {
    this.passwordInstanceRecord = passwordInstanceRecord;
  }


}

