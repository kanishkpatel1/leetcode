class Solution {
    public int minChanges(String s) {
        // min length of the even is 2 so check the same character in the group of 2
        int res=0;
        for(int i=0;i<s.length();i+=2){
            if(s.charAt(i)!=s.charAt(i+1)) res++;
        }
        return res;
    }
}