package com.practice.spring_lifecycle;

public class Addition {
	private int num1;
	private int num2;
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public Addition() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Addition [num1=" + num1 + ", num2=" + num2 + "]";
	}
	
	public void init() {
		System.out.println("it's just created");
	}
	
	public void destroy() {
		System.out.println("it's gonna be destroyed");
	}
}
