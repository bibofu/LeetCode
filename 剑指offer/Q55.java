package jianzhiOffer;

/**
 * @author fubibo
 * @create 2021-02-28 17:53
 */

import org.junit.Test;

/**
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符。
 */
public class Q55 {
    char[] chars = new char[256];
    StringBuilder sb = new StringBuilder();
    public void Insert(char ch) {
        sb.append(ch);
        chars[ch]++;
    }
    public char FirstAppearingOnce() {
        char[] str = sb.toString().toCharArray();
        for (char c : str) {
            if (chars[c] == 1) {
                return c;
            }
        }return '#';
    }

    @Test
    public void test(){

    }

}
