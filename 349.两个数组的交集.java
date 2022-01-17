/*
 * @lc app=leetcode.cn id=349 lang=java
 *
 * [349] 两个数组的交集
 */

// @lc code=start
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        ArrayList<Integer> list = new ArrayList<>();

        Arrays.sort(nums1);

        for (int i=0;i<nums1.length;i++){
            if (i>0&&nums1[i]==nums1[i-1]){
                continue;
            }
            for (int j=0;j<nums2.length;j++){
                if (nums1[i]==nums2[j]){
                    list.add(nums1[i]);
                    break;
                }
            }
        }

        int[] res=new int[list.size()];
        for (int i=0;i<list.size();i++){
            res[i]=list.get(i);

        }

        return res;



    }
}
// @lc code=end

