/*
 * @lc app=leetcode.cn id=119 lang=java
 *
 * [119] 杨辉三角 II
 */

// @lc code=start
class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<List<Integer>> res=new ArrayList<>();
        
        for(int i=1;i<=rowIndex+1;i++){
            List<Integer> temp=new ArrayList<>();
            temp.add(1);
            if(i==1){
                res.add(temp);
                if(rowIndex==0){
                    return temp;
                }
            }else{
                for(int j=2;j<i;j++){
                    int a=res.get(i-2).get(j-1);
                    int b=res.get(i-2).get(j-2);
                    temp.add(a+b);
                }
                temp.add(1);
                if(i==rowIndex+1){
                    return temp;
                }
                res.add(temp);
            }
        }
        
        return null;
        
    }
}
// @lc code=end

