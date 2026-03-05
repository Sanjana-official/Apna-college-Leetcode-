public class Code23 {
     public static boolean searchMatrix(int[][] matrix, int target) {
        int j=matrix[0].length-1;
        int i=0;
        System.out.println("before loop, i = "+i+",j= "+j);
        while(i<matrix.length-1 && j>=0)
        {
            System.out.println("matrix = "+matrix[i][j]+", i= "+i+", j = "+j);
            if(target == matrix[i][j])
            {
                return true;
            }
            else if(target < matrix[i][j])
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,1}};
        System.out.println(searchMatrix(matrix,1));
    }
}
