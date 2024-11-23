import java.util.Scanner;

public class IT24102529Lab3Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a five-digit number
        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();

        // Check if the input is a five-digit number
        if (number < 10000 || number > 99999) {
            System.out.println("Error: Please enter a valid five-digit number.");
        } else {
            // Convert the number to a string to separate the digits
            String numberStr = Integer.toString(number);
            System.out.print("Output → ");
            
            // Iterate through each character in the string and print with a space
            for (int i = 0; i < numberStr.length(); i++) {
                System.out.print(numberStr.charAt(i));
                if (i < numberStr.length() - 1) {
                    System.out.print(" "); // Add a space between digits
                }
            }
            System.out.println(); // Move to the next line after output
        }

        scanner.close();
    }
}
