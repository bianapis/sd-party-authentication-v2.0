package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBehavioralRetrieveInputModelBehavioralInstanceAnalysis
 */
public class BQBehavioralRetrieveInputModelBehavioralInstanceAnalysis   {
  private String behavioralInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return behavioralInstanceAnalysisReference
  **/

  public String getBehavioralInstanceAnalysisReference() {
    return behavioralInstanceAnalysisReference;
  }

  public void setBehavioralInstanceAnalysisReference(String behavioralInstanceAnalysisReference) {
    this.behavioralInstanceAnalysisReference = behavioralInstanceAnalysisReference;
  }


}

