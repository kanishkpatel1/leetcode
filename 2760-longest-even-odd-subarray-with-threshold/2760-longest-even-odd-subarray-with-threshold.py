class Solution:
      def longestAlternatingSubarray(self, nums: List[int], threshold: int) -> int:
        len1=0
        max1=0
       
        for l in range(0,len(nums)):
            
                if nums[l]%2==0 and nums[l]<=threshold:
                    len1=1
                    for  r in range(l+1,len(nums)):
                        if nums[r] %2 !=nums[r-1]%2 and nums[r]<=threshold and nums[r-1]<=threshold:
                            len1+=1
                        else:
                            break
                    max1 = max(max1, len1)
            
        return max1
        