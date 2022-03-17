/*
 * @lc app=leetcode.cn id=720 lang=java
 *
 * [720] 词典中最长的单词
 */

// @lc code=start
class Solution {
    public String longestWord(String[] words) {

        Arrays.sort(words,(a,b)->{
            if(a.length()!=b.length()){
                return a.length()-b.length();
            }else{
                return b.compareTo(a);
            }
        })

        String res = "";
        Set<String> set = new HashSet<String>();
        set.add("");
        int n = words.length;
        for (int i = 0; i < n; i++) {
            String word = words[i];
            if (set.contains(word.substring(0, word.length() - 1))) {
                set.add(word);
                res = word;
            }
        }
        return res;

    }
}
// @lc code=end

