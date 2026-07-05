
import java.util.Scanner;

public class FibonacciSeries {
    // public  int fib(int n){
        
    //     if(n == 0 || n == 1) return n;

    //     return 
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int a = 0, b = 1, i = 0;

        while(i <= n){
            System.out.print(a + " ");
            int c = a + b;

            a = b;
            b = c;

            i++;
        }
        sc.close();
    }
}
