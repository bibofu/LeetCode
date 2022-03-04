

/**
 * @author fubibo
 * @create 2021-02-24 11:06
 */
public class Q9 {
    public static void main(String[] args) {
        System.out.println(finbo(5));

        System.out.println(jumpMethod(5));

        System.out.println(coverMethod(5));

        System.out.println(jumpTime(5));
    }
    /**
     * 现在要求输入一个整数n，请你输出斐波那契数列的第n 项。n<=39
     */
    public static long finbo(int n){
        long result=0;
        long pre1=1;
        long pre2=0;
        if (n==0){
            return 0;
        }

        if (n==1){
            return 1;
        }

        for (int i = 2; i <=n; i++) {
            result= pre1+pre2;
            pre2=pre1;
            pre1=result;
        }

        return result;

    }

    /**
     * 一只青蛙一次可以跳上1 级台阶，也可以跳上2 级。求该青蛙跳上一
     * 个n 级的台阶总共有多少种跳法。
     */

    public static int jumpMethod(int n){
        if (n<3){
            return n;
        }
        int result=0;
        int pre2=1;
        int pre1=2;
        for (int i=3;i<=n;i++){
            result=pre1+pre2;
            pre2=pre1;
            pre1=result;
        }
        return result;


    }

    /**
     * 我们可以用2X1 的小矩形横着或者竖着去覆盖更大的矩形。请问用n
     * 个2X1 的小矩形无重叠地覆盖一个2Xn 的大矩形，总共有多少种方法？
     */

    public static int coverMethod(int n){
        int number=1;
        int sum=1;
        if (n<=0){
            return -1;
        }
        if (n==1){
            return 1;
        }

        while (n-->=2){
            sum+=number;
            number=sum-number;
        }

        return sum;

    }


    /**
     * 一只青蛙一次可以跳上1 级台阶，也可以跳上2 级……它也可以跳上n
     * 级。求该青蛙跳上一个n 级的台阶总共有多少种跳法。
     */

    public static int  jumpTime(int n){
        return (int) Math.pow(2,n-1);

    }
}
