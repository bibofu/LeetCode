package jianzhiOffer;

/**
 * @author fubibo
 * @create 2021-02-28 17:48
 */

/**
 * 圆圈中最后剩下的数字（约瑟夫环）
 */

/**
 * 约瑟夫问题是个有名的问题：N个人围成一圈，从第一个开始报数，第M个将被杀掉，最后剩下一个，其余人都将被杀掉。例如N=6，M=5，被杀掉的顺序是：5，4，6，2，3。
 * 分析：
 * （1）由于对于每个人只有死和活两种状态，因此可以用布尔型数组标记每个人的状态，可用true表示死，false表示活。
 * （2）开始时每个人都是活的，所以数组初值全部赋为false。
 * （3）模拟杀人过程，直到所有人都被杀死为止。
 */

//https://www.cnblogs.com/sessionbest/articles/8689242.html
public class Q45 {
    public static void main(String[] args) {
        System.out.println(lastRemain(5,3));

    }

    public static int lastRemain(int n, int m) {
        if (n < 1 || m < 1) {
            return -1;
        }
        int last = 0;
        for (int i = 2; i <= n; i ++) {
            // i 个人时删除数的索引等于i-1 个人时删除数的索引+k(再对i 取余)
            last = (last + m) % i;
        }
        return last;
    }
}
