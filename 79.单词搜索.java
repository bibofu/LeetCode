/*
 * @lc app=leetcode.cn id=79 lang=java
 *
 * [79] 单词搜索
 */

// @lc code=start
class Solution {
    
    boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        
        int row=board.length;
        int col=board[0].length;
        visited=new boolean[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]==word.charAt(0)&&searchWord(i,j,0,word,board)){
                    return true;
                }
            }
        }
        
        return false;

    }
    
    public boolean searchWord(int i,int j,int index,String word,char[][] board){
        if(index==word.length()){
            return true;
        }
        
        
        if(i<0||i>=board.length||j<0||j>=board[0].length){
            return false;
        }
        
        if(word.charAt(index)!=board[i][j]||visited[i][j]){
            return false;
        }
        
        visited[i][j]=true;
        
        if(searchWord(i+1,j,index+1,word,board)||
           searchWord(i-1,j,index+1,word,board)||
           searchWord(i,j+1,index+1,word,board)||
           searchWord(i,j-1,index+1,word,board)
        ){
            return true;
        }
        
        visited[i][j]=false;
        
        return false;
    }
}
// @lc code=end

