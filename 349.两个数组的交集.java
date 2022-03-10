/*
 * @lc app=leetcode.cn id=349 lang=java
 *
 * [349] 两个数组的交集
 */

// @lc code=start
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> set=new HashSet<>();
        for(int i:nums1){
            set.add(i);
        }
        
        int[] res=new int[nums1.length];
        int index=0;
        for(int i:nums2){
            if(set.contains(i)){
                res[index++]=i;
                set.remove(i);
            }
        }
        
        return Arrays.copyOfRange(res,0,index);

    }
}
// @lc code=end

