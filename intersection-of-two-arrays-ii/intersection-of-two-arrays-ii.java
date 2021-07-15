class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> hashmap = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (int x : nums1) {
            hashmap.put(x, hashmap.getOrDefault(x, 0)+1);
        }
        for (int x : nums2) {
            if (hashmap.containsKey(x) && hashmap.get(x) > 0) {
                res.add(x);
                hashmap.put(x, hashmap.get(x)-1);
            }   
        }
        int[] conv = new int[res.size()];
        int i = 0;
        for (Integer x : res) {
            conv[i] = x;
            i++;
        }
        return conv;
    }
}