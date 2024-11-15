import java.util.Scanner;

public class add3numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt(); 

        System.out.print("Enter second number: ");
        int b = scanner.nextInt(); 

        System.out.print("Enter third number: ");
        int c = scanner.nextInt(); 

        int sum = a+b+c;


        System.out.println("Sum: " +sum);
        
        scanner.close();
    }
}
