/*
 * @lc app=leetcode.cn id=1200 lang=java
 *
 * [1200] 最小绝对差
 */

// @lc code=start
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        List<List<Integer>> res = new LinkedList<>();
        Arrays.sort(arr);

        Queue<Integer> stack = new LinkedList<>();

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] < min) {
                while (!stack.isEmpty()) {
                    stack.poll();
                }
                stack.offer(i);
                min = arr[i + 1] - arr[i];
            } else if (arr[i + 1] - arr[i] == min) {
                stack.offer(i);
            }

        }

        while (!stack.isEmpty()){
            LinkedList<Integer> temp = new LinkedList<>();
            int i=stack.poll();
            temp.add(arr[i]);
            temp.add(arr[i+1]);
            res.add(temp);

        }

        return res;




    }
}
// @lc code=end

