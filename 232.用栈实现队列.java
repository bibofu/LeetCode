/*
 * @lc app=leetcode.cn id=232 lang=java
 *
 * [232] 用栈实现队列
 */

// @lc code=start
class MyQueue {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    /** Initialize your data structure here. */
    public MyQueue() {
        this.stack1=new Stack<>();
        this.stack2=new Stack<>();

    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {

        stack1.push(x);

    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {

        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int pop=stack2.pop();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }

        return pop;

    }
    
    /** Get the front element. */
    public int peek() {

        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int peek=stack2.peek();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }

        return peek;

    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {

        return stack1.isEmpty();

    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

