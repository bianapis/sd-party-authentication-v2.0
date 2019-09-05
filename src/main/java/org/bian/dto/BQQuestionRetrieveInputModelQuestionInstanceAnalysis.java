package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQQuestionRetrieveInputModelQuestionInstanceAnalysis
 */
public class BQQuestionRetrieveInputModelQuestionInstanceAnalysis   {
  private String questionInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return questionInstanceAnalysisReference
  **/

  public String getQuestionInstanceAnalysisReference() {
    return questionInstanceAnalysisReference;
  }

  public void setQuestionInstanceAnalysisReference(String questionInstanceAnalysisReference) {
    this.questionInstanceAnalysisReference = questionInstanceAnalysisReference;
  }


}

