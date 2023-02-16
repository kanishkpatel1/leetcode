class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        List<Integer> ls=new ArrayList<>();
        int a=0;
        for(int i=0;i<arr[n-1];i++){
            if(i+1!=arr[a]){
                ls.add(i+1);
            }
            else{
                a++;
            }
        }
        
        int s=ls.size();
        System.out.println(ls);
        int v=k-s;
        if(k>s){
            for(int i=0;i<v;i++){
                ls.add(++arr[n-1]);
            }
        }
        return ls.get(k-1);
       // return ls.get(0);
    }
}