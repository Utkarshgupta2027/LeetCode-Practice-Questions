
import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String :" + " ");
        String s = sc.nextLine();

        int ans = 0;
        if(s == null || s.length() == 0) {
            ans = 0;
        }

        int n = s.length();
        int maxL = 0;

        HashSet<Character> set = new HashSet<>();

        int l = 0;
        
        for (int r = 0; r < n; r++) {
            char currc = s.charAt(r);
            while(set.contains(currc)) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(currc);
            maxL = Math.max(maxL, r - l + 1);
        }

        ans = maxL;
        System.out.println("Output: " + ans);
    }
}
