/**
 * 
 */
package com.lti.day2.final_demo;

/**
 * @author Smita B Kumar
 *
 */
public final class FinalAssesment {
	//What is blank final in java? - final var which is not initialized
	//at the time of declaration
	//but initialized in static block/constructor
	protected static  String assesmentDates;
	static {//blank final field 
		assesmentDates="23rd July 2019";
	}
	public final static String getAssesmentDates() {
		System.out.println("Final Assesment Date is : "+assesmentDates);
		return assesmentDates;
	}
}//end of class
//final class cannot be extended/inherited
/*class ReAssesment extends FinalAssesment{
	//final method cannot be overridden
	public static String getAssesmentDates() {
		System.out.println("Final Assesment Date is : "+assesmentDates);
		return assesmentDates;
	}
}*/
/*
 * final is a keyword in java which can be used with
 * class
 * method
 * variables
 * final class cannot be extended/inherited
 * final method cannot be overridden
 * final varibles must be initialized and cannot be re-initialized
 * 		-used to declare constant in java
 * 		-does not have setter method
 * 
 * All methods of final class is by default final
 * What is blank final in java?
 */
	





