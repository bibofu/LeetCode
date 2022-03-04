package jianzhiOffer;

/**
 * @author fubibo
 * @create 2021-02-28 17:48
 */

/**
 * 求1+2+3+…+n，要求不能使用乘除法、for、while、if、else、
 * switch、case 等关键字及条件判断语句（A?B:C）。
 */
public class Q46 {
    public static void main(String[] args) {

        System.out.println(Sum_Solution(1));
    }
    public static int Sum_Solution(int n) {
        int sum = n;
        boolean result = (n > 0) && ((sum += Sum_Solution(n-1)) > 0);
        return sum;
    }
}
