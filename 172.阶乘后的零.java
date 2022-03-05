/*
 * @lc app=leetcode.cn id=172 lang=java
 *
 * [172] 阶乘后的零
 */

// @lc code=start
class Solution {
    
    // 2*5=10
    // 2 5 10
    // 分解成2 和 5
    public int trailingZeroes(int n) {
        
        int cnt2=0;
        int cnt5=0;
        
        for(int i=1;i<=n;i++){
            if(i%2!=0&&i%5!=0){
                continue;
            }
            int temp=i;
            while(temp%5==0){
                cnt5++;
                temp=temp/5;
            }
            while(temp%2==0){
                cnt2++;
                temp=temp/2;
            }
            
        }
        
        return Math.min(cnt2,cnt5);

    }
}
// @lc code=end

