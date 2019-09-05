package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDocumentRetrieveOutputModelDocumentInstanceAnalysis;
import org.bian.dto.BQDocumentRetrieveOutputModelDocumentInstanceRecord;
import org.bian.dto.BQDocumentRetrieveOutputModelDocumentInstanceReport;
import org.bian.dto.BQDocumentRetrieveOutputModelPartyAuthenticationAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDocumentRetrieveOutputModel
 */
public class BQDocumentRetrieveOutputModel   {
  private BQDocumentRetrieveOutputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord = null;

  private BQDocumentRetrieveOutputModelDocumentInstanceRecord documentInstanceRecord = null;

  private String documentRetrieveActionTaskReference = null;

  private Object documentRetrieveActionTaskRecord = null;

  private String documentRetrieveActionResponse = null;

  private BQDocumentRetrieveOutputModelDocumentInstanceReport documentInstanceReport = null;

  private BQDocumentRetrieveOutputModelDocumentInstanceAnalysis documentInstanceAnalysis = null;


  /**
   * Get partyAuthenticationAssessmentInstanceRecord
   * @return partyAuthenticationAssessmentInstanceRecord
  **/

  public BQDocumentRetrieveOutputModelPartyAuthenticationAssessmentInstanceRecord getPartyAuthenticationAssessmentInstanceRecord() {
    return partyAuthenticationAssessmentInstanceRecord;
  }

  public void setPartyAuthenticationAssessmentInstanceRecord(BQDocumentRetrieveOutputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord) {
    this.partyAuthenticationAssessmentInstanceRecord = partyAuthenticationAssessmentInstanceRecord;
  }


  /**
   * Get documentInstanceRecord
   * @return documentInstanceRecord
  **/

  public BQDocumentRetrieveOutputModelDocumentInstanceRecord getDocumentInstanceRecord() {
    return documentInstanceRecord;
  }

  public void setDocumentInstanceRecord(BQDocumentRetrieveOutputModelDocumentInstanceRecord documentInstanceRecord) {
    this.documentInstanceRecord = documentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Document instance retrieve service call 
   * @return documentRetrieveActionTaskReference
  **/

  public String getDocumentRetrieveActionTaskReference() {
    return documentRetrieveActionTaskReference;
  }

  public void setDocumentRetrieveActionTaskReference(String documentRetrieveActionTaskReference) {
    this.documentRetrieveActionTaskReference = documentRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return documentRetrieveActionTaskRecord
  **/

  public Object getDocumentRetrieveActionTaskRecord() {
    return documentRetrieveActionTaskRecord;
  }

  public void setDocumentRetrieveActionTaskRecord(Object documentRetrieveActionTaskRecord) {
    this.documentRetrieveActionTaskRecord = documentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return documentRetrieveActionResponse
  **/

  public String getDocumentRetrieveActionResponse() {
    return documentRetrieveActionResponse;
  }

  public void setDocumentRetrieveActionResponse(String documentRetrieveActionResponse) {
    this.documentRetrieveActionResponse = documentRetrieveActionResponse;
  }


  /**
   * Get documentInstanceReport
   * @return documentInstanceReport
  **/

  public BQDocumentRetrieveOutputModelDocumentInstanceReport getDocumentInstanceReport() {
    return documentInstanceReport;
  }

  public void setDocumentInstanceReport(BQDocumentRetrieveOutputModelDocumentInstanceReport documentInstanceReport) {
    this.documentInstanceReport = documentInstanceReport;
  }


  /**
   * Get documentInstanceAnalysis
   * @return documentInstanceAnalysis
  **/

  public BQDocumentRetrieveOutputModelDocumentInstanceAnalysis getDocumentInstanceAnalysis() {
    return documentInstanceAnalysis;
  }

  public void setDocumentInstanceAnalysis(BQDocumentRetrieveOutputModelDocumentInstanceAnalysis documentInstanceAnalysis) {
    this.documentInstanceAnalysis = documentInstanceAnalysis;
  }


}

