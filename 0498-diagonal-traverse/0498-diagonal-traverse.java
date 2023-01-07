
class Solution {
    
    //  Time Complexity = O(N*M)
    //  Space Complexity = O(N*M)
    
    public int[] findDiagonalOrder(int[][] mat) {
        
		//  Edge Cases
        if (mat == null) {
            throw new IllegalArgumentException("Input matrix is null");
        }
        if (mat.length == 0 || mat[0].length == 0) {
            return new int[0];
        }
        //  Length of rows and columns
        int rows = mat.length;
        int columns = mat[0].length;
		
        //  Resultant Array to put the Diagonal traversal of the given matrix          
        int[] result = new int[rows*columns];
		//  row and column pointers
        int r = 0, c = 0 ;
        
        for(int i = 0 ; i < result.length ; ++i){
            result[i] = mat[r][c];
            //  if sum of row and column is even
            if( (r+c)%2 == 0){
                if(c == columns-1){
                    ++r;
                }
                else if(r == 0){
                    ++c;
                }   
                else{
                    --r;++c;
                }
            }
			//  if sum of row and column is odd
			else{
                if(r == rows-1){
                    ++c;
                }    
                else if (c == 0){
                    ++r;
                }   
                else{
                    ++r;--c;
                }
            } 
        }
        return result;
    }
}