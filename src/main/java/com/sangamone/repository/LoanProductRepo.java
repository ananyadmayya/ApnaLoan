package com.sangamone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sangamone.model.LoanProduct;

public interface LoanProductRepo extends JpaRepository<LoanProduct, Integer>{
	

}
