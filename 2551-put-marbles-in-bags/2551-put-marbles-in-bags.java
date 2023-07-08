// take sum of two elements each pair
// and then sort 
// and the take two vairable left sum and right sum 
// sum upto (k-1) from both sides 
// then return right sum -left sum

// class Solution 
// {
//     public long putMarbles(int[] weights, int k) {
//         List<Integer>ls=new ArrayList<>();
//         for(int i=1;i<weights.length;i++){
//             ls.add(weights[i-1]+weights[i]);
//         }
//         Collections.sort(ls);
//         long leftsum=0;
//         long rightsum=0;
//         for(int i=0;i<k-1;i++){
//             leftsum+=ls.get(i);
//             rightsum+=ls.get(ls.size()-1-i);
//         }
//         return rightsum-leftsum;
//     }
// }


class Solution 
   {
    public long putMarbles(int[] weights, int k) {
        int arr[]=new int[weights.length-1];
        for(int i=1;i<weights.length;i++){
            arr[i-1]=weights[i-1]+weights[i];
        }
        Arrays.sort(arr);
        long leftsum=0;
        long rightsum=0;
        for(int i=0;i<k-1;i++){
            leftsum+=arr[i];
            rightsum+=arr[arr.length-1-i];
        }
        return rightsum-leftsum;
    }
}