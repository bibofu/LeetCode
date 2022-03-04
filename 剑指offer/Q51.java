package jianzhiOffer;

/**
 * @author fubibo
 * @create 2021-02-28 17:51
 */

/**
 * 在一个长度为n 的数组里的所有数字都在0 到n-1 的范围内，找出数
 * 组中任意一个重复的数字
 */
public class Q51 {
    public static void main(String[] args) {

        int[] nums = new int[]{0, 2, 3, 1, 2, 5};
        int n = nums.length;
        int[] dup = new int[1];
        boolean flag = duplicate(nums, n, dup);
        System.out.println(flag + "," + dup[0]);

    }


    public static void swap(int[] nums, int m, int n) {

        int temp = nums[m];
        nums[m] = nums[n];
        nums[n] = temp;
    }

    public static boolean duplicate(int[] nums, int length, int[] duplication) {

        if (nums == null || length <= 0) {
            return false;
        }

        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    duplication[0] = nums[i];
                    return true;
                }
                swap(nums, nums[i], i);
            }
        }
        return false;
    }
}


