import java.util.Scanner;
public class positiveornegative
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        double a = scanner.nextDouble();
        if(a>0)
        System.out.println("It is a positive number.");
        else if (a==0)
        System.out.println("It is 0");
        else if (a<0)
        System.out.println("It is a negative number.");
        scanner.close();
    }
}
