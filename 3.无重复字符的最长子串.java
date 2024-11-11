/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int left = -1;
        int right = 0;
        int n = s.length();
        int max = 0;
        int[] freq = new int[256];

        while(left < right && right < n){
            if(freq[s.charAt(right)] == 0){
                freq[s.charAt(right)] = 1;
                right++;
            }else{
                left++;
                freq[s.charAt(left)]--;
            }
            max = Math.max(max,right-left-1);
        }

        return max;

    }
}
// @lc code=end

