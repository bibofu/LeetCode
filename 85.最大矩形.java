/*
 * @lc app=leetcode.cn id=85 lang=java
 *
 * [85] 最大矩形
 */

// @lc code=start
class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length==0){
            return 0;
        }
        int max=0;
        int[][] nums=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                nums[i][j]=matrix[i][j]-'0';
            }
        }
        
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                if(nums[i][j]==0){
                    continue;
                }else{
                    nums[i][j]=nums[i-1][j]+1;
                }
            }
        }
        
        for(int[] num:nums){
            max=Math.max(max,largestRectangleArea(num));
        }
        
        return max;
        
        
        
        

    }
    
    public int largestRectangleArea(int[] heights) {
        if(heights.length==1){
            return heights[0];
        }

        Deque<Integer> stack=new ArrayDeque<>();
        stack.push(0);
        int max=0;

        int n=heights.length;
        for(int i=1;i<n;i++){
            int cur=heights[i];
            if(cur>=heights[stack.peek()]){
                stack.push(i);
            }else{
                while(!stack.isEmpty()&&cur<heights[stack.peek()]){
                    int temp=heights[stack.pop()];
                    if(stack.isEmpty()){
                        max=Math.max(max,temp*i);
                    }else{
                        max=Math.max(max,temp*(i-stack.peek()-1));
                    }
                }
                stack.push(i);
            }
        }

        if(!stack.isEmpty()){
            int i=heights.length;
            while(!stack.isEmpty()){
                int temp=heights[stack.pop()];
                if(stack.isEmpty()){
                    max=Math.max(max,temp*i);
                }else{
                    max=Math.max(max,temp*(i-stack.peek()-1));
                }
            }
        }

        return max;

    }
}
// @lc code=end

