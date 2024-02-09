package com.practice.spring_lifecycle;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/practice/spring_lifecycle/lifecycle-config.xml");
		
/**
 * 		Lifecycle using xml file
 */
//		Addition a = (Addition)context.getBean("add");
//		System.out.println(a);

		/**
		 * 		Lifecycle using interfaces
		 */
//		Multiplication b = (Multiplication) context.getBean("mul1");
//		System.out.println(b);
		
		context.registerShutdownHook();
		
		/**
		 * 		Lifecycle using annotation
		 */
		Annotation_Lifecycle c =(Annotation_Lifecycle) context.getBean("ann");
		System.out.println(c);
		
	}

}
																														