package com.school.bean;



import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "m_registration")
public class StudentRegistrationBean {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name = "id")
	private int id;
	
	@Override
	public String toString() {
		return "StudentRegistrationBean [id=" + id + ", name=" + name + ", mobile=" + mobile + ", email_id=" + email_id
				+ ", password=" + password + ", role_id=" + role_id + ", is_active=" + is_active + ", is_deleted="
				+ is_deleted + ", created_by=" + created_by + ", created_at=" + created_at + "]";
	}

	@Column(name = "name")
	private String name;
	
	@Column(name = "mobile")
	private String mobile;

	@Column(name = "email_id")
	private String email_id;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "role_id")
	private int role_id;
	
	@Column(name = "is_active")
	private int is_active;
	
	@Column(name = "is_deleted")
	private int is_deleted;
	
	@Column(name = "created_by")
	private int created_by;
	

	@Column(name = "created_at")
	private LocalDateTime created_at;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public int getIs_active() {
		return is_active;
	}

	public void setIs_active(int is_active) {
		this.is_active = is_active;
	}

	public int getIs_deleted() {
		return is_deleted;
	}

	public void setIs_deleted(int is_deleted) {
		this.is_deleted = is_deleted;
	}

	public int getCreated_by() {
		return created_by;
	}

	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}

	public LocalDateTime getCreated_at() {
		return created_at;
	}

	public void setCreated_at(LocalDateTime now) {
		this.created_at = now;
	}


	
	
}
