// Time Complexity: O(n * klog(k)) since we are sorting k characters n times in the loop.

// approach-->
// Sort the strings one by one 
// and make a map key is the sorted strings and value is an arraya of strings of  strs  
// and at last combine it in a string
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        
        for(int i=0;i<strs.length;i++){
            String value=strs[i];
            char []ch=value.toCharArray();
            Arrays.sort(ch); 
            String key=new String(ch);
            
            if(map.containsKey(key)){
                map.get(key).add(value);
            }
            else{
                map.put(key,new ArrayList<>());
                map.get(key).add(value);
            }
            
        }
        return new ArrayList<>(map.values());
    }
}