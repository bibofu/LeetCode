/*
 * @lc app=leetcode.cn id=165 lang=java
 *
 * [165] 比较版本号
 */

// @lc code=start
class Solution {
    public int compareVersion(String version1, String version2) {
       
       int index1=0;
       int index2=0;

       while(index1<version1.length()||index2<version2.length()){
           int sum1=0;
           int sum2=0;

           while(index1<version1.length()&&version1.charAt(index1)!='.'){
               sum1=10*sum1+version1.charAt(index1)-'0';
               index1++;
           }

           while(index2<version2.length()&&version2.charAt(index2)!='.'){
               sum2=10*sum2+version2.charAt(index2)-'0';
               index2++;
           }

           if(sum1>sum2){
               return 1;
           }else if(sum1<sum2){
               return -1;

           }

           index1++;
           index2++;
       }

       return 0;



    }
}
// @lc code=end

