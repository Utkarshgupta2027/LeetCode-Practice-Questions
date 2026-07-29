
import java.util.Arrays;
import java.util.Scanner;

public class Merge_Two_Sorted_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a1 = {1,3,5};
        int[] a2 = {2,4,6};

        int[] ans = new int[a1.length + a2.length];

        System.arraycopy(a1, 0, ans, 0, a1.length);

        System.arraycopy(a2, 0, ans, a1.length, a2.length);

        Arrays.sort(ans);

        System.out.println(Arrays.toString(ans));
       
    }
}
