package com.defalus.javatraining.controller;

import com.defalus.javatraining.dal.dao.EmployeeDao;
import com.defalus.javatraining.model.*;

import java.io.*;
import java.sql.SQLException;
import java.util.*; 

public class EmployeeController {
	public void addEmployee() throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee no");
		int empNo = sc.nextInt();
		System.out.println("Enter the empoyy name");
		String name = sc.next();
		Employee emp = new  Employee(empNo, name);
		EmployeeDao dao = new EmployeeDao();
		int inserted = dao.insertEmployee(emp);
		if (inserted > 0 )
			System.out.println("Added.");
		else 
			System.out.println("Failed to add.");
	}
	
	public void updateEmployee() throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee no");
		int empNo = sc.nextInt();
		System.out.println("Enter the employee name");
		String name = sc.next();
		Employee emp = new  Employee(empNo, name);
		EmployeeDao dao = new EmployeeDao();
		int updated = dao.updateEmployee(emp);
		if (updated > 0 )
			System.out.println("Updated.");
		else 
			System.out.println("Failed to update.");
	}
	
	public void deleteEmployee() throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee no");
		int empNo = sc.nextInt();
		EmployeeDao dao = new EmployeeDao();
		int inserted = dao.deleteEmployee(empNo);
		if (inserted > 0 )
			System.out.println("Deleted.");
		else 
			System.out.println("Failed to delete.");
	}
	
	public void viewEmployee() throws SQLException {
		
		EmployeeDao dao = new EmployeeDao();
		List<Employee> li = dao.listEmployee();
		System.out.println("No of records: "+li.size());
		li.forEach(emp -> System.out.println(emp));
	}
	
}
