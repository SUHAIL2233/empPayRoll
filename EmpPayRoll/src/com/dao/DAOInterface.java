package com.dao;

import com.bean.EmployeeBean;

public interface DAOInterface {
	public int insert(EmployeeBean eb);
	public int update();
	public int delete();
	public int readOneRec();
	public int readAllRec();
	public int rsLastId();
}
