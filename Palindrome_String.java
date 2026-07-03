
import java.util.Scanner;

public class Palindrome_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();

        String temp = s;

        String rev = new StringBuilder(s).reverse().toString();

        if(temp.equals(rev)){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
    }
}
