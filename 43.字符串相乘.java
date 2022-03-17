/*
 * @lc app=leetcode.cn id=43 lang=java
 *
 * [43] 字符串相乘
 */

// @lc code=start
class Solution {
    public String multiply(String num1, String num2) {
        
        int n1=num1.length();
        int n2=num2.length();
        // 99
        // 99
    //      81
    //     81
    //     81
    //    81     
        int[] res=new int[n1+n2];
        for(int i=n1-1;i>=0;i--){
            for(int j=n2-1;j>=0;j--){
                int a=num1.charAt(i)-'0';
                int b=num2.charAt(j)-'0';
                
                int pos1=i+j;
                int pos2=i+j+1;
                
                int temp=a*b+10*res[pos1]+res[pos2];
                res[pos2]=temp%10;
                res[pos1]=temp/10;
                
            }
        }
        
        StringBuilder sb=new StringBuilder();
        boolean flag=true;
        for(int i:res){
            if(i==0&&flag){
                continue;
            }
            flag=false;
            sb.append(i);
        }
        
        if(sb.length()==0){
            return "0";
        }
        return sb.toString();
    }
    
}
// @lc code=end

