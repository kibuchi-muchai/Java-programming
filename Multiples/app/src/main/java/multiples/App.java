/*
 * a Java program to display all the multiples of 2, 3 and 7 within the range 71 to 150
 */
package multiples;

public class App {

    public static void main(String[] args) {
        // Print all the multiples of 2, 3, and 7 within the range 71 to 150.
        for (int i = 71; i <= 150; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 7 == 0) {
                System.out.println(i);
            }
        }
    }

}
