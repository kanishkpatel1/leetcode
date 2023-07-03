class Solution {
public:
  vector<vector<int>> findPrimePairs(int n) {
        // steive of eratharos
        vector<bool> vis(n + 1, true);
        for (int i = 2; i * i <= n; i++){
            if (vis[i]){
                for (int j = 2 * i; j <= n; j += i){
                    vis[j] = false;
                }
            }        
        }
        
        vector<vector<int>> ans;
        
        for (int i = 2; i <= n / 2; i++){
            int x = i;
            int y = n - i;
            
            if (vis[x] && vis[y] && x <= y){
                ans.push_back({x, y});
            }
        }
        
        return ans;
    }
};