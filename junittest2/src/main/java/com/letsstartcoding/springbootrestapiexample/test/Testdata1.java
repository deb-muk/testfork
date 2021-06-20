package com.letsstartcoding.springbootrestapiexample.test;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.letsstartcoding.springbootrestapiexample.dao.EmployeeDAO;
import com.letsstartcoding.springbootrestapiexample.model.Employee;

public class Testdata1 extends ApplicationTests {
	
	@Autowired
	EmployeeDAO employeeDAO;

	@Test
	public void testfindById() {
		System.out.println(employeeDAO);
		Employee plantdata = (Employee) employeeDAO.findOne((long) 1);
		Employee plantdatas =  employeeDAO.findOne((long) 1);;

		System.out.println(plantdata.getId()+" "+plantdata.getDesignation());
	}

}