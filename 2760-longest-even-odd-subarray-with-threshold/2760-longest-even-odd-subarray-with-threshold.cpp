class Solution {
public:
    int longestAlternatingSubarray(vector<int>& nums, int threshold) {
        int len1 = 0;
        int max1 = 0;
       
        for (int l = 0; l < nums.size(); ++l) {
            if (nums[l] % 2 == 0 && nums[l] <= threshold) {
                len1 = 1;
                for (int r = l + 1; r < nums.size(); ++r) {
                    if (nums[r] % 2 != nums[r - 1] % 2 && nums[r] <= threshold && nums[r - 1] <= threshold) {
                        len1++;
                    } else {
                        break;
                    }
                }
                max1 = max(max1, len1);
            }
        }
        
        return max1;
    }
};
