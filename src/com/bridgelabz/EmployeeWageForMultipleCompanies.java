package com.bridgelabz;
public class EmployeeWageForMultipleCompanies {


	//declaring constants
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;

	//declaring variables
	private int numOfCompany=0;
	private CompanyEmpWage[] companyEmpWageArray;

	public EmployeeWageForMultipleCompanies(){
		companyEmpWageArray=new CompanyEmpWage[5];
	}
	private void addCompanyEmpWage(String company, int empRatePerour, int numOfWorkingDays, int maxHoursPerMonth) {
		companyEmpWageArray[numOfCompany]=new CompanyEmpWage(company,empRatePerour,numOfWorkingDays,maxHoursPerMonth);
		numOfCompany++;
	}
	private void computeEmpWage() {
		for(int i=0;i< numOfCompany;i++) {
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}
	private int computeEmpWage(CompanyEmpWage companyempwage) {
		//declaring variables
		int empHours=0,totalEmpHours=0,totalWorkingDays=0;
		while(totalEmpHours <= companyempwage.maxHoursPerMonth && totalWorkingDays <= companyempwage.numOfWorkingDays ) {

			totalWorkingDays++;
			int empCheck=(int)Math.floor(Math.random()*10) % 3;

			switch(empCheck){    
			case  IS_FULL_TIME:    
				empHours=8;
				break;  //optional  
			case IS_PART_TIME:    
				empHours=4;
				break; 
			default:     
				empHours=0;  
				break;
			}
			totalEmpHours+=empHours;
			System.out.println("Day#:" +totalWorkingDays+"Emp Hr :"+empHours);
		}
		return  companyempwage.empRatePerour * totalEmpHours;
		//System.out.println("Total Employee Wage for Company " +company+  "  is  " +totalEmpWage);



	}

	public static void main(String[] args) {
		EmployeeWageForMultipleCompanies empwagecompany=new EmployeeWageForMultipleCompanies();
		empwagecompany.addCompanyEmpWage("Dmart",20,2,10);
		empwagecompany.addCompanyEmpWage("Reliance",10,4,20);
		empwagecompany.computeEmpWage();


	}


}



