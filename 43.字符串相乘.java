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

        int[] res=new int[n1+n2];

        for(int i=n1-1;i>=0;i--){
            for(int j=n2-1;j>=0;j--){
                int x=num1.charAt(i)-'0';
                int y=num2.charAt(j)-'0';

                int pos1=i+j;
                int pos2=i+j+1;

                int sum=x*y+10*res[pos1]+res[pos2];
                res[pos2]=sum%10;
                res[pos1]=sum/10;
            }
        }

        StringBuilder sb=new StringBuilder();
        boolean flag=false;

        for(int i:res){
            if(i==0&&!flag){
                continue;
            }
            sb.append(i);
            flag=true;
        }

        return sb.length()==0?"0":sb.toString();

    }
}
// @lc code=end

