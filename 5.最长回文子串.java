class Solution {
    public String longestPalindrome(String s) {
        
        int n=s.length();
        boolean[][] dp=new boolean[n][n];
        int left=0;
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(i-j<2){
                    dp[j][i]=s.charAt(j)==s.charAt(i);
                }else{
                    dp[j][i]=dp[j+1][i-1]&&(s.charAt(j)==s.charAt(i));
                }
                
                if(dp[j][i]&&i-j+1>max){
                    max=i-j+1;
                    left=j;
                }
            }
        }
        
        return s.substring(left,left+max);

    }
}