import java.util.Scanner;
public class simpleinterest
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principle:"); 
        double p = scanner.nextDouble();
        System.out.println("Enter the time(in years):"); 
        double r = scanner.nextDouble();
        System.out.println("Enter the rate of interest:"); 
        double t = scanner.nextDouble();
        double si=p*r*t/100;
        System.out.println("The simple interest is Rs."+si); 
    }
}