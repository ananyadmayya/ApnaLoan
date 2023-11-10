package com.sangamone.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangamone.dao.EnrolmentCenterAdminDao;
import com.sangamone.model.EnrolmentCenterAdmin;
import com.sangamone.repository.EnrolmentCenterAdminRepo;

@Service
public class EnrolmentCenterAdminServiceImpl implements EnrolmentCenterAdminDao{
	@Autowired
	EnrolmentCenterAdminRepo repo;

	@Override
	public String addAdminDetails(EnrolmentCenterAdmin eca) {
		repo.save(eca);
		return "Admin details added successfully";
	}

	@Override
	public List<EnrolmentCenterAdmin> viewAllAdminDetails() {
		return repo.findAll();
	}

	@Override
	public List<EnrolmentCenterAdmin> viewAdminDetailsByCenterId(int center_id) {
	
		return repo.viewAdminDetailsByCenterId(center_id);
	}

}
