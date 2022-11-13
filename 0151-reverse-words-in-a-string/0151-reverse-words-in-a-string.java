class Solution {
    public String reverseWords(String s) {
      String[] arr=s.trim().split("\\s+");
         // trim where any number of spaces found
        // or below two lines to remove extra spaces in middle or start and end
        // s=s.trim().replaceAll("\\s+"," ");  
       // String[] arr=s.split(" ");
       
        int n=arr.length;
        for(int i=0;i<n/2;++i){
            String temp=arr[i];
            arr[i]=arr[n-(i+1)];
            arr[n-(i+1)]=temp;
        }
      
         return String.join(" ",arr);
    }
}