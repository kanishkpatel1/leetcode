class Solution {
    public boolean wordPattern(String pattern, String s) {
          String str[]=s.split(" ");
    if(str.length!=pattern.length()){
        return false;
    }

    HashMap<Character,String> hs=new HashMap<>();
  
    for(int i=0;i<pattern.length();i++){
        char key=pattern.charAt(i);
        if(hs.containsKey(key)){ // if key is already present in the hashmap
                if(!hs.get(key).equals(str[i])){ // then check the value of the previous key with the current 
                    // if it not equals with the previous one then retyrn false
                    return false;
                }
        }
        else{
            if(hs.containsValue(str[i])){
                return false;
            }
            hs.put(key, str[i]);
        }
    }
  // System.out.println(hs);
       return true; 
    }
}