class Solution {
    public int differenceOfSum(int[] nums) {
       int sumar=0;
        int sumdi=0;
        for(int i=0;i<nums.length;i++){
            sumar+=nums[i];
            if(nums[i]>=10){
                int a=nums[i];
                while(a>0){
                    sumdi+=a%10;
                    a=a/10;
                }
            }
            else{
                sumdi+=nums[i];
            }
        }
        return Math.abs(sumdi - sumar);
    }
}