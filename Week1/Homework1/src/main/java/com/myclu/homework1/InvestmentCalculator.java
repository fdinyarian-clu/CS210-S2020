/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myclu.homework1;
import java.util.Scanner;
/**
 * <p>
 * (Financial application: calculate future investment value) Write a program that
 * reads in investment amount, annual interest rate, and number of years, and displays
 * the future investment value using the following formula:
 * futureInvestmentValue =
 *      investmentAmount * (1 + monthlyInterestRate)^numberOfYears*12
 * For example, if you enter amount 1000, annual interest rate 3.25%, and number
 *  of years 1, the future investment value is 1032.98.
 * @author      Farzin Dinyarian
 * @version     1.0
 * @since       12/22/2019
 */
public class InvestmentCalculator {
        /**
        * main function to print JAVA String.
        * @param args 
        * @see       
        * @since     12/22/2019
        */  
    	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the investment amount,
		// annual interest rate and number of years.
		System.out.print("Enter investment amount: ");
		double amount = input.nextDouble();
		System.out.print("Enter annual interest rate in percentage: ");
		double monthlyInterestRate = input.nextDouble();
		monthlyInterestRate /= 1200;
		System.out.print("Enter number of years: ");
		int years = input.nextInt();

		// Calculate future investment value
		double futureInvestmentValue = 
			amount * Math.pow(1 + monthlyInterestRate, years * 12);
		
		// Display result
		System.out.println("Accumulated value is $" + futureInvestmentValue);
	}
}
