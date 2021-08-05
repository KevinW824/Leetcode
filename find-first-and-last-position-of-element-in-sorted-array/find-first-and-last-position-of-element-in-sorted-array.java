class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        if (nums == null || nums.length == 0) {
            return res;
        }
        
        
        res[0] = binarySearch(nums, target, true);
        res[1] = binarySearch(nums, target, false);
        
        if (res[0] == -1 && !(res[1] == -1)) {
            res[0] = res[1];
        }
        if (res[1] == -1 && !(res[0] == -1)) {
            res[1] = res[0];
        }

        return res; 
    }
    
    private int binarySearch(int[] nums, int target, boolean isFirst) {
        
        int res = -1;
        int start = 0, end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                res = mid;
                if (isFirst) {
                    end = mid;
                }
                else {
                    start = mid;
                }
            }
            else if (nums[mid] > target) {
                end = mid;
            }
            else {
                start = mid;
            }
        }

        if (!isFirst && nums[end] == target) {
            res = end;
        }
        if (isFirst && nums[start] == target) {
            res = start;
        }

        return res; 
    }
}