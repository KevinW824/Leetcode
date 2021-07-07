class Solution {
    public int[] dailyTemperatures(int[] T) {
        int len = T.length;
        int[] res = new int[len];
        Deque<Integer> stack = new ArrayDeque<Integer>();
        res[len-1] = 0;
        stack.push(len-1);
        for (int i=len-2; i>=0; i--) {
            while (!stack.isEmpty() && T[i]>=T[stack.peek()]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                res[i] = stack.peek() - i;   
            }
            else {
                res[i] = 0;
            }
            stack.push(i);
        }
        return res;
    }
}