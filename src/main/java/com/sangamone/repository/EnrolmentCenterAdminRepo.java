package com.sangamone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sangamone.model.EnrolmentCenterAdmin;

public interface EnrolmentCenterAdminRepo extends JpaRepository<EnrolmentCenterAdmin, Integer>{

	@Query(value="select * from enrolment_center_admin where center_id=:center_id", nativeQuery=true)
	List<EnrolmentCenterAdmin> viewAdminDetailsByCenterId(@Param("center_id") int center_id);

}
