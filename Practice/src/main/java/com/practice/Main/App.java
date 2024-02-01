package com.practice.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/practice/Main/config-main.xml");
		Student s1 = (Student) context.getBean("st1");
		System.out.println(s1);
		
		//USING P SCHEMA
		Student s2 = (Student) context.getBean("st2");
		System.out.println(s2);
	}

}
