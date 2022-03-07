/*
 * @lc app=leetcode.cn id=238 lang=java
 *
 * [238] 除自身以外数组的乘积
 */

// @lc code=start
class Solution {
    public int[] constructArr(int[] a) {
        
        if(a.length<=1){
            return new int[0];
        }
        
        int n=a.length;
        int[] left=new int[n];
        int[] right=new int[n];
        
        
        //1 2  3  4  5
        //1 1  2  6  24 left
        //1 5 20 60 120 right
       //120 60 40 30 24
        left[0]=1;
        for(int i=1;i<n;i++){
            left[i]=left[i-1]*a[i-1];
        }
        
        right[0]=1;
        for(int j=1;j<n;j++){
            right[j]=right[j-1]*a[n-j];
        }
        
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
                res[i]=right[n-1];
            }else if(i==n-1){
                res[i]=left[n-1];
            }else{
                res[i]=left[i]*right[n-i-1];
            }
        }
        
        return res;
        
    }
}
// @lc code=end

