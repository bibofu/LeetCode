/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 找出字符串中第一个匹配项的下标
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        if(m<n){
            return -1;
        }
        for(int i=0;i<=m-n;i++){
            if(equals(haystack.substring(i,i+n),needle)){
                return i;
            }
        }

        return -1;


    }

    public boolean equals(String a,String b){
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)){
                return false;
            }
        }

        return true;
    }
}
// @lc code=end

