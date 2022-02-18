/*
 * @lc app=leetcode.cn id=47 lang=java
 *
 * [47] 全排列 II
 */

// @lc code=start
class Solution {

    List<List<Integer>> res=new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {

        List<Integer> temp=new ArrayList<>();
        boolean[] flag=new boolean[nums.length];
        Arrays.sort(nums);

        dfs(nums,flag,temp);

        return res; 

    }

    public void dfs(int[] nums,boolean[] flag,List<Integer> temp){
        if(temp.size()==nums.length){
            res.add(new ArrayList<>(temp));
            return ;
        }

        for(int i=0;i<nums.length;i++){
            if(flag[i]){
                continue;
            }
            if(i>=1&&nums[i]==nums[i-1]&&!flag[i-1]){
                continue;
            }

            temp.add(nums[i]);
            flag[i]=true;
            dfs(nums,flag,temp);
            temp.remove(temp.size()-1);
            flag[i]=false;
        }
    }
}
// @lc code=end

