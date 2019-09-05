package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBiometricEvaluateInputModelBiometricInstanceRecord;
import org.bian.dto.BQBiometricEvaluateInputModelPartyAuthenticationAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBiometricEvaluateInputModel
 */
public class BQBiometricEvaluateInputModel   {
  private BQBiometricEvaluateInputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord = null;

  private String partyAuthenticationAssessmentInstanceReference = null;

  private Object biometricInitiateActionRecord = null;

  private BQBiometricEvaluateInputModelBiometricInstanceRecord biometricInstanceRecord = null;


  /**
   * Get partyAuthenticationAssessmentInstanceRecord
   * @return partyAuthenticationAssessmentInstanceRecord
  **/

  public BQBiometricEvaluateInputModelPartyAuthenticationAssessmentInstanceRecord getPartyAuthenticationAssessmentInstanceRecord() {
    return partyAuthenticationAssessmentInstanceRecord;
  }

  public void setPartyAuthenticationAssessmentInstanceRecord(BQBiometricEvaluateInputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord) {
    this.partyAuthenticationAssessmentInstanceRecord = partyAuthenticationAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Party Authentication Assessment instance 
   * @return partyAuthenticationAssessmentInstanceReference
  **/

  public String getPartyAuthenticationAssessmentInstanceReference() {
    return partyAuthenticationAssessmentInstanceReference;
  }

  public void setPartyAuthenticationAssessmentInstanceReference(String partyAuthenticationAssessmentInstanceReference) {
    this.partyAuthenticationAssessmentInstanceReference = partyAuthenticationAssessmentInstanceReference;
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
   * Get biometricInstanceRecord
   * @return biometricInstanceRecord
  **/

  public BQBiometricEvaluateInputModelBiometricInstanceRecord getBiometricInstanceRecord() {
    return biometricInstanceRecord;
  }

  public void setBiometricInstanceRecord(BQBiometricEvaluateInputModelBiometricInstanceRecord biometricInstanceRecord) {
    this.biometricInstanceRecord = biometricInstanceRecord;
  }


}

