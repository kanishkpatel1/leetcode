// class Solution {
//     public int[] successfulPairs(int[] spells, int[] potions, long success) {
//         int n = spells.length;
//         int m = potions.length;
//         int[] pairs = new int[n];
//         Arrays.sort(potions);
//         for (int i = 0; i < n; i++) {
//             int spell = spells[i];
//             int left = 0;
//             int right = m - 1;
//             while (left <= right) {
//                 int mid = left + (right - left) / 2;
//                 long product = (long) spell * potions[mid];
//                 if (product >= success) {
//                     right = mid - 1;
//                 } else {
//                     left = mid + 1;
//                 }
//             }
//             pairs[i] = m - left;
//         }
//         return pairs;
//     }
// }


class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int count=0;
        int[] res=new int[spells.length];
        int a=spells.length;
        int b=potions.length;
        Arrays.sort(potions);
        for(int i=0;i<a;i++){
            int left=0;
            int right=b-1; // because of index we -1 here 
            while(left<=right){
                int mid=left+(right-left)/2;
               long ans=(long)spells[i]*potions[mid]; // here we typecaste because ans can go beyond the limit of int
                if(ans>=success){
                    right=mid-1;
                }
                else {
                    left=mid+1;
                }
                
            }
            res[i]=b-left;
    }
        return res;
}
}