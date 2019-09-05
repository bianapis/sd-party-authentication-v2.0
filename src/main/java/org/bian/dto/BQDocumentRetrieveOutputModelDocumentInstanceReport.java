package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDocumentRetrieveOutputModelDocumentInstanceReport
 */
public class BQDocumentRetrieveOutputModelDocumentInstanceReport   {
  private Object documentInstanceReportRecord = null;

  private String documentInstanceReportType = null;

  private String documentInstanceReportParameters = null;

  private Object documentInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return documentInstanceReportRecord
  **/

  public Object getDocumentInstanceReportRecord() {
    return documentInstanceReportRecord;
  }

  public void setDocumentInstanceReportRecord(Object documentInstanceReportRecord) {
    this.documentInstanceReportRecord = documentInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return documentInstanceReportType
  **/

  public String getDocumentInstanceReportType() {
    return documentInstanceReportType;
  }

  public void setDocumentInstanceReportType(String documentInstanceReportType) {
    this.documentInstanceReportType = documentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return documentInstanceReportParameters
  **/

  public String getDocumentInstanceReportParameters() {
    return documentInstanceReportParameters;
  }

  public void setDocumentInstanceReportParameters(String documentInstanceReportParameters) {
    this.documentInstanceReportParameters = documentInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return documentInstanceReport
  **/

  public Object getDocumentInstanceReport() {
    return documentInstanceReport;
  }

  public void setDocumentInstanceReport(Object documentInstanceReport) {
    this.documentInstanceReport = documentInstanceReport;
  }


}

