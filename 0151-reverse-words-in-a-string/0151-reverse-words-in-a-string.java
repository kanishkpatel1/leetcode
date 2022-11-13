class Solution {
    public String reverseWords(String s) {
      String[] arr=s.trim().split("\\s+");
        // s=s.trim().replaceAll("\\s+"," ");
       // String[] arr=s.split(" ");
        // trim where any number of spaces found
        int n=arr.length;
        int b=n-1;
        for(int i=0;i<n/2;i++){
            String temp=arr[i];
            arr[i]=arr[n-(i+1)];
            arr[n-(i+1)]=temp;
        }
      
         return String.join(" ",arr);
    }
}