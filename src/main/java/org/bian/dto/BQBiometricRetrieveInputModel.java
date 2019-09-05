package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBiometricRetrieveInputModelBiometricInstanceAnalysis;
import org.bian.dto.BQBiometricRetrieveInputModelBiometricInstanceReport;

import javax.validation.Valid;
  
/**
 * BQBiometricRetrieveInputModel
 */
public class BQBiometricRetrieveInputModel   {
  private Object biometricRetrieveActionTaskRecord = null;

  private String biometricRetrieveActionRequest = null;

  private BQBiometricRetrieveInputModelBiometricInstanceReport biometricInstanceReport = null;

  private BQBiometricRetrieveInputModelBiometricInstanceAnalysis biometricInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return biometricRetrieveActionTaskRecord
  **/

  public Object getBiometricRetrieveActionTaskRecord() {
    return biometricRetrieveActionTaskRecord;
  }

  public void setBiometricRetrieveActionTaskRecord(Object biometricRetrieveActionTaskRecord) {
    this.biometricRetrieveActionTaskRecord = biometricRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return biometricRetrieveActionRequest
  **/

  public String getBiometricRetrieveActionRequest() {
    return biometricRetrieveActionRequest;
  }

  public void setBiometricRetrieveActionRequest(String biometricRetrieveActionRequest) {
    this.biometricRetrieveActionRequest = biometricRetrieveActionRequest;
  }


  /**
   * Get biometricInstanceReport
   * @return biometricInstanceReport
  **/

  public BQBiometricRetrieveInputModelBiometricInstanceReport getBiometricInstanceReport() {
    return biometricInstanceReport;
  }

  public void setBiometricInstanceReport(BQBiometricRetrieveInputModelBiometricInstanceReport biometricInstanceReport) {
    this.biometricInstanceReport = biometricInstanceReport;
  }


  /**
   * Get biometricInstanceAnalysis
   * @return biometricInstanceAnalysis
  **/

  public BQBiometricRetrieveInputModelBiometricInstanceAnalysis getBiometricInstanceAnalysis() {
    return biometricInstanceAnalysis;
  }

  public void setBiometricInstanceAnalysis(BQBiometricRetrieveInputModelBiometricInstanceAnalysis biometricInstanceAnalysis) {
    this.biometricInstanceAnalysis = biometricInstanceAnalysis;
  }


}

