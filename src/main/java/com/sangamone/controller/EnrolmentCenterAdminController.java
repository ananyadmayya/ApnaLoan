package com.sangamone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.dao.EnrolmentCenterAdminDao;
import com.sangamone.model.EnrolmentCenterAdmin;
import com.sangamone.model.EnrolmentCenterUser;
import com.sangamone.model.User;

@RestController
public class EnrolmentCenterAdminController {
	@Autowired
	EnrolmentCenterAdminDao dao;
	
	@PostMapping("/addAdminDetails")
	public String addAdminDetails(@RequestBody EnrolmentCenterAdmin eca) {
		return dao.addAdminDetails(eca);
		
	}
	
	@GetMapping("/viewAllAdminDetails")
	public List<EnrolmentCenterAdmin> viewAllAdminDetails(){
		return dao.viewAllAdminDetails();
	}
	
	@GetMapping("/viewAdminDetailsByCenterId/{center_id}")
	public List<EnrolmentCenterAdmin> viewAdminDetailsByCenterId(@PathVariable("center_id") int center_id){ 
	return dao.viewAdminDetailsByCenterId(center_id);
}

}
