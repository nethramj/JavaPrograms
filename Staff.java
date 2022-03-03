package com.cg.oopsinjava.inheritancetwo;


public class Staff extends Person{

		String StaffSchool;
		double StaffPay;
		
		void readStaffDetails() {
			System.out.println("Enter the Staff details........");
			
			System.out.println("Enter the Staff name.....");
			sc.nextLine();
			System.out.println("Enter the Person address.....");
		    sc.nextLine();
			
		}

		void printStaffDetails() {
			System.out.println("School is "+StaffSchool);
			System.out.println("the payment "+StaffPay);
	}

}

