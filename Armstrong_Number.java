import java.util.Arrays;
import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number 1: ");
        int n = sc.nextInt();

        System.out.println("enter number 2: ");
        int m = sc.nextInt();

        String s1 = Integer.toString(n);
        String s2 = Integer.toString(m);

        boolean res = true;

        if(s1.length() != s2.length()) res = false;

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if(!Arrays.equals(c1, c2)) res =  false;

        System.out.println(res);

        sc.close();


    }
}
