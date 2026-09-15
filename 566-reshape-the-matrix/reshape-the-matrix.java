class Solution {
    public int[][] matrixReshape(int[][] matrix, int r, int c) {
         int row = matrix.length ;
         int col = matrix[0].length ;
         if(row*col != r*c){
            return matrix;
         }
         int [][]ans = new int[r][c];
         int  k = 0;
         for( int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
              ans[k / c][k % c] = matrix[i][j];
              k++;
            }
         }
         return ans;
    }
}