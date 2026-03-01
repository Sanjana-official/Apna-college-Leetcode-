public class Code9 {
    public static void sortColors(int[] nums) {
        int start=0;
        int temp[]= new int[nums.length];
        String ones = "";
        int end=nums.length-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                temp[start]=nums[i];
                start++;
            }
            else if(nums[i]==2)
            {
                temp[end]=nums[i];
                end--;
            }
            else
            {
                ones = ones +  String.valueOf(nums[i]);
                // System.out.println(ones);
            }
        }
        int n=0;
        for(int i = start;i<=end;i++)
        {
            char ch = ones.charAt(n);
            n++;
            temp[i]= Character.getNumericValue(ch);
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=temp[i];
            System.out.print(nums[i]+" ");
        }
    }

    public static void main(String[] args) {
        int nums[] = {0,1,2,0,1,2,0,1,1};
        sortColors(nums);
    }

}
