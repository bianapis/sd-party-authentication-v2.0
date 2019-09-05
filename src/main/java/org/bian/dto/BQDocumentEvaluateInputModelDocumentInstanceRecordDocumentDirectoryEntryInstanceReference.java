package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDocumentEvaluateInputModelDocumentInstanceRecordDocumentDirectoryEntryInstanceReference
 */
public class BQDocumentEvaluateInputModelDocumentInstanceRecordDocumentDirectoryEntryInstanceReference   {
  private String documentContent = null;


  /**
   * `status: Provisionally Registered`  bian-reference: CustomerContactPerson.Player(as Person).PersonProfile.StoredAuthenticationData(as GenericData).BinaryData  general-info: The stored document - available in any suitable media for comparison 
   * @return documentContent
  **/

  public String getDocumentContent() {
    return documentContent;
  }

  public void setDocumentContent(String documentContent) {
    this.documentContent = documentContent;
  }


}

