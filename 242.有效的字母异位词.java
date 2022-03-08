/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        
        int[] cnt=new int[26];
        int m=s.length();
        int n=t.length();
        if(m!=n){
            return false;
        }
        
        for(int i=0;i<m;i++){
            char c=s.charAt(i);
            cnt[c-'a']++;
        }
        for(int i=0;i<n;i++){
            char c=t.charAt(i);
            cnt[c-'a']--;
            if(cnt[c-'a']<0){
                return false;
            }
        }
        
        return true;

    }
}
// @lc code=end

