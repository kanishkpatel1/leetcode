// O--> open bracketcount
// C --> Close bracket count
// start to generate with openbracket while it less than n 
// and close bracket while it less than open bracket
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        generate("(",1,0,ans,n);
        return ans;
    }
    void generate(String currentStr,int o,int c,List<String> ans,int n){
        if(currentStr.length()==2*n){ 
            // we take 2*n because we have to add n open and n close brackets only 
            // all other small strings we will have to skip
            ans.add(currentStr);
        }
        if(o<n) generate(currentStr+"(",o+1,c,ans,n); // add open braces
        if(c<o) generate(currentStr+")",o,c+1,ans,n); // add close braces
    }
}