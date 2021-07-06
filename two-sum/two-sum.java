class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashmap = new HashMap<>();
        int[] res = new int[2];
        int i = 0;
        for (int x : nums) {
            if (hashmap.containsKey(x)) {
                res[0] = hashmap.get(x);
                res[1] = i;
                return res;
            }
            hashmap.put(target-x, i);
            i++;
        }
        return res;
    }
}