public class AssgnmentOperator {
    public static void main(String[]args){
        int a = 10;
        int b = 20;

        a += b; // a = a + b
        System.out.println("a += b: " + a); // 30

        a -= b; // a = a - b
        System.out.println("a -= b: " + a); // 10

        a *= b; // a = a * b
        System.out.println("a *= b: " + a); // 200

        a /= b; // a = a / b
        System.out.println("a /= b: " + a); // 10

        a %= b; // a = a % b
        System.out.println("a %= b: " + a); // 10

    }
}
