class Solution {
    public int minDeletions(String s) {
       int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int ans=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<26;i++){
            while(freq[i]>0){
                if(hs.contains(freq[i])){
                    freq[i]--;
                    ans++;
                }
                else {
                    break;
                }
            }
            if(freq[i]!=0){
            hs.add(freq[i]);
            }
        }
        return ans;
    }
}