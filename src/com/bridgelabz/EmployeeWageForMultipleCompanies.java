package com.bridgelabz;

public class EmployeeWageForMultipleCompanies {

	//constants
	public static final int EMP_RATE_PER_HOUR=20;
	//method to calculate daily employee wage of the employee
	private static void calculateDailyWage(int is_fulltime) {


		//variables
		int empHrs=0;
		int empWage=0;
		int empCheck=0;

		empCheck=(int)Math.floor(Math.random()*10) % 2;
		//System.out.println(empCheck);
		if(empCheck==is_fulltime) 
			empHrs=8;
		else
			empHrs=4;

		empWage= EMP_RATE_PER_HOUR * empHrs;

		System.out.println("Emp Wage is "+empWage);

	}

	public static void main(String[] args) {
		int is_fulltime=1;
		calculateDailyWage(is_fulltime);
	}
}
