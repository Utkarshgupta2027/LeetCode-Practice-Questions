
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Count_Character_Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: "); 
        String s = sc.nextLine();

        sc.close();

        Map<Character, Integer> freq = new HashMap<>();
        

        for(char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        for(Character key : freq.keySet()) {
            System.out.println(key + ":" + freq.get(key));
        }
    }
}
