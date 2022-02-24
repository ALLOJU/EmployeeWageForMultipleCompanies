package com.bridgelabz;

public class EmployeeWageForMultipleCompanies {

	//constants
	public static final int EMP_RATE_PER_HOUR=20;
	//method to calculate daily employee wage of the employee
	private static void calculateDailyWage() {


		//variables
		final int fulltime=2;
		final int parttime=1;
		int empHrs=0;
		int empWage=0;
		int empCheck=0;

		empCheck=(int)Math.floor(Math.random()*10) % 3 ;
		//System.out.println(empCheck);
		switch (empCheck){    
		case 2:    
			empHrs=8;
			break;  //optional  
		case 1:    
			empHrs=4;
			break; 
		default:     
			empHrs=0;  
			break;
		} 

		empWage= EMP_RATE_PER_HOUR * empHrs;

		System.out.println("Emp Wage is "+empWage);

	}

	public static void main(String[] args) {

		calculateDailyWage();
	}
}
