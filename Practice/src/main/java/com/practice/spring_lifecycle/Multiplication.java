package com.practice.spring_lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Multiplication implements InitializingBean, DisposableBean {
	private int a;
	private int b;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public Multiplication() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Multiplication(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	@Override
	public String toString() {
		return "Multiplication [a=" + a + ", b=" + b + "]";
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ok now i'm gonna die");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("All properties are set, continuing with the same");
		
	}
	
	
}
