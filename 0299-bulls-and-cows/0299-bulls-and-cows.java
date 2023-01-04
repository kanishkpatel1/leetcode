class Solution {
    public String getHint(String secret, String guess) {
       // we'll use frequency array approach
        int len=secret.length(); // length of both strings are same
        
        int[] s=new int[10];
        int[] g=new int[10];
        int bulls=0,cows=0;
        for(int i=0;i<len;i++){
            if(secret.charAt(i)==guess.charAt(i)){
                bulls++;
            }
            else{
                s[secret.charAt(i)-'0']++;
                g[guess.charAt(i)-'0']++;
            }
        }
        
        for(int i=0;i<10;i++){
            // minimum value of each array will be 
            //the value of cows
        cows+=Math.min(s[i],g[i]);
        
        }
        return (bulls+"A"+cows+"B");
    }
}