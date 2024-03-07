class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        Set<Float> set=new HashSet<>();
        
        int last=nums.length-1;
        for(int i=0;i<nums.length/2;i++){
            set.add((float)(nums[i]+nums[last--])/2);
        }
       return set.size();
    }
}