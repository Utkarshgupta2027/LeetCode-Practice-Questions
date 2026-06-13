
import java.util.Scanner;

public class MissingNumber {
    
    public int missingnum(int[] arr){
        int n = arr.length;

        int exp = n * (n + 1) / 2;
        int actualsum = 0;

        for(int i : arr){
            actualsum += i;
        }

        return exp - actualsum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of arr: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter element of arr:");
        for(int  i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        MissingNumber mn = new MissingNumber();
        sc.close();
        System.out.println("Missed number is: " + mn.missingnum(arr));
    }
}
