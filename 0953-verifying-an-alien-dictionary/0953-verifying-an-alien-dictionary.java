class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int []map=new int[26];
        int seq=0;
        for(char ch:order.toCharArray()){
            map[ch-'a']=seq++;
        }
        
        
        for(int i=0;i<words.length-1;i++){
            String curr=words[i];
            String next=words[i+1];
            
            int len1=curr.length();
            int len2=next.length();
            int len=Math.min(len1,len2);
            
            if((len!=len1)&&(len==len2)&& curr.startsWith(next)){
                return false;
            }
            
            for(int j=0;j<len;j++){
                if(map[curr.charAt(j)-'a']>map[next.charAt(j)-'a']){
                    return false;
                }
            if(map[curr.charAt(j)-'a']<map[next.charAt(j)-'a']){
                break;
            }
            }
        }
        return true;
    }
}