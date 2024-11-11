/*
 * @lc app=leetcode.cn id=4 lang=java
 *
 * [4] 寻找两个正序数组的中位数
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    
        int length=nums1.length+nums2.length;
    
        int[] temp=new int[length];
        int index1=0;
        int index2=0;
        int index=0;
        
        double res=0.0;
        
        while(index1<nums1.length&&index2<nums2.length){
            if(nums1[index1]<=nums2[index2]){
                temp[index]=nums1[index1];
                index++;
                index1++;
            }else{
                temp[index]=nums2[index2];
                index++;
                index2++;
            }
        }
        
        while(index1<nums1.length){
            temp[index]=nums1[index1];
            index++;
            index1++;
        }
        
        while(index2<nums2.length){
            temp[index]=nums2[index2];
            index++;
            index2++;
        }
        
        if(length%2==0){
            int i1=(length-1)/2;
            int i2=(length+1)/2;
            res=(double)(temp[i1]+temp[i2])/2;
        }else{
            int i3=length/2;
            res=temp[i3];
        }
        
        return res;
    }
}
// @lc code=end

