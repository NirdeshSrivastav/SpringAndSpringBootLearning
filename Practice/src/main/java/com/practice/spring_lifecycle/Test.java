package com.practice.spring_lifecycle;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/practice/spring_lifecycle/lifecycle-config.xml");
		Addition a = (Addition)context.getBean("add");
		System.out.println(a);
		context.registerShutdownHook();

	}

}
