/*
 * @lc app=leetcode.cn id=46 lang=java
 *
 * [46] 全排列
 */

// @lc code=start
class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();

        dfs(nums,temp,res);

        return res;

    }

    public void dfs(int[] nums,List<Integer> temp,List<List<Integer>> res){
        if(temp.size()==nums.length){
            res.add(new ArrayList<>(temp));
        }

        for(int i=0;i<nums.length;i++){
            if(temp.contains(nums[i])){
                continue;
            }

            temp.add(nums[i]);
            dfs(nums,temp,res);
            temp.remove(temp.size()-1);
        }
    }
}
// @lc code=end

