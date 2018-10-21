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
public class CorrespondenceApiServiceImpl implements CorrespondenceApiService {

	public CorrespondenceBlockResponse requestPostBlocks(String crReferenceId, CorrespondenceBlockRequest request){
		return JsonReader.read("requestPost-CorrespondenceBlockResponse.json",new TypeReference<CorrespondenceBlockResponse>(){});
	}
	
	public CorrespondenceBlockResponse requestPutBlocks(String crReferenceId, String bqReferenceId, CorrespondenceBlockRequest request){
		return JsonReader.read("requestPut-CorrespondenceBlockResponse.json",new TypeReference<CorrespondenceBlockResponse>(){});
	}
	
	public CorrespondenceInboundResponse executePostInbounds(String crReferenceId, CorrespondenceInboundRequest request){
		return JsonReader.read("executePost-CorrespondenceInboundResponse.json",new TypeReference<CorrespondenceInboundResponse>(){});
	}
	
	public CorrespondenceInboundResponse executePutInbounds(String crReferenceId, String bqReferenceId, CorrespondenceInboundRequest request){
		return JsonReader.read("executePut-CorrespondenceInboundResponse.json",new TypeReference<CorrespondenceInboundResponse>(){});
	}
	
	public CorrespondenceOutboundResponse executePostOutbounds(String crReferenceId, CorrespondenceOutboundRequest request){
		return JsonReader.read("executePost-CorrespondenceOutboundResponse.json",new TypeReference<CorrespondenceOutboundResponse>(){});
	}
	
	public CorrespondenceOutboundResponse executePutOutbounds(String crReferenceId, String bqReferenceId, CorrespondenceOutboundRequest request){
		return JsonReader.read("executePut-CorrespondenceOutboundResponse.json",new TypeReference<CorrespondenceOutboundResponse>(){});
	}
	
	public CorrespondenceOutboundWithResponseResponse executePostOutboundResponses(String crReferenceId, CorrespondenceOutboundResponseRequest request){
		return JsonReader.read("executePost-CorrespondenceOutboundWithResponseResponse.json",new TypeReference<CorrespondenceOutboundWithResponseResponse>(){});
	}
	
	public CorrespondenceOutboundWithResponseResponse executePutOutboundResponses(String crReferenceId, String bqReferenceId, CorrespondenceOutboundResponseRequest request){
		return JsonReader.read("executePut-CorrespondenceOutboundWithResponseResponse.json",new TypeReference<CorrespondenceOutboundWithResponseResponse>(){});
	}
	
	public CorrespondenceRecordResponse record(String crReferenceId, CorrespondenceRecordRequest request){
		return JsonReader.read("record-CorrespondenceRecordResponse.json",new TypeReference<CorrespondenceRecordResponse>(){});
	}
	
	public CorrespondenceUpdateResponse requestPostUpdates(String crReferenceId, CorrespondenceUpdateRequest request){
		return JsonReader.read("requestPost-CorrespondenceUpdateResponse.json",new TypeReference<CorrespondenceUpdateResponse>(){});
	}
	
	public CorrespondenceUpdateResponse requestPutUpdates(String crReferenceId, String bqReferenceId, CorrespondenceUpdateRequest request){
		return JsonReader.read("requestPut-CorrespondenceUpdateResponse.json",new TypeReference<CorrespondenceUpdateResponse>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public CorrespondenceResponse retrieve(String crReferenceId){
		return JsonReader.read("retrieve-CorrespondenceResponse.json",new TypeReference<CorrespondenceResponse>(){});
	}
	
	public CorrespondenceBlockResponse retrieveBlocks(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CorrespondenceBlockResponse.json",new TypeReference<CorrespondenceBlockResponse>(){});
	}
	
	public CorrespondenceInboundResponse retrieveInbounds(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CorrespondenceInboundResponse.json",new TypeReference<CorrespondenceInboundResponse>(){});
	}
	
	public CorrespondenceOutboundResponse retrieveOutbounds(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CorrespondenceOutboundResponse.json",new TypeReference<CorrespondenceOutboundResponse>(){});
	}
	
	public CorrespondenceOutboundWithResponseResponse retrieveOutboundResponses(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CorrespondenceOutboundWithResponseResponse.json",new TypeReference<CorrespondenceOutboundWithResponseResponse>(){});
	}
	
	public CorrespondenceUpdateResponse retrieveUpdates(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CorrespondenceUpdateResponse.json",new TypeReference<CorrespondenceUpdateResponse>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
}
