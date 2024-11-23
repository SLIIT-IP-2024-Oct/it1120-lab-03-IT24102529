import java.util.Scanner;

public class IT24102529Lab3Q1B {  // Ensure class name matches your file name
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the price per kilogram
        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = scanner.nextDouble();

        // Prompt the user to enter the number of kilograms
        System.out.print("Enter the number of kilograms you want to buy: ");
        double kilograms = scanner.nextDouble();

        // Calculate the total amount to pay without discount
        double totalAmount = pricePerKg * kilograms;

        // Apply a 10% discount
        double discountAmount = totalAmount * 0.10;
        double totalAfterDiscount = totalAmount - discountAmount;

        // Display the original total amount, discount, and the final amount after discount
        System.out.printf("The original total amount is: %.2f\n", totalAmount);
        System.out.printf("The discount amount is: %.2f\n", discountAmount);
        System.out.printf("The total amount to pay after discount is: %.2f\n", totalAfterDiscount);

        // Close the scanner
        scanner.close();
    }
}