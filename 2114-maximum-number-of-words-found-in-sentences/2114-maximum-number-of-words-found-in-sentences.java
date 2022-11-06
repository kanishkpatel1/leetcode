class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0,a;
        for(int i=0;i<sentences.length;i++){
            String []arr=sentences[i].split(" ");
            a=arr.length;
            if(a>max){
                max=a;
            }
        }
        return max;
    }
}