package com.dal.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("setter.xml");
		User user = (User) context.getBean("user");
		System.out.println(user.getUserName()+" has " + user.getCar().getName() +
		" "	+" "+user.getCar().getModel()+" carNumber "+user.getCar().getCarnumber());
		
	}

}
