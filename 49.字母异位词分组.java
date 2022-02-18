/*
 * @lc app=leetcode.cn id=49 lang=java
 *
 * [49] 字母异位词分组
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> res=new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();

        for(String str:strs){
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            //不能用ch.toString()!!!
            String s=new String(ch);
            List<String> list=map.getOrDefault(s,new ArrayList<String>());

            list.add(str);
            map.put(s,list);
        }

        for(List<String> l:map.values()){
            res.add(l);
        }

        return res;

    }
}
// @lc code=end

