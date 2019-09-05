/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class PartyAuthenticationApiServiceImpl implements PartyAuthenticationApiService {

	public SDPartyAuthenticationActivateOutputModel activate(SDPartyAuthenticationActivateInputModel request){
		return JsonReader.read("activate-SDPartyAuthenticationActivateOutputModel.json",new TypeReference<SDPartyAuthenticationActivateOutputModel>(){});
	}
	
	public SDPartyAuthenticationConfigureOutputModel configure(String sdReferenceId, SDPartyAuthenticationConfigureInputModel request){
		return JsonReader.read("configure-SDPartyAuthenticationConfigureOutputModel.json",new TypeReference<SDPartyAuthenticationConfigureOutputModel>(){});
	}
	
	public CRPartyAuthenticationAssessmentEvaluateOutputModel evaluate(String sdReferenceId, CRPartyAuthenticationAssessmentEvaluateInputModel request){
		return JsonReader.read("evaluate-CRPartyAuthenticationAssessmentEvaluateOutputModel.json",new TypeReference<CRPartyAuthenticationAssessmentEvaluateOutputModel>(){});
	}
	
	public BQBehavioralEvaluateOutputModel evaluateBehavioral(String sdReferenceId, String crReferenceId, BQBehavioralEvaluateInputModel request){
		return JsonReader.read("evaluate-BQBehavioralEvaluateOutputModel.json",new TypeReference<BQBehavioralEvaluateOutputModel>(){});
	}
	
	public BQBiometricEvaluateOutputModel evaluateBiometric(String sdReferenceId, String crReferenceId, BQBiometricEvaluateInputModel request){
		return JsonReader.read("evaluate-BQBiometricEvaluateOutputModel.json",new TypeReference<BQBiometricEvaluateOutputModel>(){});
	}
	
	public BQDeviceEvaluateOutputModel evaluateDevice(String sdReferenceId, String crReferenceId, BQDeviceEvaluateInputModel request){
		return JsonReader.read("evaluate-BQDeviceEvaluateOutputModel.json",new TypeReference<BQDeviceEvaluateOutputModel>(){});
	}
	
	public BQDocumentEvaluateOutputModel evaluateDocument(String sdReferenceId, String crReferenceId, BQDocumentEvaluateInputModel request){
		return JsonReader.read("evaluate-BQDocumentEvaluateOutputModel.json",new TypeReference<BQDocumentEvaluateOutputModel>(){});
	}
	
	public BQPasswordEvaluateOutputModel evaluatePassword(String sdReferenceId, String crReferenceId, BQPasswordEvaluateInputModel request){
		return JsonReader.read("evaluate-BQPasswordEvaluateOutputModel.json",new TypeReference<BQPasswordEvaluateOutputModel>(){});
	}
	
	public BQQuestionEvaluateOutputModel evaluateQuestion(String sdReferenceId, String crReferenceId, BQQuestionEvaluateInputModel request){
		return JsonReader.read("evaluate-BQQuestionEvaluateOutputModel.json",new TypeReference<BQQuestionEvaluateOutputModel>(){});
	}
	
	public CRPartyAuthenticationAssessmentExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRPartyAuthenticationAssessmentExchangeInputModel request){
		return JsonReader.read("exchange-CRPartyAuthenticationAssessmentExchangeOutputModel.json",new TypeReference<CRPartyAuthenticationAssessmentExchangeOutputModel>(){});
	}
	
	public CRPartyAuthenticationAssessmentExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRPartyAuthenticationAssessmentExecuteInputModel request){
		return JsonReader.read("execute-CRPartyAuthenticationAssessmentExecuteOutputModel.json",new TypeReference<CRPartyAuthenticationAssessmentExecuteOutputModel>(){});
	}
	
	public SDPartyAuthenticationFeedbackOutputModel feedback(String sdReferenceId, SDPartyAuthenticationFeedbackInputModel request){
		return JsonReader.read("feedback-SDPartyAuthenticationFeedbackOutputModel.json",new TypeReference<SDPartyAuthenticationFeedbackOutputModel>(){});
	}
	
	public CRPartyAuthenticationAssessmentGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRPartyAuthenticationAssessmentGrantInputModel request){
		return JsonReader.read("grant-CRPartyAuthenticationAssessmentGrantOutputModel.json",new TypeReference<CRPartyAuthenticationAssessmentGrantOutputModel>(){});
	}
	
	public CRPartyAuthenticationAssessmentRequestOutputModel request(String sdReferenceId, String crReferenceId, CRPartyAuthenticationAssessmentRequestInputModel request){
		return JsonReader.read("request-CRPartyAuthenticationAssessmentRequestOutputModel.json",new TypeReference<CRPartyAuthenticationAssessmentRequestOutputModel>(){});
	}
	
	public CRPartyAuthenticationAssessmentRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRPartyAuthenticationAssessmentRetrieveOutputModel.json",new TypeReference<CRPartyAuthenticationAssessmentRetrieveOutputModel>(){});
	}
	
	public BQBehavioralRetrieveOutputModel retrieveBehavioral(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQBehavioralRetrieveOutputModel.json",new TypeReference<BQBehavioralRetrieveOutputModel>(){});
	}
	
	public BQBiometricRetrieveOutputModel retrieveBiometric(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQBiometricRetrieveOutputModel.json",new TypeReference<BQBiometricRetrieveOutputModel>(){});
	}
	
	public BQDeviceRetrieveOutputModel retrieveDevice(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQDeviceRetrieveOutputModel.json",new TypeReference<BQDeviceRetrieveOutputModel>(){});
	}
	
	public BQDocumentRetrieveOutputModel retrieveDocument(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQDocumentRetrieveOutputModel.json",new TypeReference<BQDocumentRetrieveOutputModel>(){});
	}
	
	public BQPasswordRetrieveOutputModel retrievePassword(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPasswordRetrieveOutputModel.json",new TypeReference<BQPasswordRetrieveOutputModel>(){});
	}
	
	public BQQuestionRetrieveOutputModel retrieveQuestion(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQQuestionRetrieveOutputModel.json",new TypeReference<BQQuestionRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDPartyAuthenticationRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDPartyAuthenticationRetrieveOutputModel.json",new TypeReference<SDPartyAuthenticationRetrieveOutputModel>(){});
	}
	
	public CRPartyAuthenticationAssessmentUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRPartyAuthenticationAssessmentUpdateInputModel request){
		return JsonReader.read("update-CRPartyAuthenticationAssessmentUpdateOutputModel.json",new TypeReference<CRPartyAuthenticationAssessmentUpdateOutputModel>(){});
	}
	
}
