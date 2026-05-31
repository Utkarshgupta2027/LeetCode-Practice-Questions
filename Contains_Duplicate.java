import java.util.HashSet;
import java.util.Scanner;

public class Contains_Duplicate {

    public boolean cd(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        for(int n : arr){
            if(!set.add(n)) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arr:");
        int s = sc.nextInt();
        System.out.println("Enter element of arr:");
        int[] arr = new int[s];

        for(int i = 0; i < s; i++){
            arr[i] = sc.nextInt();
        }

        Contains_Duplicate cds = new Contains_Duplicate();

        System.out.println("Result: " + cds.cd(arr));
        sc.close();
    }
}
