class Solution {
    public int[][] generateMatrix(int n) {
        int top=0,bottom=n-1,left=0,right=n-1,d=0;
        int [][] matrix=new int[n][n];
        int val=1;
        while(left<=right && top<=bottom){
            if(d==0){
                
                for(int i=left;i<=right;i++){
                    matrix[top][i]=val++;
                }
                d=1;
                top++;
            }
            else if(d==1){
               
                for(int i=top;i<=bottom;i++){
                    matrix[i][right]=val++;
                }
                right--;
                 d=2;
            }
            else if(d==2){
                 for(int i=right;i>=left;i--){
                    matrix[bottom][i]=val++;
                }
               d=3; 
                bottom--;
            }
            else if(d==3){
                 for(int i=bottom;i>=top;i--){
                    matrix[i][left]=val++;
                }
               d=0; 
                left++;
            }
        }
        return matrix;
    }
}