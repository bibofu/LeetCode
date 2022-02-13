/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现 strStr()
 */

// @lc code=start
class Solution {
    public int strStr(String t, String p) {
        
        int length1=t.length();
        int length2=p.length();
        
        if(length2==0){
            return 0;
        }
        
        int[] pi=new int[length2];
        
        computePrefix(p,pi);
        
        int k=-1;
        for(int i=0;i<length1;i++){
            while(k>=0 && p.charAt(k+1)!=t.charAt(i)){
                k=pi[k];
            }
            
            if(p.charAt(k+1)==t.charAt(i)){
                k++;
            }
            
            if(k==length2-1){
                return i-length2+1;
            }
        }
        
        return -1;    

    }

    
    //pi数组,无匹配为-1,一个匹配为0
    private void computePrefix(String p,int[] pi){
        pi[0]=-1;
        int k=-1;
        
        int length=p.length();
        for(int i=1;i<length;i++){
            while(k>=0 && p.charAt(k+1)!=p.charAt(i)){
                k=pi[k];
            }
            if(p.charAt(k+1)==p.charAt(i)){
                k++;
            }
            pi[i]=k;   
        }
    }
}
// @lc code=end

