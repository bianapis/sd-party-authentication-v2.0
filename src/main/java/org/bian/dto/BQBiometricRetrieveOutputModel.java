package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBiometricRetrieveOutputModelBiometricInstanceAnalysis;
import org.bian.dto.BQBiometricRetrieveOutputModelBiometricInstanceRecord;
import org.bian.dto.BQBiometricRetrieveOutputModelBiometricInstanceReport;
import org.bian.dto.BQBiometricRetrieveOutputModelPartyAuthenticationAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBiometricRetrieveOutputModel
 */
public class BQBiometricRetrieveOutputModel   {
  private BQBiometricRetrieveOutputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord = null;

  private BQBiometricRetrieveOutputModelBiometricInstanceRecord biometricInstanceRecord = null;

  private String biometricRetrieveActionTaskReference = null;

  private Object biometricRetrieveActionTaskRecord = null;

  private String biometricRetrieveActionResponse = null;

  private BQBiometricRetrieveOutputModelBiometricInstanceReport biometricInstanceReport = null;

  private BQBiometricRetrieveOutputModelBiometricInstanceAnalysis biometricInstanceAnalysis = null;


  /**
   * Get partyAuthenticationAssessmentInstanceRecord
   * @return partyAuthenticationAssessmentInstanceRecord
  **/

  public BQBiometricRetrieveOutputModelPartyAuthenticationAssessmentInstanceRecord getPartyAuthenticationAssessmentInstanceRecord() {
    return partyAuthenticationAssessmentInstanceRecord;
  }

  public void setPartyAuthenticationAssessmentInstanceRecord(BQBiometricRetrieveOutputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord) {
    this.partyAuthenticationAssessmentInstanceRecord = partyAuthenticationAssessmentInstanceRecord;
  }


  /**
   * Get biometricInstanceRecord
   * @return biometricInstanceRecord
  **/

  public BQBiometricRetrieveOutputModelBiometricInstanceRecord getBiometricInstanceRecord() {
    return biometricInstanceRecord;
  }

  public void setBiometricInstanceRecord(BQBiometricRetrieveOutputModelBiometricInstanceRecord biometricInstanceRecord) {
    this.biometricInstanceRecord = biometricInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Biometric instance retrieve service call 
   * @return biometricRetrieveActionTaskReference
  **/

  public String getBiometricRetrieveActionTaskReference() {
    return biometricRetrieveActionTaskReference;
  }

  public void setBiometricRetrieveActionTaskReference(String biometricRetrieveActionTaskReference) {
    this.biometricRetrieveActionTaskReference = biometricRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return biometricRetrieveActionResponse
  **/

  public String getBiometricRetrieveActionResponse() {
    return biometricRetrieveActionResponse;
  }

  public void setBiometricRetrieveActionResponse(String biometricRetrieveActionResponse) {
    this.biometricRetrieveActionResponse = biometricRetrieveActionResponse;
  }


  /**
   * Get biometricInstanceReport
   * @return biometricInstanceReport
  **/

  public BQBiometricRetrieveOutputModelBiometricInstanceReport getBiometricInstanceReport() {
    return biometricInstanceReport;
  }

  public void setBiometricInstanceReport(BQBiometricRetrieveOutputModelBiometricInstanceReport biometricInstanceReport) {
    this.biometricInstanceReport = biometricInstanceReport;
  }


  /**
   * Get biometricInstanceAnalysis
   * @return biometricInstanceAnalysis
  **/

  public BQBiometricRetrieveOutputModelBiometricInstanceAnalysis getBiometricInstanceAnalysis() {
    return biometricInstanceAnalysis;
  }

  public void setBiometricInstanceAnalysis(BQBiometricRetrieveOutputModelBiometricInstanceAnalysis biometricInstanceAnalysis) {
    this.biometricInstanceAnalysis = biometricInstanceAnalysis;
  }


}

