
package com.lti.day2.interface_demo;

//step 1: package statement must be first statement of the .java file 
//one or none package statement
//step 2: import statement , second statement of .java file
//many or none

//step 3: public class in PascalCase
//interface inheritances
public class Person implements IPrintable{	

	//step 4: private instance variable/properties/attribute
	//instance vaiable - every object will have its own instance variable
	private Integer personId;
	private String firstName;
	private String lastName;
	private String email;
	private String mobileNo;
	
	//step 5:no-arg constructor
	public Person() {
		System.out.println("************Person no-args constructor invoked and Object Created .....");
	}
	@Override
	public void print() {
		System.out.println("\n-----------------------------------------------\n"
				+ "\n 			Person Details \n"
				+"\n Person Id : "+this.personId
				+"\n First Name : "+this.firstName
				+"\n Last Name : "+this.lastName
				+"\n E mail Id : "+this.email
				+"\n Mobile No : "+this.mobileNo
				+"\n-----------------------------------------------\n");
		//this is a keyword in java which refers to current object
	}//step 6:Overloaded/parameterized/argument constructor	
	public Person(Integer personId, 
			String firstName, 
			String lastName, 
			String email, 
			String mobileNo) {
		super();
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNo = mobileNo;
	}
	public Person(String firstName, String lastName, String email, String mobileNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNo = mobileNo;
	}
	//step 7: getters and setters ( to access private var outside the class)

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	//step 8: Override toString() method
	//string representation of Object

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", mobileNo=" + mobileNo + "]";
	}
}






