/*
 * @lc app=leetcode.cn id=30 lang=java
 *
 * [30] 串联所有单词的子串
 */

// @lc code=start
class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        
        List<Integer> res=new ArrayList<>();
        
        //有几个单词
        int num=words.length;
        if(num==0){
            return res;
        }
        
        int wordlen=words[0].length();
        
        //HashMap1存放所有单词及其出现次数
        Map<String,Integer> allWords=new HashMap<>();
        
        for(String word:words){
            int value=allWords.getOrDefault(word,0);
            allWords.put(word,value+1);
        }
        
        //遍历所有子串
        int length=s.length();
        for(int i=0;i<length-num*wordlen+1;i++){
            //HashMap2存放当前扫描字符串含有的单词
            Map<String,Integer> hasWords=new HashMap<>();
            
            int n=0;
            while(n<num){
                String word=s.substring(i+n*wordlen,i+(n+1)*wordlen);

                int value=hasWords.getOrDefault(word,0);
                hasWords.put(word,value+1);
                if(hasWords.get(word)>allWords.getOrDefault(word,0)){
                    break;
                }
                
                n++;
            }
            if(n==num){
                res.add(i);    
            }
        }
        
        return res;

    }
}
// @lc code=end

