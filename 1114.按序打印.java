/*
 * @lc app=leetcode.cn id=1114 lang=java
 *
 * [1114] 
 */

// @lc code=start
class Foo {
    
    volatile int num=0;

    public Foo() {
        
    }

    public void first(Runnable printFirst) throws InterruptedException {
        
        while(num!=0){
            
        }
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        num++;
        
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while(num!=1){
            
        }
        
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        num++;
        
    }

    public void third(Runnable printThird) throws InterruptedException {
        while(num!=2){
            
        }
        
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
        num=0;
        
    }
}
// @lc code=end

