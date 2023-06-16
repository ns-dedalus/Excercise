package com.dal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("MavenEx.xml");
		MavenEx mav = (MavenEx)context.getBean("mav");
		System.out.println(mav.GetString());
	}

}
