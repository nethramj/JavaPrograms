package com.cg.oopsinjava.inheritancetwo;
import java.util.Scanner;

public class Person {

			String personName;
			String personAddress;
			

			Scanner sc = new Scanner(System.in);
			void readPersonDetails() {
				System.out.println("Enter the Person details........");
				
				System.out.println("Enter the Person name.....");
				personName=sc.nextLine();
	
				System.out.println("Enter the Person address.....");
				personAddress = sc.nextLine();
				
			}

			void printPersonDetails() {
				System.out.println("Person Name= "+personName);
				System.out.println("Person Address= "+personAddress);
				
				

		}

	}


