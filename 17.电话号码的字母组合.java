/*
 * @lc app=leetcode.cn id=17 lang=java
 *
 * [17] 电话号码的字母组合
 */

// @lc code=start
class Solution {
    List<String> res=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return res;
        }
        
        helper(digits,"");
        return res;

    }
    
    public void helper(String s,String temp){
        if(s.length()==0){
            res.add(temp);
            temp=temp.substring(0,temp.length()-1);
            return ;
            
        }
        if(s.charAt(0)=='2'){
            helper(s.substring(1),temp+"a");
            helper(s.substring(1),temp+"b");
            helper(s.substring(1),temp+"c");
        }else if(s.charAt(0)=='3'){
            helper(s.substring(1),temp+"d");
            helper(s.substring(1),temp+"e");
            helper(s.substring(1),temp+"f");
        }else if(s.charAt(0)=='4'){
            helper(s.substring(1),temp+"g");
            helper(s.substring(1),temp+"h");
            helper(s.substring(1),temp+"i");
        }else if(s.charAt(0)=='5'){
            helper(s.substring(1),temp+"j");
            helper(s.substring(1),temp+"k");
            helper(s.substring(1),temp+"l");
        }else if(s.charAt(0)=='6'){
            helper(s.substring(1),temp+"m");
            helper(s.substring(1),temp+"n");
            helper(s.substring(1),temp+"o");
        }else if(s.charAt(0)=='7'){
            helper(s.substring(1),temp+"p");
            helper(s.substring(1),temp+"q");
            helper(s.substring(1),temp+"r");
            helper(s.substring(1),temp+"s");
        }else if(s.charAt(0)=='8'){
            helper(s.substring(1),temp+"t");
            helper(s.substring(1),temp+"u");
            helper(s.substring(1),temp+"v");
        }else if(s.charAt(0)=='9'){
            helper(s.substring(1),temp+"w");
            helper(s.substring(1),temp+"x");
            helper(s.substring(1),temp+"y");
            helper(s.substring(1),temp+"z");
        }
    }
}
// @lc code=end

