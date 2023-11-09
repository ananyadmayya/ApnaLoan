package com.sangamone.dao;

import java.util.List;

import com.sangamone.model.LoanRequest;

public interface LoanRequestDao {

	String addLoanRequest(LoanRequest loanRequest);

	List<LoanRequest> viewLoanRequest();

}
