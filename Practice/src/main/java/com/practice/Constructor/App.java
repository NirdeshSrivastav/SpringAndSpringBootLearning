package com.practice.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/practice/Constructor/config-college.xml");
		College s1 = (College) context.getBean("cl1");
		System.out.println(s1);
	}

}
