/**
 * 
 */
package com.lti.day2.interface_demo;

import com.lti.day2.static_demo.Employee;


public class Printer {
	//printing the object in array of IPrintable type
	/*
	 * pArr[0]= new Person(111, "Alice", "Bob", "alicebob@gmail.com", "9879879876");

		pArr[1]= new Employee("Yara", 199);
		pArr[2]= new Circle(12);
		pArr[3]= new Square(12);
	 */
	public static void printAll(IPrintable [] pArr) {
		System.out.println("Max Copies : "+IPrintable.MAX_COPIES);
		for (int obj = 0; obj < pArr.length; obj++) {
			pArr[obj].print();	//dynamic polymorphism	
		}
	}
}
















