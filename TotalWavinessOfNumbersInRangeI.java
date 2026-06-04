import java.util.Scanner;

public class TotalWavinessOfNumbersInRangeI {

    public int totalWaviness(int num1, int num2) {
        int ans = 0;

        for (int x = num1; x <= num2; x++) {
            ans += waviness(x);
        }

        return ans;
    }

    private int waviness(int x) {
        String s = Integer.toString(x);

        int c = 0;

        for (int i = 1; i < s.length() - 1; i++) {
            char cur = s.charAt(i);

            if ((cur > s.charAt(i - 1) && cur > s.charAt(i + 1))
                    || (cur < s.charAt(i - 1) && cur < s.charAt(i + 1))) {
                c++;
            }
        }

        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        TotalWavinessOfNumbersInRangeI obj =
                new TotalWavinessOfNumbersInRangeI();

        System.out.println(obj.totalWaviness(num1, num2));

        sc.close();
    }
}