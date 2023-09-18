class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        HashMap<Integer,Integer> hs=new HashMap<>();
         int[][] rowStrengths = new int[mat.length][2];
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            rowStrengths[i][0]=i;
            rowStrengths[i][1]=count;
      
    }
        
  Arrays.sort(rowStrengths, Comparator.comparingInt(arr -> arr[1]));
        int arr[]=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=rowStrengths[i][0];
        }
        return arr;
       
    } 

        }
    