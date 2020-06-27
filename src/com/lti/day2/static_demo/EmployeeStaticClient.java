package com.lti.day2.static_demo;

public class EmployeeStaticClient {
	public static void main(String[] args) {
		//ids are always auto-generated
		//static variable need to initialize before constructing an object
		//object get created by new keyword by invoking contructor
		
		Employee e1 = new Employee(101, "Manas", 100.99f);
		Employee e2 = new Employee(102, "Shivangi", 100.99f);
		Employee e3 = new Employee(103, "Sonali", 100.99f);
		
		System.out.println("/********************************************\n"
				+ "Employee Name list working for : "
				+"\n"+Employee.getCoName()
				+"\n********************************************\n"
				+"\n"+e1.getEmpName()
				+"\n"+e2.getEmpName()
				+"\n"+e3.getEmpName());
		//non-static members cannot be accessed 
		//within static context directly,can be accessed with Object ref
		//e1.print();e2.print();e3.print();
	}

}







