import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        System.out.println(helper(input));
    }

    public static int helper(int n){

        int res=0;
        Set<Integer> set=new HashSet<>();
        while(n>0){
            int temp=n%10;
            if(!set.contains(temp)){
                set.add(temp);
                res=res*10+temp;
            }
            n=n/10;
        }
        return res;

    }
}