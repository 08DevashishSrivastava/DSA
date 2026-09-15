class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int row  = matrix.length ;
        int col = matrix[0].length ;
        HashSet<Integer> minrow = new HashSet<>();
        HashSet<Integer> maxrow = new HashSet<>();
            for(int i = 0 ;  i<row ; i++){
              int minval = matrix[i][0];
                for(int  j = 0  ; j<col ; j++){
                     minval = Math.min(minval , matrix[i][j]);
                }
                minrow.add(minval);
            }
            for(int i = 0 ; i<col ; i++){
                int maxval = matrix[0][i];
                for(int j = 0 ; j<row ; j++){
                    int max = matrix[0][i];
                    maxval = Math.max(maxval , matrix[j][i]);
                }
                maxrow.add(maxval);
            }
            List<Integer> ans  = new ArrayList<>();
            for(int i = 0 ; i < row ; i++){
                for(int  j = 0 ; j < col ; j++){
                    if(minrow.contains(matrix[i][j])  &&  maxrow.contains(matrix[i][j])){
                        ans.add(matrix[i][j]);
                    }
                }
            }
            return ans;
    }
}