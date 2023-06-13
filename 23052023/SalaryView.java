package com.dal.view;
import com.dal.Controller.SalaryController;
import java.util.Scanner;

public class SalaryView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SalaryController sac = new SalaryController();
		System.out.println("Salary Calculator");
		System.out.println("Enter Basic pay");
		double basic = sc.nextDouble();
		//System.out.println("basic :"+basic);
		sac.SetBasic(basic);
	//	sac.CalculateSal();
	//	sac.ViewSalary();
		
		while(true) {
		System.out.println("1.Calculate Salary");
		System.out.println("2.View Salary");
		System.out.println("3.Exit");
		int option = sc.nextInt();
		boolean bIsExit = false;
		switch(option) {
		case 1:
			sac.CalculateSal();
			break;
		case 2:
			sac.ViewSalary();
			break;
		case 3:
			bIsExit = true;
			break;
		}
		if(bIsExit)
			break;
		
		}
		
		sc.close();
		System.out.println("Exit successfully");
	}

}
