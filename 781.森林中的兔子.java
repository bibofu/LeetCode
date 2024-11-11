/*
 * @lc app=leetcode.cn id=781 lang=java
 *
 * [781] 森林中的兔子
 */

// @lc code=start
class Solution {
    public int numRabbits(int[] answers) {

        if(answers==null||answers.length==0){
            return 0;
        }

        //count[i]>0   先前已经记录到有回答i的兔子,这次遇到只需容量减1
        //count[i]==0  第一次遇到回答i的兔子或者上一次遇到回答i的兔子时创建颜色的容量已经用完. 
           
        int[] count = new int[1000];
        int result = 0;
        for (int i : answers) {
            if (count[i] > 0) {
                count[i]--;
            } else {
                count[i] = i;
                result += i + 1;
            }
        }
        return result;



    }
}
// @lc code=end

