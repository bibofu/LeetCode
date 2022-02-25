/*
 * @lc app=leetcode.cn id=78 lang=java
 *
 * [78] 子集
 */

// @lc code=start
class Solution {
    
    List<List<Integer>> res=new ArrayList<>();
    
    public List<List<Integer>> subsets(int[] nums) {
        
        List<Integer> temp=new ArrayList<>();
        int start=0;
        
        dfs(nums,temp,start);
        
        return res;

    }
    
    public void dfs(int[] nums,List<Integer> temp,int start){
        
        res.add(new ArrayList<>(temp));
        
        for(int i=start;i<nums.length;i++){
            temp.add(nums[i]);
            dfs(nums,temp,i+1);
            temp.remove(temp.size()-1);
        }
        
    }
}
// @lc code=end

