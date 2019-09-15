package com.accenture.VCS.service;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.VCS.model.ClaimEntity;
import com.accenture.VCS.repository.ClaimRepository;

@Service
public class ClaimService implements IclaimService{

	@Autowired
	ClaimRepository claimRepo;
	
	@Override
	public ClaimEntity addClaim(ClaimEntity claim) {
		// TODO Auto-generated method stub
		
		//claim = claimRepo.save(claim);
		return claimRepo.save(claim);
	}

}
