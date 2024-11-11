/*
 * @lc app=leetcode.cn id=224 lang=java
 *
 * [224] 基本计算器
 */

// @lc code=start
class Solution {
    public int calculate(String s) {
        Queue<Character> q = new ArrayDeque<>();
        for(char c:s.toCharArray()){
            if(c!=' '){
                q.offer(c);
            }
        }
        q.offer(' ');
        return helper(q);
    }

    public int helper(Queue<Character> q){
        int sum=0,prev=0,num=0;
        char prevOp = '+';

        while(!q.isEmpty()){
            char ch = q.poll();
            if(Character.isDigit(ch)){
                num = num*10+ch-'0';
            }else if(ch == '('){
                num = helper(q);
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
                }
                if(ch ==')'){
                    break;
                }
                prevOp = ch;
                num = 0;
            }
        }

        return sum + prev;
    }

}
// @lc code=end

