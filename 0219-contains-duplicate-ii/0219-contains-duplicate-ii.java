// In this code maintain a sliding window from i to k and if any elements find duplicate return true 
// else return false

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
        if(i>k){
        hs.remove(nums[i-k-1]);  //remove element out of sliding window    
        }
            if(!hs.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}