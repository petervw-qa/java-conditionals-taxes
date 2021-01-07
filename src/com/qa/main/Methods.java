package com.qa.main;

public class Methods {
	
	// method 1: salary percentage
	public double taxPercentage(double salary) {
		
		double tax = 0;
		
		if (salary < 0) {
			System.out.println("You are going to be very broke.");
		} if (salary < 14999) {
			tax = 0;
		} else if (salary >= 15000 && salary <= 19999) {
			tax = 0.1;
		} else if (salary >= 20000 && salary <= 29999) {
			tax = 0.15;
		} else if (salary >= 30000 && salary <= 49999) {
			tax = 0.2;
		} else if (salary > 45000) {
			tax = 0.25;
		}
		
		return tax;
	}
	
	// method 2: tax taken
	public double taxTaken(double bigBoySalary) {
		
		double totalLost = 0;
		
		double moneyLost = taxPercentage(bigBoySalary);
		
		if (moneyLost == 0) {
			totalLost = 0;
		} else {
			totalLost = bigBoySalary*(moneyLost/100);
		}
		
		System.out.println("Your salary is " + bigBoySalary + " and you have been taxed " + totalLost);
		return totalLost;
		
		
	}
	

}
