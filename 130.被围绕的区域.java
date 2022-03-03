/*
 * @lc app=leetcode.cn id=130 lang=java
 *
 * [130] 被围绕的区域
 */

// @lc code=start
class Solution {
    public void solve(char[][] board) {
        
        int m=board.length;
        int n=board[0].length;
        boolean[][] flag=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0||i==m-1||j==0||j==n-1){
                    if(board[i][j]=='O'){
                        dfs(board,i,j,flag);
                    }
                }
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(flag[i][j]){
                    board[i][j]='O';
                }else{
                    board[i][j]='X';
                }
            }
        }
        

    }
    public void dfs(char[][] board,int i,int j,boolean[][] flag){
        if(i<0||i>=board.length||j<0||j>=board[0].length){
            return ;
        }
        if(board[i][j]=='X'){
            return ;
        }
        if(flag[i][j]==true){
            return ;
        }
        flag[i][j]=true;
        
        dfs(board,i+1,j,flag);
        dfs(board,i-1,j,flag);
        dfs(board,i,j+1,flag);
        dfs(board,i,j-1,flag);
    }
}
// @lc code=end

