class Solution {
    public int longestSubarray(int[] nums) {
         int k=1;
           int ans=0;
        int j=0;
        Queue<Integer> que=new ArrayDeque<>();
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                que.add(i);
            }
            if(que.size()==k+1){ 
                j=que.remove()+1;
            }
            
            ans=Math.max(i-j+1,ans);
        }
        return ans-1;
    }
}