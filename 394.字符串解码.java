/*
 * @lc app=leetcode.cn id=394 lang=java
 *
 * [394] 字符串解码
 */

// @lc code=start
class Solution {
    public String decodeString(String s) {

        Stack<Integer> counts=new Stack<>();
        Stack<String> result=new Stack<>();
        String res="";
        int index=0;
        int n=s.length();
        while(index<n){
            char ch=s.charAt(index);
            if(Character.isDigit(ch)){
                int temp=0;
                while(Character.isDigit(s.charAt(index))){
                    temp=temp*10+s.charAt(index)-'0';
                    index++;
                }
                counts.push(temp);
            }else if(ch=='['){
                res.push(res);
                res="";
                index++;
            }else if(ch==']'){
                StringBuilder sb=new StringBuilder(result.pop());
                int count=counts.pop();
                for(int i=0;i<count;i++){
                    temp.append(res);
                }
                res=temp.toString();
                index++;
            }else{
                res+=ch;
                index++;
            }
        }

        return res;

    }
}
// @lc code=end

