package cn.bibofu.huawei;

import java.util.Scanner;

/**
 * @author fubibo
 * @create 2022-03-28 下午5:04
 */
//若两个正整数的和为素数，则这两个正整数称之为“素数伴侣”
// 有一个正偶数 n ，表示待挑选的自然数的个数。后面给出 n 个具体的数字。
//输出一个整数 K ，表示你求得的“最佳方案”组成“素数伴侣”的对数
public class Q28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] input=new int[n];
        for(int i=0;i<n;i++){
            input[i]=sc.nextInt();
        }
        System.out.println(helper(input,input.length));


    }
    private static int helper(int[] arr, int n) {
        if (arr == null || n == 0 || n % 2 != 0) {
            return 0;
        }
        int[] dp = new int[n+1];
        int count = 0;
        for (int i = n - 2; i > -1; i--)
        {
            for (int j = n - 1; j > i; j--)
            {
                count = isPrime(arr[i]+arr[j]) ? (dp[i + 1] - dp[j - 1] + dp[j + 1] + 1) : dp[i + 1];
                dp[i] = (count > dp[i]) ? count : dp[i];
            }
        }
        return dp[0];
    }

    public static boolean isPrime(int n) {
        int count = (int) Math.sqrt(n);
        while (count > 1) {
            if (n % count == 0 ) {
                return false;
            }
            count--;
        }

        return true;
    }
}
