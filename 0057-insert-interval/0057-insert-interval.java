

/*
Interval will not be overlapped
case 1 : when interval[end] < newInterval[start],ex-newInterval = [4,8], interval = [1,2]
case 2 : when interval[start] > newInterval[end],ex-newInterval = [4,8], interval = [12,16]
case 3 : when new interval is already added in output list

*/

//we use approach just like problem no 56 merge interval the difference is that in it we just need to copy the whole array into another array and add the newInterval in copied array after that all the code are same
// but this method will give memory limit exceed error


class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
            int n=intervals.length+1;
             List<int[]> result=new ArrayList<>();
        for(int[]interval:intervals){
            if(newInterval==null || interval[1]<newInterval[0]){  // case1
              result.add(interval);
            }
            else if(interval[0]>newInterval[1]){ // case 2
              result.add(newInterval);
                result.add(interval);
                newInterval=null;
            }
            else{ // overlapping condition
               newInterval[0]=Math.min(newInterval[0],interval[0]);
               newInterval[1]=Math.max(newInterval[1],interval[1]);
                
                
            }
        }
        if(newInterval!=null) result.add(newInterval);
        
        return result.toArray(new int[result.size()][]);
        }
    }