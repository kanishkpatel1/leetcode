class Solution {
    public int countSubstrings(String s) {
               boolean [][]dp=new boolean[s.length()][s.length()];
        int count=0;
        // g denotes to gap draw a 2d matrix to visualize it see notes 
        for(int g=0;g<s.length();g++){ 
            for(int i=0,j=g;j<dp.length;i++,j++){ // i denotes to row and j denotes to column and every row start from 0 
                if(g==0){ // it is the base case every single digit is palindromic 
                    dp[i][j]=true;
                    
                }
               else if(g==1){  // it is the second base case means two digits are palindromic if they are same --> aa,bb,cc,dd are same 
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j]=true;
                    }
                    else{
                        dp[i][j]=false;
                    }
                }
                 // when digits are more than two then check first and last digit should be same and inner part will be true means
                // go to the dp[i+1][j-1] and check for true or false
                else{
                   if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==true){
                       dp[i][j]=true;
                   }
                    else{
                       dp[i][j]=false; 
                    }
                    
                }
                if(dp[i][j]){ // if it true then increase the count
                    count++;
                }
            }
        }
        return count;
    }
}


