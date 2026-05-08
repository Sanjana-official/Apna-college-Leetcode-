public class Code37
{
    public String longestPrefix(String s) {
        int n = s.length();
        int[] lps = new int[n];
        lps[0] = 0;
        int i=1; 
        int len = 0;
        while(i < s.length()){
            if(s.charAt(i) == s.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }else{
                if(len != 0) len = lps[len-1];
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        int end = lps[n-1];
        return s.substring(0,end);
    }
}