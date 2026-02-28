public class Code6 {
    public static double myPow(double x, int n) {
        double org =x;
        int maxv = Integer.MAX_VALUE;
        int minv = Integer.MIN_VALUE;
        
        if(n==0 || x==1)
        {
            x=1;
        }
        else if(n<0)
        {
            if(x==-1)
            {
                x=1;
            }
            else if(n<=minv)
            {
                x=0;
            }
            else{
                int positiveN  = n* (-1);
                for(int i=1;i<positiveN;i++)
                {
                    x = org*x;
                }
                x=1/x;
            }
        }
        else
        {
            if(x==-1)
            {
                x=-1;
            }
            else if(n>maxv)
            {
                x=0;
            }
            else{
                for(int i=1;i<n;i++)
                {
                    x = org*x;
                }
            }
        }
        return x; 
    }
    public static void main(String[] args) {
        double x =10;
        int n = 4;
        System.out.println(myPow(x,n));
    }
}
