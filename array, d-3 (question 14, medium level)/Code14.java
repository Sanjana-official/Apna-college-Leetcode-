public class Code14{
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 1){
            return intervals;
        }
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

        int[][] result = new int[intervals.length][2];

        int k = 0;

        result[0][0] = intervals[0][0];
        result[0][1] = intervals[0][1];

        for(int i = 1; i < intervals.length; i++)
        {
            if(result[k][1] >= intervals[i][0])
            {
                result[k][1] = Math.max(result[k][1], intervals[i][1]);
            }
            else
            {
                k++;
                result[k][0] = intervals[i][0];
                result[k][1] = intervals[i][1];
            }
        }

        return Arrays.copyOf(result, k + 1);
    }
}