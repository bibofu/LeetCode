/*
 * @lc app=leetcode.cn id=225 lang=java
 *
 * [225] 用队列实现栈
 */

// @lc code=start
class MyStack {
    
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public MyStack() {
        queue1=new LinkedList<>();
        queue2=new LinkedList<>();

    }
    
    public void push(int x) {
        
        queue1.offer(x);

    }
    
    public int pop() {
        
        int res=0;
        while(!queue1.isEmpty()){
            int i=queue1.poll();
            if(queue1.isEmpty()){
                res = i;
                break;
            }
            queue2.offer(i);
            
        }
        
        while(!queue2.isEmpty()){
            queue1.offer(queue2.poll());
        }
        
        
        return res;

    }
    
    public int top() {
        
        int res=0;
        while(!queue1.isEmpty()){
            int i=queue1.poll();
            queue2.offer(i);
            if(queue1.isEmpty()){
                res = i;
            }
            
            
        }
        
        while(!queue2.isEmpty()){
            queue1.offer(queue2.poll());
        }
        
        
        return res;


    }
    
    public boolean empty() {
        
        return queue1.isEmpty();

    }
}



/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

