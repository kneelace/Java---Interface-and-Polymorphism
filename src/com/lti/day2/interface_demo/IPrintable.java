
package com.lti.day2.interface_demo;

//all interface are abstract in nature
public interface IPrintable {
	//by default all variables are public static and final
	//that s final var must be initialize at the time of declaration
	int MAX_COPIES=100;
	//by default all methods are public and abstract
	void print();	

}
/*
 * A class can imlepents many interfaces
 * and a class implementing an interface must override all the abstract method
 * or declare the class itself as abstract
 * java 8 onwards interfaces can also have default and static methods*/











