/*
 * @lc app=leetcode.cn id=77 lang=java
 *
 * [77] 组合
 */

// @lc code=start
class Solution {
    List<List<Integer>> res=new ArrayList<>();
    
    public List<List<Integer>> combine(int n, int k) {
        
        int start=0;
        List<Integer> temp=new ArrayList<>();
        dfs(n,k,1,temp);
        
        return res;

    }
    
    public void dfs(int n,int k,int start,List<Integer> temp){
        if(temp.size()==k){
            res.add(new ArrayList<>(temp));
            return ;
        }
        
        for(int i=start;i<=n;i++){
            temp.add(i);
            dfs(n,k,i+1,temp);
            temp.remove(temp.size()-1);
        }
    }
}
// @lc code=end

