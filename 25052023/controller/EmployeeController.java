package com.defalus.javatraining.controller;

import com.defalus.javatraining.model.*;
import java.util.Scanner;
import java.io.*;

public class EmployeeController {
	
	Employee emp = new  Employee();
	public void addEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee no");
		int empNo = sc.nextInt();
		emp.setNo(empNo);
		System.out.println("Enter the empoyy name");
		String name = sc.next();
		emp.setName(name);
	}
	
	public void viewEmployee() {
		//System.out.println(emp.getNo());
		//System.out.println(emp.getName());
		System.out.println(emp);
	}
	
	public void saveEmployee() throws FileNotFoundException, IOException  {
		if (emp !=null) {
			FileOutputStream fos = new FileOutputStream("storage.bin");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);
		}
	}
	
	public void loadEmployee() throws FileNotFoundException, IOException, ClassNotFoundException {
		FileInputStream fos = new FileInputStream("storage.bin");
		ObjectInputStream oos = new ObjectInputStream(fos);
		emp = (Employee) oos.readObject();
	}

}
