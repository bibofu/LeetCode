/*
 * @lc app=leetcode.cn id=205 lang=java
 *
 * [205] 同构字符串
 */

// @lc code=start
class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        Map<Character,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=map.getOrDefault(a,t.charAt(i));
            if(!map.keySet().contains(a)&&map.values().contains(b)){
                return false;
            }
            map.put(a,b);
            if(b!=t.charAt(i)){
                return false;
            }
        }
        
        return true;

    }
}
// @lc code=end

