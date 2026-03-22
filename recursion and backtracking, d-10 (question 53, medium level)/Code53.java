public class Code53{
    public boolean checkValidGrid(int[][] grid) {
        int n = grid.length;

        // step -> position
        int[][] pos = new int[n * n][2];

        // fill positions
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                int step = grid[i][j];
                pos[step][0] = i;
                pos[step][1] = j;
            }
        }

        // check starting point
        if (pos[0][0] != 0 || pos[0][1] != 0) 
        {
            return false;
        }

        // check all moves
        for (int i = 1; i < n * n; i++) 
        {

            int x1 = pos[i - 1][0];
            int y1 = pos[i - 1][1];

            int x2 = pos[i][0];
            int y2 = pos[i][1];

            int dx = Math.abs(x1 - x2);
            int dy = Math.abs(y1 - y2);

            if (!((dx == 2 && dy == 1) || (dx == 1 && dy == 2))) 
            {
                return false;
            }
        }

        return true;
    }
}