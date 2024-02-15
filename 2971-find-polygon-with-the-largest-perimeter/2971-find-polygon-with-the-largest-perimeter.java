class Solution {
    public long largestPerimeter(int[] nums) {
        long resarr[] = new long[nums.length];
        Arrays.sort(nums);
        resarr[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            resarr[i] = resarr[i - 1] + nums[i];
        }
        int len = nums.length - 1;
        while (len > 0) {
            if (nums[len] < resarr[len - 1])
                return nums[len] + resarr[len - 1];
            len--;
        }
        return -1;
    }
}