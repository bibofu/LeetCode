package jianzhiOffer;

/**
 * @author fubibo
 * @create 2021-02-23 16:20
 */

/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列
 * 都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一
 * 个整数，判断数组中是否含有该整数。
 */

//双指针，数组
public class Q3 {
    public static void main(String[] args) {
        int[][] test={{1,2,3,4},{4,5,7,8}};
        System.out.println(hasNum(test,5));

    }

    public static boolean hasNum(int[][] nums,int target){
        if (nums==null||nums.length==0){
            return false;
        }
        int row=0;
        int col=nums[0].length-1;
        while (row<nums.length&&col>=0){
            if (nums[row][col]==target){
                return true;
            }
            if (nums[row][col]>target){
                col--;
            }else {
                row++;
            }
        }
        return false;
    }

}
