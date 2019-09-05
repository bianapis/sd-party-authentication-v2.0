package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDeviceRetrieveInputModelDeviceInstanceAnalysis;
import org.bian.dto.BQDeviceRetrieveInputModelDeviceInstanceReport;

import javax.validation.Valid;
  
/**
 * BQDeviceRetrieveInputModel
 */
public class BQDeviceRetrieveInputModel   {
  private Object deviceRetrieveActionTaskRecord = null;

  private String deviceRetrieveActionRequest = null;

  private BQDeviceRetrieveInputModelDeviceInstanceReport deviceInstanceReport = null;

  private BQDeviceRetrieveInputModelDeviceInstanceAnalysis deviceInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return deviceRetrieveActionTaskRecord
  **/

  public Object getDeviceRetrieveActionTaskRecord() {
    return deviceRetrieveActionTaskRecord;
  }

  public void setDeviceRetrieveActionTaskRecord(Object deviceRetrieveActionTaskRecord) {
    this.deviceRetrieveActionTaskRecord = deviceRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return deviceRetrieveActionRequest
  **/

  public String getDeviceRetrieveActionRequest() {
    return deviceRetrieveActionRequest;
  }

  public void setDeviceRetrieveActionRequest(String deviceRetrieveActionRequest) {
    this.deviceRetrieveActionRequest = deviceRetrieveActionRequest;
  }


  /**
   * Get deviceInstanceReport
   * @return deviceInstanceReport
  **/

  public BQDeviceRetrieveInputModelDeviceInstanceReport getDeviceInstanceReport() {
    return deviceInstanceReport;
  }

  public void setDeviceInstanceReport(BQDeviceRetrieveInputModelDeviceInstanceReport deviceInstanceReport) {
    this.deviceInstanceReport = deviceInstanceReport;
  }


  /**
   * Get deviceInstanceAnalysis
   * @return deviceInstanceAnalysis
  **/

  public BQDeviceRetrieveInputModelDeviceInstanceAnalysis getDeviceInstanceAnalysis() {
    return deviceInstanceAnalysis;
  }

  public void setDeviceInstanceAnalysis(BQDeviceRetrieveInputModelDeviceInstanceAnalysis deviceInstanceAnalysis) {
    this.deviceInstanceAnalysis = deviceInstanceAnalysis;
  }


}

