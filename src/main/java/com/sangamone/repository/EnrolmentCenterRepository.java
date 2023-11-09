package com.sangamone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sangamone.model.EnrolmentCenter;

public interface EnrolmentCenterRepository extends JpaRepository<EnrolmentCenter, Integer> {
	@Query(value="select * from enrolment_center where center_name=:center_name",nativeQuery=true)
	EnrolmentCenter addUser(String center_name);

}
