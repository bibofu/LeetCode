/*
 * @lc app=leetcode.cn id=228 lang=java
 *
 * [228] 汇总区间
 */

// @lc code=start
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        int n = nums.length;
        if(n==0){
            return res;
        }
        int index = 0;
        for(int i=1;i<n;i++){
            if(nums[i] - nums[i-1] != 1){
                String temp = make_string(nums,index,i-1);
                res.add(temp);
                index = i;
            }
        }

        res.add(make_string(nums,index,n-1));
        return res;

    }

    public String make_string(int[] nums,int a,int b){
        String res = "";
        if(a==b){
            return String.valueOf(nums[a]);
        }
        res = String.valueOf(nums[a])+"->"+String.valueOf(nums[b]);

        return res;
    }
}
// @lc code=end

