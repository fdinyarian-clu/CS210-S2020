package com.myclu.chapter2;
import java.lang.Math;
import java.util.Scanner;

class d {

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		//Receives the amount of money that the user invested
		System.out.println("Please input your investment amount: ");
		double investmentAmount = input.nextDouble();
		
		//Receives the annual interest rate for the user's investment
		System.out.println("Please input the annual interest rate as a percentage without the sign: ");
		double annualInterestRate = input.nextDouble();
		
		//Receives the number of years that the user is investing for
		System.out.println("Please input the number of years that you are going investing your money: ");
		double numberOfYears = input.nextDouble();
		
		//Calculates the future value of the user's investment and tells them what it is
		double futureInvestmentValue = investmentAmount * Math.pow((1 + (annualInterestRate/100)), numberOfYears);
		System.out.printf("Your investment will be worth $%5.2f", futureInvestmentValue);
		
	}

}
