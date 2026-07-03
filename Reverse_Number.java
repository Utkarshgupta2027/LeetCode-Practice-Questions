
import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:");
        int n = sc.nextInt();

        String rs = new StringBuilder(String.valueOf(n)).reverse().toString();

        System.out.println(rs);
        
        int rev = 0;
        while(n != 0){
           int d = n % 10;
            rev = rev * 10 + d;

            n /= 10;
        }
        System.out.println(rev);
    }
}
