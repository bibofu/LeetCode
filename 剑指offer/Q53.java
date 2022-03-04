package jianzhiOffer;

/**
 * @author fubibo
 * @create 2021-02-28 17:52
 */

/**
 * 请实现一个函数用来匹配包括’.’和’*‘的正则表达式。模式中的字符’.’表
 * 示任意一个字符， 而* 表示它前面的字符可以出现任意次（包含0 次）
 */
public class Q53 {
    public static void main(String[] args) {

    }

    public boolean match(char[] str, char[] pattern) {
        if (str == null || pattern == null)
            return false;
// 若字符串的长度为1
        if (str.length == 1) {
            if (pattern.length == 1){
                if (str[0] == pattern[0] || pattern[0] == '.')
                    return true;
                return false;
            }
        }int sindex = 0;
        int pindex = 0;
        return matchIndex(str,sindex,pattern,pindex);
    }
    public boolean matchIndex(char[] str,int sindex, char[] pattern, int pindex) {
// str 和pattern 同时到达末尾，则匹配成功
        if (sindex == str.length && pindex == pattern.length)
            return true;
// 若pattern 先到尾，而str 没有到达末尾，则匹配失败
        if (sindex != str.length && pindex == pattern.length)
            return false;
// 若pattern 第二个字符是*
        if (pindex + 1 < pattern.length && pattern[pindex + 1] == '*') {
            if (sindex != str.length && pattern[pindex] == str[sindex] ||
                    sindex != str.length && pattern[pindex] == '.') {
                return matchIndex(str,sindex+1,pattern,pindex+2)

                        || matchIndex(str,sindex,pattern,pindex+2)
                        || matchIndex(str,sindex+1,pattern,pindex);
            } else {
                return matchIndex(str,sindex,pattern,pindex+2);
            }
        }// 若pattern 第二个字符不是*
        if (sindex != str.length && pattern[pindex] == str[sindex] ||
                sindex != str.length && pattern[pindex] == '.')
            return matchIndex(str,sindex+1,pattern,pindex+1);
        return false;
    }
}
