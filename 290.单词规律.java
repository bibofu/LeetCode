/*
 * @lc app=leetcode.cn id=290 lang=java
 *
 * [290] 单词规律
 */

// @lc code=start
class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        Map<Character,String> map=new HashMap<>();
        String[] s1 = s.split(" ");
        int n=pattern.length();
        if(n!=s1.length){
            return false;
        }
        for(int i=0;i<n;i++){
            char ch=pattern.charAt(i);
            String temp=map.getOrDefault(ch,s1[i]);
            if(map.values().contains(temp)&&!map.keySet().contains(ch)){
                return false;
            }
            map.put(ch,temp);
            if(!temp.equals(s1[i])){
                return false;
            }
        }
        
        return true;

    }
}
// @lc code=end

