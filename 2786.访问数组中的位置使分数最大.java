/*
 * @lc app=leetcode.cn id=2786 lang=java
 *
 * [2786] 访问数组中的位置使分数最大
 */

// @lc code=start
class Solution {
    public long maxScore(int[] nums, int x) {

        int n = nums.length;
        Stack<Long> qishu = new Stack<>();
        Stack<Long> oushu = new Stack<>();

        if(nums[0]%2 == 0){
            oushu.push((long)nums[0]);
        }else{
            qishu.push((long)nums[0]);
        }

        for(int i = 1;i<n;i++){
            if(is_qishu(nums[i])){
                if(qishu.size() == 0){
                    qishu.push((long)(oushu.peek() + nums[i] -x));
                }else{
                    if(oushu.size()!=0){
                        qishu.push((long)Math.max(qishu.peek()+nums[i],oushu.peek()+nums[i]-x));
                    }else{
                        qishu.push((long)(qishu.peek()+nums[i]));
                    }
                }
            }else if(!is_qishu(nums[i])){
                if(oushu.size() == 0){
                    oushu.push(qishu.peek() + nums[i] -x);
                }else{
                    if(qishu.size()!=0){
                        oushu.push(Math.max(oushu.peek()+nums[i],qishu.peek()+nums[i]-x));
                    }else{
                        oushu.push(oushu.peek()+nums[i]);
                    }
                }
            }
        }

        if(qishu.size() == 0){
            return oushu.peek();
        }else if(oushu.size() ==0){
            return qishu.peek();
        }else{
            return Math.max(qishu.peek(),oushu.peek());
        }
        

    }

    public boolean is_qishu(long a){
        return a%2 == 1;
    }


}
// @lc code=end

