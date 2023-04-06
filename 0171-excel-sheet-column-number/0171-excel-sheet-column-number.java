 // Take a pen and paper and try to dry run you will understant the logic behind this question
        // And Also try to solve question 168 first (same logic )

class Solution {
    public int titleToNumber(String str) {
        int n=0;
        for(int i=0;i<str.length();i++){
            n=n*26+(str.charAt(i)-'A')+1;
        }
                     return n;
    }
}