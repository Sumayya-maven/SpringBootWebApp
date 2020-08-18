package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.EmployeeJKT;
import com.service.EmployeeService;


@Controller
public class EmployeeJKT_controller {

	@Autowired
	private EmployeeService service;
	
	public EmployeeJKT_controller() {
		super();
		System.out.println("inside no args constructor:EmployeeJKT_controller()");
	}
	
	@RequestMapping(value = "/saveForm")
	public String displayAddForm(Model model) {
		
		EmployeeJKT jkt=new EmployeeJKT();
		model.addAttribute("employee", jkt);
		return "save";
	}
	
	@RequestMapping(value = "/saveEmp")
	public String addEmployee(@ModelAttribute("employee") EmployeeJKT emp) {
		
		service.addEmployee(emp);
		return "redirect:/listEmployee";
	}
	
	@RequestMapping(value ="/listEmployee")
	public String getEmployee(Model model) {
		
		List <EmployeeJKT> employee=service.getAllEmployee();
		model.addAttribute("Employee", employee);
		return "ListEmployee";
	}
	
	@RequestMapping(value = "/updateRecord")
	public String updateEmployee(@RequestParam("id") Integer id,Model model) {
		
		EmployeeJKT emp=findById(id);
		model.addAttribute("employee", emp);
		return "save";
	}
	
	@RequestMapping(value = "/deleteRecord")
	public String deleteEmployee(@RequestParam("id") Integer id) {
		EmployeeJKT emp=findById(id);
		service.deleteEmployeeObj(emp);
		return "redirect:/listEmployee";
	}
	private EmployeeJKT findById(Integer empId) {
		
		EmployeeJKT emp=service.getEmployeeObj(empId);
		return emp;
	}
}
