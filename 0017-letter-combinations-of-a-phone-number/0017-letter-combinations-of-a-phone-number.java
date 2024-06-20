class Solution {
Map<String,String>map=new HashMap<String,String>(){{
    put("2","abc");
    put("3","def");
    put("4","ghi");
    put("5","jkl");
    put("6","mno");
    put("7","pqrs");
    put("8","tuv");
    put("9","wxyz");
}};
     List<String> op=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length()!=0)
         backtrack("",digits);
            return op;
    }
       
   
        public void backtrack(String cmb,String nd){
            if(nd.length()==0) op.add(cmb);
            else{
                String digit=nd.substring(0,1);
                String letters=map.get(digit);
                for(int i=0;i<letters.length();i++){
                    String letter=letters.substring(i,i+1);
                    backtrack(cmb+letter,nd.substring(1));
                }
            }
        }
    }
