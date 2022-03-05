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
        int m=version1.length();
        int n=version2.length();
        while(index1<m&&index2<n){
            int temp1=0;
            int temp2=0;
            while(index1<m&&version1.charAt(index1)!='.'){
                temp1=10*temp1+version1.charAt(index1)-'0';
                index1++;
            }
            while(index2<n&&version2.charAt(index2)!='.'){
                temp2=10*temp2+version2.charAt(index2)-'0';
                index2++;
            }
            if(temp1>temp2){
                return 1;
            }else if(temp1<temp2){
                return -1;
            }else{
                index1++;
                index2++;
            }
            
        }
        
        while(index1<m){
            int temp=0;
            while(index1<m&&version1.charAt(index1)!='.'){
                temp=10*temp+version1.charAt(index1)-'0';
                index1++;
            }
            if(temp>0){
                return 1;
            }else{
                index1++;
            }
        }
        
         while(index2<n){
            int temp=0;
            while(index2<n&&version2.charAt(index2)!='.'){
                temp=10*temp+version2.charAt(index2)-'0';
                index2++;
            }
            if(temp>0){
                return -1;
            }else{
                index2++;
            }
        }
        
        return 0;

    }
}
// @lc code=end

