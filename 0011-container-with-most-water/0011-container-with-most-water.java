class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int currheight=0;  // for find current max water
        int maxheight=0;   // for find max water among curr and previous one 
        int end=height.length-1;
        while(start<end){
            currheight=(end-start)*Math.min(height[start],height[end]);
            maxheight=Math.max(maxheight,currheight);
            if(height[start]<height[end]){
                start++;   
            }
            else{
                end--;
            }
        }
        return maxheight;
    }
}