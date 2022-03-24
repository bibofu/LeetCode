/*
 * @lc app=leetcode.cn id=1114 lang=java
 *
 * [1114] 
 */

// @lc code=start
class FooBar {
    private int n;
    Lock lock=new ReentrantLock();
    Condition condition=lock.newCondition();

    public FooBar(int n) {
        this.n = n;
    }
    
    volatile int num=0;

    public  void foo(Runnable printFoo) throws InterruptedException {
        lock.lock();
        
        try{
            for (int i = 0; i < n; i++) {
                while(num!=0){
                    condition.await();
                }
                // printFoo.run() outputs "foo". Do not change or remove this line.
                printFoo.run();
                num++;
                condition.signalAll();
            }
        }catch (Exception e){
                e.printStackTrace();
        }finally{
                lock.unlock();
        }
        
        
    }

    public  void bar(Runnable printBar) throws InterruptedException {
        lock.lock();
        try{
            for (int i = 0; i < n; i++) {
                while(num!=1){
                    condition.await();
                }
                // printBar.run() outputs "bar". Do not change or remove this line.
                printBar.run();
                num--;
                condition.signalAll();
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            lock.unlock();        
        }
        
    }
}
// @lc code=end

