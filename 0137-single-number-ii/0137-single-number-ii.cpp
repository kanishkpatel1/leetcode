// class Solution {
// public:
//     int singleNumber(vector<int>& nums) {
//         unordered_map<int, int> map;
        
//         for (int i = 0; i < nums.size(); i++) {
//             map[nums[i]] = map[nums[i]] + 1;
//         }
        
//         for (auto& pair : map) {
//             if (pair.second == 1) {
//                 return pair.first;
//             }
//         }
        
//         return -1;
//     }
// };
class Solution {
public:
    int singleNumber(vector<int>& arr) {
        int ones = 0;
        int twos = 0;
        
        for (int i = 0; i < arr.size(); i++) {
            int el = arr[i];
            ones = (ones ^ el) & (~twos);
            twos = (twos ^ el) & (~ones);
        }
        
        return ones;
    }
};
