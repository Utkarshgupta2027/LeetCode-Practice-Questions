
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum{
    public int[] twosum(int[] arr, int target){
        int n = arr.length;
        int[] ans = new int[2];
        if(n < 2) return ans;
        
        int l = 0;
        int r = n - 1;
        while(l < r){
            int sum = 0;
            sum += arr[l] + arr[r];
            if(sum == target) {
                ans[0] = l;
                ans[1] = r;
                return ans;
            }
           if(sum < target){
            l++;
           } else {
            r--;
           }
        }

        return ans;

        //The time complexity of the corrected Two-Sum code is \(O(N)\) (Linear Time), where \(N\) is the number of elements in the array.
    }
    //optimized
    public int[] twosumOP(int[] arr, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                ans[0] = map.get(complement);
                ans[1] = i;
                return ans;
            }

            map.put(arr[i], i);
        }

        return ans;
        //This approach achieves a \(O(N)\) time complexity and works perfectly without needing to sort the array first.
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int s = sc.nextInt();
        System.out.println("Enter Array:");
        int[] arr = new int[s];
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target");
        int target = sc.nextInt();
        TwoSum ts = new TwoSum();

        int[] res = ts.twosum(arr, target);

        System.out.println(Arrays.toString(res));

        sc.close();
    }
}