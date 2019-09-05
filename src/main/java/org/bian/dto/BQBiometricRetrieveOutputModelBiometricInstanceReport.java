package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBiometricRetrieveOutputModelBiometricInstanceReport
 */
public class BQBiometricRetrieveOutputModelBiometricInstanceReport   {
  private Object biometricInstanceReportRecord = null;

  private String biometricInstanceReportType = null;

  private String biometricInstanceReportParameters = null;

  private Object biometricInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return biometricInstanceReportRecord
  **/

  public Object getBiometricInstanceReportRecord() {
    return biometricInstanceReportRecord;
  }

  public void setBiometricInstanceReportRecord(Object biometricInstanceReportRecord) {
    this.biometricInstanceReportRecord = biometricInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return biometricInstanceReportType
  **/

  public String getBiometricInstanceReportType() {
    return biometricInstanceReportType;
  }

  public void setBiometricInstanceReportType(String biometricInstanceReportType) {
    this.biometricInstanceReportType = biometricInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return biometricInstanceReportParameters
  **/

  public String getBiometricInstanceReportParameters() {
    return biometricInstanceReportParameters;
  }

  public void setBiometricInstanceReportParameters(String biometricInstanceReportParameters) {
    this.biometricInstanceReportParameters = biometricInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return biometricInstanceReport
  **/

  public Object getBiometricInstanceReport() {
    return biometricInstanceReport;
  }

  public void setBiometricInstanceReport(Object biometricInstanceReport) {
    this.biometricInstanceReport = biometricInstanceReport;
  }


}

