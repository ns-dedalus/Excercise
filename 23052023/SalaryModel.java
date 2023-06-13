package com.dal.Model;

public class SalaryModel {
	double basic;
	double HRA;
	double TA;
	double DA;
public void CalCulateSalary()
{
	System.out.println("Model Calculate Salary");
	this.HRA = this.basic * (10.0/100.0);
	this.TA = this.basic * 0.6;
	this.DA = this.basic * 0.14;
	//System.out.println("HRA"+this.HRA);
	//System.out.println("TA"+this.TA);
	//System.out.println("DA"+this.DA);
}
public double getBasic() {
	return basic;
}
public void setBasic(double basic) {
	this.basic = basic;
}
public double getHRA() {
	return HRA;
}
public double getTA() {
	return TA;
}
public double getDA() {
	return DA;
}
}
