class Solution {
    
    public boolean dist(int a,int b,int r){
        double ans=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        if((ans)<=r){
            return true;
        }
        return false;
    }
    public int[] countPoints(int[][] points, int[][] queries) {
        int arr[]=new int[queries.length];
        int ql=queries.length;
        int cp=points.length;
        for(int i=0;i<ql;i++){
             int sum=0;
            int x1=queries[i][0];
            int y1=queries[i][1];
            for(int j=0;j<cp;j++){
                
                int x2=points[j][0];
                
                int y2=points[j][1];
                int a=x2-x1;
                int b=y2-y1;
                int r=queries[i][2];
               
                if(dist(a,b,r)){
                    sum++;
                }
                
                
            }
            arr[i]=sum;
            
            
        }
       return arr; 
    }
}