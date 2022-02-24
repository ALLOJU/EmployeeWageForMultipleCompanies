package com.bridgelabz;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class EmployeeWageForMultipleCompanies implements IComupteEmpWage {


	//declaring constants
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;

	//declaring variables
	private int numOfCompany=0;
	private LinkedList<CompanyEmpWage> companyEmpWageList;
	private Map<String, CompanyEmpWage> companyEmpWageMap;

	
	public EmployeeWageForMultipleCompanies() {
		companyEmpWageList=new LinkedList<>();
		companyEmpWageMap=new HashMap<>();
	}
	public void addCompanyEmpWage(String company, int empRatePerour, int numOfWorkingDays, int maxHoursPerMonth) {
		
		CompanyEmpWage companyEmpWage=new CompanyEmpWage(company, empRatePerour, numOfWorkingDays, maxHoursPerMonth);
		companyEmpWageList.add(companyEmpWage);
		companyEmpWageMap.put(company, companyEmpWage);
		
	}
	public void computeEmpWage() {
		for(int i=0;i< companyEmpWageList.size();i++) {
		
			CompanyEmpWage companyEmpWage=companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
		}
	}
	public int computeEmpWage(CompanyEmpWage companyempwage) {
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
		IComupteEmpWage empwagecompany=new EmployeeWageForMultipleCompanies();
		empwagecompany.addCompanyEmpWage("Damrt",20,2,10);
		//empwagecompany.addCompanyEmpWage("Reliance",10,4,20);
		System.out.println("Total Employee wage "+empwagecompany.getTotalWage("Dmart"));
		empwagecompany.computeEmpWage();


	}
	@Override
	public int getTotalWage(String company) {
		return companyEmpWageMap.get(company).totalEmpWage;
	}


}



