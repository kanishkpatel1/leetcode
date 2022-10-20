class Solution {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        String str1[]=s.split("");
    
        String str2[]=t.split("");
        Arrays.sort(str1);
        Arrays.sort(str2);
        System.out.println(Arrays.toString(str1));
        System.out.println(Arrays.toString(str2));
       int a=0;
        for(int i=0;i<str1.length;i++){
            if(str1[i].equals(str2[i])){
                a++;
            }
        }
      if(a==str1.length){
        return true;
      }
      return false;
}
}