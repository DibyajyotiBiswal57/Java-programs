import java.util.Scanner;

public class add3numbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the standard input stream (keyboard)
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt(); 


        System.out.print("Enter second number: ");
        int b = scanner.nextInt(); 


        System.out.print("Enter third number: ");
        int c = scanner.nextInt(); 

        int sum = a+b+c

        // Display the entered information
        System.out.println("Sum: " +sum);
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
