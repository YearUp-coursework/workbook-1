package com.pluralsight;

import java.util.Scanner;

public class payroll {
    public static void main(String[] args){

        //Create a scanner with the name properPayroll
        Scanner properPayroll = new Scanner(System.in);

        //Takes an input to ask for the users name
        System.out.print("Please input your name: ");
        String name = properPayroll.nextLine();

        //Takes a double point input to get the users hourly wage
        System.out.print("Please input your hourly pay rate: ");
        double hourlyWage = properPayroll.nextDouble();
        properPayroll.nextLine();

        //Takes another double point input to get the amount of hours the user worked
        System.out.print("Please input your hours worked: ");
        double hoursWorked = properPayroll.nextDouble();

        // Creates a conditional assigned to the variable grossPay where if the user inputs a number above 40 they will get their regular wage as well as overtime pay
        double grossPay;

        if (hoursWorked > 40) {
            double regularWages = 40 * hourlyWage;
            double overtimePay = (hoursWorked - 40) + (hourlyWage * 1.5);

            grossPay = regularWages + overtimePay;
        } else {
            grossPay = hoursWorked * hourlyWage;
        }


        //Outputs text that explains how much they will be earning given the amount of hours they've worked
        System.out.printf("Hi! %s, because you worked %.0f hours this week. Your gross pay will be $%.0f.", name, hoursWorked, grossPay);
    }
}
