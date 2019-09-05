package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDocumentEvaluateInputModelDocumentInstanceRecordAuthenticationDocumentReference;
import org.bian.dto.BQDocumentEvaluateInputModelDocumentInstanceRecordDocumentDirectoryEntryInstanceReference;

import javax.validation.Valid;
  
/**
 * BQDocumentRetrieveOutputModelDocumentInstanceRecord
 */
public class BQDocumentRetrieveOutputModelDocumentInstanceRecord   {
  private BQDocumentEvaluateInputModelDocumentInstanceRecordAuthenticationDocumentReference authenticationDocumentReference = null;

  private BQDocumentEvaluateInputModelDocumentInstanceRecordDocumentDirectoryEntryInstanceReference documentDirectoryEntryInstanceReference = null;

  private String authenticationDocumentComparisonTestResult = null;


  /**
   * Get authenticationDocumentReference
   * @return authenticationDocumentReference
  **/

  public BQDocumentEvaluateInputModelDocumentInstanceRecordAuthenticationDocumentReference getAuthenticationDocumentReference() {
    return authenticationDocumentReference;
  }

  public void setAuthenticationDocumentReference(BQDocumentEvaluateInputModelDocumentInstanceRecordAuthenticationDocumentReference authenticationDocumentReference) {
    this.authenticationDocumentReference = authenticationDocumentReference;
  }


  /**
   * Get documentDirectoryEntryInstanceReference
   * @return documentDirectoryEntryInstanceReference
  **/

  public BQDocumentEvaluateInputModelDocumentInstanceRecordDocumentDirectoryEntryInstanceReference getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(BQDocumentEvaluateInputModelDocumentInstanceRecordDocumentDirectoryEntryInstanceReference documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of comparing the presented document to the stored value 
   * @return authenticationDocumentComparisonTestResult
  **/

  public String getAuthenticationDocumentComparisonTestResult() {
    return authenticationDocumentComparisonTestResult;
  }

  public void setAuthenticationDocumentComparisonTestResult(String authenticationDocumentComparisonTestResult) {
    this.authenticationDocumentComparisonTestResult = authenticationDocumentComparisonTestResult;
  }


}

