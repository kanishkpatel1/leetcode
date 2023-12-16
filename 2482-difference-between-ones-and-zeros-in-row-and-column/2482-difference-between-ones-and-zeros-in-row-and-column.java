class Solution {
     public static int[][] onesMinusZeros(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int rones[]=new int[m];
        int cones[]=new int[n];
        int res[][]=new int[m][n];
        for (int i = 0; i < m; i++) {
           for(int j=0;j<n;j++){
            if(grid[i][j]==1){
                rones[i]++;
                cones[j]++;
            }
           }

        }
        // System.out.println(Arrays.toString(rones));
        // System.out.println(Arrays.toString(cones));

         for (int i = 0; i < m; i++) {
           for(int j=0;j<n;j++){
            res[i][j]=(2*rones[i]-m)+(2*cones[j]-n);
           }
        }
        return res;
    }
}