package org.tcs.test;

public class DayOne {
	
	
	//ctrl + space
	public void studentName() {
		//ctrl + d
		System.out.println("My name is Santhosh");
	}
	
	public void courseName() {
		System.out.println("Course name is Java and Selenium");
	}
	
	public void trainingInstitute() {
		System.out.println("Training institute is Greens Tech");
	}
	
	//main method
	
	public static void main(String[] args) {
		
		// classname objectname = new classname ();
		DayOne d = new DayOne();  // object create - memory allocation
		
		// objectname.methodname
		
		d.studentName();
		d.courseName();
		d.trainingInstitute();
		
	}

}
