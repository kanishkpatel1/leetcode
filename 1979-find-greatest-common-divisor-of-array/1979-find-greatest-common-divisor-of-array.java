class Solution {

    public int findGCD(int[] nums) {
        Arrays.sort(nums);
       // int max=1;
        int a = nums[0];
        int b = nums[nums.length - 1];
        for (int i = a; i >= 2; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
