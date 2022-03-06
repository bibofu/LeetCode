/*
 * @lc app=leetcode.cn id=202 lang=java
 *
 * [202] 快乐数
 */

// @lc code=start
class Solution {
    
    // 如果不是快乐数，肯定会有循环
    public boolean isHappy(int n) {
        
        Set<Integer> set=new HashSet<>();
        
        while(n!=1){
            int sum=0;
            int temp=n;
            while(temp>0){
                sum+=(temp%10)*(temp%10);
                temp=temp/10;
            }
            
            n=sum;
            if(set.contains(n)){
                return false;
            }
            set.add(n);
        }
        
        return true;
    }
     
}
// @lc code=end

