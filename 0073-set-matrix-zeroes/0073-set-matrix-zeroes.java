class Solution {
    public void setZeroes(int[][] matrix) {
  int l1=matrix.length;
  int l2=matrix[0].length;
ArrayList<ArrayList<Integer>> arr1=new ArrayList<>();
        for(int i=0;i<l1;i++){
            for(int j=0;j<l2;j++){
                if(matrix[i][j]==0){
                    ArrayList<Integer> arr2=new ArrayList<>();
                    arr2.add(i);
                    arr2.add(j);
                    arr1.add(arr2);
                }
            }
        }
        for(int i=0;i<arr1.size();i++){
            for(int j=0;j<l2;j++){
                matrix[arr1.get(i).get(0)][j]=0;
                
            }
            for(int j=0;j<l1;j++){
                matrix[j][arr1.get(i).get(1)]=0;
            }
        }
}
}