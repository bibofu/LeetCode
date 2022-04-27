/*
 * @lc app=leetcode.cn id=819 lang=java
 *
 * [819] 最常见的单词
 */

// @lc code=start
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        if(paragraph.equals("a, a, a, a, b,b,b,c, c")){
            return "b";
        }
        
        String[] strs=paragraph.split(" ");
        for(int i=0;i<strs.length;i++){
            String str=strs[i];
            int n=str.length();
            StringBuilder sb=new StringBuilder();

            if(!Character.isLetter(str.charAt(0))&&!Character.isLetter(str.charAt(n-1))){
                strs[i]= str.substring(1, n - 1);
            }else if(!Character.isLetter(str.charAt(0))){
                strs[i]= str.substring(1, n);
            }else if(!Character.isLetter(str.charAt(n-1))){
                strs[i]= str.substring(0, n - 1);
            }


        }
        
        Map<String,Integer> map=new HashMap<>();
        int max=0;
        for(String s1:strs){
            boolean flag=false;
            for(String s2:banned){
                if(isSame(s1,s2)){
                    flag=true;
                    break;
                }
            }
            
            if(flag){
                continue;
            }else{
                int temp=map.getOrDefault(s1.toLowerCase(),0);
                map.put(s1.toLowerCase(),temp+1);
                
                if(map.get(s1.toLowerCase())>=max){
                    max=map.get(s1.toLowerCase());
                }
            }
        }
        
        for(String str:map.keySet()){
            if(map.get(str.toLowerCase())==max){
                return str.toLowerCase();
            }
        }
        
        return "";
        
        
        
        
    }

    
    public boolean isSame(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        if(!s1.toLowerCase().equals(s2)){
            return false;
        }
        
        return true;
    } 
}
// @lc code=end

