import java.util.Scanner;

public class IT24102529Lab3Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter an amount
        System.out.print("Enter the amount in rupees: ");
        int amount = scanner.nextInt();
        
        // Define the denominations
        int[] denominations = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] count = new int[denominations.length];
        
        // Calculate the number of each denomination
        for (int i = 0; i < denominations.length; i++) {
            if (amount >= denominations[i]) {
                count[i] = amount / denominations[i];
                amount = amount % denominations[i];
            }
        }
        
        // Print the results
        System.out.println("Breakdown of the amount:");
        for (int i = 0; i < denominations.length; i++) {
            System.out.println(denominations[i] + " Notes – " + count[i]);
        }
        
        scanner.close();
    }
}
