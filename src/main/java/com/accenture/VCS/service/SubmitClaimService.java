package com.accenture.VCS.service;



import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.accenture.VCS.repository.ClaimRepository;
import com.accenture.VCS.model.ClaimEntity;


import com.accenture.VCS.claimeligibility.AddClaimRequest;
import com.accenture.VCS.claimeligibility.AddClaimResponse;


@Service
public class SubmitClaimService {
	
	private ClaimRepository claimRepository;


	public AddClaimResponse submitClaim(AddClaimRequest request) {
		
		AddClaimResponse acknowledgement = new AddClaimResponse();
		//ClaimEntity req= new ClaimEntity(request);
		ClaimEntity req= new ClaimEntity();
		
		
			
		     req.setClaimId(request.getClaimId().intValue());
		     
		     req.setDateOfloss(request.getDateOfloss());
			
			req.setDateOfloss(request.getDateOfloss());
			
			req.setTimeOfloss(request.getTimeOfloss());
			
			req.setLosslocationAddress(request.getLosslocationAddress());

			req.setPincode(request.getPincode());
			
			req.setLossLocationStateCode(request.getLossLocationStateCode());
			
			req.setInjuryDetail(request.getInjuryDetail());
			
			req.setPolicyNumber(request.getPolicyNumber().intValue());

			req.setDescriptionOfLos(request.getDescriptionOfLos());
		
		
		
		ClaimEntity res = claimRepository.save(req);
		
		
			
				return acknowledgement ;
			
				//return res.getClaimId();
		

	}

}
