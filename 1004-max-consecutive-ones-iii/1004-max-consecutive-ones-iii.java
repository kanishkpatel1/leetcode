// it can be solved using two pointer and sliding also but best is using que

// Approach Sliding window--> See the hints you will get this approach
class Solution {
    public int longestOnes(int[] nums, int k) {
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
         return ans;
    }
}
        
// Approach -->
//Store the index of 0 in the que when size of the que is equal to k then calculate the ans and remove first index of zero 
// class Solution {
//     public int longestOnes(int[] nums, int k) {
//         int ans=0;
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
//         return ans;
//     }
// }