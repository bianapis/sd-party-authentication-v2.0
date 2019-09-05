/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface PartyAuthenticationApiService {

	SDPartyAuthenticationActivateOutputModel activate(SDPartyAuthenticationActivateInputModel request);
	
	SDPartyAuthenticationConfigureOutputModel configure(String sdReferenceId, SDPartyAuthenticationConfigureInputModel request);
	
	CRPartyAuthenticationAssessmentEvaluateOutputModel evaluate(String sdReferenceId, CRPartyAuthenticationAssessmentEvaluateInputModel request);
	
	BQBehavioralEvaluateOutputModel evaluateBehavioral(String sdReferenceId, String crReferenceId, BQBehavioralEvaluateInputModel request);
	
	BQBiometricEvaluateOutputModel evaluateBiometric(String sdReferenceId, String crReferenceId, BQBiometricEvaluateInputModel request);
	
	BQDeviceEvaluateOutputModel evaluateDevice(String sdReferenceId, String crReferenceId, BQDeviceEvaluateInputModel request);
	
	BQDocumentEvaluateOutputModel evaluateDocument(String sdReferenceId, String crReferenceId, BQDocumentEvaluateInputModel request);
	
	BQPasswordEvaluateOutputModel evaluatePassword(String sdReferenceId, String crReferenceId, BQPasswordEvaluateInputModel request);
	
	BQQuestionEvaluateOutputModel evaluateQuestion(String sdReferenceId, String crReferenceId, BQQuestionEvaluateInputModel request);
	
	CRPartyAuthenticationAssessmentExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRPartyAuthenticationAssessmentExchangeInputModel request);
	
	CRPartyAuthenticationAssessmentExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRPartyAuthenticationAssessmentExecuteInputModel request);
	
	SDPartyAuthenticationFeedbackOutputModel feedback(String sdReferenceId, SDPartyAuthenticationFeedbackInputModel request);
	
	CRPartyAuthenticationAssessmentGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRPartyAuthenticationAssessmentGrantInputModel request);
	
	CRPartyAuthenticationAssessmentRequestOutputModel request(String sdReferenceId, String crReferenceId, CRPartyAuthenticationAssessmentRequestInputModel request);
	
	CRPartyAuthenticationAssessmentRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	BQBehavioralRetrieveOutputModel retrieveBehavioral(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQBiometricRetrieveOutputModel retrieveBiometric(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQDeviceRetrieveOutputModel retrieveDevice(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQDocumentRetrieveOutputModel retrieveDocument(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQPasswordRetrieveOutputModel retrievePassword(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQQuestionRetrieveOutputModel retrieveQuestion(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDPartyAuthenticationRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRPartyAuthenticationAssessmentUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRPartyAuthenticationAssessmentUpdateInputModel request);
	
}
