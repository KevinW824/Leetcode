class Solution {
    public boolean isPalindrome(String s) {
           // write your code here
        if (s == null) {
            return false;
        }

        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && !isValid(s.charAt(left))) {
                left++;
            }
            while (left < right && !isValid(s.charAt(right))) {
                right--;
            }
            while (left < right && !isEqual(s.charAt(left), s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean isValid(char c) {
        if (Character.isLetter(c) || Character.isDigit(c)) {
            return true;
        }
        return false;
    }

    public boolean isEqual(char left, char right) {
        if (Character.toLowerCase(left) == Character.toLowerCase(right)) {
            return true;
        }
        return false;
    }
}