package com.practice.reference;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/practice/reference/config-reference.xml");

		Student s = (Student) context.getBean("student1");
		System.out.println(s);
	}

}
