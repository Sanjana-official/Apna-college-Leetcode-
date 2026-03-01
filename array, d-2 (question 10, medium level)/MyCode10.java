public class MyCode10{

    public static void main(String[] args) {
        int arr[]={2,1,-3,-1,-1,2};
        int nums[]=new int[3];
        for(int i=0;i<arr.length-2;i++)
        {
            for(int j=i+1;j<arr.length-1;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==0)
                    {
                        nums[0]=arr[i];
                        nums[1]=arr[j];
                        nums[2]=arr[k];
                        for(int p=0;p<nums.length;p++)
                        {
                            System.out.print(nums[p]+" ");
                        }
                        System.out.println();
                    }
                }
            }
        }
    }
}