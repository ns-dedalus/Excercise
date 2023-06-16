package com.dal.props;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProbsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spr-props.xml");
		MyDao dao = (MyDao) context.getBean("dao");
		System.out.println(dao.getDbname()+" "+dao.getUname()+" "+dao.getPassword());
		
		ApplicationContext conContext = new ClassPathXmlApplicationContext("spr-myconnection.xml");
		MyDBConnection dbconn = (MyDBConnection) conContext.getBean("dbcon");
		System.out.println(dbconn.getMyConnection());  
	}

}
