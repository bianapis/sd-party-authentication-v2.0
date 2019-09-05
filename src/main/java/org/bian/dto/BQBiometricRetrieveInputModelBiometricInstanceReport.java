package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBiometricRetrieveInputModelBiometricInstanceReport
 */
public class BQBiometricRetrieveInputModelBiometricInstanceReport   {
  private String biometricInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return biometricInstanceReportReference
  **/

  public String getBiometricInstanceReportReference() {
    return biometricInstanceReportReference;
  }

  public void setBiometricInstanceReportReference(String biometricInstanceReportReference) {
    this.biometricInstanceReportReference = biometricInstanceReportReference;
  }


}

