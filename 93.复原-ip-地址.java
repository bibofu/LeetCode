/*
 * @lc app=leetcode.cn id=93 lang=java
 *
 * [93] 复原 IP 地址
 */

// @lc code=start
class Solution {

    List<String> res=new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        dfs(s,0,"");
        return res;

     
    }

    public void dfs(String s,int n,String ip){

        if(n==4&&s.length()==0){

            res.add(ip.substring(0,ip.length()-1));
            return ;
        }
        if(n>4){
            return ;
        }
        int left=4-n;
        if(s.length()<left||s.length()>3*left){
            return ;
        }

        for(int i=1;i<=3;i++){
            if(s.length()<i){
                return ;
            }

            String part=s.substring(0,i);
            int num=Integer.valueOf(part);
            if(part.length()!=String.valueOf(num).length()){
                return;
            }

            if(num>255){
                return;
            }

            dfs(s.substring(i),n+1,ip+part+'.');

        }

    }

   
}
// @lc code=end

