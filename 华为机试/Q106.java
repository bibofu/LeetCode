package cn.bibofu.huawei;

import java.util.Scanner;

/**
 * @author fubibo
 * @create 2022-03-28 下午4:22
 */
//将一个字符串str的内容颠倒过来，并输出。
public class Q106 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            StringBuilder sb = new StringBuilder(sc.nextLine());
            System.out.println(sb.reverse());
        }

    }
}
