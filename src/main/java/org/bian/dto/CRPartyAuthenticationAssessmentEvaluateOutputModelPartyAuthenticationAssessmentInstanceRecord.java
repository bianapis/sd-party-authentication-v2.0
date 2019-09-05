package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyAuthenticationAssessmentEvaluateInputModelPartyAuthenticationAssessmentInstanceRecordPartyAuthenticationAssessmentProfile;

import javax.validation.Valid;
  
/**
 * CRPartyAuthenticationAssessmentEvaluateOutputModelPartyAuthenticationAssessmentInstanceRecord
 */
public class CRPartyAuthenticationAssessmentEvaluateOutputModelPartyAuthenticationAssessmentInstanceRecord   {
  private CRPartyAuthenticationAssessmentEvaluateInputModelPartyAuthenticationAssessmentInstanceRecordPartyAuthenticationAssessmentProfile partyAuthenticationAssessmentProfile = null;

  private Object partyAuthenticationConsolidationRecord = null;

  private String customerContactAuthenticationLevel = null;


  /**
   * Get partyAuthenticationAssessmentProfile
   * @return partyAuthenticationAssessmentProfile
  **/

  public CRPartyAuthenticationAssessmentEvaluateInputModelPartyAuthenticationAssessmentInstanceRecordPartyAuthenticationAssessmentProfile getPartyAuthenticationAssessmentProfile() {
    return partyAuthenticationAssessmentProfile;
  }

  public void setPartyAuthenticationAssessmentProfile(CRPartyAuthenticationAssessmentEvaluateInputModelPartyAuthenticationAssessmentInstanceRecordPartyAuthenticationAssessmentProfile partyAuthenticationAssessmentProfile) {
    this.partyAuthenticationAssessmentProfile = partyAuthenticationAssessmentProfile;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The combination of the different assessment results used in the authentication determination 
   * @return partyAuthenticationConsolidationRecord
  **/

  public Object getPartyAuthenticationConsolidationRecord() {
    return partyAuthenticationConsolidationRecord;
  }

  public void setPartyAuthenticationConsolidationRecord(Object partyAuthenticationConsolidationRecord) {
    this.partyAuthenticationConsolidationRecord = partyAuthenticationConsolidationRecord;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_wcU_wA93EeGeV5vP7Mvdig_-374264443/elements/_UqFPkPkdEea0GN7fTO7hmQ  bian-reference: (as Authentication).AuthenticationResult `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_wcU_wA93EeGeV5vP7Mvdig_-374264443/elements/_FColeMTGEeChad0JzLk7QA_1230435094  bian-reference: (as Authentication).AuthenticationValue `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_wcU_wA93EeGeV5vP7Mvdig_-374264443/elements/_UqFPkPkdEea0GN7fTO7hmQ  bian-reference: (as Assessment).AssessmentResult  general-info: The required value and value returned as a result of the authentication task, defining the level of identity assurance achieved - valid for the duration of the current contact 
   * @return customerContactAuthenticationLevel
  **/

  public String getCustomerContactAuthenticationLevel() {
    return customerContactAuthenticationLevel;
  }

  public void setCustomerContactAuthenticationLevel(String customerContactAuthenticationLevel) {
    this.customerContactAuthenticationLevel = customerContactAuthenticationLevel;
  }


}

