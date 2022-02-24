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
				if(empCheck==fulltime) 
					empHrs=8;
				else if(empCheck==parttime)
					empHrs=4;
				else
					empHrs=0;

				empWage= EMP_RATE_PER_HOUR * empHrs;

				System.out.println("Emp Wage is "+empWage);

	}

	public static void main(String[] args) {
		
		calculateDailyWage();
	}
}
