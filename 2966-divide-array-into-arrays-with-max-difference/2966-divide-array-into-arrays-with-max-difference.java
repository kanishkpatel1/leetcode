class Solution {
      public static void main(String[] args) {
        int nums[]={1,3,4,8,7,9,3,5,1};
        int k=2;
        System.out.println(Arrays.deepToString(divideArray(nums, k)));
    }

    public static int[][] divideArray(int[] nums, int k) {
        int eleind=0;
        Arrays.sort(nums);
        int row=nums.length/3;
        int result[][]=new int[row][3];
        for(int i=0;i<nums.length;i+=3){
            if(i+2<nums.length) {
                if((nums[i+2]-nums[i])<=k){
                    result[eleind][0]=nums[i];
                    result[eleind][1]=nums[i+1];
                    result[eleind][2]=nums[i+2];
                    eleind++;
                }
                else return new int[][]{};
            }
        }
        return result;
    }
}