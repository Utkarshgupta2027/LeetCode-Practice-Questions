import java.util.*;
public class Second_Largest_Element {
    public static void main(String[] args) {
            int[] arr = {1,5,7,12,9,4,3,15};

        Arrays.sort(arr);
        int n = arr.length;

        System.out.println("Sec element: " + arr[n - 2]);
    }
}
