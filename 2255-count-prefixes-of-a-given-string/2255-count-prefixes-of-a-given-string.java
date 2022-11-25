class Solution {
    public int countPrefixes(String[] words, String s) {
            int count=0;
        for(int i=0;i<words.length;i++){
            int sum=0;
            int a=Math.min(words[i].length(), s.length());
            for(int j=0;j<a;j++){
                if(words[i].length()<=s.length()){
                if(words[i].charAt(j)==s.charAt(j)){
                        sum++;
                        //System.out.println(sum);
                }
            }
            }
                if(sum==a){
                    count++;
                    
                }
                sum=0;
                
            }
        
        return count;
    }
}