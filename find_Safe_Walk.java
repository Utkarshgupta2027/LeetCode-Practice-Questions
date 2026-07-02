public class find_Safe_Walk{
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        
        int m = grid.size();
        int n = grid.get(0).size();

        int sh = health - grid.get(0).get(0);

        if(sh <= 0) return false;

        int[][] best = new int[m][n];
        for(int[] row : best)
            Arrays.fill(row, - 1);

        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{0, 0, sh});
        best[0][0] = sh;

        int[][] dir = {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1}
        };
        
        while(!q.isEmpty()){
            int[] cur = q.poll();

            int r = cur[0];
            int c = cur[1];
            int curH = cur[2];

            if(r == m - 1 && c == n - 1)
                return true;

            for(int[] d : dir){
                int nr = r + d[0];
                int nc = c + d[1];

                if(nr < 0 || nc < 0 || nr >= m || nc >= n)
                    continue;

                int newH = curH - grid.get(nr).get(nc);

                if(newH <= 0)
                    continue;

                if(newH > best[nr][nc]){
                    best[nr][nc] = newH;
                    q.offer(new int[]{nr, nc, newH});
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        find_Safe_Walk obj = new find_Safe_Walk();

        List<List<Integer>> grid = new ArrayList<>();

        grid.add(Arrays.asList(0, 1, 0, 0, 0));
        grid.add(Arrays.asList(0, 1, 0, 1, 0));
        grid.add(Arrays.asList(0, 0, 0, 1, 0));

        int health = 1;

        boolean ans = obj.findSafeWalk(grid, health);

        System.out.println("Can reach destination: " + ans);
    }
}
}