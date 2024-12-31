import java.util.Scanner;

public class profitandloss
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("This program finds the profit or loss for a given cost and selling price.");
        System.out.println("Enter the cost price:");
        double cp = scanner.nextInt();
        System.out.println("Enter the selling price:");
        double sp = scanner.nextInt();

        if(cp>sp)
        {

        System.out.println("It is a loss");
        double loss=cp-sp
        System.out.println("The loss is "+cp-sp);
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
        