package com.sangamone.dao;

import java.util.List;

import com.sangamone.model.EnrolmentCenterAdmin;

public interface EnrolmentCenterAdminDao {

	String addAdminDetails(EnrolmentCenterAdmin eca);

	List<EnrolmentCenterAdmin> viewAllAdminDetails();

	List<EnrolmentCenterAdmin> viewAdminDetailsByCenterId(int center_id);

	

}
