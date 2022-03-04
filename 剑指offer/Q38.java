package jianzhiOffer;

/**
 * @author fubibo
 * @create 2021-02-28 17:43
 */

import java.util.Arrays;

/**
 * 统计一个数字在排序数组中出现的次数。
 */
public class Q38 {
    public static void main(String[] args) {
        int[] test={1,2,3,3,3,3,3,3,4,5,6,7};
        System.out.println(getNumberOfK(test,3));

    }

    public static int getNumberOfK(int[] arraySorted, int k) {
        if (arraySorted == null || arraySorted.length == 0) {
            return 0;
        }if (arraySorted.length == 1) {
            return arraySorted[0] == k ? 1 : 0;
        }

        int result = 0;
        int mid = arraySorted.length / 2;
        if (k < arraySorted[mid]) {
            result += getNumberOfK(Arrays.copyOfRange(arraySorted, 0, mid), k);
        } else if (k > arraySorted[mid]) {
            result += getNumberOfK(Arrays.copyOfRange(arraySorted, mid, arraySorted.length), k);
        } else {
            result += getCount(arraySorted, mid);
        }
        return result;
    }
    private static int getCount(int[] arraySorted, int mid) {
        int k = arraySorted[mid];
        int result = 0;
        for (int i = mid; i < arraySorted.length; i++) {
            if (arraySorted[i] == k) {
                result++;
            } else {
                break;
            }
        }
        for (int i = mid - 1; i >= 0; i--) {
            if (arraySorted[i] == k) {
                result++;
            } else {
                break;
            }
        }
        return result;
    }
}
