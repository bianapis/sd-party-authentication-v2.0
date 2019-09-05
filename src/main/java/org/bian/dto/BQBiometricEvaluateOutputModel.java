package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBiometricEvaluateOutputModelBiometricInstanceRecord;
import org.bian.dto.BQPasswordEvaluateOutputModelPartyAuthenticationAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBiometricEvaluateOutputModel
 */
public class BQBiometricEvaluateOutputModel   {
  private BQPasswordEvaluateOutputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord = null;

  private String biometricInstanceReference = null;

  private String biometricInitiateActionReference = null;

  private Object biometricInitiateActionRecord = null;

  private String biometricInstanceStatus = null;

  private BQBiometricEvaluateOutputModelBiometricInstanceRecord biometricInstanceRecord = null;


  /**
   * Get partyAuthenticationAssessmentInstanceRecord
   * @return partyAuthenticationAssessmentInstanceRecord
  **/

  public BQPasswordEvaluateOutputModelPartyAuthenticationAssessmentInstanceRecord getPartyAuthenticationAssessmentInstanceRecord() {
    return partyAuthenticationAssessmentInstanceRecord;
  }

  public void setPartyAuthenticationAssessmentInstanceRecord(BQPasswordEvaluateOutputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord) {
    this.partyAuthenticationAssessmentInstanceRecord = partyAuthenticationAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Biometric instance 
   * @return biometricInstanceReference
  **/

  public String getBiometricInstanceReference() {
    return biometricInstanceReference;
  }

  public void setBiometricInstanceReference(String biometricInstanceReference) {
    this.biometricInstanceReference = biometricInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return biometricInitiateActionReference
  **/

  public String getBiometricInitiateActionReference() {
    return biometricInitiateActionReference;
  }

  public void setBiometricInitiateActionReference(String biometricInitiateActionReference) {
    this.biometricInitiateActionReference = biometricInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return biometricInitiateActionRecord
  **/

  public Object getBiometricInitiateActionRecord() {
    return biometricInitiateActionRecord;
  }

  public void setBiometricInitiateActionRecord(Object biometricInitiateActionRecord) {
    this.biometricInitiateActionRecord = biometricInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Biometric instance (e.g. initialised, pending, active) 
   * @return biometricInstanceStatus
  **/

  public String getBiometricInstanceStatus() {
    return biometricInstanceStatus;
  }

  public void setBiometricInstanceStatus(String biometricInstanceStatus) {
    this.biometricInstanceStatus = biometricInstanceStatus;
  }


  /**
   * Get biometricInstanceRecord
   * @return biometricInstanceRecord
  **/

  public BQBiometricEvaluateOutputModelBiometricInstanceRecord getBiometricInstanceRecord() {
    return biometricInstanceRecord;
  }

  public void setBiometricInstanceRecord(BQBiometricEvaluateOutputModelBiometricInstanceRecord biometricInstanceRecord) {
    this.biometricInstanceRecord = biometricInstanceRecord;
  }


}

