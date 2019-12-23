/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myclu.exercise02_05;

import java.util.Scanner;
/**
 * @author      Farzin Dinyarian
 * @version     1.0
 * @since       12/22/2019
 */
public class Exercise02_05 {
    public static void main(String[] args) {
        // Read subtotal
        Scanner input = new Scanner(System.in);
        System.out.print("Enter subtotal and gratuity rate: ");
        double subtotal = input.nextDouble();
        double rate = input.nextDouble();

        double gratuity = subtotal * rate / 100;
        double total = subtotal + gratuity;

        System.out.println("The gratuity is $" + gratuity +
            " total is $" + total);
  }
    
}
