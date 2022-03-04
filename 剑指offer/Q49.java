package jianzhiOffer;

/**
 * @author fubibo
 * @create 2021-02-28 17:50
 */

/**
 * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函
 * 数。数值为0 或者字符串不是一个合法的数值则返回0
 */
public class Q49 {
    public static void main(String[] args) {
        String test="fubibo";
        System.out.println(tranStringToInt(test));

    }

    public static int tranStringToInt(String s) {
        if (s.length() == 0 || s == null) {
            return 0;
        }

        int mark = 0;
        int number = 0;
        char[] chars = s.toCharArray();
        if (chars[0] == '-')
            mark = 1;
        for (int i = mark; i < chars.length; i++) {
            if (chars[i] == '+') {
                continue;
            }
            if (chars[i] < 48 || chars[i] > 57) {
                return 0;
            }
            number = number * 10 + chars[i] - 48;
        }

        return mark == 0 ? number : -number;
    }

}

