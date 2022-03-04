package jianzhiOffer;

/**
 * @author fubibo
 * @create 2021-02-28 17:49
 */

/**
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四
 * 则运算符号。
 */
public class Q47 {
    public static void main(String[] args) {

        System.out.println(Add(5,6));
    }
    public static int Add(int num1,int num2) {
        while (num2 != 0) {
            // 计算个位
            int temp = num1 ^ num2;
            // 计算进位（1+1）
            num2 = (num1 & num2) << 1;
            num1 = temp;
        }

        return num1;
    }

}
