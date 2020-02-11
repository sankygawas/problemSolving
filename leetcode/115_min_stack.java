class MinStack {

    /** initialize your data structure here. */
    int min = Integer.MIN_VALUE;
    Stack<Integer> stack;
    Stack<Integer> minStack;
    public MinStack() {
        
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
        
    }
    
    public void push(int x) {
        
        stack.push(x);
        
        if(minStack.isEmpty()){
             minStack.push(x);
             min = x;
        }
           
        else if(min >= x)
        {
            minStack.push(x);
            min = x;
        }
    }
    
    public void pop() {
        
        int poppedElement = stack.pop();
        
        if(minStack.peek() == poppedElement){
            minStack.pop();
            if(!minStack.isEmpty())
                min = minStack.peek();
        }
        
        
        
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
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