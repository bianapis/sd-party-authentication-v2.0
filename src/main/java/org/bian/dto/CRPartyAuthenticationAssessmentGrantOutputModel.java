package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyAuthenticationAssessmentGrantOutputModelGrantRequestResponseRecord;

import javax.validation.Valid;
  
/**
 * CRPartyAuthenticationAssessmentGrantOutputModel
 */
public class CRPartyAuthenticationAssessmentGrantOutputModel   {
  private String partyAuthenticationAssessmentGrantActionTaskReference = null;

  private Object partyAuthenticationAssessmentGrantActionTaskRecord = null;

  private String grantRequestRecordReference = null;

  private CRPartyAuthenticationAssessmentGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Party Authentication Assessment instance grant service call 
   * @return partyAuthenticationAssessmentGrantActionTaskReference
  **/

  public String getPartyAuthenticationAssessmentGrantActionTaskReference() {
    return partyAuthenticationAssessmentGrantActionTaskReference;
  }

  public void setPartyAuthenticationAssessmentGrantActionTaskReference(String partyAuthenticationAssessmentGrantActionTaskReference) {
    this.partyAuthenticationAssessmentGrantActionTaskReference = partyAuthenticationAssessmentGrantActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return partyAuthenticationAssessmentGrantActionTaskRecord
  **/

  public Object getPartyAuthenticationAssessmentGrantActionTaskRecord() {
    return partyAuthenticationAssessmentGrantActionTaskRecord;
  }

  public void setPartyAuthenticationAssessmentGrantActionTaskRecord(Object partyAuthenticationAssessmentGrantActionTaskRecord) {
    this.partyAuthenticationAssessmentGrantActionTaskRecord = partyAuthenticationAssessmentGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the grant request record 
   * @return grantRequestRecordReference
  **/

  public String getGrantRequestRecordReference() {
    return grantRequestRecordReference;
  }

  public void setGrantRequestRecordReference(String grantRequestRecordReference) {
    this.grantRequestRecordReference = grantRequestRecordReference;
  }


  /**
   * Get grantRequestResponseRecord
   * @return grantRequestResponseRecord
  **/

  public CRPartyAuthenticationAssessmentGrantOutputModelGrantRequestResponseRecord getGrantRequestResponseRecord() {
    return grantRequestResponseRecord;
  }

  public void setGrantRequestResponseRecord(CRPartyAuthenticationAssessmentGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord) {
    this.grantRequestResponseRecord = grantRequestResponseRecord;
  }


}

