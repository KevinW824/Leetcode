class Solution {
    public int strStr(String haystack, String needle) {
        if (needle == null || needle == "") {
            return -1;
        }
        int res = -1;
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            boolean eq = true;
            for (int j = 0; j < needle.length(); j++) {
                if (needle.charAt(j) != haystack.charAt(i + j)) {
                    eq = false;
                    break;
                }
            }
            if (eq) {
                res = i;
                break;
            }
        }
        return res;
    }
}