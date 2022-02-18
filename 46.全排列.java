/*
 * @lc app=leetcode.cn id=46 lang=java
 *
 * [46] 全排列
 */

// @lc code=start
class Solution {

    List<List<Integer>> res=new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {

        List<Integer> temp=new ArrayList<>();
        boolean[] flag=new boolean[nums.length];
        
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

            temp.add(nums[i]);
            flag[i]=true;
            dfs(nums,flag,temp);
            temp.remove(temp.size()-1);
            flag[i]=false;
        }
    }

    
}
// @lc code=end

