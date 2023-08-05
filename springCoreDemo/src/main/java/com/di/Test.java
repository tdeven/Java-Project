package com.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    
	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		 Student s = (Student) context.getBean("stud");
		 System.out.println(s);
		 
		Customer ct = (Customer) context.getBean("cust");
		System.out.println(ct);
   }
	
}
