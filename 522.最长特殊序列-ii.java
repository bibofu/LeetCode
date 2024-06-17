/*
 * @lc app=leetcode.cn id=522 lang=java
 *
 * [522] 最长特殊序列 II
 */

// @lc code=start
class Solution {
    public int findLUSlength(String[] strs) {
        Arrays.sort(strs,(s1,s2)->s2.length()-s1.length());
        
        for(int i = 0;i<strs.length;i++){
            String cur = strs[i];
            int count = 0;
            for(int j = 0;j<strs.length;j++){
                if(i!=j && !is_substring(cur,strs[j])){
                    count++;
                }
            }
            if(count == strs.length-1){
                return cur.length();
            }
        }

        return -1;

    }

    /**
     * if s1 is a substring of s2
     */
    public boolean is_substring(String s1,String s2){
        if(s1.length() > s2.length()){
            return false;
        }
        int index = 0;
        int n = s2.length();
        for(int i = 0;i<n;i++){
            if(index == s1.length()){
                return true;
            }
            if(s1.charAt(index) == s2.charAt(i)){
                index++;
            }
        }

        return index == s1.length();

    }
}
// @lc code=end

