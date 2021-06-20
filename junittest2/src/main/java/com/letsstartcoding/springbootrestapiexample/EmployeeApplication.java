package com.letsstartcoding.springbootrestapiexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@EnableJpaAuditing
@SpringBootApplication
@ComponentScan("com.letsstartcoding.springbootrestapiexample")
public class EmployeeApplication extends SpringBootServletInitializer {  
	//Make sure that everything for .war deployment is there
	 @Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	   return application.sources(EmployeeApplication.class);
	 }

	 public static void main(String[] args) throws Exception {
	   SpringApplication.run(EmployeeApplication.class, args);
	 }

}
