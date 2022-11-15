class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0; //left
        int r=0;  // right
        int max=0;
        Set<Character> check=new HashSet();  //for checking duplicate elements
        // we can use frequency array to keep trace of duplicate elements but hash set is easier approach
        while(r<s.length()){
            char c=s.charAt(r);
            if(check.add(c)){
                max=Math.max(max,r-l+1);
                r++;
            }
            else{
                while(s.charAt(l)!=c){
                    check.remove(s.charAt(l));
                    l++;
                }
                check.remove(c);
                l++;
            }
        }
        return max;
    }
}