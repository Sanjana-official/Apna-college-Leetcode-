class Code150 {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int minutes = 0;
        boolean changed = true;

        while(changed){
            changed = false;
            for (int i = 0; i < rows; i++) 
            {
                for (int j = 0; j < cols; j++) 
                {
                    if (grid[i][j] == 2) 
                    {
                        if (i+1 < rows && grid[i+1][j] == 1) 
                        {
                            grid[i+1][j] = 3;
                            changed = true;
                        }

                        if (i-1 >= 0 && grid[i-1][j] == 1) 
                        {
                            grid[i-1][j] = 3;
                            changed = true;
                        }

                        if (j+1 < cols && grid[i][j+1] == 1) 
                        {
                            grid[i][j+1] = 3;
                            changed = true;
                        }

                        if (j-1 >= 0 && grid[i][j-1] == 1) 
                        {
                            grid[i][j-1] = 3;
                            changed = true;
                        }
                    }
                }
            }

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (grid[i][j] == 3)
                        grid[i][j] = 2;
                }
            }
            if(changed) 
            {
                minutes++;
            }
        }

        for (int[] row : grid) 
        {
            for (int cell : row) 
            {
                if (cell == 1)
                {
                    return -1;
                }
            }
        }

        return minutes;
    }
}