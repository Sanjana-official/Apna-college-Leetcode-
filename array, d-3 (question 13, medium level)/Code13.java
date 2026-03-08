import java.util.Arrays;

public class Code13 {
    public void nextPermutation(int[] nums) {
        int pivot=-1;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                pivot=i;
                System.out.println(pivot);
                break;
            }
        }

        if(pivot==-1)
        {
            Arrays.sort(nums);
            System.out.println(Arrays.toString(nums));
        }
        else{
            for(int i=nums.length-1;i>pivot;i--)
            {
                if(nums[i]>nums[pivot])
                {
                    int temp=nums[pivot];
                    nums[pivot]=nums[i];
                    nums[i]=temp; 
                    break;
                }
            }
            Arrays.sort(nums, pivot+1, nums.length);
            System.out.println(Arrays.toString(nums)); 
        }
    }
}

