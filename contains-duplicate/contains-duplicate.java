class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hashset = new HashSet<Integer>();
        for (int num : nums) {
            if (hashset.contains(num)) {
                return true;
            }
            hashset.add(num);
        }
        return false;
    }
}