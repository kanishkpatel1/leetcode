class Solution {

    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int max=1;
        int a = nums[0];
        int b = nums[nums.length - 1];
        for (int i = 2; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                max=Math.max(max,i);
            }
        }
        return max;
    }
}
