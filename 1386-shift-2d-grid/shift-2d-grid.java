// class Solution {
//     public List<List<Integer>> shiftGrid(int[][] grid, int k) {
//       int row = grid.length;
//       int col = grid[0].length;
//       int  n =  row * col ;
//       k = k % n;
//       if( k == 0 ){
//         return grid;
//       }

//       reverse(grid, 0 , n-1);
//       reverse(grid , 0 , k-1);
//       reverse(grid , 0 , n-1);
// }
//    public void reverse(int[] grid , int i , int j){
//       while( i < j){
//         int temp = grid[i/co][i%col];
//         grid[i/co][i%col] = grid[j/co][j%col];
//         grid[j/co][j%col] = temp;
//         i++;
//         j--;
//       }
//    }
//    }


// //  nhi a rha h 


// class Solution {  
//     public List<List<Integer>> shiftGrid(int[][] grid, int k) {  
        
//         int row = grid.length;  
//         int col = grid[0].length;  
//         int n = row * col;   // n missing tha

//         k = k % n;  

//         if (k == 0) {  
//             return grid;    
//         }  
  
//         reverse(grid, 0, n - 1, col);  
//         reverse(grid, 0, k - 1, col);  
//         reverse(grid, k, n - 1, col);  
//     }  

//     public void reverse(int[][] grid, int i, int j, int col) {  

//         while (i < j) {  

//             int temp = grid[i / col][i % col];  

//             grid[i / col][i % col] = grid[j / col][j % col];  

//             grid[j / col][j % col] = temp;  

//             i++;  
//             j--;  
//         }  
//     }  
// }



import java.util.*;

class Solution {

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int row = grid.length;
        int col = grid[0].length;

        int n = row * col;

        k = k % n;

        if (k == 0) {

            List<List<Integer>> ans = new ArrayList<>();

            for (int i = 0; i < row; i++) {

                List<Integer> list = new ArrayList<>();

                for (int j = 0; j < col; j++) {
                    list.add(grid[i][j]);
                }

                ans.add(list);
            }

            return ans;
        }

        reverse(grid, 0, n - 1, col);

        reverse(grid, 0, k - 1, col);

        reverse(grid, k, n - 1, col);

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < row; i++) {

            List<Integer> list = new ArrayList<>();

            for (int j = 0; j < col; j++) {
                list.add(grid[i][j]);
            }

            ans.add(list);
        }

        return ans;
    }

    public void reverse(int[][] grid, int i, int j, int col) {

        while (i < j) {

            int temp = grid[i / col][i % col];

            grid[i / col][i % col] =
                grid[j / col][j % col];

            grid[j / col][j % col] = temp;

            i++;
            j--;
        }
    }
}