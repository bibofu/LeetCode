/*
 * @lc app=leetcode.cn id=496 lang=java
 *
 * [496] 下一个更大元素 I
 */

// @lc code=start
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int n=nums1.length;
        int[] res=new int[n];
        
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            map.put(nums2[i],i);
        }
        
        for(int i=0;i<n;i++){
            int t=map.get(nums1[i]);
            boolean find =false;
            for(int j=t+1;j<nums2.length;j++){
                if(nums2[j]>nums1[i]){
                    res[i]=nums2[j];
                    find=true;
                    break;
                }
            }
            
            if(!find){
                res[i]=-1;
            }
        }
        return res;

    }
}
// @lc code=end

