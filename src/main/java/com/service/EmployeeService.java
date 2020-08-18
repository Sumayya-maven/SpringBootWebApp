package com.service;

import java.util.List;
import com.model.EmployeeJKT;



public interface EmployeeService {
	public void addEmployee(EmployeeJKT jkt);

	public List<EmployeeJKT> getAllEmployee();

	public EmployeeJKT getEmployeeObj(Integer empId);

	public void deleteEmployeeObj(EmployeeJKT emp);
	
}
