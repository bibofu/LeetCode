package cn.bibofu.huawei;

import java.util.Scanner;

/**
 * @author fubibo
 * @create 2022-03-17 下午1:00
 */

/**
 * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示
 */
public class Q5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        int res=helper(input);
        System.out.println(res);
    }

    public static int helper(String  s){
        int res =0;
        int n=s.length();
        int index=0;
        for(int i=n-1;i>=2;i--){
            char c=s.charAt(i);
            if(c-'0'>=0&&c-'0'<10){
                res= (int) (res+(c-'0')*Math.pow(16,index));
                index++;
            }else if(c=='A'){
                res= (int) (res+10*Math.pow(16,index));
                index++;
            }else if(c=='B'){
                res= (int) (res+11*Math.pow(16,index));
                index++;
            }else if(c=='C'){
                res= (int) (res+12*Math.pow(16,index));
                index++;
            }else if(c=='D'){
                res= (int) (res+13*Math.pow(16,index));
                index++;
            }else if(c=='E'){
                res= (int) (res+14*Math.pow(16,index));
                index++;
            }else if(c=='F'){
                res= (int) (res+15*Math.pow(16,index));
                index++;
            }
        }

        return res;
    }
}
