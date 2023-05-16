class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        int []freq1=new int[26];
        for(int i=0;i<word1.length();i++){
            int c=word1.charAt(i)-'a';
            freq1[c]++;
        }
        int []freq2=new int[26];
        for(int i=0;i<word2.length();i++){
            int c=word2.charAt(i)-'a';
            freq2[c]++;
        }
        
        
        for(int i=0;i<26;i++){  
            // this step will check if a character is present in string 1 and not in string 2 means 
            // value on freq1[i]==0 and freq2[i]!=0 then we will simply return 0 
            if((freq1[i]==0 && freq2[i]!=0)||(freq1[i]!=0 && freq2[i]==0)){
                return false;
            }
        }
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        
      
        return Arrays.equals(freq1,freq2);
        
    }
}