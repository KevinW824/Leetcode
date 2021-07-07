class Solution {
  public boolean isValid(String s) {
      
      if (s.length() % 2 == 1) {
          return false;
      }

    // Initialize a stack to be used in the algorithm.
    Stack<Character> stack = new Stack<Character>();

    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);

        // If the current character is a closing bracket.
        if (c == ')' || c == ']'|| c == '}') {

            // Get the top element of the stack. If the stack is empty, set a dummy value of '#'
            if (!stack.empty()) {
                if (c == ')' && stack.peek() == '(' ||
                    c == ']' && stack.peek() == '[' ||
                    c == '}' && stack.peek() == '{') {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }

        } else {
        // If it was an opening bracket, push to the stack.
        stack.push(c);
        }
    }

    // If the stack still contains elements, then it is an invalid expression.
    return stack.isEmpty();
  }
}