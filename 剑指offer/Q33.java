package jianzhiOffer;

/**
 * @author fubibo
 * @create 2021-02-28 17:40
 */

import java.util.Arrays;

/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印
 * 能拼接出的所有数字中最小的一个
 */
public class Q33 {
    public static void main(String[] args) {
        int[] test={0,1,2,5,4};
        System.out.println(minPingjie(test));

    }

    public static int minPingjie(int[] nums){
        StringBuilder sb=new StringBuilder();
        Arrays.sort(nums);
        for (int i:nums){
            sb.append(i);
        }

        String s=String.valueOf(sb);
        return Integer.parseInt(s);

    }
}
