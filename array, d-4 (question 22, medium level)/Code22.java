import java.util.ArrayList;
import java.util.List;

public class Code22{
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;
        while(startRow<=endRow && startCol <= endCol)
        {
            //top
            for(int i=startCol;i<=endCol;i++)
            {
               result.add(matrix[startRow][i]);
            }

            //right
            for(int i=startRow+1;i<=endRow;i++)
            {
                result.add(matrix[i][endCol]);
            }

            //bottom
            for(int i=endCol-1;i>=startCol;i--)
            {
                if(endRow==startRow)
                {
                    break;
                }
                result.add(matrix[endRow][i]);
            }

            //left
            for(int i=endRow-1;i>=startRow+1;i--)
            {
                if(endCol==startCol)
                {
                    break;
                }
                 result.add(matrix[i][startCol]);
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return result;
    }
}