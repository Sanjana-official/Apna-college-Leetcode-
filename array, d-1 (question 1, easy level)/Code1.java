public class Code1 {
     public static int majorityElement(int[] nums) 
    {
        int n = nums.length;
        int major = n/2; int number=0; int repeat;
        for(int i = 0 ; i<n;i++)
        {
            repeat=0; 
            
            for(int j = 0; j<n;j++)
            {
                
               if(nums[i]==number)
                {
                    repeat++;
                    break;
                }
                else if(nums[i]==nums[j])
                {
                    repeat++;
                }
            }
            if(repeat>major)
            {
                number=nums[i];
            }
        }
        
        return number;
    }
    public static void main(String args[])
    {
        int nums[]={1,2,1};
        int n=majorityElement(nums);
        System.out.println("major number repeated : "+n);
    }
}
