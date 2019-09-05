package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDocumentRetrieveOutputModelDocumentInstanceAnalysis
 */
public class BQDocumentRetrieveOutputModelDocumentInstanceAnalysis   {
  private Object documentInstanceAnalysisRecord = null;

  private String documentInstanceAnalysisReportType = null;

  private String documentInstanceAnalysisParameters = null;

  private Object documentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return documentInstanceAnalysisRecord
  **/

  public Object getDocumentInstanceAnalysisRecord() {
    return documentInstanceAnalysisRecord;
  }

  public void setDocumentInstanceAnalysisRecord(Object documentInstanceAnalysisRecord) {
    this.documentInstanceAnalysisRecord = documentInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return documentInstanceAnalysisReportType
  **/

  public String getDocumentInstanceAnalysisReportType() {
    return documentInstanceAnalysisReportType;
  }

  public void setDocumentInstanceAnalysisReportType(String documentInstanceAnalysisReportType) {
    this.documentInstanceAnalysisReportType = documentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return documentInstanceAnalysisParameters
  **/

  public String getDocumentInstanceAnalysisParameters() {
    return documentInstanceAnalysisParameters;
  }

  public void setDocumentInstanceAnalysisParameters(String documentInstanceAnalysisParameters) {
    this.documentInstanceAnalysisParameters = documentInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return documentInstanceAnalysisReport
  **/

  public Object getDocumentInstanceAnalysisReport() {
    return documentInstanceAnalysisReport;
  }

  public void setDocumentInstanceAnalysisReport(Object documentInstanceAnalysisReport) {
    this.documentInstanceAnalysisReport = documentInstanceAnalysisReport;
  }


}

