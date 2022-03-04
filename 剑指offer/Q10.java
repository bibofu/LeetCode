

/**
 * @author fubibo
 * @create 2021-02-24 11:14
 */

/**
 * 输入一个整数，输出该数二进制表示中1 的个数。其中负数用补码表
 * 示。
 */
public class Q10 {
    public static void main(String[] args) {
        System.out.println(find1(15));

    }

    public static int find1(int n){
        int count=0;
        while (n!=0){
            count++;
            n=n&(n-1);
        }
        return count;
    }

}
