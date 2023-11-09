package com.sangamone.dao;

import java.util.List;

import com.sangamone.model.Loan;

public interface LoanDao {
	String addLoanDetails(Loan loan);

	List<Loan> viewLoanDetails();

	List<Loan> viewLoanDetailsByUserId(int from_user_id, int to_user_id);

	List<Loan> viewLoanDetailsByCenterId(int center_id);

}
