class Solution {
    public int findMinDifference(List<String> timePoints) {
        int arr[]=new int[timePoints.size()];
        for(int i=0;i<timePoints.size();i++){
            String time=timePoints.get(i);
            int hrs= Integer.parseInt(time.substring(0,2));
            int min=Integer.parseInt(time.substring(3));
            int totalminutes=hrs*60+min;
            arr[i]=totalminutes;            
            }
        Arrays.sort(arr);
        int mindiff=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                mindiff=Math.min(Math.abs(1440+arr[i]-arr[j]),mindiff);
                mindiff=Math.min(Math.abs(arr[i]-arr[j]),mindiff);
                }
            }
        }
        return mindiff;
    }
}