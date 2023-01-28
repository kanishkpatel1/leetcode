class Solution {
    public int balancedStringSplit(String s) {
        
        int count=0;
        int res=0;
        for(char ch:s.toCharArray()){
            if(ch=='R'){
                count++;
            }
            if(ch=='L'){
                count--;
            }
            if(count==0){
                res++;
            }
        }
        return res;
    }
}