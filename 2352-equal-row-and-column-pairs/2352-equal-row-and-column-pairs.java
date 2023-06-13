class Solution {
    public int equalPairs(int[][] grid) {
        int n=grid.length;
        int transposegrid[][]=new int[n][n];
        int count=0;
        transpose(grid,transposegrid);
        for(int i=0;i<n;i++){
            for(int j=0;j<grid[0].length;j++){
                // check every original row with its transpose matrix if equal then increase the count
                if(Arrays.equals(grid[i], transposegrid[j])){  
                    count++;
                }
            }
        }
        return count;
    }
    public void transpose(int[][] grid,int[][] transposegrid){  // function for transposing the matrix
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                transposegrid[j][i]=grid[i][j];
            }
        }
    }
}