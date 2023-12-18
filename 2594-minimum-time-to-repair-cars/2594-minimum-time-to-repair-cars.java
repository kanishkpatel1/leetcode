// total time taken to repair n cars= r*n^2
// So to repair n cars time taken = (totaltime/r)^(1/2);
// then we calculate in mid no of minutes how many cars will be repaire 
// if it less than cars then we will have to increase the time 
// if it greater than cars then we will have to decreasse the time and find minimal ans 

// So according to given consraints the minimum time rank[i]*(cars^2) so minmum value = 1(1^2)=1
//  maximum time rank[i]*(cars^2) so minmum value = 100*((10^6)^2)===10^14

// now we will check from time 1 to 10^14 and get the number of cars repaired in that time and according to the 
// number of cars we will make aur mid in binary search so now let's jump to code 

class Solution {
    public long repairCars(int[] ranks, int cars) {
        // long mintime=1;
        // long maxtime=(long) 1e14;
        long low=1;
        long high=(long) 1e14;
        
        long ans=0;
        while(low<=high){
            long mid=low-(low-high)/2;
            long canrepair=0;
            for(int r:ranks){
                // calculate no of cars repaired in this time
                canrepair+=(long) Math.sqrt(mid/r);
            }
            // if no of canrepair cars > = cars then we will check weather mechanics repair in less time or not
            if(canrepair>=cars){
                high=mid-1;
                // store the value every time 
               //  so that we can find min time when we decrease the mid pointer
                ans=mid;
            }
            // if canrepair < cars means time should be increased 
            else{
                low=mid+1;
            }
            
        }
    
        return ans;
        
    } 
}