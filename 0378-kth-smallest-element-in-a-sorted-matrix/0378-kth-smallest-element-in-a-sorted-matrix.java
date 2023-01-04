class Solution {
    public int kthSmallest(int[][] matrix, int k) {
       int a=matrix.length;
        int n=a*a;
        int t=0;
        int[] arr=new int[n];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                arr[t++]=matrix[i][j];
                
            }
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}