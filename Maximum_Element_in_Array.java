

public class Maximum_Element_in_Array {
    public static void main(String[] args) {
        int[] arr = {1,5,7,12,9,4,3,15};

        // Arrays.sort(arr);
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        int m = 0;
        while(l <= r){
            int curr = 0;
            curr = Math.max(arr[l], arr[r]);
            m = Math.max(m, curr);
            l++;
            r--;
        }

        System.out.println("Large element: " + m);
        // System.out.println(arr[n - 1]);
    }
}
