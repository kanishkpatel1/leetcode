class Solution {
    public int[] rearrangeArray(int[] nums) {
        int l=nums.length/2;
        int len=nums.length;
        int []a=new int[l];
        int []b=new int[l];
        int []res=new int[len];
        int a1=0;
        int b1=0;
        for(int i=0;i<len;i++){
            
            if(nums[i]>0){
                
            a[a1++]=nums[i];
        }
        else if(nums[i]<0){
            b[b1++]=nums[i];
        }

        }
        int aaa=0;
        for(int i=0;i<l;i++){
            res[aaa++]=a[i];
            res[aaa++]=b[i];
        }
        return res;
        
    }
}