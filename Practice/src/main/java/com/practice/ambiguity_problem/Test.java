package com.practice.ambiguity_problem;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/practice/ambiguity_problem/config-ambiguity.xml");

		Addition s = (Addition) context.getBean("add");                                  
	}

}
