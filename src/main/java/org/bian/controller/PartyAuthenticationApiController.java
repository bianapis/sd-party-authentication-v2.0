/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Assess;

@BianRestController
public class PartyAuthenticationApiController {

	@Autowired
	PartyAuthenticationApiService service;
	
	@Assess.Activate
	public BianResponse<SDPartyAuthenticationActivateOutputModel> activate(@RequestBody BianRequest<SDPartyAuthenticationActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Assess.Configure
	public BianResponse<SDPartyAuthenticationConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDPartyAuthenticationConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Assess.Evaluate
	public BianResponse<CRPartyAuthenticationAssessmentEvaluateOutputModel> evaluate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRPartyAuthenticationAssessmentEvaluateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.evaluate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("behavioral")
	@Assess.Evaluate
	public BianResponse<BQBehavioralEvaluateOutputModel> evaluateBehavioral(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQBehavioralEvaluateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.evaluateBehavioral(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("biometric")
	@Assess.Evaluate
	public BianResponse<BQBiometricEvaluateOutputModel> evaluateBiometric(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQBiometricEvaluateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.evaluateBiometric(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("device")
	@Assess.Evaluate
	public BianResponse<BQDeviceEvaluateOutputModel> evaluateDevice(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQDeviceEvaluateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.evaluateDevice(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("document")
	@Assess.Evaluate
	public BianResponse<BQDocumentEvaluateOutputModel> evaluateDocument(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQDocumentEvaluateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.evaluateDocument(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("password")
	@Assess.Evaluate
	public BianResponse<BQPasswordEvaluateOutputModel> evaluatePassword(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQPasswordEvaluateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.evaluatePassword(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("question")
	@Assess.Evaluate
	public BianResponse<BQQuestionEvaluateOutputModel> evaluateQuestion(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQQuestionEvaluateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.evaluateQuestion(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Assess.Exchange
	public BianResponse<CRPartyAuthenticationAssessmentExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRPartyAuthenticationAssessmentExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Assess.Execute
	public BianResponse<CRPartyAuthenticationAssessmentExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRPartyAuthenticationAssessmentExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Assess.Feedback
	public BianResponse<SDPartyAuthenticationFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDPartyAuthenticationFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Assess.Grant
	public BianResponse<CRPartyAuthenticationAssessmentGrantOutputModel> grant(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRPartyAuthenticationAssessmentGrantInputModel> bianRequest) {
		return BianResponse.forSuccess(service.grant(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Assess.Request
	public BianResponse<CRPartyAuthenticationAssessmentRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRPartyAuthenticationAssessmentRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Assess.Retrieve
	public BianResponse<CRPartyAuthenticationAssessmentRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@BQ("behavioral")
	@Assess.Retrieve
	public BianResponse<BQBehavioralRetrieveOutputModel> retrieveBehavioral(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveBehavioral(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("biometric")
	@Assess.Retrieve
	public BianResponse<BQBiometricRetrieveOutputModel> retrieveBiometric(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveBiometric(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("device")
	@Assess.Retrieve
	public BianResponse<BQDeviceRetrieveOutputModel> retrieveDevice(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDevice(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("document")
	@Assess.Retrieve
	public BianResponse<BQDocumentRetrieveOutputModel> retrieveDocument(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDocument(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("password")
	@Assess.Retrieve
	public BianResponse<BQPasswordRetrieveOutputModel> retrievePassword(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePassword(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("question")
	@Assess.Retrieve
	public BianResponse<BQQuestionRetrieveOutputModel> retrieveQuestion(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveQuestion(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Assess.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Assess.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Assess.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Assess.RetrieveSD
	public BianResponse<SDPartyAuthenticationRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Assess.Update
	public BianResponse<CRPartyAuthenticationAssessmentUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRPartyAuthenticationAssessmentUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
}
