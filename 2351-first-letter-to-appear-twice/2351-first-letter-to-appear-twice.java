class Solution {
    public char repeatedCharacter(String s) {
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            int a=s.charAt(i)-'a';
            arr[a]=arr[a]+1;
            if(arr[a]==2){
                return s.charAt(i);
            }
        }
        return s.charAt(0);
    }
}