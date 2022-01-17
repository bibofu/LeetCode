/*
 * @lc app=leetcode.cn id=415 lang=java
 *
 * [415] 字符串相加
 */

// @lc code=start
class Solution {
    public String addStrings(String num1, String num2) {

        StringBuilder sb=new StringBuilder();
        int carry=0;

        int index1=num1.length()-1;
        int index2=num2.length()-1;
        while(index1>=0||index2>=0||carry>0){
            int temp=0;
            if(index1>=0){
                temp=temp+num1.charAt(index1)-'0';
                index1--;

            }
            if(index2>=0){
                temp=temp+num2.charAt(index2)-'0';
                index2--;
            }
            temp+=carry;
            carry=temp/10;
            sb.append(temp%10);
        }

        return sb.reverse().toString();

    }
}
// @lc code=end

