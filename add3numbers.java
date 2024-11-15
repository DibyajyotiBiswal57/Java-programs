import java.util.Scanner;

public class add3numbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the standard input stream (keyboard)
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read a line of text

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Read an integer

        // Prompt the user to enter their height
        System.out.print("Enter your height: ");
        double height = scanner.nextDouble(); // Read a double

        // Display the entered information
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
