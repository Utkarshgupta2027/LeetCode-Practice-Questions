import java.util.Scanner;

public class BestTimetoBuyandSellStock {

    public int BTTBSS(int[] p){
        if(p == null || p.length == 0) return 0;

        int s = p.length;
        int minP = Integer.MAX_VALUE;
        int maxPrice = 0;

        for(int pr : p){
            if(pr < minP){
                minP = pr;
            } else{
                maxPrice = Math.max(maxPrice, pr - minP);
            }
        }
        return maxPrice;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] p = new int[n];

        System.out.println("Enter array Element");

        for(int i = 0; i < n; i++){
            p[i] = sc.nextInt();
        }
        sc.close();

        BestTimetoBuyandSellStock bs = new BestTimetoBuyandSellStock();
       
        System.out.println( "Max profit will be :" + bs.BTTBSS(p));

    }
}
