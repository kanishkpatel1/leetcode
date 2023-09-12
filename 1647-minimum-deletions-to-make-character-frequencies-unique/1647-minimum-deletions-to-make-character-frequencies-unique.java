class Solution {
    public int minDeletions(String s) {
       int freq[]=new int[26];
        // calculate freq of each chars
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int ans=0;
        
        HashSet<Integer> hs=new HashSet<>();
        
        for(int i=0;i<26;i++){
            while(freq[i]>0){
                // check if the freq of the current char is present in the hs or not 
                // if present decrease it until the freq[i] become 0 or not contains in hs 
                if(hs.contains(freq[i])){
                    freq[i]--;
                    ans++;
                }
                else {
                    break;
                }
            }
            // after decreasing the frequency if it is not 0 then push it to the hashset
            if(freq[i]!=0){
            hs.add(freq[i]);
            }
        }
        return ans;
    }
}