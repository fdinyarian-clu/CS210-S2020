/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myclu.exercise02_23;

import java.util.Scanner;

/**
 * @author      Farzin Dinyarian
 * @version     1.0
 * @since       12/22/2019
 */
public class Exercise02_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();

        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();

        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();

        System.out.println("The cost of driving is $" + 
          (distance / milesPerGallon) * pricePerGallon);
  }
    
}
