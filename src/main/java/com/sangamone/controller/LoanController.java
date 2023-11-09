package com.sangamone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.dao.LoanDao;
import com.sangamone.model.Loan;

@RestController
public class LoanController {
	@Autowired
	LoanDao loandao;
	
	@PostMapping("/addLoanDetails")
	public String addLoanDetails(@RequestBody Loan loan) {
		return loandao.addLoanDetails(loan);
		
	}
	
	@GetMapping("/viewLoanDetails")
	public List<Loan> viewLoanDetails(){
		return loandao.viewLoanDetails();
	}
	
	@GetMapping("/getLoanDetailsByUserId/{from_user_id}/{to_user_id}")
	public List<Loan> viewLoanDetailsByUserId(@PathVariable("from_user_id") int from_user_id ,@PathVariable("to_user_id")int to_user_id)
	{
		return loandao.viewLoanDetailsByUserId(from_user_id,to_user_id);
		
	}
	
	@GetMapping("/getLoanDetailsByCenterId/{center_id}")
	public List<Loan> viewLoanDetailsByCenterId(@PathVariable("center_id") int center_id )
	{
		return loandao.viewLoanDetailsByCenterId(center_id);
		
	}

}
