

/**
 * @author fubibo
 * @create 2021-02-24 11:15
 */

/**
 * 给定一个double 类型的浮点数base 和int 类型的整数exponent。求
 * base 的exponent 次方。不得使用库函数，不需要考虑大数问题
 */
public class Q11 {
    public static void main(String[] args) {
        System.out.println(exponetDouble(2.5,2));

    }

    public static boolean equal(double a, double b) {
        if (a - b < 0.000001 && a - b > -0.000001) {
            return true;
        }
        return false;
    }

    public static double mutiply(double base, int e) {
        double sum = 1;
        for (int i = 0; i < e; i++) {
            sum = sum * base;
        }
        return sum;
    }
    public static double exponetDouble(double base,int exponent){
        double res=0;
        if (equal(base,0)){
            return 0;
        }
        if (exponent==0){
            return 1.0;
        }

        if(exponent>0){
            res=mutiply(base,exponent);

        }else {
            res=mutiply(1/base,-exponent);
        }

        return res;

    }
}
