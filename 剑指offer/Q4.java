package jianzhiOffer;

/**
 * @author fubibo
 * @create 2021-02-23 16:32
 */

/**
 * 将一个字符串中的空格替换成“%20”。例如：当字符串为We Are
 * Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Q4 {
    public static void main(String[] args) {
        StringBuilder test=new StringBuilder("We Are Happy");
        System.out.println(replaceBy(test));

    }
    public static StringBuilder replaceBy(StringBuilder str){
        StringBuilder res=new StringBuilder();
        for (int i = 0; i <str.length() ; i++) {
            if (String.valueOf(str.charAt(i)).equals(" ")){
                res.append("%20");
            }else {
                res.append(str.charAt(i));
            }

        }
        return res;
    }
}
