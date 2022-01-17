/*
 * @lc app=leetcode.cn id=6 lang=java
 *
 * [6] Z 字形变换
 */

// @lc code=start
class Solution {
    public String convert(String s, int numRows) {
    
        int index=0;
        int length=s.length();
        String[] strs=new String[numRows];
        for(int i=0;i<numRows;i++){
            strs[i]="";
        }
        int i;
        int j;
        
        while(index<length){
            //上到下
            for(i=0;i<numRows;i++){
                if(index>=length){
                    break;
                }
                strs[i]+=s.charAt(index);
                index++;
            }
            
            //下到上
            for(j=numRows-2;j>0;j--){
                if(index>=length){
                    break;
                }
                strs[j]+=s.charAt(index);
                index++;
            
            }
            
        }
        
        for(int k=1;k<numRows;k++){
            strs[0]+=strs[k];
        }
        
        return strs[0];
        

    }
}
// @lc code=end

