/*
 * This program checks whether the given integer is divisible by integers in the range of 0-9
 */
package divisibilitytest;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //get the number from user
        System.out.println(("Enter a number: "));
        int number = input.nextInt();

        //check if the number is divisible by 0-9
        for (int i = 0; i <= 9; i++){
            if (number % i == 0){
                System.out.println("The number is divisible by " + i + "because it ends with a " + (number % 10));
            }

        }


    }}
