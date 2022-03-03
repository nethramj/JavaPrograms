package com.cg.employeecrud;

import java.text.ParseException;
import java.util.Scanner;


	public class EmployeeCRUD {
		//Array of Student Objects
		Employee[] listOfEmployees = new Employee[30];
		Employee employee;
		int noOfEmployees;
		Scanner sc = new Scanner(System.in);
		public void menu() throws ParseException {

			System.out.println("Enter the choice .....");
			System.out.println("add : to add Employee in the array");
			System.out.println("update:to update Employee in the array");
			System.out.println("delete:to delete Employee in the array");
			System.out.println("display: to display all Employee");
			System.out.println("search: to search for a Employee");

			String choice = sc.nextLine();

			switch (choice) {
			case "add":
				addEmployee();
				break;
			case "update":
				updateEmployee();
				break;
			case "delete":
				deleteEmployee();
				break;
			case "display":
				displayEmployee();
				break;
			case "search":
				searchEmployee();
				break;
			default:
				System.out.println("Not a proper choice");
				break;
			}

		}

		void searchEmployee() {
			System.out.println("Enter the Employee details to search");

		}

		void displayEmployee() {
			System.out.println("Enter the Employeedetails to display");
			//display the Employee data
			System.out.println("Enter the number of Employees");
			noOfEmployees = sc.nextInt();
			for(int i=0;i<noOfEmployees;i++) {
				System.out.println(listOfEmployees[i]);
				listOfEmployees[i].displayEmployeeDetails();
			}
		}

		void deleteEmployee() {
			System.out.println("Enter the Employee details to delete");

		}

		void updateEmployee() {
			System.out.println("Enter the Employee details to update");

		}

		void addEmployee() throws ParseException {
			System.out.println("Enter the Employee details");
			//creating and adding student objects in the above array
			for(int i=0;i<noOfEmployees;i++) {
				employee = new Employee();
				employee.readEmployeeDetails();
				listOfEmployees[i] = employee;

			}
		}



	}
	
