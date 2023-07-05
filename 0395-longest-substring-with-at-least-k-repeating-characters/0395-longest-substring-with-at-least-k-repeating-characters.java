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
// In the provided solution, recursion is used to divide the string into smaller substrings and find the length of the longest substring that satisfies the given condition.

// The main idea behind the recursion is as follows:

// The initial call to longestSubstring is made with the entire string s and the minimum frequency k.

// Inside the function, a Map<Character, Integer> named map is used to store the frequency of each character in the string s. This step is necessary to determine the frequency of each character in the current substring.

// Next, a loop is used to find the length of the longest contiguous substring from the beginning of s where the frequency of each character is greater than or equal to k. The loop increments the ans variable until the frequency of the character at index ans becomes less than k.

// If the value of ans becomes equal to the length of the string s, it means that the entire string satisfies the condition. In this case, the function returns ans.

// If the value of ans is less than the length of s, it means that there is at least one character in the substring at index ans with a frequency less than k. The string s is then divided into two parts: s.substring(0, ans) and s.substring(ans + 1).

// The function is recursively called for the left and right substrings obtained in the previous step: longestSubstring(s.substring(0, ans), k) and longestSubstring(s.substring(ans + 1), k).

// Finally, the function returns the maximum length obtained from the left and right substrings by using the Math.max function.

// By recursively dividing the string into smaller parts, the function explores all possible substrings and returns the length of the longest substring that satisfies the given condition