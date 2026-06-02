
import java.util.Arrays;
import java.util.Scanner;

public class Product_of_Array_Except_Self {

    public int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        ans[0] = 1;

        for(int i = 1; i < n; i++){
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int suffix = 1;
        for(int i = n - 1; i >= 0; i--){
            ans[i] *= suffix;
            suffix *= nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arr:");
        int n  = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter element of array:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        Product_of_Array_Except_Self pes = new Product_of_Array_Except_Self();
        int[] res = pes.productExceptSelf(nums);
        System.out.println("Resultant Array: " + Arrays.toString(res));

        sc.close();
    }
}
