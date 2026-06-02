
import java.util.Scanner;

public class Maximum_Subarray {

    public int maxSubArray(int[] nums){
        int n = nums.length;
        int currS = nums[0];
        int maxS = nums[0];

        for(int i = 1; i < n; i++){
            currS = Math.max(currS, currS + nums[i]);
            maxS = Math.max(maxS, currS);
        }

        return maxS;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arr:");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter elemet of Array:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        Maximum_Subarray ms = new Maximum_Subarray();

        System.out.println("Result:" + ms.maxSubArray(nums));
        sc.close();
    }
}
