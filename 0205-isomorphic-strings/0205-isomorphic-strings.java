class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
    
        HashMap<Character,Character> hs=new HashMap<>();
      
        for(int i=0;i<s.length();i++){
            char key=s.charAt(i);
            if(hs.containsKey(key)){ // if key is already present in the hashmap
                    if(!hs.get(key).equals(t.charAt(i))){ // then check the value of the previous key with the current 
                        // if it not equals with the previous one then retyrn false
                        return false;
                    }
            }
            else{
                if(hs.containsValue(t.charAt(i))){
                    return false;
                }
                hs.put(key, t.charAt(i));
            }
        }

        return true; 
    }
}