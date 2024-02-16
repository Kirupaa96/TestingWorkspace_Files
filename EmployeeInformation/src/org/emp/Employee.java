package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.empName();
		
		Company comp = new Company();
		comp.companyName();
		
		Client cl = new Client();
		cl.clientName();
		
//		Project pro = new Project();  //since projectName is static, don't need to create objects. 
		Project.projectName();
		
	}
	
	
	public void empName() {
		System.out.println("This method is empName");
	}

}
 