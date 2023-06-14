/*
 * Write a Java program that asks the user to enter their sur name and current age then print the number of characters of their sir name and even or odd depending on their age number
 */
package java.programming;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // scanner reads input from user
        Scanner input = new Scanner(System.in);

        //get the users surname and age
        System.out.println("Enter your surname:");
        String surname = input.nextLine();
        System.out.println("Enter your age:");
        int age = input.nextInt();

        //print the number of characters in the users surname
        System.out.println("Your surname has " + surname.length() + "characters");

        //check if the users age is even or odd
        if (age % 2 == 0){
            System.out.println("Your age is even");

        }else {
            System.out.println("Your age is odd");
        }

}}