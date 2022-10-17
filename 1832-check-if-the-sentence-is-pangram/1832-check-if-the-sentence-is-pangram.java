class Solution {
    public boolean checkIfPangram(String sentence) {
        int l=sentence.length();
        boolean [] arr=new boolean [26];
        for(int i=0;i<l;i++){
            int pos=sentence.charAt(i)-'a';
            arr[pos]=true;
        }
        for(int i=0;i<26;i++){
            if(arr[i]==false){
                return false;
            }
        }
        return true;
    }
}