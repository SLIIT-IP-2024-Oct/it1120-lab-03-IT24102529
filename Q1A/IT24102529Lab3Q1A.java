import java.util.Scanner;  // Import statement (should be at the top)

public class IT24102529Lab3Q1A {  // Class definition should match the filename
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the price per kilogram
        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = scanner.nextDouble();

        // Prompt the user to enter the number of kilograms
        System.out.print("Enter the number of kilograms you want to buy: ");
        double kilograms = scanner.nextDouble();

        // Calculate the total amount to pay
        double totalAmount = pricePerKg * kilograms;

        // Display the total amount
        System.out.printf("The total amount to pay is: %.2f\n", totalAmount);

        // Close the scanner
        scanner.close();
    }
}
