class Code175 {
    Integer[][] dp;
    public int solve(int[] cuts, int i, int j){
        if(j-i<2) return 0;

        if(dp[i][j]!=null) return dp[i][j];
        int ans = Integer.MAX_VALUE;
        int currLen = cuts[j] - cuts[i]; // current length of stick
        for(int len=i+1; len<j; len++){ // cut at this len
            int left = solve(cuts, i, len);
            int right = solve(cuts, len, j);
            int currCost = currLen + left + right;

            ans = Math.min(ans, currCost);
        }
        return dp[i][j] = ans;
    }
    public int minCost(int n, int[] cuts) {
        Arrays.sort(cuts); // so we get the current cut at left and right in recursion
        int total_cuts = cuts.length;
        int[] modi = new int[total_cuts+2];
        modi[0] = 0;
        for(int i=0; i<total_cuts; i++){
            modi[i+1] = cuts[i];
        }
        modi[total_cuts+1] = n;
        // dp = new Integer[modi.length][modi.length];
        // return solve(modi, 0, modi.length-1);


        // Tabulation - 
        int[][] dp = new int[modi.length][modi.length];

        for(int i=modi.length-1; i>=0; i--){
            for(int j=i+1; j<modi.length; j++){
                if(j-i<2){
                    dp[i][j] = 0;
                    continue;
                }
                int ans = Integer.MAX_VALUE;
                int currLen = modi[j] - modi[i];
                for(int len=i+1; len<j; len++){
                    int left = dp[i][len];
                    int right = dp[len][j];
                    int currCost = currLen + left + right;

                    ans = Math.min(ans, currCost);
                }
                dp[i][j] = ans;
            }
        }
        return dp[0][modi.length-1];
    }
}