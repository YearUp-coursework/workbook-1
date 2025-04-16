package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompts user for the size of the sandwich and sets a price based on that sandwich size
        System.out.println("Hi! Welcome to the sandwich shop, what size sandwich would you like? \n Regular: 5.45 \n Large: 8.95");
        String sandwichSize = scanner.nextLine();

        double sandwichCost = 0;
        if (sandwichSize.equalsIgnoreCase("regular")) {
            sandwichCost = 5.45;

        } else if (sandwichSize.equalsIgnoreCase("large")) {
            sandwichCost = 8.95;

        } else {
            System.out.println("Sorry we don't have that size available.");
            System.exit(0);
            
        }

        System.out.printf("Would you like to get your %s sized sandwich loaded? \n Loaded regular: +1.00 \n Loaded large: +1.75\n", sandwichSize);
        String loadedSandwich = scanner.nextLine();

        if (loadedSandwich.equalsIgnoreCase("yes")) {
            if (sandwichSize.equalsIgnoreCase("regular")) {
                sandwichCost += 1.00;

            } else if (sandwichSize.equalsIgnoreCase("large")) {
                sandwichCost += 1.75;

            }
        }
        // Prompts user for their age and applies a discount based on their age

        System.out.println("We're having a promotional discount going on right now based on your age! Do you mind telling me how old you are?");
        String ageInput = scanner.nextLine();
        int customersAge = Integer.parseInt(ageInput);

        if (customersAge <= 17) {
            sandwichCost = sandwichCost * .9;

        } else if (customersAge >= 65) {
            sandwichCost = sandwichCost * .8;

        }

        System.out.printf("Your sandwich will be $%.2f", sandwichCost);
    }
}
