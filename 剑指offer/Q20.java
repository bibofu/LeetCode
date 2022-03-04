

/**
 * @author fubibo
 * @create 2021-02-24 11:21
 */

import java.util.ArrayList;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数
 * 字，例如，如果输入如下4X4 矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次
 * 打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class Q20 {
    public static void main(String[] args) {
        int[][] test={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(printVt(test));


    }

    public static ArrayList<Integer> printVt(int[][] nums){
        ArrayList<Integer> res=new ArrayList<>();
        if (nums==null||nums.length==0){
            return  res;
        }

        int row1=0,row2=nums.length-1;
        int col1=0,col2=nums[0].length-1;

        while (row1<=row2&&col1<=col2){
            //从左往右
            for (int col=col1;col<=col2;col++){
                res.add(nums[row1][col]);
            }

            //从上往下
            for (int row=row1+1;row<=row2;row++){
                res.add(nums[row][col2]);
            }

            if (row1<row2&&col1<col2){
                //从右往左
                for (int col=col2-1;col>col1;col--){
                    res.add(nums[row2][col]);
                }

                //从下往上
                for (int row = row2; row>row1 ; row--) {
                    res.add(nums[row][col1]);

                }

                row1++;
                row2--;

                col1++;
                col2--;

            }



        }
        return res;

    }
}
