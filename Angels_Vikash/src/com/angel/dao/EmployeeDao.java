package com.angel.dao;

import com.angel.exceptions.EmployeeExceptions;
import com.angel.model.Employee;

public interface EmployeeDao {
	
	public String insertEmployee(Employee employee) throws EmployeeExceptions;

}
