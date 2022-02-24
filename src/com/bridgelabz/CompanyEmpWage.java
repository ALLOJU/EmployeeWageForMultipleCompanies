package com.bridgelabz;

public class CompanyEmpWage {

	public final String company;
	public final int empRatePerour;
	public final int numOfWorkingDays;
	public final int maxHoursPerMonth;
	public int totalEmpWage;
	
	public String getCompany() {
		return company;
	}


	public int getEmpRatePerour() {
		return empRatePerour;
	}


	public int getNumOfWorkingDays() {
		return numOfWorkingDays;
	}


	public int getMaxHoursPerMonth() {
		return maxHoursPerMonth;
	}

	public CompanyEmpWage(String company, int empRatePerour, int numOfWorkingDays, int maxHoursPerMonth) {
		super();
		this.company = company;
		this.empRatePerour = empRatePerour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	@Override
	public String toString() {
		return "CompanyEmpWage [company=" + company + ", empRatePerour=" + empRatePerour + ", numOfWorkingDays="
				+ numOfWorkingDays + ", maxHoursPerMonth=" + maxHoursPerMonth + "]";
	}


	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage=totalEmpWage;
	}


	
}
