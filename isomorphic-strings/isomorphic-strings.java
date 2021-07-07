class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            char chs = s.charAt(i);
            char cht = t.charAt(i);
            if (map.containsKey(chs)) {
                if (map.get(chs)!=cht) {
                    return false;
                }
            }
            else {
                if (map.containsValue(cht)) {
                    return false;
                }
                map.put(chs, cht);   
            }
        }
        return true;
    }
}