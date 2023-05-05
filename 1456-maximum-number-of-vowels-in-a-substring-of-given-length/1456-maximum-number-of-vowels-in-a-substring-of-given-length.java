class Solution {
    public int maxVowels(String s, int k) {
        int len = s.length();
        int max = 0;
        int vowels = 0;
       
        for(int i = 0;i<len;i++){
            char ch = s.charAt(i);
            if(checkisVowel(ch)) vowels++;
            if(i >= k){//deleting the char of previous window
                char oldch = s.charAt(i - k);
                if(checkisVowel(oldch)) vowels--; 
            }
            max = Math.max(max,vowels); 
        }
        return max;
    }
    boolean checkisVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;
        return false;     
    }
}