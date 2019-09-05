package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDocumentEvaluateInputModelDocumentInstanceRecordAuthenticationDocumentReference
 */
public class BQDocumentEvaluateInputModelDocumentInstanceRecordAuthenticationDocumentReference   {
  private String authenticationDocumentContent = null;


  /**
   * `status: Provisionally Registered`  bian-reference: (as Authentication).SubmittedAuthenticationData(as GenericData).BinaryData  general-info: The submitted document content in any appropriate format/media (e.g. scan) 
   * @return authenticationDocumentContent
  **/

  public String getAuthenticationDocumentContent() {
    return authenticationDocumentContent;
  }

  public void setAuthenticationDocumentContent(String authenticationDocumentContent) {
    this.authenticationDocumentContent = authenticationDocumentContent;
  }


}

