package jianzhiOffer;

/**
 * @author fubibo
 * @create 2021-02-28 17:38
 */

import java.util.ArrayList;
import java.util.Collections;

/**
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输
 * 入字符串abc,则打印出由字符a,b,c 所能排列出来的所有字符串abc,acb,bac,bca,cab
 * 和cba。
 *
 * https://blog.csdn.net/qq_43109561/article/details/89604895
 */
public class Q28 {
    public static void main(String[] args) {
        String test="acd";
        System.out.println(Permutation(test));

    }

    public static ArrayList<String> Permutation(String str){
        ArrayList<String> res=new ArrayList<>();
        if (str==null||str.length()==0){
            return res;
        }
        helper(res,0,str.toCharArray());
        Collections.sort(res);
        return res;

    }

    public static void helper(ArrayList<String> res,int index,char[] s){
        if (index==s.length-1){
            res.add(String.valueOf(s));
            return;
        }

        for (int i=index;i<s.length;i++){
            if (i==index||s[index]!=s[i]){
                swap(s,index,i);
                helper(res,index+1,s);
                swap(s,index,i);

            }
        }


    }

    public static void swap(char[] c,int a,int b){
        char temp=c[a];
        c[a]=c[b];
        c[b]=temp;
    }

}
