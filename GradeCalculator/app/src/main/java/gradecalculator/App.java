/*
 * Write Java program to ask student to enter the marks of the five units they did last semester, 
 * compute the average and display it on the screen. (Average should be given in two decimal places).
 */
package gradecalculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //get students name
        System.out.println("Enter your name:");
        String name = input.nextLine();

        //get the students marks
        System.out.println("Enter your marks, one per line:");
        double grade1 = input.nextDouble();
        double grade2 = input.nextDouble();
        double grade3 = input.nextDouble();
        double grade4 = input.nextDouble();
        double grade5 = input.nextDouble();

        //calculate the average grade
        double average = (grade1 + grade2 + grade3 + grade4 + grade5 ) / 5;

        //display the students name and average grade
        System.out.println("Name:" + name);
        System.out.printf("Average: %.2f " + average);
            }


    
    
    }
