class Solution {
    public int diagonalSum(int[][] matrix) {
        int sum = 0 ;
        int n = matrix.length;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                if( i== j){
                    sum += matrix[i][j];
                }
                else if( i+j == n-1){
                    sum += matrix[i][j];
                }
            }
        }
    
      return sum;
}
}