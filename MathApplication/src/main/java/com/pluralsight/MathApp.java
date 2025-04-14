package com.pluralsight;

import static java.lang.Math.nextAfter;
import static java.lang.Math.round;

public class MathApp {
    public static void main (String[] args) {

        // Question 1:
        // declare variables here
        // then code solution
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        // REPEAT FOR NEXT EXERCISE

        // Question 1:
        /** Assigns the salary of both Bob and Gary
         * Compare the two salaries using Math.max which finds the higher of the 2 given variables
         * Prints the output of the Math.max function
         */
        double bobSalary = 70000;
        double garySalary = 85000;

        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The answer is " + highestSalary);

        // Question 2:
        /** Assigns the value of each vehicle to a variable based on the vehicle type
         * Compares the 2 vehicles prices and finds the smaller one
         * Prints which vehicle would be the least expensive using Math.min
         */
        double carPrice = 74132.83;
        double truckPrice = 87592.70;

        double cheapestVehicle = Math.min(carPrice, truckPrice);
        System.out.println("The least expensive vehicle is " + cheapestVehicle + "$.");

        // Question 3:
        /** Assigns a value to the variable radius
         * Assigns the rounded value of PI times radius^2 to circleArea
         * Prints the output of the area of the circle with the given radius
         */
        double radius = 7.25;
        double circleArea = Math.round(Math.PI * Math.pow(radius, 2));

        System.out.println("The area of this circle is " + circleArea + ".");

        // Question 4:
        /** Assigns a value to the variable randomNum
         * Assigns the value of the square root of the variable randomNum to the variable numSqrt
         * Prints the output of the square root of the given number
         */
        double randomNum = 81;
        double numSqrt = Math.sqrt(randomNum);

        System.out.println("The square root of " + randomNum + " is " + numSqrt);

        //Question 5:
        /** Assigns the value of the two points based on their x and y value to their respective variables
         * Computes the rounded integer distance between the two points using the pythagorean theorem
         * Outputs the distance between the two points
         */
        double x1 = 5, x2 = 85;
        double y1 = 10, y2 =50;

        double distance = Math.round(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1,2)));
        System.out.println("The distance between the points (5,10) and (85,50) is " + distance);

        //Question 6:
        /** Assigns a negative value to the variable negativeFloat
         * Uses the Math class to find the absolute value of that variable
         * Prints the outcome of the absoluteValue variable
         */
        float negativeFloat = -3.8F;

        float absoluteValue = Math.abs(negativeFloat);
        System.out.println("The absolute value of " + negativeFloat + " is " + absoluteValue);

        //Question 7
        /** Math.random() created a random decimal between 0.0 and 1.0
         * Casting the number to (int) removed the decimal
         * Changes the maximum range to 9
         * Uses +1 to indicate a change in range from 0-9 to 1-10
         * Outputs a random number between 1 and 10
         */
        int randomNumber = (int)(Math.random() * 10) + 1;

        System.out.println(randomNumber);
    }
}
