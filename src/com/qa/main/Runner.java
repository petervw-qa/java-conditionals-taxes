package com.qa.main;

public class Runner {
	public static void main(String[] args) {
		
		Methods taxexample = new Methods();
		
		System.out.println(taxexample.taxPercentage(32000));
		System.out.println(taxexample.taxTaken(64302));
		System.out.println(taxexample.taxPercentage(-65));
	}

}
