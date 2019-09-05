package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBiometricEvaluateOutputModelBiometricInstanceRecord
 */
public class BQBiometricEvaluateOutputModelBiometricInstanceRecord   {
  private String biometricTestResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of the biometric check 
   * @return biometricTestResult
  **/

  public String getBiometricTestResult() {
    return biometricTestResult;
  }

  public void setBiometricTestResult(String biometricTestResult) {
    this.biometricTestResult = biometricTestResult;
  }


}

