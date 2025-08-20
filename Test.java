import java.util.*;
class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr1 = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
            }
            int[] arr2 = new int[n];
            for (int i = 0; i < n; i++) {
                arr2[i] = sc.nextInt();
            }

            Arrays.sort(arr1);
            Arrays.sort(arr2);
            int sum =0;
            for (int i = 0; i < n; i++) {
                sum = sum + arr1[i] * arr2[n-i-1];
            }
            System.out.println(sum);
            
           
           
           
           
           
         
           
        }
    }
}