/*
 * @lc app=leetcode.cn id=260 lang=java
 *
 * [260] 只出现一次的数字 III
 */

// @lc code=start
class Solution {
    public int[] singleNumber(int[] nums) {
        
        int temp=0;
        for(int i:nums){
            temp=temp^i;
        }
        
        // 3^5
        int index=0;
        for(int i=0;i<32;i++){
            if((temp>>i&1)==1){
                index=i;
                break;
            }
        }
        
        int n1=0;
        int n2=0;
        for(int i:nums){
            if((i>>index&1)==1){
                n1^=i;
            }else{
                n2^=i;
            }
        }
        
        return new int[]{n1,n2};

    }
}
// @lc code=end

