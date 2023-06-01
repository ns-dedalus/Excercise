package com.defalus.javatraining.view;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.function.BiPredicate;

import com.defalus.javatraining.controller.*;

public class EmployeeView {

	public static void main(String[] args)
			throws ClassNotFoundException, IOException, FileNotFoundException, InterruptedException, SQLException {
		// TODO Auto-generated method stub
		EmployeeController c = new EmployeeController();

		Scanner sc = new Scanner(System.in);

		String prompt = null;

		System.out.println("Enter the username");
		String username = sc.next();
		System.out.println("Enter the password");
		String password = sc.next();

		/*
		 * if (username == password) { System.out.println("Same"); } else {
		 * System.out.println("Different"); }
		 */

		BiPredicate<String, String> validator = (u, p) -> {
			return u.equals(p);
		};

		if (validator.test(username, password)) {

			/*
			 * ThreadTimer timer = new ThreadTimer(); Thread t = new Thread(timer);
			 * t.start(); t.join();
			 * 
			 */

			do {
				System.out.println(
						"1. View Employee\r\n2. Add Employee\r\n3. Delete Employee \r\n4. Update Employee\r\n5. Exit");
				int opt = sc.nextInt();
				switch (opt) {
				case 1: {
					c.viewEmployee();
					break;
				}
				case 2: {
					c.addEmployee();
					break;
				}

				case 3: {
					c.deleteEmployee();
					break;
				}
				case 4: {
					c.updateEmployee();
					break;
				}
				default:
					break;
				}
				if (opt == 5)
					break;
			} while (true);

		} else {
			System.out.println("Unauthorized access");
		}

		System.out.println("Application ended");

	}

}

class ThreadTimer implements Runnable {

	@Override
	public void run() {
		try {
			System.out.print("Please wait ");
			for (int i = 0; i < 10; i++) {
				System.out.print(".");
				new Thread(this).sleep(1000);
			}
			System.out.println("");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
