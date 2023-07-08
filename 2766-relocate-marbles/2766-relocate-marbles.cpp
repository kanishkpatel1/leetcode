
class Solution {
public:
    std::vector<int> relocateMarbles(std::vector<int>& nums, std::vector<int>& moveFrom, std::vector<int>& moveTo) {
        std::unordered_set<int> op;
        for (int el : nums) {
            op.insert(el);
        }
        for (int lp = 0; lp < moveFrom.size(); lp++) {
            if (op.count(moveFrom[lp])) {
                op.erase(moveFrom[lp]);
                op.insert(moveTo[lp]);
            }
        }
        std::vector<int> ans(op.begin(), op.end());
        std::sort(ans.begin(), ans.end());
        return ans;
    }
};
