class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> hashmap = new HashMap<>();
        int i = 0;
        for (int x : nums) {
            if (hashmap.containsKey(x) && Math.abs(i-hashmap.get(x)) <= k) {
                return true;
            }
            hashmap.put(x, i);
            i++;
        }
        return false;
    }
}