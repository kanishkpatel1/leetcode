// BruteForce Solution 
// class Solution {
//     public int minimumRecolors(String blocks, int k) {
//         int ans=Integer.MAX_VALUE;
//         for(int i=0;i<=blocks.length()-k;i++){
//            int currcount=0;
//            for(int j=i;j<i+k;j++){
//                if(blocks.charAt(j)=='W'){
//                    currcount++;
                   
//                }
//              }
//            ans=Math.min(ans,currcount);
//        }
//         return ans;
//     }
// }

// Sliding window approach
class Solution {
    public int minimumRecolors(String blocks, int k) {
         int ans=Integer.MAX_VALUE;
        int count=0;
        for(int i=0;i<k;i++){ // calculate 'W' for sliding window k
                if(blocks.charAt(i)=='W'){
                    count++;
                }
            }
        int leftptr=0;
        int rightptr=k;
        ans=Math.min(ans,count);
        while(rightptr<blocks.length()){
            if(blocks.charAt(leftptr++)=='W') count--;  // remove one element from sliding window
            if(blocks.charAt(rightptr++)=='W') count++;  // add one item in sliding window
            if(count==0){
                return 0;
            }
            ans=Math.min(ans,count);
        }
        
         return ans;
            }
      
    }
