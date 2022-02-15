/*
 * @lc app=leetcode.cn id=36 lang=java
 *
 * [36] 有效的数独
 */

// @lc code=start
class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        return checkRow(board)&&checkCol(board)&&check9(board);

        
    }
    
    public boolean checkRow(char[][] board){
        
        for(int i=0;i<9;i++){
            Set<Character> set=new HashSet<>();
            
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(set.contains(board[i][j])){
                    return false;
                }
                set.add(board[i][j]);
            }
        }
        
        return true;
    }
    
    public boolean checkCol(char[][] board){
        
        for(int i=0;i<9;i++){
            
            Set<Character> set=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[j][i]=='.'){
                    continue;
                }
                if(set.contains(board[j][i])){
                    return false;
                }
                set.add(board[j][i]);
                
            }
        }
        
        return true;
    
    }
    
    public boolean check9(char[][] board){
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                if(!check9Gong(i,j,board)){
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean check9Gong(int a,int b,char[][] board){
        Set<Character> set=new HashSet<>();
        for(int i=a;i<=a+2;i++){
            for(int j=b;j<=b+2;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(set.contains(board[i][j])){
                    return false;
                }
                set.add(board[i][j]);
            }
        }
        
        return true;
        
    }
}
// @lc code=end

