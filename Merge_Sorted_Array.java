
import java.util.Arrays;
import java.util.Scanner;

public class Merge_Sorted_Array {
    
   public int[] merge(int[] nums1, int m, int[] nums2, int n){
        int i = m  -  1;
        int j = n - 1;
        int k = m + n - 1;

        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while(j >= 0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }

        return nums1;
   }
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of nums1 arr:");
        int m = sc.nextInt();
        System.out.println("Enter size of nums2 Arr:");
        int n = sc.nextInt();
        int[] nums1 = new int[m + n];
        System.out.println("Enter element of nums1 arr:");
        for(int i = 0; i < m; i++){
            nums1[i] = sc.nextInt();
        }

        
        int[] nums2 = new int[n];
        System.out.println("Enter element of nums2 aRRAY:");
        for(int i = 0; i < n; i++){
            nums2[i] = sc.nextInt();
         }
         sc.close();
         Merge_Sorted_Array msa = new Merge_Sorted_Array();

         int[] res = msa.merge(nums1, m, nums2, n);

         System.out.println("RESULT IS: " + Arrays.toString(res));

   }
}
