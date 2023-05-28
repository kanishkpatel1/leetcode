class Solution {
    public long minimumCost(String s) {
        int n = s.length();
        long ans=0;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                ans+=Math.min(i+1,n-i-1);
            }
        }
        return ans;
    }
}
