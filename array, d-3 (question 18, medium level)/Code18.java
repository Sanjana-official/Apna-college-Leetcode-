import java.util.*;
public class Code18 {
   public int[] productExceptSelf(int[] nums) {
       int ans[]=new int[nums.length];
       ans[0]=1;
       for(int i=1;i<ans.length;i++)
       {
            ans[i] = ans[i-1]*nums[i-1];
       }

       int suffix=1;
       for(int i=nums.length-2;i>=0;i--)
       {
            suffix = nums[i+1]*suffix;
            ans[i]= ans[i]*suffix;
       }

       return ans;
    }
}
