/*
 * @lc app=leetcode.cn id=2244 lang=java
 *
 * [2244] 完成所有任务需要的最少轮数
 */

// @lc code=start
class Solution {
    public int minimumRounds(int[] tasks) {
        List<Integer> set = new ArrayList<>();
        int res = 0;
        Arrays.sort(tasks);
        int temp = tasks[0];
        int count = 0;
        for(int i = 0;i<tasks.length;i++){
            if(tasks[i] == temp){
                count++;
            }else{
                temp = tasks[i];
                set.add(count);
                count=1;
            }
        }
        set.add(count);
        for(int i:set){
            if(helper(i)==-1){
                return -1;
            }else{
                res+=helper(i);
            }
        }

        return res;
    }

    public int helper(int num){
        if(num==1){
            return -1;
        }else{
            return (num-1)/3+1;
        }
    }
}
// @lc code=end

