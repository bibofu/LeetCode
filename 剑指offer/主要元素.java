

/**
 * @author fubibo
 * @create 2021-02-28 17:38
 */

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数
 * 字。如果不存在则输出0。
 */
class Solution {
    public int majorityElement(int[] nums) {
        
        int cnt=0;
        int candidate=0;
        for(int i:nums){
            if(cnt==0){
                candidate=i;
                cnt=1;
            }else{
                if(i==candidate){
                    cnt++;
                }else{
                    cnt--;
                }
            }
        }
        
        cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==candidate){
                cnt++;
            }
        }
        
        return cnt*2>nums.length?candidate:-1;
        
        
    }
}