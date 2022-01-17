/*
 * @lc app=leetcode.cn id=93 lang=java
 *
 * [93] 复原 IP 地址
 */

// @lc code=start
class Solution {
    public List<String> restoreIpAddresses(String s) {

        List<String> res=new ArrayList<>();

        dfs(s,0,"",res);
        return res;

    }

    public void dfs(String s,int n,String ip,List<String> res){
        if(n==4&&s.length()==0){
            res.add(ip.substring(0,ip.length()-1));
            return;
        }

        if(n>4){
            return;
        }
        int left=4-n;
        if(s.length()<left||s.length()>left*3){
            return;
        }

        for(int i=1;i<=3;i++){

            if(s.length()<i){
                return;
            }

            String part=s.substring(0,i);
            int nums=Integer.valueOf(part);
            if(part.length()!=String.valueOf(nums).length()){
                return;
            }

            if(nums>255){
                return;
            }

            dfs(s.substring(i),n+1,ip+part+'.',res);

        }
    }
}
// @lc code=end

