/*
 * @lc app=leetcode.cn id=216 lang=java
 *
 * [216] 组合总和 III
 */

// @lc code=start
class Solution {
    
    List<List<Integer>> res=new ArrayList<>();
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<Integer> temp=new ArrayList<>();
        dfs(k,n,1,temp,0);
        
        return res;

    }
    
    public void dfs(int k,int n,int start,List<Integer> temp,int sum){
        if(sum==n&&k==0){
            res.add(new ArrayList<>(temp));
            return;
        }
        if(sum>=n||k<=0){
            return ;
        }
        
        for(int i=start;i<=9;i++){
            temp.add(i);
            dfs(k-1,n,i+1,temp,sum+i);
            temp.remove(temp.size()-1);
        }
    }
}
// @lc code=end

