package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyAuthenticationAssessmentUpdateInputModelPartyAuthenticationAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRPartyAuthenticationAssessmentUpdateOutputModel
 */
public class CRPartyAuthenticationAssessmentUpdateOutputModel   {
  private CRPartyAuthenticationAssessmentUpdateInputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord = null;

  private String partyAuthenticationAssessmentUpdateActionTaskReference = null;

  private Object partyAuthenticationAssessmentUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get partyAuthenticationAssessmentInstanceRecord
   * @return partyAuthenticationAssessmentInstanceRecord
  **/

  public CRPartyAuthenticationAssessmentUpdateInputModelPartyAuthenticationAssessmentInstanceRecord getPartyAuthenticationAssessmentInstanceRecord() {
    return partyAuthenticationAssessmentInstanceRecord;
  }

  public void setPartyAuthenticationAssessmentInstanceRecord(CRPartyAuthenticationAssessmentUpdateInputModelPartyAuthenticationAssessmentInstanceRecord partyAuthenticationAssessmentInstanceRecord) {
    this.partyAuthenticationAssessmentInstanceRecord = partyAuthenticationAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return partyAuthenticationAssessmentUpdateActionTaskReference
  **/

  public String getPartyAuthenticationAssessmentUpdateActionTaskReference() {
    return partyAuthenticationAssessmentUpdateActionTaskReference;
  }

  public void setPartyAuthenticationAssessmentUpdateActionTaskReference(String partyAuthenticationAssessmentUpdateActionTaskReference) {
    this.partyAuthenticationAssessmentUpdateActionTaskReference = partyAuthenticationAssessmentUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return partyAuthenticationAssessmentUpdateActionTaskRecord
  **/

  public Object getPartyAuthenticationAssessmentUpdateActionTaskRecord() {
    return partyAuthenticationAssessmentUpdateActionTaskRecord;
  }

  public void setPartyAuthenticationAssessmentUpdateActionTaskRecord(Object partyAuthenticationAssessmentUpdateActionTaskRecord) {
    this.partyAuthenticationAssessmentUpdateActionTaskRecord = partyAuthenticationAssessmentUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

