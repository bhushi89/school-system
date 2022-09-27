package com.school.dao;

import org.springframework.stereotype.Service;

import com.school.bean.StudentRegistrationBean;

@Service
public interface StudentRegistrationDao {	

	void saveStudent(StudentRegistrationBean studbean);
	

}
