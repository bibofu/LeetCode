/*
 * @lc app=leetcode.cn id=51 lang=java
 *
 * [51] N 皇后
 */

// @lc code=start
class Solution {

    List<List<String>> res=new ArrayList<>();
    int n;
    boolean[][] board;
    HashSet<Integer> lie,pie,na;

    public List<List<String>> solveNQueens(int n) {
        this.n=n;
        this.board=new boolean[n][n];
        this.lie=new HashSet<>();
        this.pie=new HashSet<>();
        this.na=new HashSet<>();
        dfs(0);
        return res;

    }

    public void dfs(int row){
        if(row==n){
            generate_res(board);
            return;
        }

        for(int col=0;col<n;col++){
            if(lie.contains(col)||pie.contains(row+col)||na.contains(row-col)){
                continue;
            }
            board[row][col]=true;
            lie.add(col);
            pie.add(row+col);
            na.add(row-col);

            dfs(row+1);
            lie.remove(col);
            pie.remove(row+col);
            na.remove(row-col);
            board[row][col]=false;
        }
    }

     public void generate_res(boolean[][] board){

        List<String> temp=new ArrayList<>();
        for(int i=0;i<n;i++){
            StringBuilder sb=new StringBuilder();
                
            for(int j=0;j<n;j++){
                if(board[i][j]==true){
                    sb.append('Q');
                }else{
                    sb.append('.');
                }

            }
            temp.add(sb.toString());
                

        }
        res.add(temp);
    }
}
// @lc code=end

