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
import org.bian.annotation.functionalpattern.Operate;

@BianRestController
public class CorrespondenceApiController {

	@Autowired
	CorrespondenceApiService service;
	
	@BQ("blocks")
	@Operate.RequestPost
	public BianResponse<CorrespondenceBlockResponse> requestPostBlocks(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CorrespondenceBlockRequest> bianRequest) {
		return BianResponse.forSuccess(service.requestPostBlocks(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("blocks")
	@Operate.RequestPut
	public BianResponse<CorrespondenceBlockResponse> requestPutBlocks(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CorrespondenceBlockRequest> bianRequest) {
		return BianResponse.forSuccess(service.requestPutBlocks(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("inbounds")
	@Operate.ExecutePost
	public BianResponse<CorrespondenceInboundResponse> executePostInbounds(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CorrespondenceInboundRequest> bianRequest) {
		return BianResponse.forSuccess(service.executePostInbounds(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("inbounds")
	@Operate.ExecutePut
	public BianResponse<CorrespondenceInboundResponse> executePutInbounds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CorrespondenceInboundRequest> bianRequest) {
		return BianResponse.forSuccess(service.executePutInbounds(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("outbounds")
	@Operate.ExecutePost
	public BianResponse<CorrespondenceOutboundResponse> executePostOutbounds(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CorrespondenceOutboundRequest> bianRequest) {
		return BianResponse.forSuccess(service.executePostOutbounds(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("outbounds")
	@Operate.ExecutePut
	public BianResponse<CorrespondenceOutboundResponse> executePutOutbounds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CorrespondenceOutboundRequest> bianRequest) {
		return BianResponse.forSuccess(service.executePutOutbounds(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("outbound-responses")
	@Operate.ExecutePost
	public BianResponse<CorrespondenceOutboundWithResponseResponse> executePostOutboundResponses(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CorrespondenceOutboundResponseRequest> bianRequest) {
		return BianResponse.forSuccess(service.executePostOutboundResponses(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("outbound-responses")
	@Operate.ExecutePut
	public BianResponse<CorrespondenceOutboundWithResponseResponse> executePutOutboundResponses(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CorrespondenceOutboundResponseRequest> bianRequest) {
		return BianResponse.forSuccess(service.executePutOutboundResponses(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Operate.Record
	public BianResponse<CorrespondenceRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CorrespondenceRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("updates")
	@Operate.RequestPost
	public BianResponse<CorrespondenceUpdateResponse> requestPostUpdates(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CorrespondenceUpdateRequest> bianRequest) {
		return BianResponse.forSuccess(service.requestPostUpdates(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("updates")
	@Operate.RequestPut
	public BianResponse<CorrespondenceUpdateResponse> requestPutUpdates(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CorrespondenceUpdateRequest> bianRequest) {
		return BianResponse.forSuccess(service.requestPutUpdates(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Operate.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Operate.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Operate.Retrieve
	public BianResponse<CorrespondenceResponse> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@BQ("blocks")
	@Operate.Retrieve
	public BianResponse<CorrespondenceBlockResponse> retrieveBlocks(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveBlocks(crReferenceId, bqReferenceId));
	}
	
	@BQ("inbounds")
	@Operate.Retrieve
	public BianResponse<CorrespondenceInboundResponse> retrieveInbounds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInbounds(crReferenceId, bqReferenceId));
	}
	
	@BQ("outbounds")
	@Operate.Retrieve
	public BianResponse<CorrespondenceOutboundResponse> retrieveOutbounds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveOutbounds(crReferenceId, bqReferenceId));
	}
	
	@BQ("outbound-responses")
	@Operate.Retrieve
	public BianResponse<CorrespondenceOutboundWithResponseResponse> retrieveOutboundResponses(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveOutboundResponses(crReferenceId, bqReferenceId));
	}
	
	@BQ("updates")
	@Operate.Retrieve
	public BianResponse<CorrespondenceUpdateResponse> retrieveUpdates(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveUpdates(crReferenceId, bqReferenceId));
	}
	
	@Operate.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
}
