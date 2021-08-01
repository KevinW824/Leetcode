class Solution {
    public int search(int[] nums, int target) {
        return BinarySearch(nums, 0, nums.length - 1, target);
    }
    
    private int BinarySearch(int[] nums, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        
        int mid = (start + end) / 2;
        
        if (nums[mid] == target) {
            return mid;
        }
        else if (nums[mid] < target) {
            return BinarySearch(nums, mid + 1, end, target);
        }
        else {
            return BinarySearch(nums, start, mid - 1, target);
        }
    }
}