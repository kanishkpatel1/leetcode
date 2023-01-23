class Solution {
public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++) {
            int low=i+1;
            int high=nums.length-1;
            if(i>0 && nums[i]==nums[i-1]) {
                continue;
            }
            while(low<high) {
                if(nums[low]+nums[high]==-nums[i]) {
                    res.add(Arrays.asList(nums[low],nums[high],nums[i]));
					//skip same elements
                    while(low<high&&nums[low]==nums[low+1]) {
                        low++;
                    }
					//skip same elements
                    while(low<high&&nums[high]==nums[high-1]) {
                        high--;
                    }
                    low++;
                    high--;
                } else if(nums[low]+nums[high]>-nums[i]) {
                    high--;
                } else {
                    low++;
                }
            }
        }
        return res;
    }
}