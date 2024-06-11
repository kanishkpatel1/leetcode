class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        int freqarr[]=new int[1001];
        for(int i=0;i<arr1.length;i++) freqarr[arr1[i]]++;
         List<Integer> ls2=new ArrayList<>();
        for(int i=0;i<arr2.length;i++) ls2.add(arr2[i]);
        int res[]=new int[arr1.length];
        int p=0;
        List<Integer>ls=new ArrayList<>();
        for(int j=0;j<arr2.length;j++){
         for(int i=0;i<arr1.length;i++){
             if(!ls2.contains(arr1[i])) {
              if(!ls.contains(arr1[i])) ls.add(arr1[i]);
             }
             if(arr2[j]==arr1[i]) 
                res[p++]=arr1[i];
        }
        }
        Collections.sort(ls);
        for(int i=0;i<ls.size();i++){
            int f=freqarr[ls.get(i)];
            while(f-->0) {
                res[p++]=ls.get(i);
            }
        }
     //   System.out.println(ls);
        return res;
        
    }
}