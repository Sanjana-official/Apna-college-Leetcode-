public class Code7{
    public static int maxSubArray(int[] nums) {
        int maxProfit = Integer.MIN_VALUE;
        int current_sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums.length==1)
            {
                return nums[i];
            }
            current_sum = current_sum+nums[i];
            maxProfit = Math.max(maxProfit,current_sum);
            if(current_sum<0)
            {
                current_sum=0;
            }
            // maxProfit = Math.max(maxProfit,current_sum);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,7,4,9,8,4,-1,-4,-5,3};
        System.out.println("profit = "+maxSubArray(nums));
    }
}