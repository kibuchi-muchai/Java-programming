/*
 * create a calculator program that performs basic functions
 */
package calculator;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the first number.
        System.out.println("Enter the first number: ");
        int firstNumber = input.nextInt();

        // Get the operation.
        System.out.println("Enter the operation (+, -, *, /): ");
        String operation = input.next();

        // Get the second number.
        System.out.println("Enter the second number: ");
        int secondNumber = input.nextInt();

        // Calculate the result.
        int result = 0;
        switch (operation) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
        }

        // Display the result.
        System.out.println("The result is " + result);
    }
}