class Solution {
    
    void dfs(int[][] image,int sr,int sc,int color,int rows,int columns,int source){
        if(sr<0 || sc<0 || sr>=rows || sc>=columns){
            return;
        }
        else if(image[sr][sc]!=source){
            return;
        }
        image[sr][sc]=color;
        dfs(image,sr-1,sc,color,rows,columns,source);
        dfs(image,sr+1,sc,color,rows,columns,source);
        dfs(image,sr,sc-1,color,rows,columns,source);
        dfs(image,sr,sc+1,color,rows,columns,source);
    }
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(color==image[sr][sc]){
            return image;
        }
        int rows=image.length;
        int columns=image[0].length;
        int source=image[sr][sc];
        dfs(image,sr,sc,color,rows,columns,source);
        return image;
        
    }
}