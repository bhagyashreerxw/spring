package com.reactiveworks.practice.dependencyinjection.factorymethod.nonstatic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("StudentSubjectContext.xml");
		Student studentObj = context.getBean("student",Student.class);	
		System.out.println(studentObj);
		//System.out.println(studentObj.getSub());
	}

}
