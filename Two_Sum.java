public class Two_Sum {
    public static void main(String[] args) {
        int[] arr = {1,5,4,3,2,8};
        int t = 7;

        int[] ans = new int[2];

        int l = 0;
        int r = arr.length - 1;

        while(l < r){
            int sum = arr[l] + arr[r];
            if(sum == t) {
                ans[0] = l;
                ans[1] = r;
                break;
            }
            l++;
            r--;
        }

        for(int i : ans) {
            System.out.print(i + " ");
        }
    }
}
