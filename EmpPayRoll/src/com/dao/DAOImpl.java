package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bean.EmployeeBean;

//import sun.security.mscapi.KeyStore.MY;

public class DAOImpl implements DAOInterface
{
	Connection con;
	DAOConn conn;
	PreparedStatement pstm;
	ResultSet rset;
	Statement stmt;
	@Override
	public int insert(EmployeeBean eb1) 
	{
		int result = 0;
		con = conn.getConnection();
		String query1 = "insert into emppayroll(?,?,?,?,?,?,?,?,?)";
		try
		{
			PreparedStatement pstmt = con.prepareStatement(query1);
			pstmt.setInt(1, eb1.getEmpId());
			pstmt.setString(2, eb1.getEmpName());
			pstmt.setString(3, eb1.getEmpDOB());
			pstmt.setString(4, eb1.getEmpDesignation());
			pstmt.setDouble(5, eb1.getEmpSalary());
			pstmt.setLong(6, eb1.getEmpMobileNumber());
			pstmt.setString(7, eb1.getEmpEmail());
			pstmt.setString(8, eb1.getEmpLocation());
			result = pstmt.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public int update() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int readOneRec() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int readAllRec() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int rsLastId() {
		String query1 = "select * from emppayrol";
		return 0;
	}
	
//	public List<EmployeeBean> search()
//	{
//		List<EmployeeBean> emplist = new ArrayList<>();
//		String query = "select * from employee";
//		try{
//			PreparedStatement pstmt = connection.prepareStatement(query);
//			resultSet = pstmt.executeQuery();
//			EmployeeBean empBean = null;
//			while(resultSet.next())
//			{
//				empBean = new EmployeeBean();
//				empBean.setEmpId(resultSet.getInt(1));
//				empBean.setEmpName(resultSet.getString(2));
//				empBean.setEmpDOB(resultSet.getString(3));
//				empBean.setEmpDesignation(resultSet.getString(4));
//				empBean.setEmpPackage(resultSet.getDouble(5));
//				empBean.setEmpMobileNumber(resultSet.getLong(6));
//				empBean.setEmpEmail(resultSet.getString(7));
//				empBean.setEmpLocation(resultSet.getString(8));
//				emplist.add(empBean);
//			}
//		}
//		catch(SQLException e)
//		{
//			e.printStackTrace();
//		}
//		return emplist;
//	}
	
	
}
