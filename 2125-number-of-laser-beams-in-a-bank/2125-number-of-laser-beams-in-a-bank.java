// In this code first we calculate the number of ones in present  line poc(previous one count) and then multiply that with the number of ones in the another lines  coc (current one count)

// because the number of laser beams is equal to the ===> coc*poc 

class Solution {
    public int numberOfBeams(String[] bank) {
      
        int poc=0;
        // poc: previous one count
        int ans=0;
        for(String s:bank){
            int coc=0;
            // coc: current one count
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='1'){
                    coc++;
           }
            }
             if(coc>0){
                ans+=coc*poc;
                poc=coc;
                    
                }
        }
        return ans;
    }
}