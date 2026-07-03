
import java.util.Scanner;

public class Palindrome_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int n = sc.nextInt();

        int temp = n;
        int rev = 0;

        while(n != 0){
            int d = n % 10;
            rev = rev * 10 + d;
            n /= 10;
        }
        
        if(temp == rev){
            System.out.println("true");
        } else{
            System.out.println("false");
        }
    }
}
