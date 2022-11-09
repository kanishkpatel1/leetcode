class Solution {

    public int findGCD(int[] nums) {
        Arrays.sort(nums);
       // int max=1;
        int a = nums[0];
        int b = nums[nums.length - 1];
        for (int i = a; i >= 2; i--) {  
            // because we have to return the greatest common divisor of array 
            //and if it not then return 1 because 1 is divisible by both
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
