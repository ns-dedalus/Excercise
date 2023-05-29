package com.defalus.javatraining.controller;

import com.defalus.javatraining.model.*;

import java.io.*;
import java.util.*; 

public class EmployeeController {
	List<Employee> li = new ArrayList<Employee>();
	 
	public void addEmployee() {
		Employee emp = new  Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee no");
		int empNo = sc.nextInt();
		emp.setNo(empNo);
		System.out.println("Enter the empoyy name");
		String name = sc.next();
		emp.setName(name);
		li.add(emp);
		System.out.println("Added. No of records:" + li.size());
	}
	
	public void viewEmployee() {
		//System.out.println(emp.getNo());
		//System.out.println(emp.getName());
		
		System.out.println("No of records: "+li.size());
		li.forEach(emp -> System.out.println(emp));
	}
	
	public void saveEmployee() throws FileNotFoundException, IOException  {
		FileOutputStream fos = new FileOutputStream("storage.bin");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		System.out.println("No of records stored: "+li.size());
		oos.writeObject(li);
	}
	
	public void loadEmployee() throws FileNotFoundException, IOException, ClassNotFoundException {
		FileInputStream fos = new FileInputStream("storage.bin");
		ObjectInputStream oos = new ObjectInputStream(fos);
		li = (List<Employee>) oos.readObject();
		System.out.println("No of records loaded: "+li.size());
	}

}
