
package com.lti.day2.static_demo;

import com.lti.day2.interface_demo.IPrintable;


public class Employee implements IPrintable {
	private int empId;
	private String empName;
	private float empSal;
	private static String coName;
	private static int autoId;
	public Employee() {
		System.out.println("Object Created by no-arg contr");
	}
//static block- used for initializing only static variables
	//and invoked only once before constructor is invoked
	static {
		System.out.println("1>    Static block invoked only once...");
		coName="L&T Infotech Mahape";
		autoId=(int) (1001+( Math.random()*1235.1235));
		//empId=101;//error
		//non-static members cannot be accessed within static context directly
	}
	public Employee(String empName, float empSal) {
		System.out.println("Object Created by Overloaded contr");
		//assigned the auto-generated id to empId
		this.empId = autoId++;
		this.empName = empName;
		this.empSal = empSal;
	}
	public Employee(int empId, String empName, float empSal) {
		System.out.println("Object Created by Overloaded contr");
		this.empId = autoId++;
		this.empName = empName;
		this.empSal = empSal;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSal() {
		return empSal;
	}

	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}

	public static String getCoName() {
		return coName;
	}//all static variable getters and setters are also static

	public static void setCoName(String coName) {
		//static always has class reference 
		//not the 'this' or object reference
		Employee.coName = coName;
		//error//this.coName = coName;
		//this does not go with static context
		//because this refers to current object
		//and static says class reference
	}
	//static methods & variables has a class reference,
	//must be always accessed using className
	//className.variableName eg : Employee.coName
	//className.methodName() eg :Employee.getCoName()
	public void print() {
		System.out.println("\n-----------------------------------------------\n"
				+ "\n 			Employee Details \n"
				+"\n Employee Id : "+this.empId
				+"\n Employee Name : "+this.empName
				+"\n Salary : "+this.empSal
				+"\n Company Name : "+this.coName
				+"\n-----------------------------------------------\n");
		//this is a keyword in java which refers to current object
	}
}
