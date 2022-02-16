/*
 * @lc app=leetcode.cn id=461 lang=java
 *
 * [461] 汉明距离
 */

// @lc code=start
class Solution {
    public int hammingDistance(int x, int y) {
        
        int res=x^y;
        
        String s=Integer.toBinaryString(res);
        
        int num=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                num++;
            }
        }
        
        return num;
        

    }
}

// @lc code=end

