package com.letsstartcoding.springbootrestapiexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.letsstartcoding.springbootrestapiexample.dao.EmployeeDAO;
import com.letsstartcoding.springbootrestapiexample.model.Employee;

@RestController
@RequestMapping("/companys")
public class EmployeeController {
	
	@Autowired
	EmployeeDAO employeeDAO;
	
//	@GetMapping("/hello")
//	public String getHello(){
//		return "Hello";
//	}
//	
	@RequestMapping(path="/hellos",method=RequestMethod.GET)
	public String getData(Model m){
	m.addAttribute("header","welcome header")	;
		return "index";
	}
	
	
	/* to save an employee*/
//	@PostMapping("/employeescreate")
//	public Employee createEmployee(@Valid @RequestBody Employee emp) {
//		return employeeDAO.save(emp);
//	}
	
	/*get all employees*/
	@RequestMapping(method = RequestMethod.GET, value = "/employees")
	public List<Employee> getAllEmployees(){
		System.out.println(employeeDAO);
		return employeeDAO.findAll();
	}
	
//	/*get employee by empid*/
//	@GetMapping("/employees/{id}")
//	public ResponseEntity<Employee> getEmployeeById(@PathVariable(value="id") Long empid){
//		
//		Employee emp=employeeDAO.findOne(empid);
//		
//		if(emp==null) {
//			return ResponseEntity.notFound().build();
//		}
//		return ResponseEntity.ok().body(emp);
//		
//	}
//	
//	
//	/*update an employee by empid*/
//	@PutMapping("/employees/{id}")
//	public ResponseEntity<Employee> updateEmployee(@PathVariable(value="id") Long empid,@Valid @RequestBody Employee empDetails){
//		
//		Employee emp=employeeDAO.findOne(empid);
//		if(emp==null) {
//			return ResponseEntity.notFound().build();
//		}
//		
//		emp.setName(empDetails.getName());
//		emp.setDesignation(empDetails.getDesignation());
//		emp.setExpertise(empDetails.getExpertise());
//		
//		Employee updateEmployee=employeeDAO.save(emp);
//		return ResponseEntity.ok().body(updateEmployee);
//		
//		
//		
//	}
//	
//	/*Delete an employee*/
//	@DeleteMapping("/employees/{id}")
//	public ResponseEntity<Employee> deleteEmployee(@PathVariable(value="id") Long empid){
//		
//		Employee emp=employeeDAO.findOne(empid);
//		if(emp==null) {
//			return ResponseEntity.notFound().build();
//		}
//		employeeDAO.delete(emp);
//		
//		return ResponseEntity.ok().build();
//		
//		
//	}
//	
//	  
//	    public String getHomepage() {
//	        return "index";
//	    }
//	

}
