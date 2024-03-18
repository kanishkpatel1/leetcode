class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length==1) return;  
        // find the first break point where nums[i]<nums[i+1] from last
        int indx1=-1;
        int indx2=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                indx1=i;
                break;
            }
        }
        // if there is no breaking point means array is sorted so just reverse the array from start
        if(indx1==-1)
         reverse(nums,0);
        else{
            // step 2 find next greater element and swap with ind2
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]>nums[indx1]){
                    indx2=i;
                    break;
                }
            }

            swap(nums,indx1,indx2);
            // step 3 reverse the rest right half
            reverse(nums,indx1+1);
        }
    }
        
        void swap(int nums[],int i,int j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        void reverse(int nums[],int start){
            int i=start;
            int j=nums.length-1;
            while(i<j) {
                swap(nums,i,j);
                i++;
                j--;
                }
        }
    
}