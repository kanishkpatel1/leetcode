class Solution {
    public String sortSentence(String s) {
               String []arr=s.split(" ");
        String []str=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            int a=arr[i].length(); // getting the length of each words
            int b=arr[i].charAt(a-1)-'0'; 
            // to extract the position no from words
            String sub = arr[i].substring(0,a-1); 
            // remove number (last digit) from string 
            str[b-1]=sub; // store it in new array
        }
        String res=String.join(" ", str);  // join the result string 
        return res;
    }
}