class Solution { 
    public int projectionArea(int[][] grid) { 

        int area = 0; 

        for(int i = 0; i < grid.length; i++) { 

            int rowmax = 0; 
            int colmax = 0; 

            for(int j = 0; j < grid.length; j++) { 

                if(grid[i][j] > 0) {
                    area++; 
                } 

                rowmax = Math.max(rowmax, grid[i][j]); 
                colmax = Math.max(colmax, grid[j][i]); 
            } 

            area += rowmax;  
            area += colmax; 
        } 

        return area; 
    } 
}