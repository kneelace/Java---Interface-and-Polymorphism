
package com.lti.day2.inner_class;

public class OuterClass {
	private int out=10;
	class InnerClass{
		public int in=20;
		//inner class can access all members of outer class , even if private
		public void inDisplay() {
			System.out.println("Hello Inner Class..."
					+ "accessing outer class member : "+out);
		}		
	}
	public void outDisplay() {
		//outer class cannot access members of inner class directly
		//, even if public
	System.out.println("Hello Outer Class..."
			+ "accessing outer class member : "+this.out);
	InnerClass inObj = new InnerClass();
	System.out.println("Hello Outer Class..."
			+ "accessing Inner class member : "+inObj.in);
	
	System.out.println("Hello Outer Class..."
			+ "accessing StaticInner class member : "
			+StaticInnerClass.getAutoId());
	}//end of method
	
	static class StaticInnerClass{
		//used for static members declaration
		static int autoId;
		static {
			autoId=1001;
		}
		public static int getAutoId() {
			System.out.println("Auto Id: "+autoId);
			return autoId;
		}
	}
}




