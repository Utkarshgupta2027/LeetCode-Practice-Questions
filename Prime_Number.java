
import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int n = sc.nextInt();

        boolean prime = true;
        sc.close();
        if(n <= 1){
            prime = false;
        } else {
            for(int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        if(prime){
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
