package com.school.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.bean.StudentRegistrationBean;
import com.school.repository.StudentRepository;

@Service
public class StudentRegistrationDaoImple implements StudentRegistrationDao {

	@Autowired
	private StudentRepository studRepo;
	
	@Override
	public void saveStudent(StudentRegistrationBean studBean) {
		this.studRepo.save(studBean);		
	}

}
