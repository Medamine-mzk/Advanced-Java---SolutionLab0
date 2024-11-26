package part4;
import java.util.Scanner;
import java.util.Scanner;

public class LabTest {
    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a number
        System.out.print("Enter a number: ");
        float number = scanner.nextFloat();

        // Calculate the double of the number
        float doubleValue = number * 2;

        // Display the result
        System.out.println("The double of the number is: " + doubleValue);
    }
}
