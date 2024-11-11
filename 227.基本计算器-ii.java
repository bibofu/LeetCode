/*
 * @lc app=leetcode.cn id=227 lang=java
 *
 * [227] 基本计算器 II
 */

// @lc code=start
class Solution {
    public int calculate(String s) {
        int sum =0,prev=0,num=0;
        char prevOp='+';
        s=s.trim();
        s = s+" ";
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == ' '&&i!=n-1){
                continue;
            }
            if(Character.isDigit(ch)){
                num = num*10+ch-'0';
            }else{
                switch(prevOp){
                    case '+':
                        sum+=prev;
                        prev=num;
                        break;
                    case '-':
                        sum+=prev;
                        prev=-num;
                        break;
                    case '*':
                        prev*=num;
                        break;
                    case '/':
                        if(num!=0)
                            prev/=num;
                        break;
                }
                num = 0;
                prevOp = ch;
            }
        }

        return sum+prev;

    }
}
// @lc code=end

