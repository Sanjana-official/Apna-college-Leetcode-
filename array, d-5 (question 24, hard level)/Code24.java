public class Code24 {
    public static int trap(int[] height) {
        int n=height.length;


        // left boundary
        int left[] = new int[n];
        left[0] = height[0];
        for(int i=1;i<n;i++)
        {
            left[i] = Math.max(height[i],left[i-1]);
        }

         // right boundary
        int right[] = new int[n];
        right[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            right[i] = Math.max(height[i],right[i+1]);
        }

        //trapped water
        int trapped = 0;
        int waterlevel = 0;

        for(int i=0;i<n;i++)
        {
            waterlevel = Math.min(left[i],right[i]);
            trapped += (waterlevel-height[i]);
        }

        return trapped;
    }
    public static void main(String[] args) {
        int trapped[] = {1,2,3,1,4,2,5,3,2};
        System.out.println(trap(trapped));
    }
}
