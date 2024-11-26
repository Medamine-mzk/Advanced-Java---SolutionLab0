package part3;
import java.util.Scanner;

public class LabTest {
    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input two numbers
        System.out.print("Enter the first number: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = scanner.nextInt();

        // Declare a float variable to store the sum
        float sum = n1 + n2;

        // Display the result
        System.out.println("The result is: " + sum);
    }
}
