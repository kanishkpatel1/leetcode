class Solution {
    public String convertToTitle(int n) {
        
        // Take a pen and paper and try to dry run you will understant the logic behind this question
        // And Also try to solve question 171 same logic 
        StringBuilder sb=new StringBuilder();
        while(n>0){
            n--;
            sb.append((char)('A'+n%26));
            n=n/26;
        }
        sb.reverse();
        return sb.toString();
    }
}