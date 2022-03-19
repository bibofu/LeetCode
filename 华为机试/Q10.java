import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;


//计算字符串中含有的不同字符的个数

public class Main{
        
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        System.out.println(helper(input));
    }
        
        
    public static int helper(String s){
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int cnt=map.getOrDefault(c,0);
            map.put(c,cnt+1);
        }
                
        return map.size();
    }
}