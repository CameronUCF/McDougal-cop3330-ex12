/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Cameron McDougal
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        int principal;
        float interestRate;
        int years;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal:");
        principal = scanner.nextInt();

        System.out.println("Enter the rate of interest:");
        interestRate = scanner.nextFloat();
        interestRate /= 100;

        System.out.println("Enter the number of years:");
        years = scanner.nextInt();

        scanner.close();

        float interest = principal * (1 + (interestRate * years));

        System.out.printf("After %d years at %.1f%%, the investment will be worth $%.0f", years, interestRate * 100, interest);
    }
}
