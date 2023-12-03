package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.Employee;
import com.app.service.EmployeeService;

@Controller
@RequestMapping("/emps")
public class EmployeeController {
	//dep : 
	@Autowired//(required = true)
	private EmployeeService empService;
	
	public EmployeeController() {
		System.out.println("in ctor of " + getClass());
	}
	// add a req handling method to send list of emps from handler --> D.S , using
	// ModelAttrs : using Model map
	@GetMapping("/list")
	public String listEmps(Model map)
	{
		System.out.println("in list emps");
		map.addAttribute("emp_list",empService.getAllEmps());
		return "/emps/list_all_emp";//AVN : /WEB-INF/views/emps/list.jsp
		//impl : model map 
	}
	@PostMapping("/add")
	public String addEmps(@RequestParam String fn, 
			@RequestParam String ln, 
			@RequestParam String city,
			@RequestParam String comp,
			Model map)
	{
		System.out.println("in add emps");
		map.addAttribute("emp_add",empService.addEmployee(new Employee(fn, ln, city, comp)));
		return "/emps/result";//AVN : /WEB-INF/views/emps/list.jsp
		//impl : model map 
	}
	@PostMapping("/company")
	public String showEmpByCompany(@RequestParam String comp,Model map)
	{
		System.out.println("in show emp by company");
		//logger
		map.addAttribute("show_emp",empService.getEmpByCompany(comp));
		return "/emps/list_emp_by_comp";//AVN : /WEB-INF/views/emps/list.jsp
		//impl : model map 
	}
//	@RequestMapping("/empsList")
//	String abs() {
//		return "/emplist";
//	}
	
}
