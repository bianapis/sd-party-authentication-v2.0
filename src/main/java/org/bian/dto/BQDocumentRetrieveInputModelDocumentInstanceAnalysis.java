package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDocumentRetrieveInputModelDocumentInstanceAnalysis
 */
public class BQDocumentRetrieveInputModelDocumentInstanceAnalysis   {
  private String documentInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return documentInstanceAnalysisReference
  **/

  public String getDocumentInstanceAnalysisReference() {
    return documentInstanceAnalysisReference;
  }

  public void setDocumentInstanceAnalysisReference(String documentInstanceAnalysisReference) {
    this.documentInstanceAnalysisReference = documentInstanceAnalysisReference;
  }


}

