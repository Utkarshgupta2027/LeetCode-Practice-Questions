
import java.util.Scanner;

public class Binary_Search {
    public int BinarySearch(int[] arr, int l, int r, int t){
        if( l > r) return  -1;
        int mid = l + (r - l )/ 2;
        if(arr[mid] == t) return mid;

        if(arr[mid] > t) return BinarySearch(arr, l, mid -1, t);

        return BinarySearch(arr, mid + 1, r, t);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = {1,2,3,4,5,6,7,8};

        Binary_Search bs = new Binary_Search();
        System.out.println("Enter target:");
        int t = sc.nextInt();
        int l = 0;
        int r = arr.length  - 1;

        System.out.println(bs.BinarySearch(arr, l, r, t));
    }
}
