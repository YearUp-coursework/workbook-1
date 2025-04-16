package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double sandwichCost = 0.0;

        // Prompts user for the size of the sandwich and sets a price based on that sandwich size
        System.out.println("Hi! Welcome to the sandwich shop, what size sandwich would you like?");
        String sandwichSize = scanner.nextLine();

        if (sandwichSize.equalsIgnoreCase("regular")) {
            sandwichCost = 5.45;
        } else if (sandwichSize.equalsIgnoreCase("large")) {
            sandwichCost = 8.95;
        } else {
            sandwichCost = 5.45;
        }


        // Prompts user for their age and applies a discount based on their age

        System.out.println("We're having a promotional discount going on right now based on your age! Do you mind telling me how old you are?");
        String ageInput = scanner.nextLine();
        int customersAge = Integer.parseInt(ageInput);
        if (customersAge <= 17){
            sandwichCost = sandwichCost * .9;
        } else if (customersAge >= 65) {
            sandwichCost = sandwichCost * .8;
        } else {
            sandwichCost = sandwichCost;
        }

        System.out.printf("Your sandwich will be %.2f", sandwichCost);
    }
}
