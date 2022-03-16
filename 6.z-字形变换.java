/*
 * @lc app=leetcode.cn id=6 lang=java
 *
 * [6] Z 字形变换
 */

// @lc code=start
class Solution {
    public String convert(String s, int numRows) {
        
        StringBuilder[] sbs=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            sbs[i]=new StringBuilder();
        }
        
        int n=s.length();
        int index=0;
        
        while(index<n){
            //上到下
            for(int i=0;i<numRows;i++){
                sbs[i].append(s.charAt(index));
                index++;
                if(index>=n){
                    break;
                }
            }
            
            if(index>=n){
                break;
            }
            
            for(int i=numRows-2;i>0;i--){
                sbs[i].append(s.charAt(index));
                index++;
                if(index>=n){
                    break;
                }
            }
        }
        
        String res="";
        for(StringBuilder sb:sbs){
            res=res+sb.toString();
        }
        
        return res;
        

    }
}
// @lc code=end

