class Solution {
    public void sortColors(int[] nums) {
        int pl = 0, pr = nums.length - 1, i = 0;
        
        while (i <= pr) {
            if (nums[i] == 0) {
                swap(nums, i, pl);
                pl++;
                i++;
            }
            else if (nums[i] == 2){
                swap(nums, i, pr);
                pr--;
            }
            else {
                i++;
            }
        }
    }
    
    private void swap(int[] nums, int index1, int index2) {
        int temp;
        temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}