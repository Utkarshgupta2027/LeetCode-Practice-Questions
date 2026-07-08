
import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arr:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter element of arr: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        sc.close();

        for(int j = 0; j < n; j++){
            for(int i = 1; i < n; i++){
            if(arr[i] < arr[i - 1]){
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
        }
        }

        System.out.println("Sorted arr: ");
        for(int i : arr){
            System.out.print(i + " ");
        }

    }
}
