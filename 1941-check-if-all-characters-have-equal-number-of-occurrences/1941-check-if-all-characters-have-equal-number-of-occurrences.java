class Solution {
    public boolean areOccurrencesEqual(String s) {
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            int a=s.charAt(i)-'a';
            arr[a]++;
        }
        Arrays.sort(arr);
        int max=arr[arr.length-1];
       // System.out.println(Arrays.toString(arr));
        for(int i=0;i<26;i++){
            if(arr[i]!=max&&arr[i]!=0){  
// here we use && arr[i]!=max because if only one element occurs more 
 //than one time and all other not came so we'll have to return true if all elements 
// came  same time max will be same if other chars not came then 
//the default value of those is zero so we'll have to neglect then 
 // and check only the other values are same or not except zeroes
                return false;
            }
        }
        return true;
    }
}