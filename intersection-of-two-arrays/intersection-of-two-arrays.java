class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hashset1 = new HashSet<Integer>();
        Set<Integer> hashset2 = new HashSet<Integer>();
        for (int x : nums1) {
            hashset1.add(x);
        }
        for (int y : nums2) {
            if (hashset1.contains(y)) {
                hashset2.add(y);   
            }
        }
        int[] res = new int[hashset2.size()];
        int i = 0;
        for (Integer x : hashset2) {
            res[i] = x;
            i++;
        }
        return res;
    }
}