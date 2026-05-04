class MinStack {
    Stack<Integer> st;
    Stack<Integer> st2; 
    public MinStack() {
        st = new Stack<>();
        st2 = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(st2.isEmpty() || val<=st2.peek()){
            st2.push(val);
        }
    }
    
    public void pop() {
        if(st.peek().equals(st2.peek())) st2.pop();
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        if(!st2.isEmpty()) return st2.peek();
        return st.peek();
    }
}
