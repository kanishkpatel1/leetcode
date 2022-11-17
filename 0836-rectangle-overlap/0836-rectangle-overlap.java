class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        // we use same method like 223 rectangle area
        int ax1=rec1[0];
        int ay1=rec1[1];
        int ax2=rec1[2];
        int ay2=rec1[3];
        
        int bx1=rec2[0];
        int by1=rec2[1];
        int bx2=rec2[2];
        int by2=rec2[3];
        
        
        int left=Math.max(bx1,ax1);
        int right=Math.min(ax2,bx2);
        int top=Math.min(ay2,by2);
        int bottom=Math.max(ay1,by1);
            
        return  ((right>left) && (top >bottom));
        
        
     
        //approach 2--> minimize code 
        // return (Math.min(rec1[2], rec2[2]) > Math.max(rec1[0], rec2[0]) && // width > 0
     //            Math.min(rec1[3], rec2[3]) > Math.max(rec1[1], rec2[1]));  // height > 0
     
        
        
      // approach 3 --> more minimize \U0001f923
        // return (rec1[0] < rec2[2] && rec1[1] < rec2[3] && rec1[2] > rec2[0] &&  rec1[3] > rec2[1]);
    }
}