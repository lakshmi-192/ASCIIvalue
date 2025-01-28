
//Write a program to display the ASCII value of a character entered by the user
import java.util.Scanner;

public class ASCIIValue {
    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a character and read the input
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Print the ASCII value of the character
        System.out.println((int) ch);

        // Close the scanner
        scanner.close();
    }
}