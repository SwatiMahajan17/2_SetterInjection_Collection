package com.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext apc=new ClassPathXmlApplicationContext("bean.xml");
		
		Employee e=(Employee) apc.getBean("emp");
		
		System.out.println(e.getPhones()+" "+e.getAddresses()+" "+e.getCourses());
	}

}
