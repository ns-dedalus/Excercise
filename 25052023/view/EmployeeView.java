package com.defalus.javatraining.view;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.defalus.javatraining.controller.*;

public class EmployeeView {

	public static void main(String[] args) 
			throws ClassNotFoundException, IOException, FileNotFoundException {
		// TODO Auto-generated method stub
		EmployeeController c = new EmployeeController();
		
		Scanner sc = new Scanner(System.in);
		
		String prompt = null;
		
		do {
			System.out.println("1. Add Employee\r\n2. View Employee\r\n3. Save Employee \r\n4. Load Employee");
			int opt = sc.nextInt();
			switch (opt) {
				case 1: {
					c.addEmployee();
					break;
				}
				case 2: {
					c.viewEmployee();
					break;
				}
				case 3: {
					c.saveEmployee();
					break;
				}
				case 4: {
					c.loadEmployee();
					break;
				}
				default:
					break;
			}
			
			System.out.println("Continue (Y)es?");
			prompt = sc.next();
			
		} while (prompt.equalsIgnoreCase("Y"));
		
		System.out.println("Application ended");

	}

}
