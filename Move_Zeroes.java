
import java.util.Arrays;
import java.util.Scanner;

public class Move_Zeroes {
    public int[] moveZeroes(int[] nums) {

    int j = 0;

    // Non-zero elements ko front me place karo
    for(int i = 0; i < nums.length; i++) {
        if(nums[i] != 0) {
            nums[j] = nums[i];
            j++;
        }
    }

    // Remaining positions ko 0 se fill karo
    while(j < nums.length) {
        nums[j] = 0;
        j++;
    }

    return nums;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int  n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elemet of array:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        Move_Zeroes mz = new Move_Zeroes();

        int[] res = mz.moveZeroes(nums);

        System.out.println("Result: " + Arrays.toString(res));
        sc.close();
    }
}

