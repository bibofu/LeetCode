/*
 * @lc app=leetcode.cn id=118 lang=java
 *
 * [118] 杨辉三角
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> res=new ArrayList<>();
        
        for(int i=1;i<=numRows;i++){
            List<Integer> temp=new ArrayList<>();
            temp.add(1);
            if(i==1){
                res.add(temp);
            }else{
                for(int j=2;j<i;j++){
                    int a=res.get(i-2).get(j-1);
                    int b=res.get(i-2).get(j-2);
                    temp.add(a+b);
                }
                temp.add(1);
                res.add(temp);
            }
        }
        
        return res;

    }
}
// @lc code=end

