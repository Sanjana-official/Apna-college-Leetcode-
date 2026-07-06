class Code188 {
    public int findLongestChain(int[][] pairs) {
        Integer[] line = new Integer[2001];

        for (int[] w: pairs) {
            if (line[w[1] + 1000] != null) line[w[1]+1000] = Math.max(line[w[1] + 1000], w[0]); 
            else line[w[1] + 1000] = w[0];
        } 

        int ans =0, last=-2000;
        for (int i=0; i<line.length; i++) {
            if (line[i] != null && line[i] > last) {
                ans ++ ;
                last = i - 1000;
            }
        }

        return ans;
    }
}