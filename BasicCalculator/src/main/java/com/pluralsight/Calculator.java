package com.pluralsight;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        letsDoMath();


    }

    public static void letsDoMath() {

        try {
            String operator;
            String operation;
            double result = 0;
            double num1;
            double num2;
            boolean validNumbers = false;
            boolean validOperator = false;
            do {
                try {
                    System.out.print("Please enter a number: ");
                    num1 = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Please enter the second number: ");
                    num2 = scanner.nextDouble();
                    scanner.nextLine();
                    validNumbers = true;

                } catch (InputMismatchException e) {
                    System.out.println("Invalid number\n");
                    scanner.nextLine();
                    continue;

                }

                System.out.print("People pick an operator symbol.\n" +
                        "\"+\"  -  Addition\n" +
                        "\"-\"  -  Subtraction\n" +
                        "\"*\"  -  Multiplication\n" +
                        "\"/\"  -  Division\n");
                operator = scanner.nextLine().trim();
                operation = operator;

                if (operator.equals("+") || operator.equals("-")
                        || operator.equals("*") || operator.equals("/")) {
                    validOperator = true;
                    switch (operator) {
                        case "+" -> {
                            result = num1 + num2;
                            operation = "sum";
                        }
                        case "-" -> {
                            result = num1 - num2;
                            operation = "remainder";
                        }
                        case "*" -> {
                            result = num1 * num2;
                            operation = "product";
                        }
                        case "/" -> {
                            if(num2 == 0){
                                System.out.println("Divide by 0 error.");
                                validOperator = false;

                            }else {
                                result = num1 / num2;
                                operation = "quotient";

                            }
                        }
                    }
                    System.out.printf("The %s of %.2f and %.2f is %.2f", operation, num1, num2, result);
                    scanner.close();

                } else {
                    System.out.println("Invalid operator\n");

                }

            } while (!validNumbers || !validOperator);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input");

        }
    }
}