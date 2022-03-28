package cn.bibofu.huawei;

import java.util.Scanner;

/**
 * @author fubibo
 * @create 2022-03-17 下午1:16
 */

//接受一个只包含小写字母的字符串，然后输出该字符串反转后的字符串。（字符串长度不超过1000）
public class Q12 {
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        helper(input);
    }

    public static void helper(String s){
        StringBuilder sb=new StringBuilder(s);


        System.out.println(sb.reverse().toString());
    }
}
