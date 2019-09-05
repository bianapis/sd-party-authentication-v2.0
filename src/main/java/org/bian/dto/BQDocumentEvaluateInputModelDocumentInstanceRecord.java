package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDocumentEvaluateInputModelDocumentInstanceRecordAuthenticationDocumentReference;
import org.bian.dto.BQDocumentEvaluateInputModelDocumentInstanceRecordDocumentDirectoryEntryInstanceReference;

import javax.validation.Valid;
  
/**
 * BQDocumentEvaluateInputModelDocumentInstanceRecord
 */
public class BQDocumentEvaluateInputModelDocumentInstanceRecord   {
  private BQDocumentEvaluateInputModelDocumentInstanceRecordAuthenticationDocumentReference authenticationDocumentReference = null;

  private BQDocumentEvaluateInputModelDocumentInstanceRecordDocumentDirectoryEntryInstanceReference documentDirectoryEntryInstanceReference = null;


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


}

