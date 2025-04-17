package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double  rentalPrice = 29.99;

        // Prompt the renter for their name
        System.out.println("Hi! Welcome to Queens car rentals. What's your name?");
        String name = scanner.nextLine();

        // Prompt the renter for their age
        System.out.printf("Nice to meet you %s, would you mind showing me your id? \n", name);
        String ageInput = scanner.nextLine();

        int renterAge = Integer.parseInt(ageInput);

        // Apply a surcharge if the renter is younger than 25
        if (renterAge < 25) {
            rentalPrice *= 1.30;
            System.out.printf("A 30%% surcharge has been applied. New price: $%.2f\n", rentalPrice);
        }else {
            System.out.println("No surcharge applied. (Age >= 25)");

        }

        // Changing the price based on the optional add-ons
        System.out.println("Would you like to add our electronic toll tag package for an additional $3.95 a day?\n \"Yes\" \n \"No\" \n");
        String tollTagAddOn = scanner.nextLine();

        if (tollTagAddOn.equalsIgnoreCase("yes")){
            rentalPrice += 3.95;
            System.out.printf("Okay! the new rental price will be $%.2f.\n", rentalPrice);

        }else {
            System.out.println("No problem!");

        }

        System.out.println("Would you like to add our GPS package for an additional $2.95 a day?\n \"Yes\" \n \"No\"");
        String GPSPackage = scanner.nextLine();

        if (GPSPackage.equalsIgnoreCase("yes")){
            rentalPrice += 2.95;
            System.out.printf("Good choice! The new rental price will be $%.2f\n", rentalPrice);

        }else {
            System.out.println("That's fine! we have one more add-on to offer.");

        }

        System.out.println("Do you want to add our roadside assistance package for an additional $3.95 a day?\n \"Yes\" \n \"No\"");
        String roadsideAssistancePackage = scanner.nextLine();

        if (roadsideAssistancePackage.equalsIgnoreCase("yes")){
            rentalPrice += 3.95;
            System.out.printf("Great! the new rental price will be $%.2f\n", rentalPrice);

        }else {
            System.out.printf("The current price of the rental per day is $%.2f", rentalPrice);

        }

        // Calculate the final price of the rental based on the amount of days the renter plans to rent the vehicle
        System.out.println("How many days do you plan to rent the vehicle?");
        String userInput = scanner.nextLine();
        int daysRented = Integer.parseInt(userInput);

        System.out.printf("Okay! Your current rental price is $%.2f, since you want to rent for %d days. Your total will be $%.2f", rentalPrice, daysRented, rentalPrice * daysRented);
    }
}
