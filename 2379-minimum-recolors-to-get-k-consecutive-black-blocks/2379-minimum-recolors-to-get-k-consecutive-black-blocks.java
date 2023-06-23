class Solution {
    public int minimumRecolors(String blocks, int k) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<=blocks.length()-k;i++){
           int currcount=0;
           for(int j=i;j<i+k;j++){
               if(blocks.charAt(j)=='W'){
                   currcount++;
                   
               }
             }
           ans=Math.min(ans,currcount);
       }
        return ans;
    }
}