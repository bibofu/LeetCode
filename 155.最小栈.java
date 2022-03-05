/*
 * @lc app=leetcode.cn id=155 lang=java
 *
 * [155] 最小栈
 */

// @lc code=start
class MinStack {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    /** initialize your data structure here. */
    public MinStack() {
        this.stack1=new Stack<>();
        this.stack2=new Stack<>();
    }
    
    public void push(int val) {

        stack1.push(val);
        
        if(stack2.isEmpty()||val<stack2.peek()){
            stack2.push(val);
        }else{
            stack2.push(stack2.peek());
        }

    }
    
    public void pop() {

        if(!stack1.isEmpty()){
            stack1.pop();
            stack2.pop();
        }
    }
    
    public int top() {
        return stack1.peek();
    }
    
    public int getMin() {
        return stack2.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
// @lc code=end

