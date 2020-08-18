package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.EmployeDAO;
import com.model.EmployeeJKT;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeDAO emp_dao;
	
	@Transactional
	public void addEmployee(EmployeeJKT jkt) {
		emp_dao.addEmployee(jkt);
	}

	@Transactional
	public List<EmployeeJKT> getAllEmployee() {
		// TODO Auto-generated method stub
		return emp_dao.getAllEmployee();
	}

	@Transactional
	public EmployeeJKT getEmployeeObj(Integer empId) {
		// TODO Auto-generated method stub
		EmployeeJKT emp=emp_dao.getEmployeeObj(empId);
		return emp;
	}

	@Transactional
	public void deleteEmployeeObj(EmployeeJKT emp) {
		// TODO Auto-generated method stub
		emp_dao.deleteEmployeeObj(emp);
		
	}

}
