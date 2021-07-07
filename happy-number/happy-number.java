class Solution {
    
    public int makeHappy(int n) {
        int res = 0;
        while (n / 10 != 0) {
            res += (n % 10) * (n % 10);
            n = n / 10;
        }
        res += (n % 10) * (n % 10);
        return res;
    }
    
    public boolean isHappy(int n) {
        Set<Integer> hashset = new HashSet<>();
        while (!hashset.contains(n)) {
            hashset.add(n);
            n = makeHappy(n);
            if (n == 1) {
                return true;
            }
        }
        return false;
    }
}