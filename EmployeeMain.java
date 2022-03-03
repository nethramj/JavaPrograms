
package com.cg.oopsinjava;

import java.text.ParseException;

public class EmployeeMain {

	public static void main(String[] args) throws ParseException {
		
		//following statement creates an object
		Employee emp = new Employee();
		emp.employeeDetails();
		emp.displayEmployeeDetails();
		
		Employee emp1 = new Employee();
		emp1.readEmployeeDetails();
		emp1.displayEmployeeDetails();
	}

}

