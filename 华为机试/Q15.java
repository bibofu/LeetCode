import java.util.Scanner;

//输入一个 int 型的正整数，计算出该 int 型数据在内存中存储时 1 的个数。
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        System.out.println(helper(input));

    }

    public static int helper(int num){

        int res=0;
        while(num!=0){
            num=num&(num-1);
            res++;
        }

        return res;

    }
}

