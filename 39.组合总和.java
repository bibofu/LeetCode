/*
 * @lc app=leetcode.cn id=39 lang=java
 *
 * [39] 组合总和
 */

// @lc code=start
class Solution {

    List<List<Integer>> res=new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        int start=0;
        int sum=0;
        List<Integer> temp=new ArrayList<>();

        dfs(candidates,target,start,sum,temp);

        return res;

    }

    public void dfs(int[] candidates,int target,int start,int sum,List<Integer> temp){
        if(sum==target){
            res.add(new ArrayList<>(temp));
            return ;
        }else if(sum>target){
            return ;
        }

        for(int i=start;i<candidates.length;i++){
            temp.add(candidates[i]);
            dfs(candidates,target,i,sum+candidates[i],temp);
            temp.remove(temp.size()-1);
        }

    }
}
// @lc code=end

