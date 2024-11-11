/*
 * @lc app=leetcode.cn id=165 lang=java
 *
 * [165] 比较版本号
 */

// @lc code=start
class Solution {
    public int compareVersion(String version1, String version2) {
        String[] nums1 = version1.split("\\.");
        String[] nums2 = version2.split("\\.");

        int index1 = 0;
        int index2 = 0;
        while(index1<nums1.length && index2<nums2.length){
            int c1 = Integer.valueOf(nums1[index1]);
            int c2 = Integer.valueOf(nums2[index2]);

            if(c1 > c2){
                return 1;
            }else if(c1 < c2){
                return -1;
            }

            index1++;
            index2++;
        }

        //1.0.1 1.0
        while(index1 < nums1.length){
            int c1 = Integer.valueOf(nums1[index1]);
            if(c1 > 0){
                return 1;
            }
            index1++;
        }

        while(index2 < nums2.length){
            int c2 = Integer.valueOf(nums2[index2]);
            if(c2 > 0){
                return -1;
            }
            index2++;
        }

        return 0;

    }
}
// @lc code=end

