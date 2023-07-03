// Case 1-->  when both the strings are same -->  s= abbc    goal= abbc then swap s[1] to s[2] 

// this condition is for if we have both strings equal then if any two or more characters are same then return the true 
// because we can swap same character so store it in set if there are same character and both strings are same then the 
// length of the set should be less than goal.length(); if it true then return true 

// Case 2 --> when both the strings are not same

// then take two pointer one from start(i) and another one from end (j)
// while we find matched character s.charAt(i)==goal.charAt(i) increase the (i) counter
// while we find matched character s.charAt(j)==goal.charAt(j) decrease the (j) counter
// after it if we find any unmatched character swap them 
// at the end check weather the strings s and goal are equal if they then return true else return false


class Solution {
    public static boolean buddyStrings(String s, String goal) {
        
        if(s.equals(goal)){
            // this condition is for if we have both strings equal then if any two or more characters are same then return the true 
            // because we can swap same character so store it in set if there are same character and both strings are same then the 
            // length of the set should be less than goal.length();
           Set<Character> hs=new HashSet<>();
            for(char ch:s.toCharArray()){
                hs.add(ch);
            }
            return hs.size()<goal.length();
        }
        
        int i=0;
        int j=s.length()-1;
        while(i<j && s.charAt(i)==goal.charAt(i))  i++;
        while(j>=0 && s.charAt(j)==goal.charAt(j)) j--;
        
        if(i<j){ 
        // swapping the unmatched character
           char[] sArr = s.toCharArray();
            char temp = sArr[i];
            sArr[i] = sArr[j];
            sArr[j] = temp;
            s = new String(sArr);
        }
        
           return s.equals(goal);
    }
}