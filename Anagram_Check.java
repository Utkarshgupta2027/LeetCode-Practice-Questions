
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first srting");
        String s1 = sc.nextLine();

        System.out.println("Enter second string:");
        String s2 = sc.nextLine();

        boolean res = true;
        if(s1.length() != s2.length()) System.out.println(res);

        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();

        for(char c : s1.toCharArray()){
            m1.put(c, m1.getOrDefault(c, 0) + 1);
        }

        
        for(char c : s2.toCharArray()){
            m2.put(c, m2.getOrDefault(c, 0) + 1);
        }

        if(!m1.equals(m2)) res = false;

        System.out.println(res);
        sc.close();
    }
}
