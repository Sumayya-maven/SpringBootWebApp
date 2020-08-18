package com.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.EmployeeJKT;



@Repository
public class EmployeeDAOImpl implements EmployeDAO {

	@Autowired
	private SessionFactory factory;
	
	public void addEmployee(EmployeeJKT jkt) {
			
		factory.getCurrentSession().saveOrUpdate(jkt);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<EmployeeJKT> getAllEmployee() {
		// TODO Auto-generated method stub
		return factory.getCurrentSession().createQuery("from EmployeeJKT").list();
	}

	@Transactional
	public EmployeeJKT getEmployeeObj(Integer empId) {
		// TODO Auto-generated method stub
		EmployeeJKT emp=factory.getCurrentSession().get(EmployeeJKT.class, empId);
		return emp;
	}

	@Transactional
	public void deleteEmployeeObj(EmployeeJKT emp) {
		// TODO Auto-generated method stub
		factory.getCurrentSession().delete(emp);
	}

}
