package org.tcs.test;

import org.cts.test.DayFour;
import org.cts.test.DayThree;

public class DayTwo {
	
	public void trainerName() {
		
		//ctrl+d
		System.out.println("Trainer name is Raj");
		
	}
	
	public static void main(String[] args) {
		
		DayTwo dt = new DayTwo();
		
		//objectname.methodname
		dt.trainerName();
		
		DayOne d = new DayOne();
		d.courseName();
		d.studentName();
		d.trainingInstitute();
		
		DayThree dth = new DayThree();
		dth.modeOfTraining();
		
		DayFour df = new DayFour();
		df.batchDetails();
	}

}
