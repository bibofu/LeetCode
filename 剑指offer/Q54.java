package jianzhiOffer;

/**
 * @author fubibo
 * @create 2021-02-28 17:52
 */

/**
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）
 */
public class Q54 {
    public static void main(String[] args) {

    }
    public boolean isNumeric(char[] str) {
        if (str == null)
            return false;
        int index = 0;
        int ecount = 0;
        int point = 0;
// 如果第一个字符是符号就跳过
        if (str[0] == '-' || str[0] == '+')
            index++;
        for (int i = index; i < str.length; i++) {
            if (str[i] == '-' || str[i] == '+') {
                if (str[i-1] != 'e' && str[i-1] != 'E')
                    return false;
                continue;
            }
            if (str[i] == 'e' || str[i] == 'E') {
                ecount++;
                if (ecount > 1)
                    return false;
                if (i == 0 || str[i-1] < 48 || str[i-1] > 57 || i == str.length-1)
                return false;
                point++;
                continue;
            }
            if (str[i] == '.') {
                point++;
                if (point > 1)
                    return false;
                continue;
            }// 出现非数字且不是e/E 则返回false（小数点和符号用continue 跳过了）
            if ((str[i] < 48 || str[i] > 57) && (str[i] != 'e') && (str[i] != 'E'))
            return false;
        }return true;
    }
}
