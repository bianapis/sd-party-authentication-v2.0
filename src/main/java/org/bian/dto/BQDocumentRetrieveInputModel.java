package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDocumentRetrieveInputModelDocumentInstanceAnalysis;
import org.bian.dto.BQDocumentRetrieveInputModelDocumentInstanceReport;

import javax.validation.Valid;
  
/**
 * BQDocumentRetrieveInputModel
 */
public class BQDocumentRetrieveInputModel   {
  private Object documentRetrieveActionTaskRecord = null;

  private String documentRetrieveActionRequest = null;

  private BQDocumentRetrieveInputModelDocumentInstanceReport documentInstanceReport = null;

  private BQDocumentRetrieveInputModelDocumentInstanceAnalysis documentInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return documentRetrieveActionRequest
  **/

  public String getDocumentRetrieveActionRequest() {
    return documentRetrieveActionRequest;
  }

  public void setDocumentRetrieveActionRequest(String documentRetrieveActionRequest) {
    this.documentRetrieveActionRequest = documentRetrieveActionRequest;
  }


  /**
   * Get documentInstanceReport
   * @return documentInstanceReport
  **/

  public BQDocumentRetrieveInputModelDocumentInstanceReport getDocumentInstanceReport() {
    return documentInstanceReport;
  }

  public void setDocumentInstanceReport(BQDocumentRetrieveInputModelDocumentInstanceReport documentInstanceReport) {
    this.documentInstanceReport = documentInstanceReport;
  }


  /**
   * Get documentInstanceAnalysis
   * @return documentInstanceAnalysis
  **/

  public BQDocumentRetrieveInputModelDocumentInstanceAnalysis getDocumentInstanceAnalysis() {
    return documentInstanceAnalysis;
  }

  public void setDocumentInstanceAnalysis(BQDocumentRetrieveInputModelDocumentInstanceAnalysis documentInstanceAnalysis) {
    this.documentInstanceAnalysis = documentInstanceAnalysis;
  }


}

