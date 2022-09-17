
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int i = 0, j = 0, k = 0, m = nums1.length, n = nums2.length;
        int as=m+n;
    int nums3[] = new int[m + n];
    while (i != m && j != n) {
        if (nums1[i] < nums2[j]) {
            nums3[k] = nums1[i];
            i++;
        }
        else {
            nums3[k] = nums2[j];
            j++;
        }
        k++;
    }
    while (i != m) {
        nums3[k] = nums1[i];
        i++;
        k++;
    }
    while (j != n) {
        nums3[k] = nums2[j];
        j++;
        k++;
    }
    if(as%2==0){
    int z = as / 2;
    double e = nums3[z];
    double q = nums3[z - 1];

    double ans = (e + q) / 2;
return ans;
  }
  else{
    int z = as/ 2;
    return (double)nums3[z];
  }
         }
}