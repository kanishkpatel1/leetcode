class Solution {
    public String sortSentence(String s) {
               String []arr=s.split(" ");
        String []str=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            int a=arr[i].length();
            int b=arr[i].charAt(a-1)-'0';
            String sub = arr[i].substring(0,a-1);
            str[b-1]=sub;
        }
        String res=String.join(" ", str);
        return res;
    }
}