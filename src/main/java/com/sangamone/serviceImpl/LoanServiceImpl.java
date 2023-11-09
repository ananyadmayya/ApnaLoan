package com.sangamone.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangamone.dao.LoanDao;
import com.sangamone.model.Loan;
import com.sangamone.repository.LoanRepo;

@Service
public class LoanServiceImpl implements LoanDao {
	@Autowired
	LoanRepo loanrepo;

	@Override
	public String addLoanDetails(Loan loan) {
		loanrepo.save(loan);
		return "Added Loan Details successfully";
	}

	@Override
	public List<Loan> viewLoanDetails() {
		return loanrepo.findAll();
	}

	@Override
	public List<Loan> viewLoanDetailsByUserId(int from_user_id, int to_user_id) {
		return loanrepo.viewLoanDetailsByUserId(from_user_id,to_user_id);
	}

	@Override
	public List<Loan> viewLoanDetailsByCenterId(int center_id) {
		
		return loanrepo.viewLoanDetailsByCenterId(center_id);
	}

}
