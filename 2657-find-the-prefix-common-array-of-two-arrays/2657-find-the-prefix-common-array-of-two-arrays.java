class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        List<Integer> ls1=new ArrayList<>();
        List<Integer> ls2=new ArrayList<>();
        
        int[] res=new int[A.length];
        boolean arr[]=new boolean[51];
        int count=0;
        for(int i=0;i<A.length;i++){
         ls1.add(A[i]);
            ls2.add(B[i]);
            if(A[i]==B[i]){
                count++;
            }
            else{
                if(ls1.contains(B[i])){
                    count++;
                }
                if(ls2.contains(A[i])){
                    count++;
                }
            }
            res[i]=count;
        }
        return res;
    }
}