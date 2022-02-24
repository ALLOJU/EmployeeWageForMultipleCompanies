package com.bridgelabz;

public interface IComupteEmpWage {

	public void addCompanyEmpWage(String company, int empRatePerour, int numOfWorkingDays, int maxHoursPerMonth);
	
	public void computeEmpWage();
	
	public int getTotalWage(String company);
}
