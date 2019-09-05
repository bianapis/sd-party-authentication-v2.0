package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDocumentEvaluateOutputModelDocumentInstanceRecord;
import org.bian.dto.BQPasswordEvaluateOutputModelPartyAuthenticationAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDocumentEvaluateOutputModel
 */
public class BQDocumentEvaluateOutputModel   {
  private BQPasswordEvaluateOutputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord = null;

  private String documentInstanceReference = null;

  private String documentInitiateActionReference = null;

  private Object documentInitiateActionRecord = null;

  private String documentInstanceStatus = null;

  private BQDocumentEvaluateOutputModelDocumentInstanceRecord documentInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Document instance 
   * @return documentInstanceReference
  **/

  public String getDocumentInstanceReference() {
    return documentInstanceReference;
  }

  public void setDocumentInstanceReference(String documentInstanceReference) {
    this.documentInstanceReference = documentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return documentInitiateActionReference
  **/

  public String getDocumentInitiateActionReference() {
    return documentInitiateActionReference;
  }

  public void setDocumentInitiateActionReference(String documentInitiateActionReference) {
    this.documentInitiateActionReference = documentInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return documentInitiateActionRecord
  **/

  public Object getDocumentInitiateActionRecord() {
    return documentInitiateActionRecord;
  }

  public void setDocumentInitiateActionRecord(Object documentInitiateActionRecord) {
    this.documentInitiateActionRecord = documentInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Document instance (e.g. initialised, pending, active) 
   * @return documentInstanceStatus
  **/

  public String getDocumentInstanceStatus() {
    return documentInstanceStatus;
  }

  public void setDocumentInstanceStatus(String documentInstanceStatus) {
    this.documentInstanceStatus = documentInstanceStatus;
  }


  /**
   * Get documentInstanceRecord
   * @return documentInstanceRecord
  **/

  public BQDocumentEvaluateOutputModelDocumentInstanceRecord getDocumentInstanceRecord() {
    return documentInstanceRecord;
  }

  public void setDocumentInstanceRecord(BQDocumentEvaluateOutputModelDocumentInstanceRecord documentInstanceRecord) {
    this.documentInstanceRecord = documentInstanceRecord;
  }


}

