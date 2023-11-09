package com.sangamone.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangamone.dao.LoanRequestDao;
import com.sangamone.model.LoanRequest;
import com.sangamone.repository.LoanRequestRepo;

@Service
public class LoanRequestServiceImpl implements LoanRequestDao{
	@Autowired
	LoanRequestRepo repo;

	@Override
	public String addLoanRequest(LoanRequest loanRequest) {
		repo.save(loanRequest);
		return "Loanrequest added successfully";
		
		
	}

	@Override
	public List<LoanRequest> viewLoanRequest() {
		
		return repo.findAll();
	}

}
