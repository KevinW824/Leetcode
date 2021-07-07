class MinStack {
    private List<Integer> data; 
    private int p_end;
        
    /** initialize your data structure here. */
    public MinStack() {
        data = new ArrayList<Integer>();
        p_end = -1;
    }
    
    public void push(int x) {
        p_end++;
        data.add(p_end, x);
    }
    
    public void pop() {
        p_end--;
    }
    
    public int top() {
        return data.get(p_end);
    }
    
    public int getMin() {
        int min = data.get(0);
        int curr;
        for (int i=1; i<=p_end; i++) {
            curr = data.get(i);
            if (curr < min) {
                min = curr;
            }
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */