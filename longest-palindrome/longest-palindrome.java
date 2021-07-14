class Solution {
    public int longestPalindrome(String s) {
        if (s == null || s == "") {
            return 0;
        }

        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                if (map.get(s.charAt(i)) == 2) {
                    res += 2;
                    map.remove(s.charAt(i));
                }
            }
            else {
                map.put(s.charAt(i), 1);
            }
        }

        if (!map.isEmpty()) {
            res++;
        }

        return res;
    }
}