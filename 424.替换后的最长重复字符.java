/*
 * @lc app=leetcode.cn id=424 lang=java
 *
 * [424] 替换后的最长重复字符
 */

// @lc code=start
class Solution {
    public int characterReplacement(String s, int k) {

        int n = s.length();
        char[] arr = s.toCharArray();
        int left = 0;
        int right = 0;


        Map<Character, Integer> map = new HashMap<>();

        int max_size = 0;//记录最常出现字符次数
        int res=0;
        //A B B C
        while(right<n){


            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            max_size = Math.max(max_size, map.get(arr[right]));

            if((right - left + 1) - max_size > k){
                map.put(arr[left], map.get(arr[left]) - 1);
                left++;
            }
            res=Math.max(res,right-left+1);
            right++;


        }

        return res;


    }
}
// @lc code=end

