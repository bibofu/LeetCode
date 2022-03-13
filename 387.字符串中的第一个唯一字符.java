/*
 * @lc app=leetcode.cn id=387 lang=java
 *
 * [387] 字符串中的第一个唯一字符
 */

// @lc code=start
class Solution {
    public int firstUniqChar(String s) {
        
        int[] freq=new int[26];
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
        
        int res=n;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(freq[ch-'a']==1){
                res=i;
                break;
            }
        }
        
        return res==n?-1:res;
        
        

    }
}
// @lc code=end

