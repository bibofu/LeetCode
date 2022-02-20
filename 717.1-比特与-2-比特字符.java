/*
 * @lc app=leetcode.cn id=717 lang=java
 *
 * [717] 1比特与2比特字符
 */

// @lc code=start
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        
        Stack<Integer> stack=new Stack<>();
        
        int n=bits.length;
        for(int i=0;i<n;i++){
            if(bits[i]==0&&stack.isEmpty()){
                if(i==n-1){
                    return true;
                }
                continue;
            }else{
                if(stack.isEmpty()){
                    stack.push(bits[i]);
                }else{
                    stack.pop();
                }
            }
        }
        
        return false;
        
        

    }
}
// @lc code=end

