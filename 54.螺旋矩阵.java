class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> res=new ArrayList<>();
        
        //最小行列index
        int r1=0,c1=0;
        
        //最大行列index
        int r2=matrix.length-1,c2=matrix[0].length-1;
        
        while(r1<=r2&&c1<=c2){
            //从左到右
            for(int i=c1;i<=c2;i++){
                res.add(matrix[r1][i]);
            }
            
            //从上到下
            for(int i=r1+1;i<=r2;i++){
                res.add(matrix[i][c2]);
            }
                        
            if(c1<c2&&r1<r2){
                
                //从右到左
                for(int i=c2-1;i>=c1;i--){
                    res.add(matrix[r2][i]);
                }

                //从下到上
                for(int i=r2-1;i>r1;i--){
                    res.add(matrix[i][c1]);
                }
            }
            
            r1++;
            c1++;
            r2--;
            c2--;
        }
        
        return res;
    }
}