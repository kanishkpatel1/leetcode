class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int a=0;
        int max=0;
    
for(int i=0;i<nums.length;i++){
if(nums[i]==1){
    a++;
if(a>max){
    max=a;
}
    
}
else if(nums[i]==0){
    a=0;
}
}       
        return max;
    }
}
