package cn.bibofu.huawei;

import java.util.Scanner;

/**
 * @author fubibo
 * @create 2022-03-28 下午4:42
 */

//求最小公倍数
public class Q108 {
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(m*n/helper(m,n));
    }

    //求最大公约数
    public static int helper(int a,int b){
        if(b==0){
            return a;
        }
        return helper(b,a%b);
    }
}
