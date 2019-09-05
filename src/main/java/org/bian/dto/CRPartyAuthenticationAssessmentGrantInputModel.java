package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyAuthenticationAssessmentGrantInputModelGrantRequestInputRecord;

import javax.validation.Valid;
  
/**
 * CRPartyAuthenticationAssessmentGrantInputModel
 */
public class CRPartyAuthenticationAssessmentGrantInputModel   {
  private String partyAuthenticationServicingSessionReference = null;

  private String partyAuthenticationAssessmentInstanceReference = null;

  private Object partyAuthenticationAssessmentGrantActionTaskRecord = null;

  private String grantRequestRecordType = null;

  private CRPartyAuthenticationAssessmentGrantInputModelGrantRequestInputRecord grantRequestInputRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return partyAuthenticationServicingSessionReference
  **/

  public String getPartyAuthenticationServicingSessionReference() {
    return partyAuthenticationServicingSessionReference;
  }

  public void setPartyAuthenticationServicingSessionReference(String partyAuthenticationServicingSessionReference) {
    this.partyAuthenticationServicingSessionReference = partyAuthenticationServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Party Authentication Assessment instance 
   * @return partyAuthenticationAssessmentInstanceReference
  **/

  public String getPartyAuthenticationAssessmentInstanceReference() {
    return partyAuthenticationAssessmentInstanceReference;
  }

  public void setPartyAuthenticationAssessmentInstanceReference(String partyAuthenticationAssessmentInstanceReference) {
    this.partyAuthenticationAssessmentInstanceReference = partyAuthenticationAssessmentInstanceReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Grant request type (e.g. access permission) 
   * @return grantRequestRecordType
  **/

  public String getGrantRequestRecordType() {
    return grantRequestRecordType;
  }

  public void setGrantRequestRecordType(String grantRequestRecordType) {
    this.grantRequestRecordType = grantRequestRecordType;
  }


  /**
   * Get grantRequestInputRecord
   * @return grantRequestInputRecord
  **/

  public CRPartyAuthenticationAssessmentGrantInputModelGrantRequestInputRecord getGrantRequestInputRecord() {
    return grantRequestInputRecord;
  }

  public void setGrantRequestInputRecord(CRPartyAuthenticationAssessmentGrantInputModelGrantRequestInputRecord grantRequestInputRecord) {
    this.grantRequestInputRecord = grantRequestInputRecord;
  }


}

