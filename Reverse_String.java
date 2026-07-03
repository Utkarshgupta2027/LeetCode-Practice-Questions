
import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");

        String s = sc.nextLine();

        // String rev = new StringBuilder(s).reverse().toString();

        char[] arr = s.toCharArray();

        String rev = "";

        for(int i = arr.length - 1; i >= 0; i--){
            rev += arr[i];
        }
        sc.close();
        System.out.println(rev);
    }
}
