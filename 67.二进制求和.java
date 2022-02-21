/*
 * @lc app=leetcode.cn id=67 lang=java
 *
 * [67] 二进制求和
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        
        StringBuilder sb=new StringBuilder();
        
        int len1=a.length();
        int len2=b.length();
        int index1=len1-1;
        int index2=len2-1;
        int carry=0;
        while(index1>=0&&index2>=0){
            int i=a.charAt(index1)-'0';
            int j=b.charAt(index2)-'0';
            int res=i+j+carry;
            sb.append(res%2);
            carry=res/2;
            index1--;
            index2--;
        }
        
        while(index1>=0){
            int res=a.charAt(index1)-'0'+carry;
            sb.append(res%2);
            carry=res/2;
            index1--;
        }
        while(index2>=0){
            int res=b.charAt(index2)-'0'+carry;
            sb.append(res%2);
            carry=res/2;
            index2--;
        }
        if(carry==1){
            sb.append(1);
        }
        
        return sb.reverse().toString();

    }
}
// @lc code=end

