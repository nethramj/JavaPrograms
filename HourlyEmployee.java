package com.cg.oopsinjava.inheritance;

public class HourlyEmployee extends E{
	
	float salaryPerHour;
	float totalSalaryPerWeek;
	float noOfHoursWorked;
	
	void readSalaryPerHour() {
		System.out.println("Enter the salary per hour");
		salaryPerHour=sc.nextFloat();
	}
	
	void readnoOfHoursWorked() {
		System.out.println("Enter the noOfHoursWorked");
		noOfHoursWorked=sc.nextFloat();
		
	}
	
	void calculateSalary() {
		System.out.println("Total Monthly Salary= ");
		totalSalaryPerWeek=salaryPerHour*noOfHoursWorked
	}

}
