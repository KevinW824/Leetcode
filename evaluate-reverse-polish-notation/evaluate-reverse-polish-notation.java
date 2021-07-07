class Solution {
    public int evalRPN(String[] tokens) {
        if (tokens.length==1) {
            return Integer.parseInt(tokens[0]);
        }
        int res = 0;
        int num1 = 0;
        int num2 = 0;
        Deque<Integer> stack = new ArrayDeque<Integer>();
        for (String str : tokens) {
            if ("+-*/".contains(str)) {
                num2 = stack.pop();
                num1 = stack.pop();
                if (str.equals("+")) {
                    res = num1 + num2;
                }
                else if (str.equals("-")) {
                    res = num1 - num2;
                }
                else if (str.equals("*")) {
                    res = num1 * num2;
                }
                else if (str.equals("/")) {
                    res = num1 / num2;
                }
                stack.push(res);
            }
            else {
                stack.push(Integer.parseInt(str));
            }
        }
        return res;
    }
}