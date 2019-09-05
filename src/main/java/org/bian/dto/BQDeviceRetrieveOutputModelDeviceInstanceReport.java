package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDeviceRetrieveOutputModelDeviceInstanceReport
 */
public class BQDeviceRetrieveOutputModelDeviceInstanceReport   {
  private Object deviceInstanceReportRecord = null;

  private String deviceInstanceReportType = null;

  private String deviceInstanceReportParameters = null;

  private Object deviceInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return deviceInstanceReportRecord
  **/

  public Object getDeviceInstanceReportRecord() {
    return deviceInstanceReportRecord;
  }

  public void setDeviceInstanceReportRecord(Object deviceInstanceReportRecord) {
    this.deviceInstanceReportRecord = deviceInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return deviceInstanceReportType
  **/

  public String getDeviceInstanceReportType() {
    return deviceInstanceReportType;
  }

  public void setDeviceInstanceReportType(String deviceInstanceReportType) {
    this.deviceInstanceReportType = deviceInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return deviceInstanceReportParameters
  **/

  public String getDeviceInstanceReportParameters() {
    return deviceInstanceReportParameters;
  }

  public void setDeviceInstanceReportParameters(String deviceInstanceReportParameters) {
    this.deviceInstanceReportParameters = deviceInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return deviceInstanceReport
  **/

  public Object getDeviceInstanceReport() {
    return deviceInstanceReport;
  }

  public void setDeviceInstanceReport(Object deviceInstanceReport) {
    this.deviceInstanceReport = deviceInstanceReport;
  }


}

