class Solution {
    public int minDeletionSize(String[] str) {
        
        int res=0;
        int word=str.length;
        int column=str[0].length();
        for(int i=0;i<column;i++){
        
        for(int j=1;j<word;j++){
            if(str[j].charAt(i)<str[j-1].charAt(i)){
                res++;
               // System.out.println("kanishk"); 
                break;  // it will stop the execution of current loop (j) 
            }
        }
        
    }
        return res;
}
}