// we will have to check in rows and columns 

class Solution {
    public boolean checkValid(int[][] matrix) {
         Set<String> hs=new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
               if(!hs.add(i+"r"+matrix[i][j]) || !hs.add(j+"c"+matrix[i][j])){
                return false;
            }
            }
           
        }
        return true;
    }
}