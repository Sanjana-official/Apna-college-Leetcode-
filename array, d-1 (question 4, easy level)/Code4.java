import java.util.Arrays;

public class Code4 {
    public static void main(String[] args) {
        int nums[] ={1,1,2,3,3,4,4,5,5};
        Arrays.sort(nums);
        int result=nums[nums.length-1];
        int index=1;
        for(int i=0;i<nums.length-1;i=i+2)
        {
            
            if(nums[nums.length-1]!=nums[nums.length-2])
            {
                result=nums[nums.length-1];
                break;
            }
            if(nums[i]==nums[index] )
            {
                index=i+3;
            }
            else 
            {
                 result=nums[i];
                 break;
            }
        }
        System.out.println(result);
    }
}