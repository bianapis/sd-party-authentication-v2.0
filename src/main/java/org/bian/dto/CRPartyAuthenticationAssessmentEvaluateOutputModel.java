package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyAuthenticationAssessmentEvaluateOutputModelPartyAuthenticationAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRPartyAuthenticationAssessmentEvaluateOutputModel
 */
public class CRPartyAuthenticationAssessmentEvaluateOutputModel   {
  private String partyAuthenticationAssessmentInstanceReference = null;

  private String partyAuthenticationAssessmentEvaluateActionReference = null;

  private Object partyAuthenticationAssessmentEvaluateActionRecord = null;

  private String partyAuthenticationAssessmentInstanceStatus = null;

  private CRPartyAuthenticationAssessmentEvaluateOutputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Party Authentication Assessment instance 
   * @return partyAuthenticationAssessmentInstanceReference
  **/

  public String getPartyAuthenticationAssessmentInstanceReference() {
    return partyAuthenticationAssessmentInstanceReference;
  }

  public void setPartyAuthenticationAssessmentInstanceReference(String partyAuthenticationAssessmentInstanceReference) {
    this.partyAuthenticationAssessmentInstanceReference = partyAuthenticationAssessmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Evaluate service call 
   * @return partyAuthenticationAssessmentEvaluateActionReference
  **/

  public String getPartyAuthenticationAssessmentEvaluateActionReference() {
    return partyAuthenticationAssessmentEvaluateActionReference;
  }

  public void setPartyAuthenticationAssessmentEvaluateActionReference(String partyAuthenticationAssessmentEvaluateActionReference) {
    this.partyAuthenticationAssessmentEvaluateActionReference = partyAuthenticationAssessmentEvaluateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Evaluate service call input and output record 
   * @return partyAuthenticationAssessmentEvaluateActionRecord
  **/

  public Object getPartyAuthenticationAssessmentEvaluateActionRecord() {
    return partyAuthenticationAssessmentEvaluateActionRecord;
  }

  public void setPartyAuthenticationAssessmentEvaluateActionRecord(Object partyAuthenticationAssessmentEvaluateActionRecord) {
    this.partyAuthenticationAssessmentEvaluateActionRecord = partyAuthenticationAssessmentEvaluateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Party Authentication Assessment instance (e.g. initialised, pending, active) 
   * @return partyAuthenticationAssessmentInstanceStatus
  **/

  public String getPartyAuthenticationAssessmentInstanceStatus() {
    return partyAuthenticationAssessmentInstanceStatus;
  }

  public void setPartyAuthenticationAssessmentInstanceStatus(String partyAuthenticationAssessmentInstanceStatus) {
    this.partyAuthenticationAssessmentInstanceStatus = partyAuthenticationAssessmentInstanceStatus;
  }


  /**
   * Get partyAuthenticationAssessmentInstanceRecord
   * @return partyAuthenticationAssessmentInstanceRecord
  **/

  public CRPartyAuthenticationAssessmentEvaluateOutputModelPartyAuthenticationAssessmentInstanceRecord getPartyAuthenticationAssessmentInstanceRecord() {
    return partyAuthenticationAssessmentInstanceRecord;
  }

  public void setPartyAuthenticationAssessmentInstanceRecord(CRPartyAuthenticationAssessmentEvaluateOutputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord) {
    this.partyAuthenticationAssessmentInstanceRecord = partyAuthenticationAssessmentInstanceRecord;
  }


}

