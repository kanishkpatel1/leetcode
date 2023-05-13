class Solution {
    public int[] sortArray(int[] arr) {
     mergeSort(arr);
        return arr;
    }
    
    public  void mergeSort(int[] arr) {
		int inputLength= arr.length;
		if (inputLength<2) {
			return;
		}
		
		int midIndex = inputLength/2;
		int[] leftHalf = new int[midIndex];
		int[] rightHalf = new int[inputLength-midIndex];
		for (int i = 0; i < midIndex; i++) {
			leftHalf[i] = arr[i];
			
		}
		
		for (int i = midIndex; i < inputLength; i++) {
			rightHalf[i-midIndex] = arr[i];
			
		}
		
		mergeSort(leftHalf);
		mergeSort(rightHalf);
		merge(arr, leftHalf, rightHalf);
	}
	
	public static void merge(int[] arr, int[] left, int[] right) {
		int l = left.length;
		int r = right.length;
		int i = 0;
		int j = 0;
		int pos = 0;
		
		while (i<l && j<r) {
			if (left[i]<right[j]) {
				arr[pos] = left[i];
				i++;
				pos++;
			} else if (left[i]>right[j]) {
				arr[pos] = right[j];
				j++;
				pos++;
			} else {
				arr[pos] = left[i];
				pos++;
				i++;
				arr[pos] = right[j];
				j++;
				pos++;
				
			}
		}
		
		while (i<l) {
			arr[pos] = left[i];
			i++;
			pos++;
		}
		while (j<r) {
			arr[pos] = right[j];
			j++;
			pos++;
		}
	}
}