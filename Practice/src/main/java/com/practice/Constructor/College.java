package com.practice.Constructor;

import java.util.ArrayList;
import java.util.List;

public class College {
	private int collegeId;
	private String collegeName;
	private List departments;
	private University uname;
	public College(int collegeId, String collegeName, List departments, University uname) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.departments = departments;
		this.uname = uname;
	}
	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", departments=" + departments
				+ ", uname=" + uname + "]";
	}
	
	
	
	
}
