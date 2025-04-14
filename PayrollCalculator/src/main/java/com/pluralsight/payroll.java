package com.pluralsight;

import java.util.Scanner;

public class payroll {
    public static void main(String[] args){

        //Create a scanner with the name properPayroll
        Scanner properPayroll = new Scanner(System.in);

        //Takes an input to ask for the users name
        System.out.println("What is your name?");
        String name;
        name = properPayroll.nextLine();

        //Takes a double point input to get the users hourly wage
        System.out.println("Please input your hourly pay rate: ");
        double hourlyWage = properPayroll.nextDouble();
        properPayroll.nextLine();

        //Takes another double point input to get the amount of hours the user worked
        System.out.println("Please input your hours worked: ");
        double hoursWorked = properPayroll.nextDouble();

        //Calculates their gross earnings by multiplying the hours they worked and their wage
        double grossPay = hourlyWage * hoursWorked;

        //Outputs text that explains how much they will be earning given the amount of hours they've worked
        System.out.printf("Hi! %s, because you worked %.0f hours this week. Your gross pay will be $%.0f.", name, hoursWorked, grossPay);
    }
}
