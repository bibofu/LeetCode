package cn.bibofu.huawei;

import java.util.Scanner;

/**
 * @author fubibo
 * @create 2022-03-28 下午4:44
 */
//计算字符串的编辑距离
public class Q52 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        System.out.println(distance(a,b));

    }

    public static int distance(String a,String b){
        int m=a.length();
        int n=b.length();
        int[][] dp=new int[m+1][n+1];
        dp[0][0]=0;
        for(int i=1;i<=m;i++){
            dp[i][0]=i;
        }
        for(int i=1;i<=n;i++){
            dp[0][i]=i;
        }

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                char c1=a.charAt(i-1);
                char c2=b.charAt(j-1);
                if(c1==c2){
                    dp[i][j]=dp[i-1][j-1];
                }else{
                    int update=dp[i-1][j-1]+1;
                    int insert=Math.min(dp[i-1][j],dp[i][j-1])+1;
                    int delete=Math.min(dp[i-1][j],dp[i][j-1])+1;
                    dp[i][j]=Math.min(update,insert);
                }
            }
        }

        return dp[m][n];
    }
}
