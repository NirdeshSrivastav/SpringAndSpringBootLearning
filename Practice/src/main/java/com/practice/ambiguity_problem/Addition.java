package com.practice.ambiguity_problem;

public class Addition {
	private int num1;
	private int num2;

	public Addition(double a, double b) {
		this.num1 = (int) a;
		this.num2 = (int) b;
		System.out.println("Constructor: double double");
		System.out.println("sum: "+(this.num1+this.num2));
	}
	
	public Addition(int a, int b) {
		this.num1 = a;
		this.num2 = b;
		System.out.println("Constructor: int int");
		System.out.println("sum: "+(this.num1+this.num2));
	}
	
}
