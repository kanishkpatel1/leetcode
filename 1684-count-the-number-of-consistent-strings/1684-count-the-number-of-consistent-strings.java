class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int res=0;
        for(String str:words){
            int count=0;
            for(int i=0;i<str.length();i++){
                if(allowed.contains(""+str.charAt(i))) count++;
                
            }
            
            if(count==str.length()) res++;
                   
        }
        return res;
    }
}