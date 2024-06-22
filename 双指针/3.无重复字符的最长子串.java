/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int n=s.length();
        int left=0;
        int right=0;
        
        int max=0;
        int[] freq=new int[256];
        while(left<=right&&right<n){
            char c=s.charAt(right);
            if(freq[c]==0){
                freq[c]=1;
                right++;
            }else{
                freq[s.charAt(left)]=0;
                left++;
            }
            
            max=Math.max(max,right-left);
        }
        
        return max;
        
    }
}
// @lc code=end

