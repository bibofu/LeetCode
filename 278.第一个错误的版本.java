/*
 * @lc app=leetcode.cn id=278 lang=java
 *
 * [278] 第一个错误的版本
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int left=1;
        int right=n;
        
        int res=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            //尽量往左边找
            if(isBadVersion(mid)){
                res=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        
        return res;
        
    }
}
// @lc code=end

