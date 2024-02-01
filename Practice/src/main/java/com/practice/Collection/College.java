package com.practice.Collections;

import java.util.ArrayList;
import java.util.List;

public class College {
	private int collegeId;
	private String collegeName;
	private List departments;
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public ArrayList<String> getDepartments() {
		return (ArrayList<String>) departments;
	}
	public void setDepartments(ArrayList<String> departments) {
		this.departments = departments;
	}
	public College(int collegeId, String collegeName, ArrayList<String> departments) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.departments = departments;
	}
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", departments=" + departments
				+ "]";
	}
	
	
	
	
}
