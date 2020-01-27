/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myclu.chapter2;

/**
 *
 * @author dinya
 */
/*
(Population projection) Rewrite Programming Exercise 1.11 to prompt the user
to enter the number of years and displays the population after the number of years.
Use the hint in Programming Exercise 1.11 for this program. The population
should be cast into an integer. Here is a sample run of the program:
*/
import java.util.Scanner;

public class Exercise_02_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	// Create a Scanner object

		// Prompt the user to the number of years
		System.out.print("Enter the number of years: ");
		int years = input.nextInt();

		// Calculate population projection
		int population = 312032486 + (((31536000 / 7) - (31536000 / 13)
								+ (31536000 / 45)) * years);

		// Display the results
		System.out.println("The population in " + years + " is " + population);
	}
}