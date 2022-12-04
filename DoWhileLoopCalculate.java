package com.corejava;

public class DoWhileLoopCalculate {
	public static void main(String[]args) {
		int loanAmount=100000;
		double interestRate=10;
		do {
			System.out.println("interest rate for the loan amount"+"100000    "+interestRate+"interestRate"+" %  "+"amount of interest   "+loanAmount*(interestRate/100));
			interestRate++;
		}while(interestRate<=20);
	}

}
