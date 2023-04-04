class Solution {
    public int partitionString(String s) {
        int count=1;
        Set<Character> hs=new HashSet<>();
        for(Character ch:s.toCharArray()){
            if(!hs.contains(ch)){
                hs.add(ch);
            }
            else{
                hs.clear();
                hs.add(ch);
                count++;
            }
        }
        return count;
    }
}