import java.util.Scanner;

public class Sumoftwonum {
    public static void main(String[]args) {
        Scanner sc= new Scanner(System.in);
         
        System.out.print("Enter first number :");
        int num_1 = sc.nextInt();
        

        System.out.print("Enter second number:");
        int num_2 = sc.nextInt();

        int sum = num_1 + num_2;
        System.out.print("sum : "+ sum);


    }
    
}
