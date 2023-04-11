class Solution {
    public String removeStars(String s) {
           String str="";
        List<Character> ls=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                ls.remove(ls.size()-1);
            }
            else{
                ls.add(s.charAt(i));
            }
        }
        for(int i=0;i<ls.size();i++){
            str+=ls.get(i);
        }
        return str;
    }
}