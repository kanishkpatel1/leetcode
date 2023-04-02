//TC--> nlogn

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int count=0;
        int[] res=new int[spells.length];
        int a=spells.length;
        int b=potions.length;
        Arrays.sort(potions);  
        // we sonrt potions and find the first pos where it met the condition after that the condition will be true till the end 
        // so when we reach the condition after that add in res array --> potions.length-current index(left)
        // we use binary search to find the starting index (left)
        
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