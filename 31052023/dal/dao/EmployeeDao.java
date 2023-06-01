package com.defalus.javatraining.dal.dao;
import com.defalus.javatraining.model.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.defalus.javatraining.dal.util.MyDbConnection;
import com.defalus.javatraining.model.Employee;

public class EmployeeDao {
	public int insertEmployee(Employee emp) throws SQLException {
		Connection conn = MyDbConnection.getConnection();
		PreparedStatement ps = conn.prepareStatement("Insert into dalemp(empno, ename) values(?, ?)");
		ps.setInt(1, emp.getNo());
		ps.setString(2, emp.getName());
		int ret = ps.executeUpdate();
		return ret;
	}
	
	public int updateEmployee(Employee emp) throws SQLException {
		Connection conn = MyDbConnection.getConnection();
		PreparedStatement ps = conn.prepareStatement("Update dalemp set ename=? where empno=?");
		ps.setString(1, emp.getName());
		ps.setInt(2, emp.getNo());
		int ret = ps.executeUpdate();
		return ret;
	}
	
	public int deleteEmployee(int empNo) throws SQLException {
		Connection conn = MyDbConnection.getConnection();
		PreparedStatement ps = conn.prepareStatement("Delete from dalemp where empno=?");
		ps.setInt(1, empNo);
		int ret = ps.executeUpdate();
		return ret;
	}
	
	public List<Employee> listEmployee() throws SQLException {
		Connection conn = MyDbConnection.getConnection();
		PreparedStatement ps = conn.prepareStatement("Select empno, ename from dalemp");
		ResultSet rs = ps.executeQuery();
		List<Employee> li = new ArrayList<Employee>();
		while (rs.next()) {
			int empNo = rs.getInt(1);
			String empName = rs.getString(2);
			Employee emp = new Employee(empNo, empName);
			li.add(emp);
		}
		return li;
	}
}
