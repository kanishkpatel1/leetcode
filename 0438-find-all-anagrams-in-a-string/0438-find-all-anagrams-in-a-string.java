class Solution {
    
   public boolean isEqual(int s[],int[] p){   // function to check freq of two strings
        for(int i=0;i<26;i++)
            if(s[i]!=p[i])
                return false;
        return true;
    }
    
    public List<Integer> findAnagrams(String s, String p) {
               List<Integer> ls=new ArrayList<>();
         if(s.length()<p.length())
            return ls;
        int[] sFreq=new int[26];
        int[] pFreq=new int[26];
        for(int j=0;j<p.length();j++)
        { sFreq[s.charAt(j)-'a']++;
          pFreq[p.charAt(j)-'a']++;   
        }
        

      
        for( int i=0;i<s.length()-p.length();i++){
            // checking if they are equal add startIndex which is i in the list
            if(isEqual(sFreq,pFreq)){
               ls.add(i);
            }
            // removing the firstCharacter
             sFreq[s.charAt(i)-'a']--;
            // adding the lastCharacter
             sFreq[s.charAt(i+p.length())-'a']++;  
        }
        // at last we coming out of loop again check if they are equal add i index to the list
        if(isEqual(sFreq,pFreq))
        { ls.add(s.length()-p.length());  // last index of last sliding window
        }
        
        
        return ls; 
    }

}