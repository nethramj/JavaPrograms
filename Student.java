package com.cg.oopsinjava.inheritancetwo;


public class Student extends Person {
     String program;
	int year;
	double fee;


	void readStudentDetails() {
		System.out.println("Enter the Student details........");
		System.out.println("Enter the Program.....");
		program=sc.nextLine();
		System.out.println("Enter the Student year.....");
		year=sc.nextInt();
		System.out.println("Enter the Student fee.....");
		fee = sc.nextDouble();
		
	}

	void printStudentDetails() {
		System.out.println("the program for which enroll is= "+program);
		System.out.println("the total year of study is= "+year);
		System.out.println("the total fees required is= "+fee);

}
}
