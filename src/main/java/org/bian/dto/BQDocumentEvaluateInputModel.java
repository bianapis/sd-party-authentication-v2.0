package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDocumentEvaluateInputModelDocumentInstanceRecord;
import org.bian.dto.BQDocumentEvaluateInputModelPartyAuthenticationAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDocumentEvaluateInputModel
 */
public class BQDocumentEvaluateInputModel   {
  private BQDocumentEvaluateInputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord = null;

  private String partyAuthenticationAssessmentInstanceReference = null;

  private Object documentInitiateActionRecord = null;

  private BQDocumentEvaluateInputModelDocumentInstanceRecord documentInstanceRecord = null;


  /**
   * Get partyAuthenticationAssessmentInstanceRecord
   * @return partyAuthenticationAssessmentInstanceRecord
  **/

  public BQDocumentEvaluateInputModelPartyAuthenticationAssessmentInstanceRecord getPartyAuthenticationAssessmentInstanceRecord() {
    return partyAuthenticationAssessmentInstanceRecord;
  }

  public void setPartyAuthenticationAssessmentInstanceRecord(BQDocumentEvaluateInputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord) {
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
   * @return documentInitiateActionRecord
  **/

  public Object getDocumentInitiateActionRecord() {
    return documentInitiateActionRecord;
  }

  public void setDocumentInitiateActionRecord(Object documentInitiateActionRecord) {
    this.documentInitiateActionRecord = documentInitiateActionRecord;
  }


  /**
   * Get documentInstanceRecord
   * @return documentInstanceRecord
  **/

  public BQDocumentEvaluateInputModelDocumentInstanceRecord getDocumentInstanceRecord() {
    return documentInstanceRecord;
  }

  public void setDocumentInstanceRecord(BQDocumentEvaluateInputModelDocumentInstanceRecord documentInstanceRecord) {
    this.documentInstanceRecord = documentInstanceRecord;
  }


}

