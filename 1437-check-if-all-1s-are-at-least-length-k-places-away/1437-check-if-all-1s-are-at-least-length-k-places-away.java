class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int sum=0;
        int a=1;
//               if(nums[0]==0){
//                 sum++;
                
//             }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                  break;  }
        else{
            a++;
        }}
        for(int i=a;i<nums.length;i++){
      
            if(nums[i]==1){
                if(sum<k){
                    return false;
                }
                sum=0;
            }
            else if(nums[i]==0){
                sum++;
            }
        }
        return true;
    }
}