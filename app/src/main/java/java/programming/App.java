/*
 * Write a Java program that asks the user to enter their sur name and current age then print the number of characters of their sir name and even or odd depending on their age number
 */
package java.programming;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get the users surname and age
        System.out.println("Enter your surname:");
        String surname = input.nextLine();
        System.out.println("Enter your age:");
        int age = input.nextInt();

}}