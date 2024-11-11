/*
 * @lc app=leetcode.cn id=438 lang=java
 *
 * [438] 找到字符串中所有字母异位词
 */

// @lc code=start
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int m = s.length();
        int n = p.length();
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<m-n+1;i++){
            if(is_sameWord(s.substring(i,i+n),p)){
                res.add(i);
            }
        }

        return res;
    }

    public boolean is_sameWord(String s1,String s2){
        int[] freq = new int[26];
        int n = s1.length();
        for(int i=0;i<n;i++){
            freq[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++){
            freq[s2.charAt(i)-'a']--;
            if(freq[s2.charAt(i)-'a'] < 0){
                return false;
            }
        }

        return true;
    }
}
// @lc code=end

