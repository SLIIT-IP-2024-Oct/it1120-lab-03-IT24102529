import java.util.Scanner;

public class IT24102529Lab3Q2 {  // Replace 'xxxxxxxx' with your actual student ID
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the monthly salary
        System.out.print("Enter the monthly salary: ");
        double monthlySalary = scanner.nextDouble();

        // Prompt the user to enter the number of OT hours worked
        System.out.print("Enter the number of OT hours worked: ");
        double otHours = scanner.nextDouble();

        // Prompt the user to enter the OT hourly rate
        System.out.print("Enter the OT hourly rate: ");
        double otHourlyRate = scanner.nextDouble();

        // Calculate the OT amount
        double otAmount = otHours * otHourlyRate;

        // Calculate the total salary (Monthly Salary + OT Amount)
        double totalSalary = monthlySalary + otAmount;

        // Display the calculated results
        System.out.printf("The OT amount is: %.2f\n", otAmount);
        System.out.printf("The total salary (including OT) is: %.2f\n", totalSalary);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
