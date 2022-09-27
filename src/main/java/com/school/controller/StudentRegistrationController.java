package com.school.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.school.bean.StudentRegistrationBean;
import com.school.dao.StudentRegistrationDao;
import com.school.repository.StudentRepository;

@Controller
public class StudentRegistrationController {

	@Autowired
	private StudentRepository studRepo;
	
	@Autowired
	StudentRegistrationDao studDao;
	/*
	 * @PostMapping("/saveStudent") public String
	 * saveStudent(@ModelAttribute("student") StudentRegistrationBean studBean) {
	 * studDao.saveStudent(studBean); return "redirect:/"; }
	 */
	
	@GetMapping("/showRegistrationForm")
	public String showRegistrationForm(Model m) {
		StudentRegistrationBean studBean = new StudentRegistrationBean();
		m.addAttribute("student", studBean);
		return "student_registration";
	}
	
	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute("student") StudentRegistrationBean studBean) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();
		studBean.setIs_active(1);
		studBean.setCreated_at(now);
	System.out.println(studBean.toString());
		studDao.saveStudent(studBean);
	//	System.out.println(studDao);
		return "redirect:/student_registration";
	}
	
}
