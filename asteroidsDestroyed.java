import java.util.*;
public class asteroidsDestroyed{
    public boolean asD(int m, int[] as){
        Arrays.sort(as);
        long currM = m;

        for(int a : as){
            if(currM < a){
                return false;
            }
            currM += a;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter mass of planet:");
        int m = sc.nextInt();

        System.out.println("Enter no. of planets :");
        int n = sc.nextInt();

        int[] as = new int[n];
        System.out.println("Enter mass of asteroid:");
        for(int i = 0; i < n; i++){
            as[i] = sc.nextInt();
        }

        asteroidsDestroyed asd = new asteroidsDestroyed();

        System.out.println("Result: " + asd.asD(m, as));
        sc.close();
    }
}