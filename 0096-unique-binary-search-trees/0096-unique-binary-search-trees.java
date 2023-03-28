class Solution {
    
    
    // WE will have to just calculate the nth catalon number in this code
    int catalon(int n){
        int res=0;
        if(n<=1){
            return 1;
        }
        for(int i=0;i<n;i++){
           res+=catalon(i)*catalon(n-i-1); 
        }
        return res;
        
    }
    public int numTrees(int n) {
        return catalon(n);
        
    }
}