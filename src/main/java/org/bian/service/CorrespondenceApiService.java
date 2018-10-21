/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CorrespondenceApiService {

	CorrespondenceBlockResponse requestPostBlocks(String crReferenceId, CorrespondenceBlockRequest request);
	
	CorrespondenceBlockResponse requestPutBlocks(String crReferenceId, String bqReferenceId, CorrespondenceBlockRequest request);
	
	CorrespondenceInboundResponse executePostInbounds(String crReferenceId, CorrespondenceInboundRequest request);
	
	CorrespondenceInboundResponse executePutInbounds(String crReferenceId, String bqReferenceId, CorrespondenceInboundRequest request);
	
	CorrespondenceOutboundResponse executePostOutbounds(String crReferenceId, CorrespondenceOutboundRequest request);
	
	CorrespondenceOutboundResponse executePutOutbounds(String crReferenceId, String bqReferenceId, CorrespondenceOutboundRequest request);
	
	CorrespondenceOutboundWithResponseResponse executePostOutboundResponses(String crReferenceId, CorrespondenceOutboundResponseRequest request);
	
	CorrespondenceOutboundWithResponseResponse executePutOutboundResponses(String crReferenceId, String bqReferenceId, CorrespondenceOutboundResponseRequest request);
	
	CorrespondenceRecordResponse record(String crReferenceId, CorrespondenceRecordRequest request);
	
	CorrespondenceUpdateResponse requestPostUpdates(String crReferenceId, CorrespondenceUpdateRequest request);
	
	CorrespondenceUpdateResponse requestPutUpdates(String crReferenceId, String bqReferenceId, CorrespondenceUpdateRequest request);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	CorrespondenceResponse retrieve(String crReferenceId);
	
	CorrespondenceBlockResponse retrieveBlocks(String crReferenceId, String bqReferenceId);
	
	CorrespondenceInboundResponse retrieveInbounds(String crReferenceId, String bqReferenceId);
	
	CorrespondenceOutboundResponse retrieveOutbounds(String crReferenceId, String bqReferenceId);
	
	CorrespondenceOutboundWithResponseResponse retrieveOutboundResponses(String crReferenceId, String bqReferenceId);
	
	CorrespondenceUpdateResponse retrieveUpdates(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds();
	
}
