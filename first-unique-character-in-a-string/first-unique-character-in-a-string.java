class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> hashmap = new HashMap<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            hashmap.put(s.charAt(i), hashmap.getOrDefault(s.charAt(i), 0)+1);   
        }
        for (int i = 0; i < n; i++) {
            if (hashmap.get(s.charAt(i))==1) {
                return i;
            }   
        }
        return -1;
    }
}