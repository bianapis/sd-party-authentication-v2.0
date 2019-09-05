package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBehavioralRetrieveOutputModelBehavioralInstanceReport
 */
public class BQBehavioralRetrieveOutputModelBehavioralInstanceReport   {
  private Object behavioralInstanceReportRecord = null;

  private String behavioralInstanceReportType = null;

  private String behavioralInstanceReportParameters = null;

  private Object behavioralInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return behavioralInstanceReportRecord
  **/

  public Object getBehavioralInstanceReportRecord() {
    return behavioralInstanceReportRecord;
  }

  public void setBehavioralInstanceReportRecord(Object behavioralInstanceReportRecord) {
    this.behavioralInstanceReportRecord = behavioralInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return behavioralInstanceReportType
  **/

  public String getBehavioralInstanceReportType() {
    return behavioralInstanceReportType;
  }

  public void setBehavioralInstanceReportType(String behavioralInstanceReportType) {
    this.behavioralInstanceReportType = behavioralInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return behavioralInstanceReportParameters
  **/

  public String getBehavioralInstanceReportParameters() {
    return behavioralInstanceReportParameters;
  }

  public void setBehavioralInstanceReportParameters(String behavioralInstanceReportParameters) {
    this.behavioralInstanceReportParameters = behavioralInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return behavioralInstanceReport
  **/

  public Object getBehavioralInstanceReport() {
    return behavioralInstanceReport;
  }

  public void setBehavioralInstanceReport(Object behavioralInstanceReport) {
    this.behavioralInstanceReport = behavioralInstanceReport;
  }


}

