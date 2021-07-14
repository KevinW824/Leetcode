class Solution {
    public boolean validPalindrome(String s) {
        if (s == null || s == "") {
            return false;
        }

        int unmatchLeft = isPalindrome(s);
        int unmatchRight = s.length() - unmatchLeft;
        if (unmatchLeft == -1) {
            return true;
        }
        else if (isPalindrome(s.substring(unmatchLeft + 1, unmatchRight)) == -1 || isPalindrome(s.substring(unmatchLeft, unmatchRight - 1)) == -1) {
            return true;
        }
        return false;
    }

    public int isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return left;
            }
            left++;
            right--;
        }
        return -1;
    }
}