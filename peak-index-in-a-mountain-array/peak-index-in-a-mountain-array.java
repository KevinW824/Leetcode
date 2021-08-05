class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        
        int start = 0, end = arr.length - 1;
        int maxIndex = 0;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] > arr[mid + 1]) {
                maxIndex = mid;
                end = mid;
            }
            else {
                start = mid;
            }
        }
        
        if (arr[start] > arr[maxIndex]) {
            maxIndex = start;
        }
        if (arr[end] > arr[maxIndex]) {
            maxIndex = end;
        }
        
        return maxIndex;
    }
}