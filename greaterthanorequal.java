import java.util.Scanner;

public class greaterthanorequal
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("This program takes 2 number and tells which number is greater");
        System.out.println("Enter the first number:");
        int a = scanner.nextInt();
        System.out.println("Enter the second number:");
        int b = scanner.nextInt();

        if(a==b)
        {

        System.out.print("The numbers are equal. ");
        }
        
        else if(a>b)
        {
        System.out.println(a+" is greater than " +b);
        }
        
        else if(b>a)
        {
        System.out.println(b+" is greater than " +a);
        }
        scanner.close();
    }
}
        