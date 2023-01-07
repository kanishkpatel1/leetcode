class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int currentFuel=0;
        int totalFuel=0,totalCosts=0;
        int start=0;
        
         for(int i=0;i<gas.length;i++){
            totalFuel+=gas[i];
        }
        for(int i=0;i<cost.length;i++){
            totalCosts+=cost[i];
        }
        if(totalFuel<totalCosts){
            return -1;
        }
        
        for(int i=0;i<gas.length;i++){
        currentFuel+=(gas[i]-cost[i]);
            if(currentFuel<0){
            start=i+1;
                currentFuel=0;
            }
        }
        return start;
    }
}