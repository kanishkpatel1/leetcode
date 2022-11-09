class Solution {
    int[]  numsInsert(int[] arr,int index,int val ){
          for(int k=arr.length-1;k>index;--k){
                    arr[k]=arr[k-1];
                   
                }
                 arr[index]=val;
        return arr;
    }
    
    public int[] createTargetArray(int[] nums, int[] index) {
        int n=nums.length;
        int arr[]=new int[n];
        for(int i=0;i<n;++i){    // creating an array with the same length initialized with -1
            arr[i]=-1;              
            }
        for(int i=0,j=0;i<n;++i){
            if(arr[index[i]]==-1){
                arr[index[i]]=nums[j++];
            }
            else{     // if index is repeated then we should insert the element
                //and shift the rest of the array 
                arr=numsInsert(arr,index[i],nums[j++]);
                // function called numsInsert for doing our work shift Array
              
            }
        }
        
        
        return arr;
    }
}