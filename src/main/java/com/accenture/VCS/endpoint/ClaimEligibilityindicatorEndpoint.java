package com.accenture.VCS.endpoint;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


import com.accenture.VCS.claimeligibility.AddClaimRequest;
import com.accenture.VCS.claimeligibility.AddClaimResponse;

import com.accenture.VCS.model.ClaimEntity;
import com.accenture.VCS.service.IclaimService;
import com.accenture.VCS.service.SubmitClaimService;
import com.accenture.VCS.claimeligibility.ServiceStatus;



@Endpoint
public class ClaimEligibilityindicatorEndpoint {

	private static final String NAMESPACE = "http://www.accenture.com/VCS/ClaimEligibility";
	@Autowired
	private SubmitClaimService service;
	@Autowired
	private IclaimService claimService;

	@PayloadRoot(namespace = NAMESPACE, localPart = "addClaimRequest")
	@ResponsePayload
	public AddClaimResponse getSuccessStatus(@RequestPayload AddClaimRequest request) {
		
		
		
		
		 	
		System.out.println("Claim id is  "+request.getClaimId().intValue());
		
		AddClaimResponse response = new AddClaimResponse();
		ServiceStatus status= new ServiceStatus();
		ClaimEntity claim = new ClaimEntity();
		ClaimEntity claimres = new ClaimEntity();
		
		
		claim.setClaimId(request.getClaimId().intValue());
		claim.setDateOfloss(request.getDateOfloss());
		claim.setDateOfloss(request.getDateOfloss());
		claim.setTimeOfloss(request.getTimeOfloss());
		claim.setLosslocationAddress(request.getLosslocationAddress());
        claim.setPincode(request.getPincode());
		claim.setLossLocationStateCode(request.getLossLocationStateCode());
		claim.setInjuryDetail(request.getInjuryDetail());
		claim.setPolicyNumber(request.getPolicyNumber().intValue());
        claim.setDescriptionOfLos(request.getDescriptionOfLos());
	
		claimres = claimService.addClaim(claim);
		 
		status.setStatusCode("SUCCESS");
		status.setMessage("Congo!!!!. Added successfully.");
		
		response.setServiceStatus(status);
		
		return response;
		
		
		
		
		
		
		
	
	}

}
