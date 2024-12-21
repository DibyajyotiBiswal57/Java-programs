import java.util.Scanner;

public class area
{
    public static void main(String args[])
    {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side of the square: ");
        double side = scanner.nextInt();
        System.out.println("Your side is " +side);
        
        double squarearea= side*side;
        System.out.println("The area of the square is " +squarearea);
        
        
        System.out.print("Enter the length of the rectangle: ");
        double len = scanner.nextInt();
        System.out.println("Your length is " +len);
        
        System.out.print("Enter the breadth of the rectangle: ");
        double bre = scanner.nextInt();
        System.out.println("Your breadth is " +bre);
        
        double rectanglearea= len*bre;
        System.out.println("The area of the rectangle is " +rectanglearea);
        
        
        System.out.print("Enter the radius of the circle: ");
        double rad = scanner.nextInt();
        System.out.println("Your radius is " +rad);
        
        double circlearea= Math.PI*2*rad;
        System.out.println("The area of the cirle is " +circlearea);
        
        
        scanner.close();
    }
}