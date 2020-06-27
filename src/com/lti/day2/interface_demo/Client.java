/**
 * 
 */
package com.lti.day2.interface_demo;

import com.lti.day2.static_demo.Employee;

public class Client {
	public static void main(String[] args) {	
//array of Iprintable interface
		IPrintable [] pArr= new IPrintable[4]; 
		pArr[0]= new Person(111, "Zara", "Khan", "zara@gmail.com", "9879879876");
		pArr[1]= new Employee("Yara", 199);
		pArr[2]= new Circle(12);
		pArr[3]= new Square(12);
		//now call printAll method of Printer class
		Printer.printAll(pArr);//static method is called using class ref
	}

}















