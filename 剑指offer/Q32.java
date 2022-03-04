package jianzhiOffer;

/**
 * @author fubibo
 * @create 2021-02-28 17:40
 */

/**
 * 输入一个整数n，求从1 到整数n 的十进制表示中1 出现的次数
 */
public class Q32 {
    public static void main(String[] args) {

        System.out.println(findOneTime(11));

    }

    public static int findOneTime(int n){
        int count=0;
        for (int i=1;i<=n;i=i*10){
           int a=n/i;
           int b=n%i;
           count=count+(a+8)/10*i;

           if (a%10==1){
               count=count+b+1;
           }
        }

        return count;
    }
}
