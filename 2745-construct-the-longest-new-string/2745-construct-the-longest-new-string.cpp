class Solution {
public:
    int longestString(int x, int y, int z) {
            int u=min(x,y);
        return (x==y)?((z+2*u)*2):((1+z+2*u)*2);
    }
};