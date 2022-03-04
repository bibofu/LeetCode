package jianzhiOffer;

/**
 * @author fubibo
 * @create 2021-02-28 17:41
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 求从小到大的第N 个丑数。丑数是只包含因子2、3 和5 的数，习惯
 * 上我们把1 当做是第一个丑数。
 */
public class Q34 {
    public static void main(String[] args) {
        System.out.println(getUglyNumber(8));

    }

    public static int getUglyNumber(int n){
        if (n<=0){
            return 0;
        }

        int[] arr=new int[n];
        arr[0]=1;
        int multiple2=0;
        int multiple3=0;
        int multiple5=0;
        for (int i = 1; i < n; i++) {
            int min=Math.min(arr[multiple2]*2,Math.min(arr[multiple3]*3,arr[multiple5]*5));

            arr[i]=min;
            if (arr[multiple2]*2==min){
                multiple2++;
            }

            if (arr[multiple3]*3==min){
                multiple3++;
            }

            if (arr[multiple5]*3==min){
                multiple5++;
            }

        }

        Map<Integer,Integer> map=new HashMap<>();

        return arr[n-1];
    }
}
