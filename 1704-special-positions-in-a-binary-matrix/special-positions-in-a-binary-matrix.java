class Solution {
    public int numSpecial(int[][] matrix) {
        int row  = matrix.length;
        int col = matrix[0].length;
        int[] rowCount  = new int[row];
        int[] colCount = new int[col];
        for(int i = 0  ; i<row ; i++){
            for(int j = 0 ; j < col ; j++){
               if (matrix[i][j] == 1) {
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }
        int count = 0 ;
        for(int i = 0 ; i< row ; i++){
            for(int  j = 0 ; j<col ; j++){
                if(matrix[i][j] == 1){
                if(rowCount[i] == 1 &&   colCount[j] == 1){
                    count++;
                }
            }
        }
        }
        return count++;
    }
}