package com.practice.spring_lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Annotation_Lifecycle {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Annotation_Lifecycle(String name) {
		super();
		this.name = name;
	}

	public Annotation_Lifecycle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Annotation_Lifecycle [name=" + name + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("This gonna be set as init");
	}
	
	@PreDestroy
	public void stop(){
		System.out.println("this gonna be set as destroy");
	}

}
