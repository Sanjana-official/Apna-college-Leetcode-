import java.util.*;

public class MyCode25{

    //my code's better version by gpt
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1]; //i didnt know the length of ans array
        // thats why i had used string to keep count.
        int[] dest = new int[k];

        for(int i = 0; i <= n - k; i++) {
            System.arraycopy(nums, i, dest, 0, k);
            Arrays.sort(dest);
            ans[i] = dest[k - 1];
        }

        return ans;

        //Time Complexity = O((n-k+1) * k log k)
        //≈ O(nk log k)

        // space complexity O(k)
    }
    public static void main(String[] args) {
        int k=1;
        int[] src = {1, -1};
        int[] dest = new int[k]; 
        StringBuilder total= new StringBuilder("");
        for(int i=0;i<(src.length-k)+1;i++)
        {
            System.arraycopy(src, i, dest, 0, k); 
            System.out.println(Arrays.toString(dest));
            
            Arrays.sort(dest);
            total.append(String.valueOf(dest[dest.length-1]));
            System.out.println(total);
        }
        
        String numberString = total.toString();
        int ans[]=new int[total.length()];

        for(int i=0;i<ans.length;i++)
        {
            char ch  = numberString.charAt(i);
            ans[i] = Character.getNumericValue(ch);
        }
        
        System.out.println(Arrays.toString(ans));
    }
}