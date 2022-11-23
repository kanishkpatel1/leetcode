class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int indx=Math.abs(nums[i])-1;  
// replace the number with it's index  subtract -1 because index will start from zero
            // and number in the array start from 1 
// we take absolute value because if any element repeated then again make it negative 
// the number who not came it's will be positive so return the index+1 
    // input=[1,2,3,5,1]
  //   we 'll do'   --> [0,-1,-2,3,-4]  
//so the number who is positive+1 is our result add it in list
            
            if(nums[indx]>0){
               nums[indx]=nums[indx]*-1;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ls.add(i+1);
            }
        }
        return ls;
    }
}