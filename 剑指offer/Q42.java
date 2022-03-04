package jianzhiOffer;

import org.junit.Test;

/**
 * @author fubibo
 * @create 2021-02-28 17:46
 */
public class Q42 {
    /**
     * 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变
     */

    public String reverseSentence(String sentence) {
        if (sentence == null || sentence.length() == 0 || sentence.trim().length() == 0) {
            return sentence;
        }
        String blank = " ";
        String sentenceReverse = reverse(sentence);
        String[] splitStrings = sentenceReverse.split(blank);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < splitStrings.length - 1; i++) {
            sb.append(reverse(splitStrings[i])).append(blank);
        }
        sb.append(reverse(splitStrings[splitStrings.length - 1]));
        return String.valueOf(sb);
    }
    public String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0 ; i--) {
            sb.append(str.charAt(i));
        }
        return String.valueOf(sb);
    }

    /**
     * 对于一个给定的字符序列S，请你把其循环左移K 位后的序列输出
     */


    public String leftRemoveK(String s,int k){
        if (s==null||s.length()==0){
            return s;
        }
        String s1 = reverse(s.substring(0, k));
        String s2=s.substring(k,s.length());

        return s2+s1;
    }

    @Test
    public void test(){
        String s="Hello World";
        System.out.println(reverseSentence(s));

        System.out.println(leftRemoveK(s,3));
    }


}
