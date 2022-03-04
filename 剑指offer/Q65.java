package jianzhiOffer;

/**
 * @author fubibo
 * @create 2021-02-28 17:58
 */

/**
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值
 */

import org.junit.Test;

import java.util.ArrayList;

/**思路：两个for 循环，第一个for 循环滑动窗口，第二个for 循环滑动窗口中的
 *      值，寻找最大值。还可以使用时间复杂度更低的双端队列求解。
 */
 public class Q65 {

     @Test
     public void test(){

     }
    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> list = new ArrayList<>();
        if (num == null || size < 1 || num.length < size)
            return list;
        int length = num.length - size + 1;
        for (int i = 0; i < length; i++) {
            int current = size + i;
            int max = num[i];
            for (int j = i; j < current; j++) {
                if (max < num[j]) {
                    max = num[j];
                }

            }list.add(max);
        }return list;
    }
}
