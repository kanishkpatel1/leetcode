// In this code maintain a sliding window from i to k and if any elements find duplicate (from index i to k) return true 
// else return false

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Use Hashset to add Integers
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
        if(i>k){
        hs.remove(nums[i-k-1]);  
//remove element out of sliding window (when slidin window full)    
        }
            if(!hs.add(nums[i])){ 
    // if any element will not be added in the set it means that it is already in the set (and it is within range from i-k ) so return true
                return true;
            }
        }
        return false;
    }
}