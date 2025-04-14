package com.pluralsight;

import java.util.Scanner;

public class Calculator {
    public static void main(String[]args){

        Scanner LetsDoMath = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double number1 = LetsDoMath.nextDouble();

        System.out.println("Enter the second number: ");
        double number2 = LetsDoMath.nextDouble();
        LetsDoMath.nextLine();

        System.out.println("What do you want to do?");
        System.out.println("     Enter \"A\" for addition, \"S\" for subtraction, \"M\" for multiplication or \"D\" for division:  ");
        LetsDoMath.nextLine();

        double product = number1 * number2;
        System.out.printf("The product of %.0f and %.0f is %.0f", number1, number2, product);
    }
}
