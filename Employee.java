package com.cg.oopsinjava.inheritance;

import java.util.Scanner;



public class Employee {

	int employeeId;
	String employeeName;
	String employeeAddress;
	String employeeCountry;
	
	Scanner sc=new Scanner(System.in);

	void readEmployeeDetails() {
		System.out.println("Enter the employee details...");
		System.out.println("Enter the employee id...");
		employeeId=sc.nextInt();
		System.out.println("Enter the employee name...");
		sc.nextLine();
		System.out.println("Enter the employee address...");
		employeeAddress=sc.nextLine();
		System.out.println("Enter the employee country...");
		employeeCountry=sc.nextLine();
		
	}
	
	void displayEmployeeDetails() {
		System.out.println("Entered employee details are...");
		System.out.println(" employee id..."+employeeId);
		employeeId=sc.nextInt();
		System.out.println("employee name..."+employeeName);
		sc.nextLine();
		System.out.println("employee address..."+employeeAddress);
		employeeAddress=sc.nextLine();
		System.out.println("employee country..."+employeeCountry);
		employeeCountry=sc.nextLine();
		
	}
}
