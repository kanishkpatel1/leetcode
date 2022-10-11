class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set =new HashSet<>();
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs1 = new HashSet<>();
 
        for (int i = 0; i < arr1.length; i++){
            hs.add(arr1[i]);
        }
 
        for (int i = 0; i < arr2.length; i++){
            if (hs.contains(arr2[i])){
                set.add(arr2[i]);
            }
        }
        
        
        int [] result=new int[set.size()];
        int k=0;
        for(Integer num : set) {
            result[k++]=num;
        }
        return result;
    }
}