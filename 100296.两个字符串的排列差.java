/*
 * @lc app=leetcode.cn id=100296 lang=java
 *
 * [100296] 两个字符串的排列差
 */

// @lc code=start
class Solution {
    public int findPermutationDifference(String s, String t) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        int res = 0;
        int n = s.length();
        for(int i = 0;i<n;i++){
            freq1[s.charAt(i)-'a'] = i;
            freq2[t.charAt(i)-'a'] = i;
        }

        for(int i=0;i<26;i++){
            res+=Math.abs(freq1[i]-freq2[i]);
        }

        return res;
    }
}
// @lc code=end

