package com.entity;

public class Student {
	private int id;
	private String fname;
	private String dob;
	private String add;
	private String qualification;
	private String email;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String fname, String dob, String add, String qualification, String email) {
		super();
		
		this.fname = fname;
		this.dob = dob;
		this.add = add;
		this.qualification = qualification;
		this.email = email;
	}
	
	
	public Student(int id, String fname, String dob, String add, String qualification, String email) {
		super();
		this.id = id;
		this.fname = fname;
		this.dob = dob;
		this.add = add;
		this.qualification = qualification;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", dob=" + dob + ", add=" + add + ", qualification="
				+ qualification + ", email=" + email + "]";
	}
	
}
