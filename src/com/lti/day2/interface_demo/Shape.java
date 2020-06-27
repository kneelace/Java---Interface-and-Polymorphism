
package com.lti.day2.interface_demo;

/*
 * A class marked as abstract which cannot be instantiated
 * and is used for further extensibility of code
 * but a class which has an abstract method must be declared as abstract.
 */
public abstract class Shape implements IPrintable{
	public Shape(){
		System.out.println("Super class shape constructor invoked....");
	}
	public  void area() {
		
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("***************object memory De-allocated ");
	}
	
	
}

/*-Golden rule : a class which extends an abstract class must implements 
all the abstract method or declare the class itself as abstract.*/
class  Circle extends Shape{
	private final static float PI_VALUE=3.14f;
	private float radius;
	//final variable must be initialized
	public Circle() {
		System.out.println("Sub class Circle constructor invoked....");
	}
	
	public Circle(float radius) {
		super();
		System.out.println("Sub class Circle constructor invoked....");
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public static float getPiValue() {
		return PI_VALUE;
	}
	@Override
	public void area() {
		System.out.println("Area Of a Circle is :"
	+(radius*radius*PI_VALUE));
		//and cannot be re-initialized or changed
		//therefore they don't have any setter method
		//also used to declare constant in java
		
		//error	//PI_VALUE=3.15f;
		
	}

	@Override
	public void print() {
		System.out.println("\n-----------------------------------------------\n"
				+ "\n 			Circle Details \n"
				+"\n Radius : "+this.radius
				+"\n-----------------------------------------------\n");
	}
	
}
/********************end of Circle*************************/
class  Square extends Shape{
	private float sides;
	
	public Square() {
		System.out.println("Contructor of Square invoked");
	}
	public Square(float sides) {
		this.sides=sides;
		System.out.println("Contructor of Square invoked");
	}
	@Override
	public void area() {
		System.out.println("Area of Square : "+(sides*sides));
		
	}
	public float getSides() {
		return sides;
	}
	public void setSides(float sides) {
		this.sides = sides;
	}
	@Override
	public void print() {
		System.out.println("\n-----------------------------------------------\n"
				+ "\n 			Square Details \n"
				+"\n Sides : "+this.sides
				+"\n-----------------------------------------------\n");
	}
}









