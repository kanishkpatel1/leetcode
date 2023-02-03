class Solution {
    public int countElements(int[] nums) {
        
        // first see hints of the que then you will understand the solution
        Arrays.sort(nums);
        int a=nums[0];
        int b=nums[nums.length-1];
        int count=0;
        int s=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                s++;
            }
        }
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==a||nums[i]==b){
                count++;
            }
        }
        if(nums.length==s){
            return 0;
        }
        else{
            return nums.length-count;
        }
    }
}