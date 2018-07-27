package com.spring.hellocontroller;

import java.util.ArrayList;
import java.util.Date;

public class Student {
	
	private String studentName;

	private String studentCourse;
	private Long studentMobile;
	private Date studentDOB;
	private ArrayList<String>studentSkills;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getstudentCourse() {
		return studentCourse;
	}
	public void setstudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}
	public Long getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(Long studentMobile) {
		this.studentMobile = studentMobile;
	}
	public Date getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}
	public ArrayList<String> getStudentSkills() {
		return studentSkills;
	}
	public void setStudentSkills(ArrayList<String> studentSkills) {
		this.studentSkills = studentSkills;
	}
	

}
