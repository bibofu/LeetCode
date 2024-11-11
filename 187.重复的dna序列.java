/*
 * @lc app=leetcode.cn id=187 lang=java
 *
 * [187] 重复的DNA序列
 */

// @lc code=start
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<>();

        Map<String,Integer> map = new HashMap<>();
        int n = s.length();
        for(int i=0;i<=n-10;i++){
            String str = s.substring(i,i+10);
            map.put(str,map.getOrDefault(str,0)+1);
            if(map.get(str) == 2){
                res.add(str);
            }
        }

        return res;

    }
}
// @lc code=end

