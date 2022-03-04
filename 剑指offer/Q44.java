package jianzhiOffer;

/**
 * @author fubibo
 * @create 2021-02-28 17:47
 */

import java.util.Arrays;

/**
 * 从扑克牌中随机抽5 张牌，判断是不是一个顺子，即这5 张牌是不是
 * 连续的。2~10 为数字本身，A 为1，J 为11，Q 为12，K 为13，大小王可以看成
 * 任意数字
 */
public class Q44 {
    public static void main(String[] args) {
        int[] test={2,3,4,5,6,7};
        System.out.println(isContinuous(test));
    }
    public static boolean isContinuous(int [] numbers) {
        if (numbers == null || numbers.length == 0) {
            return false;
        }
        int count = 0;
        int diff = 0;
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == 0) {
                count++;
                continue;
            }

            if (numbers[i] == numbers[i+1]) {
                return false;
            }
            diff += numbers[i+1] - numbers[i] - 1;
        }

        return diff <= count;
    }

}
