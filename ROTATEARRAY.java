
import java.util.Scanner;

public class ROTATEARRAY {

    public int[] rotatearray(int[] arr, int k){
        
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Enter size of arr: ");
        int n = sc.nextInt();

        System.out.println("Enter element of array: ");
        int[] arr= new int[n];

        System.out.println("enter value of k:");
        int k = sc.nextInt();
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

    }
}
