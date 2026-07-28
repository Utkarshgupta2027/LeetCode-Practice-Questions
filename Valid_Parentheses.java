import java.util.Scanner;
import java.util.Stack;

public class Valid_Parentheses {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter parentheses: ");
        String s = sc.nextLine();

        boolean res = true;

        // Odd length can never be valid
        if (s.length() % 2 != 0) {
            res = false;
        }

        Stack<Character> st = new Stack<>();

        if (res) {   // Only check if length is even
            for (char c : s.toCharArray()) {

                if (c == '(' || c == '{' || c == '[') {

                    st.push(c);

                } else {

                    if (st.isEmpty()) {
                        res = false;
                        break;
                    }

                    char top = st.pop();

                    if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {

                        res = false;
                        break;
                    }
                }
            }
        }

        if (!st.isEmpty()) {
            res = false;
        }

        System.out.println(res);

        sc.close();
    }
}