class Solution {
 public static  int longestSubstring(String s, int k) {
        Map<Character,Integer>map=new HashMap<>();

        int ans=0;
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

      
    while(ans < s.length() && map.get(s.charAt(ans)) >= k){
        ans++;
    }
    
    if(ans == s.length()){
        return ans;
    }
    
    int left = longestSubstring(s.substring(0,ans),k);
    int right = longestSubstring(s.substring(ans+1),k);
    
    return Math.max(left,right);
    }
}