/*
 * @lc app=leetcode.cn id=416 lang=java
 *
 * [416] 分割等和子集
 */

// @lc code=start
class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i:nums){
            sum += i;
        }
        if(sum%2 == 1){
            return false;
        }
        int target = sum/2;
        Set<Integer> set = new HashSet<>();
        set.add(0);
        for(int number:nums){
            ArrayList<Integer> list = new ArrayList<>(set);
            for(int i=0;i<list.size();i++){
                set.add(list.get(i)+number);
            }
        }
        for(int i:nums){
            if(!set.contains(target-i)){
                return false;
            }
        }

        return true;

    }
}

class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i:nums){
            sum += i;
        }
        if(sum%2 == 1){
            return false;
        }
        
        int target = sum/2;
        boolean[] dp = new boolean[target+1];
        dp[0] = true;
        for(int num:nums){
            for(int i=target;i>=num;i--){
                dp[i] = dp[i]||dp[i-num];
            }
        }

        return dp[target];

    }
}
// @lc code=end

