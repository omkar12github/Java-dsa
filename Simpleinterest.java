import java.util.Scanner;

public class Simpleinterest {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args) {
        System.out.print("Enter principle:");
        float p = sc.nextFloat();


        System.out.print("Enter rate of interest:");
        float r =sc.nextFloat();

        System.out.print("enter time:");
        float t = sc.nextFloat();


        float si = (p* r * t) / 100;

        System.out.println("principle: " + p);
        System.out.println("rate of interest: " + r);
        System.out.println("time: " + t);
        System.out.println("Simple interest: " + si);
    }

    
}
