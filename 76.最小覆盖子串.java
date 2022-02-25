/*
 * @lc app=leetcode.cn id=76 lang=java
 *
 * [76] 最小覆盖子串
 */

// @lc code=start
class Solution {
    public String minWindow(String s, String t) {

        Map<Character,Integer> map=new HashMap<>();
        int n=t.length();
        for(int i=0;i<n;i++){
            char ch=t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        } 
        int i=0;
        int j=0;
        int count=map.size();
        int left=0;
        int right=s.length()-1;
        int min=s.length();
        boolean found=false;

        while(j<s.length()){
            char endChar=s.charAt(j);
            j++;
            if(map.containsKey(endChar)){
                map.put(endChar,map.get(endChar)-1);
                if(map.get(endChar)==0){
                    count--;
                }
            }

            if(count>0){
                continue;
            }

            while(count==0){
                char startChar=s.charAt(i);
                i++;
                if(map.containsKey(startChar)){
                    map.put(startChar,map.get(startChar)+1);
                    if(map.get(startChar)>0){
                        count++;
                    }
                }
                
            }

            if(j-i<min){
                left=i;
                right=j;
                min=j-i;
                found=true;

            }
        }

        return found?s.substring(left-1,right):"";

    }
}
// @lc code=end

