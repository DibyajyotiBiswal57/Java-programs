import java.util.Scanner;

public class averagescore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 4 marks");
        System.out.print("1: ");
        int a = scanner.nextInt(); 

        System.out.print("2: ");
        int b = scanner.nextInt(); 

        System.out.print("3: ");
        int c = scanner.nextInt(); 
      
        System.out.print("4: ");
        int d = scanner.nextInt(); 

        int aver = (a+b+c+d)/4; 


        System.out.println("The average is: " +aver);
        
        scanner.close();
    }
}
