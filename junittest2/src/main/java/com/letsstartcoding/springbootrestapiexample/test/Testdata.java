package com.letsstartcoding.springbootrestapiexample.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.letsstartcoding.springbootrestapiexample.dao.EmployeeDAO;
import com.letsstartcoding.springbootrestapiexample.model.Employee;


public class Testdata extends ApplicationTests {
	@Autowired
	EmployeeDAO employeeDAO ;
	
	
	 Add addDAO  = new Add();
	
	
	@Test
	public void testfindAll() {
		System.out.println(employeeDAO);
		List<Employee> plantdata = employeeDAO.findAll();

		for (Employee plantData : plantdata) {
			System.out.println("Plant ID" + plantData.getId());
		}
	}
	
	@Test
	public void getAllEmployees(){
		assertNotNull(employeeDAO);
	}
	
	
	@Test
	public void addnubers(){
		int sum = addDAO.add(10, 10);
		assertEquals(sum, 20);
	}
}
