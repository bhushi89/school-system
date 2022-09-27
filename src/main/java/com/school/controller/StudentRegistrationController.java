package com.school.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.school.bean.StudentRegistrationBean;
import com.school.dao.StudentRegistrationDao;

@Controller
public class StudentRegistrationController {
	
	@Autowired
	StudentRegistrationDao studDao;
	
	
	@GetMapping("/showRegistrationForm")
	public String showRegistrationForm(Model m) {
		StudentRegistrationBean studBean = new StudentRegistrationBean();
		m.addAttribute("student", studBean);
		return "student_registration";
	}
	
	
	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute("student") StudentRegistrationBean studBean) {
	
		LocalDateTime now = LocalDateTime.now();
		studBean.setIs_active(1);
		studBean.setRole_id(03);		
		String localdate=now.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
		studBean.setCreated_at(localdate);	   
		studDao.saveStudent(studBean);

		return "student_registration";
	}
	
}
