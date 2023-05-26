package com.defalus.javatraining.model;

import java.io.*;

public class Employee implements java.io.Serializable {
	private int empNo ;
	private String empName;
	
	public void setNo(int empNo) {
		this.empNo = empNo;
	}
	
	public void setName(String empName) {
		this.empName = empName;
	}
	
	public int getNo() {
		return this.empNo;
	}
	
	public String getName() {
		return this.empName;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + "]";
	}
	
	
}
