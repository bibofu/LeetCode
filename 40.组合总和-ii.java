/*
 * @lc app=leetcode.cn id=40 lang=java
 *
 * [40] 组合总和 II
 */

// @lc code=start
class Solution {

    List<List<Integer>> res=new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);
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
            if(i>start&&candidates[i]==candidates[i-1]){
                continue;
            }

            temp.add(candidates[i]);
            dfs(candidates,target,i+1,sum+candidates[i],temp);
            temp.remove(temp.size()-1);
        }
    }
}
// @lc code=end

