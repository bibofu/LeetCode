/*
 * @lc app=leetcode.cn id=90 lang=java
 *
 * [90] 子集 II
 */

// @lc code=start
class Solution {
    
    List<List<Integer>> res=new ArrayList<>();
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        Arrays.sort(nums);
        
        List<Integer> temp=new ArrayList<>();
        
        dfs(nums,0,temp);
        return res;

    }
    
    public void dfs(int[] nums,int start,List<Integer> temp){
        if(res.contains(temp)){
            return ;
        }
        res.add(new ArrayList<>(temp));
        if(start>=nums.length){
            return ;
        }
        for(int i=start;i<nums.length;i++){
            
            if(i>=1&&nums[i]==nums[i-1]&&temp.size()==0){
                continue;
            }
            temp.add(nums[i]);
            dfs(nums,i+1,temp);
            temp.remove(temp.size()-1);
        }
    }
}
// @lc code=end

