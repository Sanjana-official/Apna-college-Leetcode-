public class Code8 {
    public int maxArea(int[] height) {

        int n=height.length;
        int lp=0;
        int rp=n-1;
        int maxWater=0;

        while(lp<rp){
            int h=Math.min(height[lp],height[rp]);
            int width=rp-lp;
            int currWater=h*width;

            maxWater=Math.max(currWater,maxWater);


            if(height[lp]<height[rp]){
                lp++;
            }
            else{
                rp--;
            }

        }
        return maxWater;        
    }
}