/*
 * @lc app=leetcode.cn id=8 lang=java
 *
 * [8] 字符串转换整数 (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String s) {
    
        String str=s.trim();
        
        if(str.length()==0){
            return 0;
        }       
        int length=str.length();
        
        int symbol=1;        
        long res=0;
        
        if(str.charAt(0)=='+'){
            symbol=1; 
        }else if(str.charAt(0)=='-'){
            symbol=-1;
        }else if(!Character.isDigit(str.charAt(0))){
            return 0;
        }else{
            res=str.charAt(0)-'0';
        }
        
        for(int i = 1;i<length;i++){
            if(!Character.isDigit(str.charAt(i))){
                return (int)res*symbol;
            }
                    
            res=res*10+(str.charAt(i)-'0');
            
            if(res*symbol>=Integer.MAX_VALUE){    
                return Integer.MAX_VALUE;
            }
            
            if(res*symbol<=Integer.MIN_VALUE){    
                return Integer.MIN_VALUE;
            }
                   
            
        }
                 
        return (int)res*symbol;
        

    }
}
// @lc code=end

