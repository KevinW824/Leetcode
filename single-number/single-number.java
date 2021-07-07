class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> hashset = new HashSet<Integer>();
        for (int num : nums) {
            if (hashset.contains(num)) {
                hashset.remove(num);
            }
            else {
                hashset.add(num);
            }
        }
        Iterator<Integer> iter = hashset.iterator();
        return iter.next();
    }
}