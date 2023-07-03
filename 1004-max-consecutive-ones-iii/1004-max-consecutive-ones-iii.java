// it can be solved using two pointer and sliding also but best is using que

// Approach -->
//Store the index of 0 in the que when size of the que is equal to k then calculate the ans and remove first index of zero 
class Solution {
    public int longestOnes(int[] nums, int k) {
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
        return ans;
    }
}