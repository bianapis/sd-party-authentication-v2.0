package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBiometricRetrieveOutputModelBiometricInstanceAnalysis
 */
public class BQBiometricRetrieveOutputModelBiometricInstanceAnalysis   {
  private Object biometricInstanceAnalysisRecord = null;

  private String biometricInstanceAnalysisReportType = null;

  private String biometricInstanceAnalysisParameters = null;

  private Object biometricInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return biometricInstanceAnalysisRecord
  **/

  public Object getBiometricInstanceAnalysisRecord() {
    return biometricInstanceAnalysisRecord;
  }

  public void setBiometricInstanceAnalysisRecord(Object biometricInstanceAnalysisRecord) {
    this.biometricInstanceAnalysisRecord = biometricInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return biometricInstanceAnalysisReportType
  **/

  public String getBiometricInstanceAnalysisReportType() {
    return biometricInstanceAnalysisReportType;
  }

  public void setBiometricInstanceAnalysisReportType(String biometricInstanceAnalysisReportType) {
    this.biometricInstanceAnalysisReportType = biometricInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return biometricInstanceAnalysisParameters
  **/

  public String getBiometricInstanceAnalysisParameters() {
    return biometricInstanceAnalysisParameters;
  }

  public void setBiometricInstanceAnalysisParameters(String biometricInstanceAnalysisParameters) {
    this.biometricInstanceAnalysisParameters = biometricInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return biometricInstanceAnalysisReport
  **/

  public Object getBiometricInstanceAnalysisReport() {
    return biometricInstanceAnalysisReport;
  }

  public void setBiometricInstanceAnalysisReport(Object biometricInstanceAnalysisReport) {
    this.biometricInstanceAnalysisReport = biometricInstanceAnalysisReport;
  }


}

