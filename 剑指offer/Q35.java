package jianzhiOffer;

/**
 * @author fubibo
 * @create 2021-02-28 17:41
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

/**
 * 在一个字符串(1<=字符串长度<=10000，全部由字母组成)中找到第一
 * 个只出现一次的字符,并返回它的位置
 */
public class Q35 {
    public static void main(String[] args) {

        String s="welcome to chongqing we";
        System.out.println(findAppearOne(s));




    }

    public static int findAppearOne(String s){

        if (s==null||s.length()==0){
            return -1;
        }

        char[] chars = s.toCharArray();
        LinkedHashMap<Character,Integer> hashMap=new LinkedHashMap<>();

        for (char item:chars){
            if (hashMap.containsKey(item)){
                hashMap.put(item,hashMap.get(item)+1);
            }else {
                hashMap.put(item,1);
            }
        }

        for (int i=0;i<s.length();i++){
            if (hashMap.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;

    }

}
