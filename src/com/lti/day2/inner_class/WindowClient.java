package com.lti.day2.inner_class;

public class WindowClient {
public static void main(String[] args) {
		MyWindow window1 = new NotepadWindow();
		window1.close();
	//a class declared within a class which has no name is anonymous innerclass
	//at the time of declaration of an Object, body appears
	// it creates a sub-class which has no name
	// known as Anonymous Inner class
		MyWindow window2 = new MyWindow() {
			@Override
			void close() {
				System.out.println("Closing Window 2 ....");
			}			
		};		
		window2.close();
	}
//method local inner class which is declared within the method
}










