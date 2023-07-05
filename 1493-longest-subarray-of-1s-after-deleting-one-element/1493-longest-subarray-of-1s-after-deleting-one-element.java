// it is same like problem no-->  1004. Max Consecutive Ones III  
// in this we just need to set the value of k to 1 and return ans-1 because in it we are deleting the 0 
// approach 1--> 
class Solution {
    public int longestSubarray(int[] nums) {
        int k=1;
          int left=0;
        int ans=0;
        int current=0;
        int a=0;
        
        while(current<k && a<nums.length){ // for first window 
            if(nums[a]==0){ current++;}
             a++;
        }
        
     ans=Math.max(a,ans); // for that cases where first window is max
        
     for(int right = a;right<nums.length;right++){
            //if we find a 0, we update our current
            if(nums[right]==0){ current++; }
            //if we find more than 2 0's, we need to adjust window
            while(current > k){
                if(nums[left]==0){ current--;}
                left++;
            }
             //update the lenght of our subarray every iteration to
            //to find the maximum length
            ans = Math.max(ans, right-left+1);
    
         }
         return ans-1;
    }
}
// Approach 2--> 
// class Solution {
//     public int longestSubarray(int[] nums) {
//          int k=1;
//            int ans=0;
//         int j=0;
//         Queue<Integer> que=new ArrayDeque<>();
        
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==0){
//                 que.add(i);
//             }
//             if(que.size()==k+1){ 
//                 j=que.remove()+1;
//             }
            
//             ans=Math.max(i-j+1,ans);
//         }
//         return ans-1;
//     }
// }